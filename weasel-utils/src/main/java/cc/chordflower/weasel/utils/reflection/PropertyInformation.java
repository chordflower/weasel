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
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.StringJoiner;

/**
 * This interface describes a property (ala java beans).
 * @param <T> The type of the property.
 */
@AvailableSince( "0.1.0" )
public abstract class PropertyInformation<T> implements IAnnotatedInformation {

  /**
   * Returns the property name.
   */
  @NotNull
  public abstract String Name( );

  /**
   * Returns if this property is read-only.
   */
  public abstract boolean isReadOnly( );

  /**
   * Returns the property type.
   */
  @NotNull
  public abstract Class<T> PropertyType( );

  /**
   * Returns the associated property field information.
   */
  @NotNull
  public abstract FieldInformation<T> Field( );

  /**
   * Returns the associated property getter information.
   */
  @NotNull
  public abstract MethodInformation<T> Getter( );

  /**
   * Returns the associated property setter information or an empty optional, if this property is read-only.
   */
  @NotNull
  public abstract Optional< MethodInformation<Void> > Setter( );

  @Override
  public String toString( ) {
    return new StringJoiner( ", ", "{", "}" )
        .add( "\"name\": \"" + Name() + "\"" )
        .add( "\"readOnly\": " + isReadOnly() )
        .add( "\"propertyType\": \"" + PropertyType().getCanonicalName() + "\"" )
        .add( "\"field\": " + Field() )
        .add( "\"getter\": " + Getter() )
        .add( "\"setter\": " + Setter() )
        .toString( );
  }

}
