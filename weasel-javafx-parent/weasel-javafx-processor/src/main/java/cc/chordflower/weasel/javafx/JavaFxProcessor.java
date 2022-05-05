/*
 * Copyright 2022 carddamom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package cc.chordflower.weasel.javafx;

import cc.chordflower.weasel.javafx.annotations.Component;
import cc.chordflower.weasel.javafx.annotations.EventFor;
import cc.chordflower.weasel.javafx.annotations.EventsFor;
import cc.chordflower.weasel.javafx.annotations.View;
import cc.chordflower.weasel.javafx.runtime.JavaFxUtils;
import cc.chordflower.weasel.utils.reflection.ParameterInformation;
import cc.chordflower.weasel.utils.reflection.TypeInformation;
import cc.chordflower.weasel.utils.reflection.TypeModifiersEnum;
import cc.chordflower.weasel.utils.reflection.mirror.MirroredFieldInformation;
import com.google.auto.service.AutoService;
import com.google.common.base.CaseFormat;
import com.squareup.javapoet.*;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNull;

import javax.annotation.processing.*;
import javax.inject.Inject;
import javax.inject.Named;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic.Kind;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * Processor for the view annotation.
 */
@AutoService( Processor.class )
@Internal
public class JavaFxProcessor extends AbstractProcessor {

  private Messager messenger;

  private Filer filer;

  private Elements elementUtils;

  @Override
  public Set< String > getSupportedAnnotationTypes( ) {
    return Set.of( View.class.getCanonicalName() );
  }

  /**
   * The version of the generated source, that in this case is Java 17.
   */
  @Override
  public SourceVersion getSupportedSourceVersion( ) {
    return SourceVersion.RELEASE_17;
  }

  @Override
  public synchronized void init( ProcessingEnvironment processingEnv ) {
    super.init( processingEnv );
    messenger = processingEnv.getMessager();
    filer = processingEnv.getFiler( );
    elementUtils = processingEnv.getElementUtils( );
  }

  /**
   * Processes all the annotated types and then for each type:
   *
   * 1. Generates a new class, that inherits from the annotated type.
   * 2. Associates the fxml indicated by the **View** annotation to the generated class.
   * 3. Creates a new constructor that:
   * 3.1. Calls the super constructor with any arguments it receives.
   * 3.2. Initializes all fields annotated with Component with the corresponding field.
   * 3.3. Binds all methods annotated with EventFor to the corresponding event.
   * 3.4. Annotates the constructor with Inject, to allow for Dagger injection.
   * 4. Adds the annotation Named with the name of the annotated type (in lower camel case).
   *
   * @param annotations The detected annotations.
   * @param roundEnv The environment.
   * @return Always true.
   */
  @Override
  public boolean process( Set< ? extends TypeElement > annotations, @NotNull RoundEnvironment roundEnv ) {
    for( Element element : roundEnv.getElementsAnnotatedWith( View.class ) ) {
      if( element.getKind().equals( ElementKind.CLASS ) && !element.getModifiers().contains( Modifier.FINAL ) ) {
        // Process element
        this.processFile( (TypeElement) element );
      } else {
        this.messenger.printMessage( Kind.MANDATORY_WARNING, "The view annotation can only be placed in a non-final class", element );
      }
    }
    return true;
  }

