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
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Skin;
import javafx.stage.PopupWindow.AnchorLocation;
import javafx.stage.WindowEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ContextMenuBuilder {

  private final ContextMenu built = new ContextMenu();

  private ContextMenuBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull ContextMenuBuilder builder( ) {

    return new ContextMenuBuilder();
  }

  @Contract( pure = true )
  public ContextMenu build( ) {

    return this.built;
  }

  public ContextMenuBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public ContextMenuBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public ContextMenuBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ContextMenuBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ContextMenuBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ContextMenuBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ContextMenuBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ContextMenuBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ContextMenuBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ContextMenuBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ContextMenuBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ContextMenuBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ContextMenuBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ContextMenuBuilder withAutoFix( boolean value ) {

    built.setAutoFix( value );
    return this;
  }

  public ContextMenuBuilder withAutoHide( boolean value ) {

    built.setAutoHide( value );
    return this;
  }

  public ContextMenuBuilder withOnAutoHide( EventHandler< Event > value ) {

    built.setOnAutoHide( value );
    return this;
  }

  public ContextMenuBuilder withHideOnEscape( boolean value ) {

    built.setHideOnEscape( value );
    return this;
  }

  public ContextMenuBuilder withConsumeAutoHidingEvents( boolean value ) {

    built.setConsumeAutoHidingEvents( value );
    return this;
  }

  public ContextMenuBuilder withAnchorX( double value ) {

    built.setAnchorX( value );
    return this;
  }

  public ContextMenuBuilder withAnchorY( double value ) {

    built.setAnchorY( value );
    return this;
  }

  public ContextMenuBuilder withAnchorLocation( AnchorLocation value ) {

    built.setAnchorLocation( value );
    return this;
  }

  public ContextMenuBuilder withForceIntegerRenderScale( boolean forced ) {

    built.setForceIntegerRenderScale( forced );
    return this;
  }

  public ContextMenuBuilder withRenderScaleX( double scale ) {

    built.setRenderScaleX( scale );
    return this;
  }

  public ContextMenuBuilder withRenderScaleY( double scale ) {

    built.setRenderScaleY( scale );
    return this;
  }

  public ContextMenuBuilder withX( double value ) {

    built.setX( value );
    return this;
  }

  public ContextMenuBuilder withY( double value ) {

    built.setY( value );
    return this;
  }

  public ContextMenuBuilder withWidth( double value ) {

    built.setWidth( value );
    return this;
  }

  public ContextMenuBuilder withHeight( double value ) {

    built.setHeight( value );
    return this;
  }

  public ContextMenuBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ContextMenuBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ContextMenuBuilder withOnCloseRequest( EventHandler< WindowEvent > value ) {

    built.setOnCloseRequest( value );
    return this;
  }

  public ContextMenuBuilder withOnShowing( EventHandler< WindowEvent > value ) {

    built.setOnShowing( value );
    return this;
  }

  public ContextMenuBuilder withOnShown( EventHandler< WindowEvent > value ) {

    built.setOnShown( value );
    return this;
  }

  public ContextMenuBuilder withOnHiding( EventHandler< WindowEvent > value ) {

    built.setOnHiding( value );
    return this;
  }

  public ContextMenuBuilder withOnHidden( EventHandler< WindowEvent > value ) {

    built.setOnHidden( value );
    return this;
  }

  public ContextMenuBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

}
