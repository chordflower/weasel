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

package cc.chordflower.weasel.utils.reflection.mirror;

import cc.chordflower.weasel.utils.reflection.FieldInformation;
import cc.chordflower.weasel.utils.reflection.ReflectionUtils;
import cc.chordflower.weasel.utils.reflection.TypeModifiersEnum;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import javax.lang.model.element.VariableElement;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents a field information from the compiler point of view.
 * @param <T> The field type.
 */
@SuppressWarnings( "unchecked" )
@AvailableSince( "0.1.0" )
@Internal
@Unmodifiable
public class MirroredFieldInformation<T> extends FieldInformation< T > {

  private final String name;

  private final VariableElement field;

  private final Class< T > fieldType;

  private final ImmutableSet< TypeModifiersEnum > modifiers;

  private final Optional< T > value;

  private ImmutableMultiset< Annotation > annotations;

  MirroredFieldInformation( @NotNull VariableElement element, boolean initialized, Class<T> fieldClass ) {
    this.name = element.getSimpleName().toString();
    this.field = element;
    this.fieldType = fieldClass;
    this.modifiers = element.getModifiers().stream().map( TypeModifiersEnum::from ).collect( ImmutableSet.toImmutableSet() );
    this.value = Optional.ofNullable( (T) element.getConstantValue() );
    if( initialized ) {
      this.annotations = element.getAnnotationMirrors().stream()
          .map( annotationMirror -> ReflectionUtils.<Annotation>getClassFromType( annotationMirror.getAnnotationType() ) )
          .filter( Objects::nonNull )
          .map( cl -> element.getAnnotation( (Class<? extends Annotation>)cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset() );
    }
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
    if( this.annotations == null ) {
      this.annotations = this.field.getAnnotationMirrors().stream()
          .map( annotationMirror -> ReflectionUtils.<Annotation>getClassFromType( annotationMirror.getAnnotationType() ) )
          .filter( Objects::nonNull )
          .map( cl -> this.field.getAnnotation( (Class<? extends Annotation>)cl ) )
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
    return this.field.getAnnotation( annotationType ) != null;
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return Optional.ofNullable( this.field.getAnnotation( annotationType ) );
  }

  /**
   * The field name.
   */
  @Override
  public @NotNull String Name( ) {
    return this.name;
  }

  /**
   * The field type.
   */
  @Override
  @Experimental
  public @NotNull Class< T > FieldType( ) {
    return this.fieldType;
  }

  /**
   * The field modifiers.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< TypeModifiersEnum > Modifiers( ) {
    return this.modifiers;
  }

  /**
   * The field value (if available).
   */
  @Override
  public @NotNull Optional< T > Value( ) {
    return this.value;
  }

  /**
   * Provides direct access to the field.
   * @return The field.
   */
  public VariableElement Field( ) {
    return field;
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
    MirroredFieldInformation< ? > that = ( MirroredFieldInformation< ? > ) o;
    return Objects.equals( field, that.field );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( field );
  }
}
