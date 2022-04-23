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
 */
package cc.chordflower.robodog.utils;

import com.machinezoo.noexception.Exceptions;
import com.machinezoo.noexception.throwing.ThrowingSupplier;
import org.jetbrains.annotations.ApiStatus.AvailableSince;

import java.util.Optional;

/**
 * Utility class that contains some methods that deal with exceptions.
 */
@AvailableSince( "0.1.0" )
public final class ExceptionUtils {

  private ExceptionUtils( ) {

  }

  /**
   * Swallows all exceptions launched by the supplier and returns an optional, that is empty
   * if there was any exception.
   * @param supplier The supplier to invoke.
   * @return An optional with the result of the operation.
   */
  public static < T > Optional< T > convertToTry( ThrowingSupplier< T > supplier ) {

    return Exceptions.silence( ).get( Exceptions.wrap( ).supplier( supplier ) );
  }

}
