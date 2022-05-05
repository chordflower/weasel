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

package cc.chordflower.weasel.javafx.utilities.layouts;

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX Pane.
 */
@AvailableSince( "0.1.0" )
public class PaneBuilder {

  private final Pane pane = new Pane( );

  @Contract( " -> new" )
  public static @NotNull PaneBuilder builder( ) {

    return new PaneBuilder( );
  }

  public Pane build( ) {

    return pane;
  }

  public PaneBuilder add( Node... nodes ) {

    this.pane.getChildren( ).addAll( nodes );
    return this;
  }

  public PaneBuilder withSnapToPixel( boolean value ) {

    pane.setSnapToPixel( value );
    return this;
  }

  public PaneBuilder withPadding( Insets value ) {

    pane.setPadding( value );
    return this;
  }

  public PaneBuilder withBackground( Background value ) {

    pane.setBackground( value );
    return this;
  }

  public PaneBuilder withBorder( Border value ) {

    pane.setBorder( value );
    return this;
  }

  public PaneBuilder withOpaqueInsets( Insets value ) {

    pane.setOpaqueInsets( value );
    return this;
  }

  public PaneBuilder withMinWidth( double value ) {

    pane.setMinWidth( value );
    return this;
  }

  public PaneBuilder withMinHeight( double value ) {

    pane.setMinHeight( value );
    return this;
  }

  public PaneBuilder withMinSize( double minWidth, double minHeight ) {

    pane.setMinSize( minWidth, minHeight );
    return this;
  }

  public PaneBuilder withPrefWidth( double value ) {

    pane.setPrefWidth( value );
    return this;
  }

  public PaneBuilder withPrefHeight( double value ) {

    pane.setPrefHeight( value );
    return this;
  }

  public PaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    pane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public PaneBuilder withMaxWidth( double value ) {

    pane.setMaxWidth( value );
    return this;
  }

  public PaneBuilder withMaxHeight( double value ) {

    pane.setMaxHeight( value );
    return this;
  }

  public PaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    pane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public PaneBuilder withShape( Shape value ) {

    pane.setShape( value );
    return this;
  }

  public PaneBuilder withScaleShape( boolean value ) {

    pane.setScaleShape( value );
    return this;
  }

  public PaneBuilder withCenterShape( boolean value ) {

    pane.setCenterShape( value );
    return this;
  }

  public PaneBuilder withCacheShape( boolean value ) {

    pane.setCacheShape( value );
    return this;
  }

  public PaneBuilder withUserData( Object value ) {

    pane.setUserData( value );
    return this;
  }

  public PaneBuilder withId( String value ) {

    pane.setId( value );
    return this;
  }

  public PaneBuilder withStyle( String value ) {

    pane.setStyle( value );
    return this;
  }

  public PaneBuilder withVisible( boolean value ) {

    pane.setVisible( value );
    return this;
  }

  public PaneBuilder withCursor( Cursor value ) {

    pane.setCursor( value );
    return this;
  }

  public PaneBuilder withOpacity( double value ) {

    pane.setOpacity( value );
    return this;
  }

  public PaneBuilder withBlendMode( BlendMode value ) {

    pane.setBlendMode( value );
    return this;
  }

  public PaneBuilder withClip( Node value ) {

    pane.setClip( value );
    return this;
  }

  public PaneBuilder withCache( boolean value ) {

    pane.setCache( value );
    return this;
  }

  public PaneBuilder withCacheHint( CacheHint value ) {

    pane.setCacheHint( value );
    return this;
  }

  public PaneBuilder withEffect( Effect value ) {

    pane.setEffect( value );
    return this;
  }

  public PaneBuilder withDepthTest( DepthTest value ) {

    pane.setDepthTest( value );
    return this;
  }

  public PaneBuilder withDisable( boolean value ) {

    pane.setDisable( value );
    return this;
  }

  public PaneBuilder withPickOnBounds( boolean value ) {

    pane.setPickOnBounds( value );
    return this;
  }

