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

package cc.chordflower.robodog.javafx.utilities.controls;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class RadioMenuItemBuilder {

  private final RadioMenuItem built = new RadioMenuItem( );

  private RadioMenuItemBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull RadioMenuItemBuilder builder( ) {

    return new RadioMenuItemBuilder( );
  }

  @Contract( pure = true )
  public RadioMenuItem build( ) {

    return this.built;
  }

  public RadioMenuItemBuilder withToggleGroup( ToggleGroup value ) {

    built.setToggleGroup( value );
    return this;
  }

  public RadioMenuItemBuilder withSelected( boolean value ) {

    built.setSelected( value );
    return this;
  }

  public RadioMenuItemBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public RadioMenuItemBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public RadioMenuItemBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public RadioMenuItemBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public RadioMenuItemBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public RadioMenuItemBuilder withOnMenuValidation( EventHandler< Event > value ) {

    built.setOnMenuValidation( value );
    return this;
  }

  public RadioMenuItemBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public RadioMenuItemBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public RadioMenuItemBuilder withAccelerator( KeyCombination value ) {

    built.setAccelerator( value );
    return this;
  }

  public RadioMenuItemBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public RadioMenuItemBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

}
