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

package cc.chordflower.weasel.utils.annotations;

import org.jetbrains.annotations.ApiStatus.AvailableSince;

import java.lang.annotation.*;

/**
 * Used to decorate the inner type of a generic class, so that one can reason about it at runtime.
 */
@AvailableSince( "0.1.0" )
@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.RECORD_COMPONENT } )
public @interface GenericParameter {

  /**
   * The inner type of the generic class.
   */
  Class< ? > value( );

}
