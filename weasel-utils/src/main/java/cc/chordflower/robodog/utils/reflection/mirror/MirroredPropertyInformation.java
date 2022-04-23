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

import cc.chordflower.robodog.utils.reflection.FieldInformation;
import cc.chordflower.robodog.utils.reflection.MethodInformation;
import cc.chordflower.robodog.utils.reflection.PropertyInformation;
import com.google.common.collect.ImmutableMultiset;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Optional;

/**
 * Contains information about a property.
 * @param <P> The property type.
 */
@AvailableSince( "0.1.0" )
@Internal
@Unmodifiable
public class MirroredPropertyInformation<P> extends PropertyInformation<P> {

  private final String name;

  private final boolean readOnly;

  private final Class< P > propertyType;

  private final FieldInformation< P > field;

  private final MethodInformation< P > getter;

  private final MethodInformation< Void > setter;

  public MirroredPropertyInformation( @NotNull FieldInformation< P > field, MethodInformation< P > getter, MethodInformation< Void > setter, boolean initialized, Class<P> propertyType ) {
    this.name = field.Name();
    this.readOnly = setter == null;
    this.propertyType = propertyType;
    this.field = field;
    this.getter = getter;
    this.setter = setter;
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
    return this.field.Annotations();
  }

  /**
   * Checks if the type has the given annotation.
   *
   * @param annotationType The annotation type to check.
   * @return True if this annotation is in this type, false otherwise.
   */
  @Override
  public < A extends Annotation > boolean hasAnnotation( @NotNull Class< A > annotationType ) {
    return this.field.hasAnnotation( annotationType );
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return this.field.Annotation( annotationType );
  }

  /**
   * Returns the property name.
   */
  @Override
  public @NotNull String Name( ) {
    return this.name;
  }

  /**
   * Returns if this property is read-only.
   */
  @Override
  public boolean isReadOnly( ) {
    return this.readOnly;
  }

  /**
   * Returns the property type.
   */
  @Override
  public @NotNull Class< P > PropertyType( ) {
    return this.propertyType;
  }

  /**
   * Returns the associated property field information.
   */
  @Override
  public @NotNull FieldInformation< P > Field( ) {
    return this.field;
  }

  /**
   * Returns the associated property getter information.
   */
  @Override
  public @NotNull MethodInformation< P > Getter( ) {
    return this.getter;
  }

  /**
   * Returns the associated property setter information or an empty optional, if this property is read-only.
   */
  @Override
  public @NotNull Optional< MethodInformation< Void > > Setter( ) {
    return Optional.ofNullable( this.setter );
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
    MirroredPropertyInformation< ? > that = ( MirroredPropertyInformation< ? > ) o;
    return Objects.equals( field, that.field ) && Objects.equals( getter, that.getter ) && Objects.equals( setter, that.setter );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( field, getter, setter );
  }
}
