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
import javafx.scene.control.CustomMenuItem;
import javafx.scene.input.KeyCombination;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX CustomMenuItem.
 */
@AvailableSince( "0.1.0" )
public final class CustomMenuItemBuilder {

  private final CustomMenuItem built = new CustomMenuItem();

  private CustomMenuItemBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull CustomMenuItemBuilder builder( ) {

    return new CustomMenuItemBuilder();
  }

  @Contract( pure = true )
  public CustomMenuItem build( ) {

    return this.built;
  }

  public CustomMenuItemBuilder withContent( Node value ) {

    built.setContent( value );
    return this;
  }

  public CustomMenuItemBuilder withHideOnClick( boolean value ) {

    built.setHideOnClick( value );
    return this;
  }

  public CustomMenuItemBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public CustomMenuItemBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public CustomMenuItemBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public CustomMenuItemBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public CustomMenuItemBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public CustomMenuItemBuilder withOnMenuValidation( EventHandler< Event > value ) {

    built.setOnMenuValidation( value );
    return this;
  }

  public CustomMenuItemBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public CustomMenuItemBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public CustomMenuItemBuilder withAccelerator( KeyCombination value ) {

    built.setAccelerator( value );
    return this;
  }

  public CustomMenuItemBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public CustomMenuItemBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

}
