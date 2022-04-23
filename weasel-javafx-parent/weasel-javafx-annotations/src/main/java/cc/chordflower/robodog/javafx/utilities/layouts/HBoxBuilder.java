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
import javafx.geometry.Point3D;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX HBox.
 */
@AvailableSince( "0.1.0" )
public class HBoxBuilder {

  private final HBox hBox = new HBox( );

  @Contract( " -> new" )
  public static @NotNull HBoxBuilder builder( ) {

    return new HBoxBuilder( );
  }

  public HBox build( ) {

    return hBox;
  }

  public HBoxBuilder add( Node... nodes ) {

    this.hBox.getChildren( ).addAll( nodes );
    return this;
  }

  public HBoxBuilder withHgrow( Node child, Priority value ) {

    HBox.setHgrow( child, value );
    return this;
  }

  public HBoxBuilder withMargin( Node child, Insets value ) {

    HBox.setMargin( child, value );
    return this;
  }

  public HBoxBuilder withSpacing( double value ) {

    hBox.setSpacing( value );
    return this;
  }

  public HBoxBuilder withAlignment( Pos value ) {

    hBox.setAlignment( value );
    return this;
  }

  public HBoxBuilder withFillHeight( boolean value ) {

    hBox.setFillHeight( value );
    return this;
  }

  public HBoxBuilder withSnapToPixel( boolean value ) {

    hBox.setSnapToPixel( value );
    return this;
  }

  public HBoxBuilder withPadding( Insets value ) {

    hBox.setPadding( value );
    return this;
  }

  public HBoxBuilder withBackground( Background value ) {

    hBox.setBackground( value );
    return this;
  }

  public HBoxBuilder withBorder( Border value ) {

    hBox.setBorder( value );
    return this;
  }

  public HBoxBuilder withOpaqueInsets( Insets value ) {

    hBox.setOpaqueInsets( value );
    return this;
  }

  public HBoxBuilder withMinWidth( double value ) {

    hBox.setMinWidth( value );
    return this;
  }

  public HBoxBuilder withMinHeight( double value ) {

    hBox.setMinHeight( value );
    return this;
  }

  public HBoxBuilder withMinSize( double minWidth, double minHeight ) {

    hBox.setMinSize( minWidth, minHeight );
    return this;
  }

  public HBoxBuilder withPrefWidth( double value ) {

    hBox.setPrefWidth( value );
    return this;
  }

  public HBoxBuilder withPrefHeight( double value ) {

    hBox.setPrefHeight( value );
    return this;
  }

  public HBoxBuilder withPrefSize( double prefWidth, double prefHeight ) {

    hBox.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public HBoxBuilder withMaxWidth( double value ) {

    hBox.setMaxWidth( value );
    return this;
  }

  public HBoxBuilder withMaxHeight( double value ) {

    hBox.setMaxHeight( value );
    return this;
  }

  public HBoxBuilder withMaxSize( double maxWidth, double maxHeight ) {

    hBox.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public HBoxBuilder withShape( Shape value ) {

    hBox.setShape( value );
    return this;
  }

  public HBoxBuilder withScaleShape( boolean value ) {

    hBox.setScaleShape( value );
    return this;
  }

  public HBoxBuilder withCenterShape( boolean value ) {

    hBox.setCenterShape( value );
    return this;
  }

  public HBoxBuilder withCacheShape( boolean value ) {

    hBox.setCacheShape( value );
    return this;
  }

  public HBoxBuilder withUserData( Object value ) {

    hBox.setUserData( value );
    return this;
  }

  public HBoxBuilder withId( String value ) {

    hBox.setId( value );
    return this;
  }

  public HBoxBuilder withStyle( String value ) {

    hBox.setStyle( value );
    return this;
  }

  public HBoxBuilder withVisible( boolean value ) {

    hBox.setVisible( value );
    return this;
  }

  public HBoxBuilder withCursor( Cursor value ) {

    hBox.setCursor( value );
    return this;
  }

  public HBoxBuilder withOpacity( double value ) {

    hBox.setOpacity( value );
    return this;
  }

  public HBoxBuilder withBlendMode( BlendMode value ) {

    hBox.setBlendMode( value );
    return this;
  }

  public HBoxBuilder withClip( Node value ) {

    hBox.setClip( value );
    return this;
  }

  public HBoxBuilder withCache( boolean value ) {

    hBox.setCache( value );
    return this;
  }

  public HBoxBuilder withCacheHint( CacheHint value ) {

    hBox.setCacheHint( value );
    return this;
  }

  public HBoxBuilder withEffect( Effect value ) {

    hBox.setEffect( value );
    return this;
  }

  public HBoxBuilder withDepthTest( DepthTest value ) {

    hBox.setDepthTest( value );
    return this;
  }

  public HBoxBuilder withDisable( boolean value ) {

    hBox.setDisable( value );
    return this;
  }

  public HBoxBuilder withPickOnBounds( boolean value ) {

    hBox.setPickOnBounds( value );
    return this;
  }

  public HBoxBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    hBox.setOnDragEntered( value );
    return this;
  }

  public HBoxBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    hBox.setOnDragExited( value );
    return this;
  }

