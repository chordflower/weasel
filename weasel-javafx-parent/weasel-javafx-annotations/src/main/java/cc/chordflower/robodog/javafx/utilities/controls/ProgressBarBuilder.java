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
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Skin;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX ProgressBar.
 */
@AvailableSince( "0.1.0" )
public final class ProgressBarBuilder {

  private final ProgressBar built = new ProgressBar( );

  private ProgressBarBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull ProgressBarBuilder builder( ) {

    return new ProgressBarBuilder( );
  }

  @Contract( pure = true )
  public ProgressBar build( ) {

    return this.built;
  }

  public ProgressBarBuilder withProgress( double value ) {

    built.setProgress( value );
    return this;
  }

  public ProgressBarBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ProgressBarBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ProgressBarBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ProgressBarBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ProgressBarBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ProgressBarBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ProgressBarBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ProgressBarBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ProgressBarBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ProgressBarBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ProgressBarBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ProgressBarBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ProgressBarBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ProgressBarBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ProgressBarBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ProgressBarBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ProgressBarBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ProgressBarBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ProgressBarBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ProgressBarBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ProgressBarBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ProgressBarBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ProgressBarBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public ProgressBarBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ProgressBarBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ProgressBarBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ProgressBarBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ProgressBarBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ProgressBarBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ProgressBarBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ProgressBarBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ProgressBarBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ProgressBarBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ProgressBarBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ProgressBarBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ProgressBarBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ProgressBarBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ProgressBarBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ProgressBarBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ProgressBarBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ProgressBarBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ProgressBarBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ProgressBarBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ProgressBarBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ProgressBarBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ProgressBarBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ProgressBarBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ProgressBarBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ProgressBarBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ProgressBarBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ProgressBarBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ProgressBarBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ProgressBarBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ProgressBarBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ProgressBarBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ProgressBarBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ProgressBarBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ProgressBarBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ProgressBarBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ProgressBarBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ProgressBarBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ProgressBarBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ProgressBarBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ProgressBarBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ProgressBarBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ProgressBarBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ProgressBarBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ProgressBarBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ProgressBarBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ProgressBarBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ProgressBarBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ProgressBarBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ProgressBarBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ProgressBarBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ProgressBarBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ProgressBarBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ProgressBarBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ProgressBarBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ProgressBarBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ProgressBarBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ProgressBarBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ProgressBarBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ProgressBarBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ProgressBarBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ProgressBarBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ProgressBarBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
