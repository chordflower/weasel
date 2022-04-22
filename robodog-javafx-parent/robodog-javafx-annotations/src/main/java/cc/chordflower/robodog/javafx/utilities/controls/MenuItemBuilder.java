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
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class MenuItemBuilder {

  private final MenuItem built = new MenuItem();

  private MenuItemBuilder( ) { }

  @Contract( " -> new" )
  public static @NotNull MenuItemBuilder builder( ) {
    return new MenuItemBuilder();
  }

  @Contract( pure = true )
  public MenuItem build( ) {
    return this.built;
  }

  public MenuItemBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public MenuItemBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public MenuItemBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public MenuItemBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public MenuItemBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public MenuItemBuilder withOnMenuValidation( EventHandler< Event > value ) {

    built.setOnMenuValidation( value );
    return this;
  }

  public MenuItemBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public MenuItemBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public MenuItemBuilder withAccelerator( KeyCombination value ) {

    built.setAccelerator( value );
    return this;
  }

  public MenuItemBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public MenuItemBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

}
