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

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class MenuBarBuilder {

  private final MenuBar built = new MenuBar( );

  private MenuBarBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull MenuBarBuilder builder( ) {

    return new MenuBarBuilder( );
  }

  @Contract( pure = true )
  public MenuBar build( ) {

    return this.built;
  }

  public MenuBarBuilder add( Menu... menus) {
    built.getMenus().addAll( menus );
    return this;
  }

  public MenuBarBuilder withUseSystemMenuBar( boolean value ) {

    built.setUseSystemMenuBar( value );
    return this;
  }

  public MenuBarBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public MenuBarBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public MenuBarBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public MenuBarBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public MenuBarBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public MenuBarBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public MenuBarBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public MenuBarBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public MenuBarBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public MenuBarBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public MenuBarBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public MenuBarBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public MenuBarBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public MenuBarBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public MenuBarBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public MenuBarBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public MenuBarBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public MenuBarBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public MenuBarBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public MenuBarBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public MenuBarBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public MenuBarBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public MenuBarBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public MenuBarBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public MenuBarBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public MenuBarBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public MenuBarBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public MenuBarBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public MenuBarBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public MenuBarBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public MenuBarBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public MenuBarBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public MenuBarBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public MenuBarBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public MenuBarBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public MenuBarBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public MenuBarBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public MenuBarBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public MenuBarBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public MenuBarBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public MenuBarBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public MenuBarBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public MenuBarBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public MenuBarBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public MenuBarBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public MenuBarBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public MenuBarBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public MenuBarBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public MenuBarBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public MenuBarBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public MenuBarBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public MenuBarBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public MenuBarBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public MenuBarBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public MenuBarBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public MenuBarBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public MenuBarBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public MenuBarBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public MenuBarBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public MenuBarBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public MenuBarBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public MenuBarBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public MenuBarBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public MenuBarBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public MenuBarBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public MenuBarBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public MenuBarBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public MenuBarBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public MenuBarBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public MenuBarBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public MenuBarBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public MenuBarBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public MenuBarBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public MenuBarBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public MenuBarBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public MenuBarBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public MenuBarBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public MenuBarBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public MenuBarBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public MenuBarBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public MenuBarBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public MenuBarBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public MenuBarBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public MenuBarBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public MenuBarBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public MenuBarBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public MenuBarBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public MenuBarBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public MenuBarBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public MenuBarBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public MenuBarBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public MenuBarBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public MenuBarBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public MenuBarBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public MenuBarBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
