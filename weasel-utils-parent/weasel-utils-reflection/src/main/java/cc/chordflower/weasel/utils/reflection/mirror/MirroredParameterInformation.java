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

import cc.chordflower.weasel.utils.reflection.ParameterInformation;
import cc.chordflower.weasel.utils.reflection.ReflectionUtils;
import com.google.common.collect.ImmutableMultiset;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import javax.lang.model.element.VariableElement;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Optional;

/**
 * Represents information about a parameter.
 * @param <T> The parameter type.
 */
@AvailableSince( "0.1.0" )
@Internal
@Unmodifiable
public class MirroredParameterInformation<T> extends ParameterInformation<T> {

  private final VariableElement parameter;

  private final Class< T > parameterType;

  private ImmutableMultiset< Annotation > annotations;

  private final String name;

  public MirroredParameterInformation( @NotNull VariableElement parameter, boolean initialized, Class<T> parameterType ) {
    this.parameter = parameter;
    this.parameterType = parameterType;
    this.name = parameter.getSimpleName().toString();
    if( initialized ) {
      this.annotations = parameter.getAnnotationMirrors().stream()
          .map( annotationMirror -> ReflectionUtils.<Annotation>getClassFromType( annotationMirror.getAnnotationType() ) )
          .filter( Objects::nonNull )
          .map( cl -> parameter.getAnnotation( (Class<? extends Annotation>)cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset() );
    }
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
    if( this.annotations == null ) {
      this.annotations = parameter.getAnnotationMirrors().stream()
          .map( annotationMirror -> ReflectionUtils.<Annotation>getClassFromType( annotationMirror.getAnnotationType() ) )
          .filter( Objects::nonNull )
          .map( cl -> parameter.getAnnotation( (Class<? extends Annotation>)cl ) )
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
    return this.parameterType.getAnnotation( annotationType ) != null;
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return Optional.ofNullable( this.parameterType.getAnnotation( annotationType ) );
  }

  /**
   * Returns the parameter name.
   */
  @Override
  public @NotNull String Name( ) {
    return this.name;
  }

  /**
   * Returns the parameter type.
   */
  @Override
  public @NotNull Class< T > ParameterType( ) {
    return this.parameterType;
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
    MirroredParameterInformation< ? > that = ( MirroredParameterInformation< ? > ) o;
    return Objects.equals( parameter, that.parameter );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( parameter );
  }
}
