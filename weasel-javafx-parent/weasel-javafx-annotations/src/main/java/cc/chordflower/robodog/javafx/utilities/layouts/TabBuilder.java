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

package cc.chordflower.robodog.javafx.utilities.layouts;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Tab;
import javafx.scene.control.Tooltip;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX Tab.
 */
@AvailableSince( "0.1.0" )
public class TabBuilder {

  private final Tab tab = new Tab( );

  @Contract( " -> new" )
  public static @NotNull TabBuilder builder( ) {

    return new TabBuilder( );
  }

  public Tab build( ) {

    return tab;
  }

  public TabBuilder withId( String value ) {

    tab.setId( value );
    return this;
  }

  public TabBuilder withStyle( String value ) {

    tab.setStyle( value );
    return this;
  }

  public TabBuilder withText( String value ) {

    tab.setText( value );
    return this;
  }

  public TabBuilder withGraphic( Node value ) {

    tab.setGraphic( value );
    return this;
  }

  public TabBuilder withContent( Node value ) {

    tab.setContent( value );
    return this;
  }

  public TabBuilder withContextMenu( ContextMenu value ) {

    tab.setContextMenu( value );
    return this;
  }

  public TabBuilder withClosable( boolean value ) {

    tab.setClosable( value );
    return this;
  }

  public TabBuilder withOnSelectionChanged( EventHandler< Event > value ) {

    tab.setOnSelectionChanged( value );
    return this;
  }

  public TabBuilder withOnClosed( EventHandler< Event > value ) {

    tab.setOnClosed( value );
    return this;
  }

  public TabBuilder withTooltip( Tooltip value ) {

    tab.setTooltip( value );
    return this;
  }

  public TabBuilder withDisable( boolean value ) {

    tab.setDisable( value );
    return this;
  }

  public TabBuilder withOnCloseRequest( EventHandler< Event > value ) {

    tab.setOnCloseRequest( value );
    return this;
  }

  public TabBuilder withUserData( Object value ) {

    tab.setUserData( value );
    return this;
  }

}
