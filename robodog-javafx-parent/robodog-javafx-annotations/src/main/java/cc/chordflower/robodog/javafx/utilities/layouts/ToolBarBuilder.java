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

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Skin;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ToolBarBuilder {

  private final ToolBar toolBar;

  private ToolBarBuilder( ) {

    this.toolBar = new ToolBar( );
  }

  @Contract( " -> new" )
  public static @NotNull ToolBarBuilder builder( ) {

    return new ToolBarBuilder( );
  }

  public ToolBarBuilder withOrientation( Orientation value ) {

    toolBar.setOrientation( value );
    return this;
  }

  public ToolBarBuilder withSkin( Skin< ? > value ) {

    toolBar.setSkin( value );
    return this;
  }

  public ToolBarBuilder withTooltip( Tooltip value ) {

    toolBar.setTooltip( value );
    return this;
  }

  public ToolBarBuilder withContextMenu( ContextMenu value ) {

    toolBar.setContextMenu( value );
    return this;
  }

  public ToolBarBuilder withSnapToPixel( boolean value ) {

    toolBar.setSnapToPixel( value );
    return this;
  }

  public ToolBarBuilder withPadding( Insets value ) {

    toolBar.setPadding( value );
    return this;
  }

  public ToolBarBuilder withBackground( Background value ) {

    toolBar.setBackground( value );
    return this;
  }

  public ToolBarBuilder withBorder( Border value ) {

    toolBar.setBorder( value );
    return this;
  }

  public ToolBarBuilder withOpaqueInsets( Insets value ) {

    toolBar.setOpaqueInsets( value );
    return this;
  }

  public ToolBarBuilder withMinWidth( double value ) {

    toolBar.setMinWidth( value );
    return this;
  }

  public ToolBarBuilder withMinHeight( double value ) {

    toolBar.setMinHeight( value );
    return this;
  }

  public ToolBarBuilder withMinSize( double minWidth, double minHeight ) {

    toolBar.setMinSize( minWidth, minHeight );
    return this;
  }

  public ToolBarBuilder withPrefWidth( double value ) {

    toolBar.setPrefWidth( value );
    return this;
  }

  public ToolBarBuilder withPrefHeight( double value ) {

    toolBar.setPrefHeight( value );
    return this;
  }

  public ToolBarBuilder withPrefSize( double prefWidth, double prefHeight ) {

    toolBar.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ToolBarBuilder withMaxWidth( double value ) {

    toolBar.setMaxWidth( value );
    return this;
  }

  public ToolBarBuilder withMaxHeight( double value ) {

    toolBar.setMaxHeight( value );
    return this;
  }

  public ToolBarBuilder withMaxSize( double maxWidth, double maxHeight ) {

    toolBar.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ToolBarBuilder withShape( Shape value ) {

    toolBar.setShape( value );
    return this;
  }

  public ToolBarBuilder withScaleShape( boolean value ) {

    toolBar.setScaleShape( value );
    return this;
  }

  public ToolBarBuilder withCenterShape( boolean value ) {

    toolBar.setCenterShape( value );
    return this;
  }

  public ToolBarBuilder withCacheShape( boolean value ) {

    toolBar.setCacheShape( value );
    return this;
  }

  public ToolBarBuilder withUserData( Object value ) {

    toolBar.setUserData( value );
    return this;
  }

  public ToolBarBuilder withId( String value ) {

    toolBar.setId( value );
    return this;
  }

  public ToolBarBuilder withStyle( String value ) {

    toolBar.setStyle( value );
    return this;
  }

  public ToolBarBuilder withVisible( boolean value ) {

    toolBar.setVisible( value );
    return this;
  }

  public ToolBarBuilder withCursor( Cursor value ) {

    toolBar.setCursor( value );
    return this;
  }

  public ToolBarBuilder withOpacity( double value ) {

    toolBar.setOpacity( value );
    return this;
  }

  public ToolBarBuilder withBlendMode( BlendMode value ) {

    toolBar.setBlendMode( value );
    return this;
  }

  public ToolBarBuilder withClip( Node value ) {

    toolBar.setClip( value );
    return this;
  }

  public ToolBarBuilder withCache( boolean value ) {

    toolBar.setCache( value );
    return this;
  }

  public ToolBarBuilder withCacheHint( CacheHint value ) {

    toolBar.setCacheHint( value );
    return this;
  }

  public ToolBarBuilder withEffect( Effect value ) {

    toolBar.setEffect( value );
    return this;
  }

  public ToolBarBuilder withDepthTest( DepthTest value ) {

    toolBar.setDepthTest( value );
    return this;
  }

  public ToolBarBuilder withDisable( boolean value ) {

    toolBar.setDisable( value );
    return this;
  }

  public ToolBarBuilder withPickOnBounds( boolean value ) {

    toolBar.setPickOnBounds( value );
    return this;
  }

  public ToolBarBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    toolBar.setOnDragEntered( value );
    return this;
  }

  public ToolBarBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    toolBar.setOnDragExited( value );
    return this;
  }

  public ToolBarBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    toolBar.setOnDragOver( value );
    return this;
  }

  public ToolBarBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    toolBar.setOnDragDropped( value );
    return this;
  }

  public ToolBarBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    toolBar.setOnDragDone( value );
    return this;
  }

  public ToolBarBuilder withManaged( boolean value ) {

    toolBar.setManaged( value );
    return this;
  }

  public ToolBarBuilder withLayoutX( double value ) {

    toolBar.setLayoutX( value );
    return this;
  }

  public ToolBarBuilder withLayoutY( double value ) {

    toolBar.setLayoutY( value );
    return this;
  }

  public ToolBarBuilder withViewOrder( double value ) {

    toolBar.setViewOrder( value );
    return this;
  }

  public ToolBarBuilder withTranslateX( double value ) {

    toolBar.setTranslateX( value );
    return this;
  }

  public ToolBarBuilder withTranslateY( double value ) {

    toolBar.setTranslateY( value );
    return this;
  }

  public ToolBarBuilder withTranslateZ( double value ) {

    toolBar.setTranslateZ( value );
    return this;
  }

  public ToolBarBuilder withScaleX( double value ) {

    toolBar.setScaleX( value );
    return this;
  }

  public ToolBarBuilder withScaleY( double value ) {

    toolBar.setScaleY( value );
    return this;
  }

  public ToolBarBuilder withScaleZ( double value ) {

    toolBar.setScaleZ( value );
    return this;
  }

  public ToolBarBuilder withRotate( double value ) {

    toolBar.setRotate( value );
    return this;
  }

  public ToolBarBuilder withRotationAxis( Point3D value ) {

    toolBar.setRotationAxis( value );
    return this;
  }

  public ToolBarBuilder withNodeOrientation( NodeOrientation orientation ) {

    toolBar.setNodeOrientation( orientation );
    return this;
  }

  public ToolBarBuilder withMouseTransparent( boolean value ) {

    toolBar.setMouseTransparent( value );
    return this;
  }

  public ToolBarBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    toolBar.setOnContextMenuRequested( value );
    return this;
  }

  public ToolBarBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMouseClicked( value );
    return this;
  }

  public ToolBarBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMouseDragged( value );
    return this;
  }

  public ToolBarBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMouseEntered( value );
    return this;
  }

  public ToolBarBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMouseExited( value );
    return this;
  }

  public ToolBarBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMouseMoved( value );
    return this;
  }

  public ToolBarBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMousePressed( value );
    return this;
  }

  public ToolBarBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnMouseReleased( value );
    return this;
  }

  public ToolBarBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    toolBar.setOnDragDetected( value );
    return this;
  }

  public ToolBarBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    toolBar.setOnMouseDragOver( value );
    return this;
  }

  public ToolBarBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    toolBar.setOnMouseDragReleased( value );
    return this;
  }

  public ToolBarBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    toolBar.setOnMouseDragEntered( value );
    return this;
  }

  public ToolBarBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    toolBar.setOnMouseDragExited( value );
    return this;
  }

  public ToolBarBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    toolBar.setOnScrollStarted( value );
    return this;
  }

  public ToolBarBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    toolBar.setOnScroll( value );
    return this;
  }

  public ToolBarBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    toolBar.setOnScrollFinished( value );
    return this;
  }

  public ToolBarBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    toolBar.setOnRotationStarted( value );
    return this;
  }

  public ToolBarBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    toolBar.setOnRotate( value );
    return this;
  }

  public ToolBarBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    toolBar.setOnRotationFinished( value );
    return this;
  }

  public ToolBarBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    toolBar.setOnZoomStarted( value );
    return this;
  }

  public ToolBarBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    toolBar.setOnZoom( value );
    return this;
  }

  public ToolBarBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    toolBar.setOnZoomFinished( value );
    return this;
  }

  public ToolBarBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    toolBar.setOnSwipeUp( value );
    return this;
  }

  public ToolBarBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    toolBar.setOnSwipeDown( value );
    return this;
  }

  public ToolBarBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    toolBar.setOnSwipeLeft( value );
    return this;
  }

  public ToolBarBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    toolBar.setOnSwipeRight( value );
    return this;
  }

  public ToolBarBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    toolBar.setOnTouchPressed( value );
    return this;
  }

  public ToolBarBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    toolBar.setOnTouchMoved( value );
    return this;
  }

  public ToolBarBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    toolBar.setOnTouchReleased( value );
    return this;
  }

  public ToolBarBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    toolBar.setOnTouchStationary( value );
    return this;
  }

  public ToolBarBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    toolBar.setOnKeyPressed( value );
    return this;
  }

  public ToolBarBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    toolBar.setOnKeyReleased( value );
    return this;
  }

  public ToolBarBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    toolBar.setOnKeyTyped( value );
    return this;
  }

  public ToolBarBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    toolBar.setOnInputMethodTextChanged( value );
    return this;
  }

  public ToolBarBuilder withInputMethodRequests( InputMethodRequests value ) {

    toolBar.setInputMethodRequests( value );
    return this;
  }

  public ToolBarBuilder withFocusTraversable( boolean value ) {

    toolBar.setFocusTraversable( value );
    return this;
  }

  public ToolBarBuilder withEventDispatcher( EventDispatcher value ) {

    toolBar.setEventDispatcher( value );
    return this;
  }

  public ToolBarBuilder withAccessibleRole( AccessibleRole value ) {

    toolBar.setAccessibleRole( value );
    return this;
  }

  public ToolBarBuilder withAccessibleRoleDescription( String value ) {

    toolBar.setAccessibleRoleDescription( value );
    return this;
  }

  public ToolBarBuilder withAccessibleText( String value ) {

    toolBar.setAccessibleText( value );
    return this;
  }

  public ToolBarBuilder withAccessibleHelp( String value ) {

    toolBar.setAccessibleHelp( value );
    return this;
  }

  public ToolBarBuilder add( Node... nodes ) {

    toolBar.getItems( ).addAll( nodes );
    return this;
  }

  public ToolBar build( ) {

    return toolBar;
  }

}