  /**
   * Generates the java file.
   *
   * @param element The element to generate the java file for.
   */
  @SuppressWarnings( { "OptionalGetWithoutIsPresent", "ResultOfMethodCallIgnored" } )
  private void processFile( TypeElement element ) {

    var information = TypeInformation.getTypeInformation( element, false );

    // 1. Get the fxml filename...
    var fxmlFilename = information.Annotation( View.class ).get().name();

    // 2. Find out the name of the class
    var className = information.Name();
    if( className.isEmpty( ) ) {
      this.messenger.printMessage( Kind.MANDATORY_WARNING, "Unable to get the class name, make sure the annotated class is not an anonymous class!", element );
      return;
    }

    // 3. Create a new type named <CLASS_NAME>Robodog
    var typeSpec = TypeSpec.classBuilder(String.format("%sWeasel", className))
        .addJavadoc( "This type contains the implementation of the view class without the View annotation\n" )
        .addJavadoc( "as generated by the weasel-javafx-processor" )
        .addModifiers( Modifier.PUBLIC, Modifier.FINAL );

    // 4. Add the Named annotation to the new class
    typeSpec.addAnnotation( AnnotationSpec.builder( Generated.class )
        .addMember( "value", "$S", "weasel-javafx-processor" )
        .addMember( "date", "$S", LocalDate.now().format( DateTimeFormatter.ISO_DATE ) )
        .addMember( "comments", "$S", "Can't touch this!" )
        .build() );
    typeSpec.addAnnotation( AnnotationSpec.builder( Named.class )
        .addMember( "value", "$S", CaseFormat.UPPER_CAMEL.to( CaseFormat.LOWER_CAMEL, className ) )
        .build() );

    // 5. The new type should extend the class
    typeSpec.superclass( element.asType() );

    // 6. Get the arguments of the class constructor
    var constructor = information.Constructors().stream()
        .filter( el -> !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) ).findFirst();
    if( constructor.isEmpty() ) {
      this.messenger.printMessage( Kind.MANDATORY_WARNING, "The given class does not have a valid constructor!", element );
      return;
    }

    // 7. Create a new constructor that has the same arguments as the class constructor
    var newConstructor = MethodSpec.constructorBuilder().addModifiers( Modifier.PUBLIC );

    for( var parameter : constructor.get( ).Parameters() ) {
      var typeName = TypeName.get( parameter.ParameterType() );
      newConstructor.addParameter( typeName, parameter.Name() );
    }

    // 8. Add the Injected annotation to the constructor
    newConstructor.addAnnotation( Inject.class );

    // 9. Make a call to the super constructor in the new class
    var res = String.join( ",", constructor.get().Parameters().stream().map( ParameterInformation::Name ).toList() );
    newConstructor.addStatement( "super($L)", res );

    /* 10. Add the code for loading the fxml file to the constructor:
     *
     * FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("<FXML_FILENAME>"));
     * fxmlLoader.setRoot(this);
     * fxmlLoader.setController(this);
     *
     * try {
     *   fxmlLoader.load();
     * } catch( IOException exception ) {
     *   throw new RuntimeException(exception);
     * }
     */
    var fxmlLoader = ClassName.get( "javafx.fxml", "FXMLLoader" );
    newConstructor.addComment( "Attempt to load the given fxml file, inside the root provided by this view" );
    newConstructor.addStatement( "$T fxmlLoader = new $T( getClass().getResource( $S ) )", fxmlLoader, fxmlLoader, fxmlFilename );
    newConstructor.addStatement( "fxmlLoader.setRoot( this )" );
    newConstructor.addStatement( "fxmlLoader.setController( this )" );
    newConstructor.addCode( "" );
    newConstructor.beginControlFlow( "try" );
    newConstructor.addStatement( "fxmlLoader.load()" );
    newConstructor.nextControlFlow( "catch( $T ex )", IOException.class );
    newConstructor.addStatement("throw new $T(ex)", RuntimeException.class);
    newConstructor.endControlFlow();
    newConstructor.addCode( "\n" );

