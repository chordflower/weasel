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

package cc.chordflower.robodog.utils.reflection.runtime;

import cc.chordflower.robodog.utils.reflection.ParameterInformation;
import com.google.common.collect.ImmutableMultiset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Optional;

public class RuntimeParameterInformation<P> extends ParameterInformation<P> {

  private final Parameter parameter;

  private final Class< P > parameterType;

  private final String name;

  private final ImmutableMultiset< Annotation > annotations;

  public RuntimeParameterInformation( Parameter parameter, boolean initialized, Class<P> parameterType ) {
    this.parameter = parameter;
    this.parameterType = parameterType;
    this.name = parameter.getName();
    this.annotations = Arrays.stream( parameter.getAnnotations( ) ).collect( ImmutableMultiset.toImmutableMultiset() );
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
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
    return this.parameter.getAnnotation( annotationType ) != null;
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return Optional.ofNullable( this.parameter.getAnnotation( annotationType ) );
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
  public @NotNull Class< P > ParameterType( ) {
    return this.parameterType;
  }

}
