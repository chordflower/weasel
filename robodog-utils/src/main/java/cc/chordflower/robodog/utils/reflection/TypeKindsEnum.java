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

package cc.chordflower.robodog.utils.reflection;

import org.jetbrains.annotations.ApiStatus.AvailableSince;

import javax.lang.model.element.ElementKind;
import java.util.Arrays;

/**
 * This enumeration represents all of the possible types available in java.
 */
@AvailableSince( "0.1.0" )
public enum TypeKindsEnum {

  /**
   * Represents a class type.
   */
  CLASS( ElementKind.CLASS ),
  /**
   * Represents a record type.
   */
  RECORD( ElementKind.RECORD ),
  /**
   * Represents an interface type.
   */
  INTERFACE( ElementKind.INTERFACE ),
  /**
   * Represents an enum type.
   */
  ENUM( ElementKind.ENUM ),

  /**
   * Represents an unknown type.
   */
  UNKNOWN( ElementKind.OTHER );

  private final ElementKind elementKind;

  TypeKindsEnum( ElementKind elementKind ) {
    this.elementKind = elementKind;
  }

  /**
   * Returns the corresponding element kind of this type.
   */
  public ElementKind ElementKind( ) {
    return elementKind;
  }

  /**
   * Returns the type kind enum for the given element kind.
   *
   * @param elementKind The element kind to use.
   * @return The corresponding type kind.
   */
  public static TypeKindsEnum from( ElementKind elementKind ) {
    return Arrays.stream( TypeKindsEnum.values() ).filter( t -> t.elementKind.equals( elementKind ) )
        .findFirst().orElse( TypeKindsEnum.UNKNOWN );
  }
}
