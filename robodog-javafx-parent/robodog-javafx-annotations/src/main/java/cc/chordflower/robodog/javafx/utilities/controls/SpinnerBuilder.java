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
import javafx.util.Duration;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class SpinnerBuilder< T > {

  private final Spinner< T > built = new Spinner<>( );

  private SpinnerBuilder( ) {

  }

  @Contract( " -> new" )
  public static < T > @NotNull SpinnerBuilder< T > builder( ) {

    return new SpinnerBuilder<>( );
  }

  @Contract( pure = true )
  public Spinner< T > build( ) {

    return this.built;
  }

  public SpinnerBuilder< T > withValueFactory( SpinnerValueFactory< T > value ) {

    built.setValueFactory( value );
    return this;
  }

  public SpinnerBuilder< T > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public SpinnerBuilder< T > withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public SpinnerBuilder< T > withInitialDelay( Duration value ) {

    built.setInitialDelay( value );
    return this;
  }

  public SpinnerBuilder< T > withRepeatDelay( Duration value ) {

    built.setRepeatDelay( value );
    return this;
  }

  public SpinnerBuilder< T > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public SpinnerBuilder< T > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public SpinnerBuilder< T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public SpinnerBuilder< T > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public SpinnerBuilder< T > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public SpinnerBuilder< T > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public SpinnerBuilder< T > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public SpinnerBuilder< T > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public SpinnerBuilder< T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public SpinnerBuilder< T > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public SpinnerBuilder< T > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public SpinnerBuilder< T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public SpinnerBuilder< T > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public SpinnerBuilder< T > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public SpinnerBuilder< T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public SpinnerBuilder< T > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public SpinnerBuilder< T > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public SpinnerBuilder< T > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public SpinnerBuilder< T > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public SpinnerBuilder< T > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public SpinnerBuilder< T > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public SpinnerBuilder< T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public SpinnerBuilder< T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public SpinnerBuilder< T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public SpinnerBuilder< T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public SpinnerBuilder< T > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public SpinnerBuilder< T > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public SpinnerBuilder< T > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public SpinnerBuilder< T > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public SpinnerBuilder< T > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public SpinnerBuilder< T > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public SpinnerBuilder< T > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public SpinnerBuilder< T > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public SpinnerBuilder< T > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public SpinnerBuilder< T > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public SpinnerBuilder< T > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public SpinnerBuilder< T > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public SpinnerBuilder< T > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public SpinnerBuilder< T > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public SpinnerBuilder< T > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public SpinnerBuilder< T > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public SpinnerBuilder< T > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public SpinnerBuilder< T > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public SpinnerBuilder< T > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public SpinnerBuilder< T > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public SpinnerBuilder< T > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public SpinnerBuilder< T > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public SpinnerBuilder< T > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public SpinnerBuilder< T > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public SpinnerBuilder< T > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public SpinnerBuilder< T > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public SpinnerBuilder< T > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public SpinnerBuilder< T > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public SpinnerBuilder< T > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public SpinnerBuilder< T > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public SpinnerBuilder< T > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public SpinnerBuilder< T > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public SpinnerBuilder< T > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public SpinnerBuilder< T > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public SpinnerBuilder< T > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public SpinnerBuilder< T > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public SpinnerBuilder< T > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public SpinnerBuilder< T > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public SpinnerBuilder< T > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public SpinnerBuilder< T > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public SpinnerBuilder< T > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public SpinnerBuilder< T > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public SpinnerBuilder< T > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public SpinnerBuilder< T > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public SpinnerBuilder< T > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public SpinnerBuilder< T > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public SpinnerBuilder< T > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public SpinnerBuilder< T > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public SpinnerBuilder< T > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public SpinnerBuilder< T > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public SpinnerBuilder< T > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public SpinnerBuilder< T > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public SpinnerBuilder< T > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public SpinnerBuilder< T > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public SpinnerBuilder< T > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public SpinnerBuilder< T > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public SpinnerBuilder< T > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public SpinnerBuilder< T > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public SpinnerBuilder< T > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public SpinnerBuilder< T > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
