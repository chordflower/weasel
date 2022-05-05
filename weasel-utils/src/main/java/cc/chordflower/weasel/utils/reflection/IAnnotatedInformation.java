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

import com.google.common.collect.ImmutableMultiset;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.lang.annotation.Annotation;
import java.util.Optional;

/**
 * This interface describes a annotation.
 */
@AvailableSince( "0.1.0" )
interface IAnnotatedInformation {

  /**
   * All annotations available in the type.
   */
  @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( );

  /**
   * Checks if the type has the given annotation.
   *
   * @param annotationType The annotation type to check.
   * @param <A> The type of the annotation.
   * @return True if this annotation is in this type, false otherwise.
   */
  < A extends Annotation > boolean hasAnnotation( @NotNull Class< A > annotationType );

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @param <A> The type of the annotation.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  < A extends Annotation > @NotNull Optional< A > Annotation( @NotNull Class< A > annotationType );

}