  public PaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    pane.setOnDragEntered( value );
    return this;
  }

  public PaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    pane.setOnDragExited( value );
    return this;
  }

  public PaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    pane.setOnDragOver( value );
    return this;
  }

  public PaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    pane.setOnDragDropped( value );
    return this;
  }

  public PaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    pane.setOnDragDone( value );
    return this;
  }

  public PaneBuilder withManaged( boolean value ) {

    pane.setManaged( value );
    return this;
  }

  public PaneBuilder withLayoutX( double value ) {

    pane.setLayoutX( value );
    return this;
  }

  public PaneBuilder withLayoutY( double value ) {

    pane.setLayoutY( value );
    return this;
  }

  public PaneBuilder withViewOrder( double value ) {

    pane.setViewOrder( value );
    return this;
  }

  public PaneBuilder withTranslateX( double value ) {

    pane.setTranslateX( value );
    return this;
  }

  public PaneBuilder withTranslateY( double value ) {

    pane.setTranslateY( value );
    return this;
  }

  public PaneBuilder withTranslateZ( double value ) {

    pane.setTranslateZ( value );
    return this;
  }

  public PaneBuilder withScaleX( double value ) {

    pane.setScaleX( value );
    return this;
  }

  public PaneBuilder withScaleY( double value ) {

    pane.setScaleY( value );
    return this;
  }

  public PaneBuilder withScaleZ( double value ) {

    pane.setScaleZ( value );
    return this;
  }

  public PaneBuilder withRotate( double value ) {

    pane.setRotate( value );
    return this;
  }

  public PaneBuilder withRotationAxis( Point3D value ) {

    pane.setRotationAxis( value );
    return this;
  }

  public PaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    pane.setNodeOrientation( orientation );
    return this;
  }

  public PaneBuilder withMouseTransparent( boolean value ) {

    pane.setMouseTransparent( value );
    return this;
  }

  public PaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    pane.setOnContextMenuRequested( value );
    return this;
  }

  public PaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMouseClicked( value );
    return this;
  }

  public PaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMouseDragged( value );
    return this;
  }

  public PaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMouseEntered( value );
    return this;
  }

  public PaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMouseExited( value );
    return this;
  }

  public PaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMouseMoved( value );
    return this;
  }

  public PaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMousePressed( value );
    return this;
  }

  public PaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    pane.setOnMouseReleased( value );
    return this;
  }

  public PaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    pane.setOnDragDetected( value );
    return this;
  }

  public PaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    pane.setOnMouseDragOver( value );
    return this;
  }

  public PaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    pane.setOnMouseDragReleased( value );
    return this;
  }

  public PaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    pane.setOnMouseDragEntered( value );
    return this;
  }

  public PaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    pane.setOnMouseDragExited( value );
    return this;
  }

  public PaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    pane.setOnScrollStarted( value );
    return this;
  }

  public PaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    pane.setOnScroll( value );
    return this;
  }

  public PaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    pane.setOnScrollFinished( value );
    return this;
  }

  public PaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    pane.setOnRotationStarted( value );
    return this;
  }

  public PaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    pane.setOnRotate( value );
    return this;
  }

  public PaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    pane.setOnRotationFinished( value );
    return this;
  }

  public PaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    pane.setOnZoomStarted( value );
    return this;
  }

  public PaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    pane.setOnZoom( value );
    return this;
  }

  public PaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    pane.setOnZoomFinished( value );
    return this;
  }

  public PaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    pane.setOnSwipeUp( value );
    return this;
  }

  public PaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    pane.setOnSwipeDown( value );
    return this;
  }

  public PaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    pane.setOnSwipeLeft( value );
    return this;
  }

  public PaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    pane.setOnSwipeRight( value );
    return this;
  }

  public PaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    pane.setOnTouchPressed( value );
    return this;
  }

  public PaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    pane.setOnTouchMoved( value );
    return this;
  }

  public PaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    pane.setOnTouchReleased( value );
    return this;
  }

  public PaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    pane.setOnTouchStationary( value );
    return this;
  }

  public PaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    pane.setOnKeyPressed( value );
    return this;
  }

  public PaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    pane.setOnKeyReleased( value );
    return this;
  }

  public PaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    pane.setOnKeyTyped( value );
    return this;
  }

  public PaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    pane.setOnInputMethodTextChanged( value );
    return this;
  }

  public PaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    pane.setInputMethodRequests( value );
    return this;
  }

  public PaneBuilder withFocusTraversable( boolean value ) {

    pane.setFocusTraversable( value );
    return this;
  }

  public PaneBuilder withEventDispatcher( EventDispatcher value ) {

    pane.setEventDispatcher( value );
    return this;
  }

  public PaneBuilder withAccessibleRole( AccessibleRole value ) {

    pane.setAccessibleRole( value );
    return this;
  }

  public PaneBuilder withAccessibleRoleDescription( String value ) {

    pane.setAccessibleRoleDescription( value );
    return this;
  }

  public PaneBuilder withAccessibleText( String value ) {

    pane.setAccessibleText( value );
    return this;
  }

  public PaneBuilder withAccessibleHelp( String value ) {

    pane.setAccessibleHelp( value );
    return this;
  }

}
