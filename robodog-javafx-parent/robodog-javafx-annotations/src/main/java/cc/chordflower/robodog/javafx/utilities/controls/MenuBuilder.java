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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class MenuBuilder {

  private final Menu built = new Menu();

  private MenuBuilder( ) {
  }

  @Contract( " -> new" )
  public static @NotNull MenuBuilder builder( ) {
    return new MenuBuilder();
  }

  @Contract( pure = true )
  public Menu build( ) {
    return this.built;
  }

  public MenuBuilder add( MenuItem... items ) {
    built.getItems().addAll( items );
    return this;
  }

  public MenuBuilder withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public MenuBuilder withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public MenuBuilder withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public MenuBuilder withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public MenuBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public MenuBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public MenuBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public MenuBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public MenuBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public MenuBuilder withOnMenuValidation( EventHandler< Event > value ) {

    built.setOnMenuValidation( value );
    return this;
  }

  public MenuBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public MenuBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public MenuBuilder withAccelerator( KeyCombination value ) {

    built.setAccelerator( value );
    return this;
  }

  public MenuBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public MenuBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

}
