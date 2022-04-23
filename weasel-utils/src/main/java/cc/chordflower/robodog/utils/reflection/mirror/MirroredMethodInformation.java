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
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import javax.lang.model.element.ExecutableElement;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes a method.
 * @param <R> The method type.
 */
@AvailableSince( "0.1.0" )
@Internal
@Unmodifiable
public class MirroredMethodInformation<R> extends MethodInformation< R > {

  private final Class< R > returnType;

  private final ExecutableElement method;

  private final String name;

  private final ImmutableSet< TypeModifiersEnum > modifiers;

  private ImmutableMultiset< Annotation > annotations;

  private ImmutableSet< ParameterInformation< ? > > parameters;

  public MirroredMethodInformation( @NotNull ExecutableElement method, boolean initialized, Class<R> returnType ) {
    this.returnType = returnType;
    this.method = method;
    this.name = method.getSimpleName( ).toString( );
    this.modifiers = method.getModifiers( ).stream( ).map( TypeModifiersEnum::from ).collect( ImmutableSet.toImmutableSet( ) );
    if( initialized ) {
      this.annotations = method.getAnnotationMirrors( ).stream( )
          .map( annotationMirror -> ReflectionUtils.< Annotation >getClassFromType( annotationMirror.getAnnotationType( ) ) )
          .filter( Objects::nonNull )
          .map( cl -> method.getAnnotation( ( Class< ? extends Annotation > ) cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset( ) );

      this.parameters = method.getParameters( ).stream( )
          .map( param -> new MirroredParameterInformation<>( param, true, ReflectionUtils.getClassFromType( param.asType( ) ) ) )
          .collect( ImmutableSet.toImmutableSet( ) );
    }
    if( initialized ) {
      this.annotations = method.getAnnotationMirrors( ).stream( )
          .map( annotationMirror -> ReflectionUtils.< Annotation >getClassFromType( annotationMirror.getAnnotationType( ) ) )
          .filter( Objects::nonNull )
          .map( cl -> method.getAnnotation( ( Class< ? extends Annotation > ) cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset( ) );

      this.parameters = method.getParameters( ).stream( )
          .map( param -> new MirroredParameterInformation<>( param, true, ReflectionUtils.getClassFromType( param.asType( ) ) ) )
          .collect( ImmutableSet.toImmutableSet( ) );
    }
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {

    if( this.annotations == null ) {
      this.annotations = method.getAnnotationMirrors( ).stream( )
          .map( annotationMirror -> ReflectionUtils.< Annotation >getClassFromType( annotationMirror.getAnnotationType( ) ) )
          .filter( Objects::nonNull )
          .map( cl -> method.getAnnotation( ( Class< ? extends Annotation > ) cl ) )
          .collect( ImmutableMultiset.toImmutableMultiset( ) );
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
   * The method parameters.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< ParameterInformation< ? > > Parameters( ) {

    if( parameters == null ) {
      this.parameters = method.getParameters( ).stream( )
          .map( param -> new MirroredParameterInformation<>( param, false, ReflectionUtils.getClassFromType( param.asType( ) ) ) )
          .collect( ImmutableSet.toImmutableSet( ) );
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

  /**
   * The method return type.
   */
  @Override
  public @NotNull Class< R > ReturnType( ) {
    return this.returnType;
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
    MirroredMethodInformation< ? > that = ( MirroredMethodInformation< ? > ) o;
    return Objects.equals( method, that.method );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( method );
  }
}
