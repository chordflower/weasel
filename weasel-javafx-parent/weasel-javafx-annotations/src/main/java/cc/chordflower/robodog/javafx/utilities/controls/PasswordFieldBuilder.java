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
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX PasswordField.
 */
@AvailableSince( "0.1.0" )
public final class PasswordFieldBuilder {

  private final PasswordField built = new PasswordField( );

  private PasswordFieldBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull PasswordFieldBuilder builder( ) {

    return new PasswordFieldBuilder( );
  }

  @Contract( pure = true )
  public PasswordField build( ) {

    return this.built;
  }

  public PasswordFieldBuilder withPrefColumnCount( int value ) {

    built.setPrefColumnCount( value );
    return this;
  }

  public PasswordFieldBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public PasswordFieldBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public PasswordFieldBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public PasswordFieldBuilder withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public PasswordFieldBuilder withTextFormatter( TextFormatter< ? > value ) {

    built.setTextFormatter( value );
    return this;
  }

  public PasswordFieldBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public PasswordFieldBuilder withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public PasswordFieldBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public PasswordFieldBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public PasswordFieldBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public PasswordFieldBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public PasswordFieldBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public PasswordFieldBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public PasswordFieldBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public PasswordFieldBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public PasswordFieldBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public PasswordFieldBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public PasswordFieldBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public PasswordFieldBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public PasswordFieldBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public PasswordFieldBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public PasswordFieldBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public PasswordFieldBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public PasswordFieldBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public PasswordFieldBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public PasswordFieldBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public PasswordFieldBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public PasswordFieldBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public PasswordFieldBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public PasswordFieldBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public PasswordFieldBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public PasswordFieldBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public PasswordFieldBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public PasswordFieldBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public PasswordFieldBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public PasswordFieldBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public PasswordFieldBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public PasswordFieldBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public PasswordFieldBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public PasswordFieldBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public PasswordFieldBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public PasswordFieldBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public PasswordFieldBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public PasswordFieldBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public PasswordFieldBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public PasswordFieldBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public PasswordFieldBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public PasswordFieldBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public PasswordFieldBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public PasswordFieldBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public PasswordFieldBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public PasswordFieldBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public PasswordFieldBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public PasswordFieldBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public PasswordFieldBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public PasswordFieldBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public PasswordFieldBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public PasswordFieldBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public PasswordFieldBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public PasswordFieldBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public PasswordFieldBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public PasswordFieldBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public PasswordFieldBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public PasswordFieldBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public PasswordFieldBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public PasswordFieldBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public PasswordFieldBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public PasswordFieldBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public PasswordFieldBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public PasswordFieldBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public PasswordFieldBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public PasswordFieldBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public PasswordFieldBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public PasswordFieldBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public PasswordFieldBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public PasswordFieldBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public PasswordFieldBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public PasswordFieldBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public PasswordFieldBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public PasswordFieldBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public PasswordFieldBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public PasswordFieldBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public PasswordFieldBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public PasswordFieldBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public PasswordFieldBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public PasswordFieldBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public PasswordFieldBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public PasswordFieldBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public PasswordFieldBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public PasswordFieldBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public PasswordFieldBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public PasswordFieldBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public PasswordFieldBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
