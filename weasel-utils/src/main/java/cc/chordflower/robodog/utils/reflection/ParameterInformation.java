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
import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

/**
 * This interface describes a parameter.
 */
@AvailableSince( "0.1.0" )
public abstract class ParameterInformation<T> implements IAnnotatedInformation {

  /**
   * Returns the parameter name.
   */
  @NotNull
  public abstract String Name( );

  /**
   * Returns the parameter type.
   */
  @NotNull
  public abstract Class<T> ParameterType( );

  @Override
  public String toString( ) {
    return new StringJoiner( ", ", "{", "}" )
        .add( "\"parameterType\": \"" + ParameterType().getCanonicalName() + "\"" )
        .add( "\"annotations\": [" + String.join( ",", Annotations().stream().map( Object::toString ).toArray( String[]::new ) ) + "]" )
        .add( "\"name\": \"" + Name() + "\"" )
        .toString( );
  }

}
