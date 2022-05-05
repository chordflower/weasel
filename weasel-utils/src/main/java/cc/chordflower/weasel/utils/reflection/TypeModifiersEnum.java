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

import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;

/**
 * Enumeration that represents the java modifiers.
 *
 * It unifies the java.lang.reflect.Modifier and javax.lang.model.element.Modifier.
 */
@AvailableSince( "0.1.0" )
public enum TypeModifiersEnum {

  PUBLIC( Modifier.PUBLIC, javax.lang.model.element.Modifier.PUBLIC ),
  PROTECTED( Modifier.PROTECTED, javax.lang.model.element.Modifier.PROTECTED ),
  PRIVATE( Modifier.PRIVATE, javax.lang.model.element.Modifier.PRIVATE ),
  ABSTRACT( Modifier.ABSTRACT, javax.lang.model.element.Modifier.ABSTRACT ),
  STATIC( Modifier.STATIC, javax.lang.model.element.Modifier.STATIC ),
  FINAL( Modifier.FINAL, javax.lang.model.element.Modifier.FINAL ),
  TRANSIENT( Modifier.TRANSIENT, javax.lang.model.element.Modifier.TRANSIENT ),
  VOLATILE( Modifier.VOLATILE, javax.lang.model.element.Modifier.VOLATILE ),
  SYNCHRONIZED( Modifier.SYNCHRONIZED, javax.lang.model.element.Modifier.SYNCHRONIZED ),
  NATIVE( Modifier.NATIVE, javax.lang.model.element.Modifier.NATIVE ),
  STRICT( Modifier.STRICT, javax.lang.model.element.Modifier.STRICTFP ),
  UNKNOWN( -1, null );

  private final int modifier1;

  private final javax.lang.model.element.Modifier modifier2;

  @Contract( pure = true )
  TypeModifiersEnum( int modifier1, javax.lang.model.element.Modifier modifier2 ) {
    this.modifier1 = modifier1;
    this.modifier2 = modifier2;
  }

  /**
   * Returns the java.lang.reflect.Modifier, represented by this modifier.
   */
  @Contract( pure = true )
  public int ReflectModifier( ) {
    return modifier1;
  }

  /**
   * Returns the javax.lang.model.element.Modifier, represented by this modifier.
   */
  @Contract( pure = true )
  public javax.lang.model.element.Modifier ModelModifier( ) {
    return modifier2;
  }

  /**
   * Returns a TypeModifierEnum given the corresponding java.lang.reflect.Modifier.
   * @param modifier The java.lang.reflect.Modifier to look for.
   * @return The TypeModifierEnum corresponding to the given modifier.
   */
  public static TypeModifiersEnum from( int modifier ) {
    return Arrays.stream( TypeModifiersEnum.values( ) ).filter( m -> m.modifier1 == modifier ).findFirst()
        .orElse( TypeModifiersEnum.UNKNOWN );
  }

  /**
   * Returns a TypeModifierEnum given the corresponding javax.lang.model.element.Modifier.
   * @param modifier The javax.lang.model.element.Modifier to look for.
   * @return The TypeModifierEnum corresponding to the given modifier.
   */
  public static TypeModifiersEnum from( javax.lang.model.element.Modifier modifier ) {
    Objects.requireNonNull( modifier );
    return Arrays.stream( TypeModifiersEnum.values( ) )
        .filter( m -> m.modifier2 == Objects.requireNonNull( modifier ) ).findFirst()
        .orElse( TypeModifiersEnum.UNKNOWN );
  }
}
