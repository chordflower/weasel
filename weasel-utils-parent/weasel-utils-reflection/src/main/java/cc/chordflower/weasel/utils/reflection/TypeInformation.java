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

package cc.chordflower.weasel.utils.reflection;

import cc.chordflower.weasel.utils.reflection.mirror.MirroredTypeInformation;
import cc.chordflower.weasel.utils.reflection.runtime.RuntimeTypeInformation;
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import javax.lang.model.element.TypeElement;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * This interface contains information about a specific type.
 */
@SuppressWarnings( "unchecked" )
@AvailableSince( "0.1.0" )
public abstract class TypeInformation implements IAnnotatedInformation {

  /**
   * Simple name of the type.
   */
  @NotNull
  public abstract String Name( );

  /**
   * The qualified name of the type.
   */
  @NotNull
  public abstract String QualifiedName( );

  /**
   * The package name of the type.
   */
  @NotNull
  public abstract String PackageName( );

  /**
   * The kind of the referenced type.
   */
  @NotNull
  public abstract TypeKindsEnum Type( );

  /**
   * The type modifiers.
   */
  @Unmodifiable @NotNull
  public abstract ImmutableSet< TypeModifiersEnum > Modifiers( );

  /**
   * The type fields.
   */
  @Unmodifiable @NotNull
  public abstract ImmutableSet< FieldInformation<?> > Fields( );

  /**
   * Checks if this type has a field with the given name.
   * @param name The name of the field to look for.
   * @return True if it has, false otherwise.
   */
  public boolean hasFieldNamed( @NotNull String name ) {
    return Fields().stream( ).anyMatch( f -> f.Name().equals( name ) );
  }

  /**
   * Returns the field information for the given field.
   * @param name The name of the field to look for.
   * @param <F> The field type.
   * @return The field information or an empty optional if there is no information.
   */
  public < F > @NotNull Optional< FieldInformation< F > > FieldInformation( @NotNull String name ) {
    return Fields().stream().filter( f -> f.Name().equals( name ) ).map( f -> (FieldInformation<F>)f ).findFirst();
  }

  /**
   * The type methods.
   */
  @Unmodifiable @NotNull
  public abstract ImmutableSet< MethodInformation<?> > Methods( );

  /**
   * Checks if this type has a method with the given name.
   * @param name The name of the method to look for.
   * @return True if it has, false othwerwise.
   */
  public boolean hasMethodNamed( String name ) {
    return Methods().stream( ).anyMatch( m -> m.Name().equals( name ) );
  }

  /**
   * Returns the method information for the given method name.
   * @param name The name of the method to look for.
   * @param <M> The method return type.
   * @return The method information or an empty optional if there is no information.
   */
  public < M > @NotNull Optional< MethodInformation< M > > MethodInformation( @NotNull String name ) {
    return Methods().stream().filter( m -> m.Name().equals( name ) ).map( m -> ( MethodInformation<M> )m ).findFirst();
  }

  /**
   * The type constructors.
   */
  @Unmodifiable @NotNull
  public abstract ImmutableSet< ConstructorInformation > Constructors( );

  /**
   * The type properties.
   */
  @Unmodifiable @NotNull
  public abstract ImmutableSet< PropertyInformation<?> > Properties( );

  /**
   * Checks if this type has a property with the given name.
   * @param name The name of the property to look for.
   * @return True if it has, false othwerwise.
   */
  public boolean hasPropertyNamed( @NotNull String name ) {
    return Properties().stream().anyMatch( p -> p.Name().equals( name ) );
  }

  /**
   * Returns the property information for the given property name.
   * @param name The name of the property to look for.
   * @param <P> The property return type.
   * @return The property information or an empty optional if there is no information.
   */
  public < P > @NotNull Optional< PropertyInformation< P > > PropertyInformation( @NotNull String name ) {
    return Properties().stream().filter( p -> p.Name().equals( name ) ).map( p -> ( PropertyInformation<P> )p ).findFirst();
  }

  /**
   * Gets an instance of the type information. ( Runtime version )
   *
   * @param type The type to get information from.
   * @param initialized If the type information should be eager or lazy,
   *                    meaning that a eager one, would retrieve all possible
   *                    data at the start, while the other will retrieve it only
   *                    as needed.
   * @param <T> The type of the type to obtain information from.
   * @return The type information instance corresponding to the given type.
   */
  @Contract( "_, _ -> new" )
  public static < T > @NotNull @Unmodifiable TypeInformation getTypeInformation( @NotNull Class< T > type, boolean initialized ) {
    return new RuntimeTypeInformation<>( Objects.requireNonNull( type ), initialized );
  }

  /**
   * Gets an instance of the type information. ( Compile version )
   *
   * @param type The type to get information from.
   * @param initialized If the type information should be eager or lazy,
   *                    meaning that a eager one, would retrieve all possible
   *                    data at the start, while the other will retrieve it only
   *                    as needed.
   * @return The type information instance corresponding to the given type.
   */
  @Contract( "_, _ -> new" )
  public static @NotNull @Unmodifiable TypeInformation getTypeInformation( @NotNull TypeElement type, boolean initialized ) {
    return new MirroredTypeInformation( Objects.requireNonNull( type ), initialized );
  }

  @Override
  public String toString( ) {
    return new StringJoiner( ", ", "{", "}" )
        .add( "\"name\":\"" + Name() + "\"" )
        .add( "\"qualifiedName\":\"" + QualifiedName() + "\"" )
        .add( "\"packageName\":\"" + PackageName() + "\"" )
        .add( "\"kind\":\"" + Type() + "\"" )
        .add( "\"fields\": [" + String.join( ",", Fields().stream().map( Object::toString ).toArray( String[]::new ) ) + "]" )
        .add( "\"annotations\": [" + String.join( ",", Annotations().stream().map( Object::toString ).toArray( String[]::new ) ) + "]" )
        .add( "\"modifiers\": [" + String.join( ",", Modifiers().stream().map( ReflectionUtils::wrapMe ).toArray( String[]::new ) ) + "]" )
        .add( "\"methods\": [" + String.join( ",", Methods().stream().map( Object::toString ).toArray( String[]::new ) ) + "]" )
        .add( "\"properties\": [" + String.join( ",", Properties().stream().map( Object::toString ).toArray( String[]::new ) ) + "]" )
        .toString( );
  }

}
