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

package cc.chordflower.weasel.utils.reflection.runtime;

import cc.chordflower.weasel.utils.ExceptionUtils;
import cc.chordflower.weasel.utils.reflection.FieldInformation;
import cc.chordflower.weasel.utils.reflection.ReflectionUtils;
import cc.chordflower.weasel.utils.reflection.TypeModifiersEnum;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes a field.
 * @param <F> The field type.
 */
@SuppressWarnings( "unchecked" )
@AvailableSince( "0.1.0" )
@Internal
@Unmodifiable
public class RuntimeFieldInformation<F> extends FieldInformation<F> {

  private final Field field;

  private final Class< F > fieldType;

  private final ImmutableMultiset< Annotation > annotations;

  private final String name;

  private final ImmutableSet< TypeModifiersEnum > modifiers;

  public RuntimeFieldInformation( @NotNull Field field, Class<F> fieldType ) {
    this.field = field;
    this.fieldType = fieldType;
    this.annotations = Arrays.stream( field.getAnnotations( ) ).collect( ImmutableMultiset.toImmutableMultiset() );
    this.name = field.getName();
    this.modifiers = ReflectionUtils.getSetFromModifiers( field.getModifiers() );
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
    return annotations;
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
  public @NotNull Class< F > FieldType( ) {
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
  public @NotNull Optional< F > Value( ) {
    return Optional.empty();
  }

  public @NotNull Optional< F > Value( Object obj ) {
    return ExceptionUtils.convertToTry( () -> (F)this.field.get( obj ) );
  }

  public Field Field( ) {
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
    RuntimeFieldInformation< ? > that = ( RuntimeFieldInformation< ? > ) o;
    return field.equals( that.field );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( field );
  }
}