  public HBoxBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    hBox.setOnDragOver( value );
    return this;
  }

  public HBoxBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    hBox.setOnDragDropped( value );
    return this;
  }

  public HBoxBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    hBox.setOnDragDone( value );
    return this;
  }

  public HBoxBuilder withManaged( boolean value ) {

    hBox.setManaged( value );
    return this;
  }

  public HBoxBuilder withLayoutX( double value ) {

    hBox.setLayoutX( value );
    return this;
  }

  public HBoxBuilder withLayoutY( double value ) {

    hBox.setLayoutY( value );
    return this;
  }

  public HBoxBuilder withViewOrder( double value ) {

    hBox.setViewOrder( value );
    return this;
  }

  public HBoxBuilder withTranslateX( double value ) {

    hBox.setTranslateX( value );
    return this;
  }

  public HBoxBuilder withTranslateY( double value ) {

    hBox.setTranslateY( value );
    return this;
  }

  public HBoxBuilder withTranslateZ( double value ) {

    hBox.setTranslateZ( value );
    return this;
  }

  public HBoxBuilder withScaleX( double value ) {

    hBox.setScaleX( value );
    return this;
  }

  public HBoxBuilder withScaleY( double value ) {

    hBox.setScaleY( value );
    return this;
  }

  public HBoxBuilder withScaleZ( double value ) {

    hBox.setScaleZ( value );
    return this;
  }

  public HBoxBuilder withRotate( double value ) {

    hBox.setRotate( value );
    return this;
  }

  public HBoxBuilder withRotationAxis( Point3D value ) {

    hBox.setRotationAxis( value );
    return this;
  }

  public HBoxBuilder withNodeOrientation( NodeOrientation orientation ) {

    hBox.setNodeOrientation( orientation );
    return this;
  }

  public HBoxBuilder withMouseTransparent( boolean value ) {

    hBox.setMouseTransparent( value );
    return this;
  }

  public HBoxBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    hBox.setOnContextMenuRequested( value );
    return this;
  }

  public HBoxBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMouseClicked( value );
    return this;
  }

  public HBoxBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMouseDragged( value );
    return this;
  }

  public HBoxBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMouseEntered( value );
    return this;
  }

  public HBoxBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMouseExited( value );
    return this;
  }

  public HBoxBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMouseMoved( value );
    return this;
  }

  public HBoxBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMousePressed( value );
    return this;
  }

  public HBoxBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnMouseReleased( value );
    return this;
  }

  public HBoxBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    hBox.setOnDragDetected( value );
    return this;
  }

  public HBoxBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    hBox.setOnMouseDragOver( value );
    return this;
  }

  public HBoxBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    hBox.setOnMouseDragReleased( value );
    return this;
  }

  public HBoxBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    hBox.setOnMouseDragEntered( value );
    return this;
  }

  public HBoxBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    hBox.setOnMouseDragExited( value );
    return this;
  }

  public HBoxBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    hBox.setOnScrollStarted( value );
    return this;
  }

  public HBoxBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    hBox.setOnScroll( value );
    return this;
  }

  public HBoxBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    hBox.setOnScrollFinished( value );
    return this;
  }

  public HBoxBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    hBox.setOnRotationStarted( value );
    return this;
  }

  public HBoxBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    hBox.setOnRotate( value );
    return this;
  }

  public HBoxBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    hBox.setOnRotationFinished( value );
    return this;
  }

  public HBoxBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    hBox.setOnZoomStarted( value );
    return this;
  }

  public HBoxBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    hBox.setOnZoom( value );
    return this;
  }

  public HBoxBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    hBox.setOnZoomFinished( value );
    return this;
  }

  public HBoxBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    hBox.setOnSwipeUp( value );
    return this;
  }

  public HBoxBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    hBox.setOnSwipeDown( value );
    return this;
  }

  public HBoxBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    hBox.setOnSwipeLeft( value );
    return this;
  }

  public HBoxBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    hBox.setOnSwipeRight( value );
    return this;
  }

  public HBoxBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    hBox.setOnTouchPressed( value );
    return this;
  }

  public HBoxBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    hBox.setOnTouchMoved( value );
    return this;
  }

  public HBoxBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    hBox.setOnTouchReleased( value );
    return this;
  }

  public HBoxBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    hBox.setOnTouchStationary( value );
    return this;
  }

  public HBoxBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    hBox.setOnKeyPressed( value );
    return this;
  }

  public HBoxBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    hBox.setOnKeyReleased( value );
    return this;
  }

  public HBoxBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    hBox.setOnKeyTyped( value );
    return this;
  }

  public HBoxBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    hBox.setOnInputMethodTextChanged( value );
    return this;
  }

  public HBoxBuilder withInputMethodRequests( InputMethodRequests value ) {

    hBox.setInputMethodRequests( value );
    return this;
  }

  public HBoxBuilder withFocusTraversable( boolean value ) {

    hBox.setFocusTraversable( value );
    return this;
  }

  public HBoxBuilder withEventDispatcher( EventDispatcher value ) {

    hBox.setEventDispatcher( value );
    return this;
  }

  public HBoxBuilder withAccessibleRole( AccessibleRole value ) {

    hBox.setAccessibleRole( value );
    return this;
  }

  public HBoxBuilder withAccessibleRoleDescription( String value ) {

    hBox.setAccessibleRoleDescription( value );
    return this;
  }

  public HBoxBuilder withAccessibleText( String value ) {

    hBox.setAccessibleText( value );
    return this;
  }

  public HBoxBuilder withAccessibleHelp( String value ) {

    hBox.setAccessibleHelp( value );
    return this;
  }

}