    if( information.Fields().stream().anyMatch( el -> el.hasAnnotation( Component.class ) && !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) ) ) {
      newConstructor.addComment( "Inject the fields from the fxml" );
    }

    // 11. For each field annotated with Component (and not private):
    for( var field : information.Fields().stream().filter( el -> el.hasAnnotation( Component.class ) && !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) ).toList() ) {
      // 11.1. Get the id from the annotation
      var id = String.format( "#%s", field.Annotation( Component.class ).get().id() );

      // 11.2. Get the name of the field
      var name = field.Name();

      // 11.3. Get the type of the field
      var fieldType = (( MirroredFieldInformation<?> )field).Field().asType();

      /* 11.4. Add the following code to the constructor:
       *
       * this.<FIELD_NAME> = JavaFxUtils.getInstance().<<CONTROL_TYPE>>lookup( "#<ID>", this ).get();
       */
      newConstructor.addStatement( "this.$L = $T.getInstance().<$T>lookup( $S, this ).get()", name, ClassName.get( JavaFxUtils.class ), fieldType, id );
    }
    newConstructor.addCode( "\n" );

    if( information.Methods().stream().anyMatch( el -> ( el.hasAnnotation( EventFor.class ) || el.hasAnnotation( EventsFor.class ) ) && !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) ) ) {
      newConstructor.addComment( "Inject the events in the proper event handler" );
    }

    // 12. For each method annotated with EventFor ( and not private ):
    for( var method : information.Methods().stream().filter( el -> el.hasAnnotation( EventFor.class ) && !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) ).toList() ) {
      // 12.1. Get the id from the annotation
      var id = String.format( "#%s", method.Annotation( EventFor.class ).get().id() );

      // 12.2. Get the action from the annotation
      var action = String.format( "%sProperty", method.Annotation( EventFor.class ).get().action() );

      // 12.3. Get the control from the annotation
      TypeMirror control = null;
      try {
        method.Annotation( EventFor.class ).get().control( );
      } catch( MirroredTypeException ex ) {
        control = ex.getTypeMirror();
      }

      // 12.4. Get the name of the method
      var methodName = method.Name();

      /* 12.5 Add the following code to the constructor:
       *
       * (JavaFxUtils.getInstance().<<CONTROL_TYPE>>lookup( "<ID>" ).get()).<ACTION>Property().set( this::<METHOD_NAME> );
       */
      newConstructor.addStatement( "($T.getInstance().<$T>lookup( $S, this ).get()).$L().set( this::$L )", ClassName.get( JavaFxUtils.class ), control, id, action, methodName );
    }

    // 13. For each method annotation with EventsFor ( and not private ):
    for( var method : information.Methods().stream().filter( el -> el.hasAnnotation( EventsFor.class ) && !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) ).toList() ) {

      // 13.1. Get the EventFor list form the annotation
      var eventsFor = method.Annotation( EventsFor.class ).get().value();

      // 13.2. For each EventFor
      for( EventFor eventFor : eventsFor ) {

        // 13.2.1. Get the id from the annotation
        var id = String.format( "#%s", eventFor.id() );

        // 13.2.2. Get the action from the annotation
        var action = String.format( "%sProperty", eventFor.action() );

        // 13.2.3. Get the control from the annotation
        TypeMirror control = null;
        try {
          eventFor.control( );
        } catch( MirroredTypeException ex ) {
          control = ex.getTypeMirror();
        }

        // 13.2.4. Get the name of the method
        var methodName = method.Name();

        /* 13.2.5 Add the following code to the constructor:
         *
         * (JavaFxUtils.getInstance().<<CONTROL_TYPE>>lookup( "<ID>" ).get()).<ACTION>Property().set( this::<METHOD_NAME> );
         */
        newConstructor.addStatement( "($T.getInstance().<$T>lookup( $S, this ).get()).$L().set( this::$L )", ClassName.get( JavaFxUtils.class ), control, id, action, methodName );
      }
    }

    // 14. If there is an method called init without any arguments call it
    if( information.Methods().stream().anyMatch( el -> "init".equals( el.Name() ) &&
        !el.Modifiers().contains( TypeModifiersEnum.PRIVATE ) && el.Parameters().isEmpty() ) ) {
      newConstructor.addCode( "\n" );
      newConstructor.addComment( "Call the init method" );
      newConstructor.addStatement( "this.init()" );
    }

    // 15. Generate the class and place it in the outdir
    var result = typeSpec.addMethod( newConstructor.build() ).build();

    var javaFile = JavaFile.builder( this.elementUtils.getPackageOf( element ).getQualifiedName().toString(), result )
        .build();

    try {
      javaFile.writeTo( this.filer );
    } catch( IOException e ) {
      this.messenger.printMessage( Kind.ERROR, e.getMessage() );
    }
  }

}
