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

import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Optional;
import java.util.StringJoiner;

/**
 * This interface contains information about a field.
 * @param <T> The field type.
 */
@AvailableSince( "0.1.0" )
public abstract class FieldInformation<T> implements IAnnotatedInformation {

  /**
   * The field name.
   */
  @NotNull
  public abstract String Name( );

  /**
   * The field type.
   */
  @NotNull
  public abstract Class<T> FieldType( );

  /**
   * The field modifiers.
   */
  @Unmodifiable @NotNull
  public abstract ImmutableSet< TypeModifiersEnum > Modifiers( );

  /**
   * The field value (if available).
   */
  @NotNull
  public abstract Optional<T> Value( );

  @Override
  public String toString( ) {
    return new StringJoiner( ", ", "{", "}" )
        .add( "\"name\": \"" + Name() + "\"" )
        .add( "\"fieldType\": \"" + FieldType().getCanonicalName() + "\"" )
        .add( "\"value\": \"" + Value().map( Object::toString ).orElse( "" ) + "\"" )
        .add( "\"annotations\": [" + String.join( ",", Annotations().stream().map( Object::toString ).toArray( String[]::new ) ) + "]" )
        .add( "\"modifiers\": [" + String.join( ",", Modifiers().stream().map( ReflectionUtils::wrapMe ).toArray( String[]::new ) ) + "]" )
        .toString( );
  }

}
