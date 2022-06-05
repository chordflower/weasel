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

import cc.chordflower.weasel.utils.reflection.MethodInformation;
import cc.chordflower.weasel.utils.reflection.ParameterInformation;
import cc.chordflower.weasel.utils.reflection.ReflectionUtils;
import cc.chordflower.weasel.utils.reflection.TypeModifiersEnum;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class RuntimeMethodInformation<R> extends MethodInformation<R> {

  private final Method method;

  private final Class< R > methodReturn;

  private final ImmutableMultiset< Annotation > annotations;

  private final String name;

  private ImmutableSet< ParameterInformation< ? > > parameters;

  private final ImmutableSet< TypeModifiersEnum > modifiers;

  RuntimeMethodInformation( Method method, boolean initialized, Class<R> methodReturn ) {
    this.method = method;
    this.methodReturn = methodReturn;
    this.name = method.getName();
    this.annotations = Arrays.stream( method.getAnnotations( ) ).collect( ImmutableMultiset.toImmutableMultiset() );
    this.modifiers = ReflectionUtils.getSetFromModifiers( method.getModifiers() );
    if( initialized ) {
      this.parameters = Arrays.stream( method.getParameters( ) )
          .map( p -> new RuntimeParameterInformation<>( p, true, p.getType() ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
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
    return this.method.getAnnotation( annotationType ) != null;
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return Optional.ofNullable( this.method.getAnnotation( annotationType ) );
  }

  /**
   * The method name.
   */
  @Override
  public @NotNull String Name( ) {
    return this.name;
  }

  /**
   * The method return type.
   */
  @Override
  public @NotNull Class< R > ReturnType( ) {
    return this.methodReturn;
  }

  /**
   * The method parameters.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< ParameterInformation< ? > > Parameters( ) {
    if( this.parameters == null ) {
      this.parameters = Arrays.stream( method.getParameters( ) )
          .map( p -> new RuntimeParameterInformation<>( p, false, p.getType() ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.parameters;
  }

  /**
   * The method modifiers.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< TypeModifiersEnum > Modifiers( ) {
    return this.modifiers;
  }

}
