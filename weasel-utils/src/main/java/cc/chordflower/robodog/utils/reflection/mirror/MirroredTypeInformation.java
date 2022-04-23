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
package cc.chordflower.robodog.utils.reflection.mirror;

import cc.chordflower.robodog.utils.reflection.*;
import com.google.common.base.CaseFormat;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Optional;

/**
 * Contains information about a compile-time type or TypeElement.
 */
@SuppressWarnings( "unchecked" )
@AvailableSince( "0.1.0" )
@Internal
@Unmodifiable
public class MirroredTypeInformation extends TypeInformation {

  private final TypeElement type;

  private final String name;

  private final String qualifiedName;

  private final String packageName;

  private final TypeKindsEnum kind;

  private ImmutableSet< FieldInformation< ? > > fields;

  private ImmutableMultiset< Annotation > annotations;

  private final ImmutableSet< TypeModifiersEnum > modifiers;

  private ImmutableSet< MethodInformation< ? > > methods;

  private ImmutableSet< PropertyInformation< ? > > properties;

  private ImmutableSet< ConstructorInformation > constructors;

  /**
   * Creates a new mirrored type information.
   * @param type The type to create the mirrored type information from.
   * @param initialized True, if this class is going to be fully initialized.
   */
  @SuppressWarnings( "rawtypes" )
  public MirroredTypeInformation( TypeElement type, boolean initialized ) {
    this.type = type;
    this.name = type.getSimpleName().toString();
    this.qualifiedName = type.getQualifiedName().toString();
    this.packageName = this.qualifiedName.substring( 0, this.qualifiedName.lastIndexOf( '.' ) );
    this.kind = TypeKindsEnum.from( type.getKind() );
    this.modifiers = type.getModifiers().stream().map( TypeModifiersEnum::from ).collect( ImmutableSet.toImmutableSet() );
    if( initialized ) {
      this.annotations = type.getAnnotationMirrors().stream()
          .map( annotationMirror -> ReflectionUtils.<Annotation>getClassFromType( annotationMirror.getAnnotationType() ) )
          .filter( Objects::nonNull )
          .map( cl -> type.getAnnotation( (Class<? extends Annotation>)cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset() );

      this.fields = type.getEnclosedElements().stream()
          .filter( el -> el.getKind().equals( ElementKind.FIELD ) )
          .map( el -> new MirroredFieldInformation<>( ( VariableElement )el, true, ReflectionUtils.getClassFromType( el.asType( ) ) ) )
          .collect( ImmutableSet.toImmutableSet() );

      this.methods = type.getEnclosedElements().stream()
          .filter( el -> el.getKind().equals( ElementKind.METHOD ) )
          .map( el -> new MirroredMethodInformation<>( ( ExecutableElement )el, true, ReflectionUtils.getClassFromType( el.asType() ) ) )
          .collect( ImmutableSet.toImmutableSet() );

      this.constructors = type.getEnclosedElements().stream()
          .filter( el -> el.getKind().equals( ElementKind.CONSTRUCTOR ) )
          .map( el -> new MirroredConstructorInformation( (ExecutableElement )el, true ) )
          .collect( ImmutableSet.toImmutableSet() );

      var prop = Sets.< PropertyInformation<?> >newHashSet( );
      for( var field : this.fields ) {
        var getter = this.methods.stream()
            .filter( m -> ( m.Name().equals( CaseFormat.LOWER_CAMEL.to( CaseFormat.UPPER_CAMEL, field.Name() ) ) ||
                  m.Name().equals( String.format( "get%s", field.Name() ) ) ||
                  m.Name().equals( String.format( "is%s", field.Name() ) ) ) &&
                m.ReturnType().equals( field.FieldType() ) &&
                !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                m.Parameters().isEmpty() )
            .findFirst();
        if( getter.isPresent( ) ) {
          if( field.Modifiers( ).contains( TypeModifiersEnum.FINAL ) ) {
            prop.add( new MirroredPropertyInformation( field, getter.get(), null, true, field.FieldType() ) );
          } else {
            var setter = this.methods.stream()
                .filter( m -> m.Name().equals( String.format( "set%s", field.Name() ) ) &&
                    m.ReturnType().equals( Void.class ) &&
                    !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                    m.Parameters().size() == 1 &&
                    m.Parameters().stream( ).anyMatch( p -> p.ParameterType().equals( field.FieldType() ) ) )
                .findFirst();
            setter.ifPresent( sett -> prop.add( new MirroredPropertyInformation( field, getter.get( ), sett, true, field.FieldType() ) ) );
          }
        }
      }
      this.properties = ImmutableSet.copyOf( prop );
    }
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
    if( this.annotations == null ) {
      this.annotations = type.getAnnotationMirrors().stream()
          .map( annotationMirror -> ReflectionUtils.<Annotation>getClassFromType( annotationMirror.getAnnotationType() ) )
          .filter( Objects::nonNull )
          .map( cl -> type.getAnnotation( (Class<? extends Annotation>)cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset() );
    }
    return this.annotations;
  }

  /**
   * Checks if the type has the given annotation.
   *
   * @param annotationType The annotation type to check.
   * @return True if this annotation is in this type, false otherwise.
   */
  @Override
  public < A extends Annotation > boolean hasAnnotation( @NotNull Class< A > annotationType ) {
    return this.type.getAnnotation( annotationType ) != null;
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return Optional.ofNullable( this.type.getAnnotation( annotationType ) );
  }

  /**
   * Simple name of the type.
   */
  @Override
  public @NotNull String Name( ) {
    return this.name;
  }

  /**
   * The qualified name of the type.
   */
  @Override
  public @NotNull String QualifiedName( ) {
    return this.qualifiedName;
  }

  /**
   * The package name of the type.
   */
  @Override
  public @NotNull String PackageName( ) {
    return this.packageName;
  }

  /**
   * The kind of the referenced type.
   */
  @Override
  public @NotNull TypeKindsEnum Type( ) {
    return this.kind;
  }

  /**
   * The type modifiers.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< TypeModifiersEnum > Modifiers( ) {
    return this.modifiers;
  }

  /**
   * The type fields.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< FieldInformation< ? > > Fields( ) {
    if( this.fields == null ) {
      this.fields = type.getEnclosedElements().stream()
          .filter( el -> el.getKind().equals( ElementKind.FIELD ) )
          .map( el -> {
            var cl = ReflectionUtils.getClassFromType( el.asType( ) );
            return new MirroredFieldInformation<>( ( VariableElement )el, true, cl );
          } )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.fields;
  }

  /**
   * The type methods.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< MethodInformation< ? > > Methods( ) {
    if( this.methods == null ) {
      this.methods = type.getEnclosedElements().stream()
          .filter( el -> el.getKind().equals( ElementKind.METHOD ) )
          .map( el -> new MirroredMethodInformation<>( ( ExecutableElement )el, false, ReflectionUtils.getClassFromType( el.asType() ) ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.methods;
  }

  /**
   * The type constructors.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< ConstructorInformation > Constructors( ) {
    if( this.constructors == null ) {
      this.constructors = type.getEnclosedElements().stream()
          .filter( el -> el.getKind().equals( ElementKind.CONSTRUCTOR ) )
          .map( el -> new MirroredConstructorInformation( (ExecutableElement )el, true ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.constructors;
  }

  /**
   * The type properties.
   */
  @SuppressWarnings( "rawtypes" )
  @Override
  public @Unmodifiable @NotNull ImmutableSet< PropertyInformation< ? > > Properties( ) {
    if( this.properties == null ) {
      var prop = Sets.< PropertyInformation<?> >newHashSet( );
      for( var field : this.Fields() ) {
        var getter = this.Methods().stream()
            .filter( m -> ( m.Name().equals( CaseFormat.LOWER_CAMEL.to( CaseFormat.UPPER_CAMEL, field.Name() ) ) ||
                m.Name().equals( String.format( "get%s", field.Name() ) ) ||
                m.Name().equals( String.format( "is%s", field.Name() ) ) ) &&
                m.ReturnType().equals( field.FieldType() ) &&
                !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                m.Parameters().isEmpty() )
            .findFirst();
        if( getter.isPresent( ) ) {
          if( field.Modifiers( ).contains( TypeModifiersEnum.FINAL ) ) {
            prop.add( new MirroredPropertyInformation( field, getter.get(), null, true, field.FieldType() ) );
          } else {
            var setter = this.Methods().stream()
                .filter( m -> m.Name().equals( String.format( "set%s", field.Name() ) ) &&
                    m.ReturnType().equals( Void.class ) &&
                    !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                    m.Parameters().size() == 1 &&
                    m.Parameters().stream( ).anyMatch( p -> p.ParameterType().equals( field.FieldType() ) ) )
                .findFirst();
            setter.ifPresent( sett -> prop.add( new MirroredPropertyInformation( field, getter.get( ), sett, true, field.FieldType() ) ) );
          }
        }
      }
      this.properties = ImmutableSet.copyOf( prop );
    }
    return this.properties;
  }

  @Contract( value = "null -> false", pure = true )
  @Override
  public boolean equals( Object o ) {
    if( this == o ) {
      return true;
    }
    if( o == null || getClass( ) != o.getClass( ) ) {
      return false;
    }
    MirroredTypeInformation that = ( MirroredTypeInformation ) o;
    return type.equals( that.type );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( type );
  }
}
