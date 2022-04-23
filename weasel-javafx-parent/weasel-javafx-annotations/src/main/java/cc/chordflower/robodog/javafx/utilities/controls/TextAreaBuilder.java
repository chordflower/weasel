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
import javafx.scene.text.Font;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX TextArea.
 */
@AvailableSince( "0.1.0" )
public final class TextAreaBuilder {

  private final TextArea built = new TextArea( );

  private TextAreaBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull TextAreaBuilder builder( ) {

    return new TextAreaBuilder( );
  }

  @Contract( pure = true )
  public TextArea build( ) {

    return this.built;
  }

  public TextAreaBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public TextAreaBuilder withPrefColumnCount( int value ) {

    built.setPrefColumnCount( value );
    return this;
  }

  public TextAreaBuilder withPrefRowCount( int value ) {

    built.setPrefRowCount( value );
    return this;
  }

  public TextAreaBuilder withScrollTop( double value ) {

    built.setScrollTop( value );
    return this;
  }

  public TextAreaBuilder withScrollLeft( double value ) {

    built.setScrollLeft( value );
    return this;
  }

  public TextAreaBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public TextAreaBuilder withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public TextAreaBuilder withTextFormatter( TextFormatter< ? > value ) {

    built.setTextFormatter( value );
    return this;
  }

  public TextAreaBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public TextAreaBuilder withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TextAreaBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public TextAreaBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public TextAreaBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TextAreaBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public TextAreaBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public TextAreaBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public TextAreaBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public TextAreaBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public TextAreaBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TextAreaBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public TextAreaBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public TextAreaBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TextAreaBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public TextAreaBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TextAreaBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TextAreaBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public TextAreaBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TextAreaBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public TextAreaBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public TextAreaBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public TextAreaBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public TextAreaBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public TextAreaBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public TextAreaBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TextAreaBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TextAreaBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public TextAreaBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public TextAreaBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public TextAreaBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public TextAreaBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public TextAreaBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public TextAreaBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public TextAreaBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public TextAreaBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public TextAreaBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public TextAreaBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public TextAreaBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public TextAreaBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public TextAreaBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public TextAreaBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public TextAreaBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public TextAreaBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public TextAreaBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public TextAreaBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public TextAreaBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public TextAreaBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public TextAreaBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public TextAreaBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public TextAreaBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public TextAreaBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public TextAreaBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public TextAreaBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public TextAreaBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public TextAreaBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public TextAreaBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public TextAreaBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public TextAreaBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public TextAreaBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public TextAreaBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public TextAreaBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public TextAreaBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public TextAreaBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public TextAreaBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public TextAreaBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public TextAreaBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public TextAreaBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public TextAreaBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public TextAreaBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public TextAreaBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public TextAreaBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public TextAreaBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public TextAreaBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public TextAreaBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public TextAreaBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public TextAreaBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public TextAreaBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public TextAreaBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public TextAreaBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public TextAreaBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public TextAreaBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public TextAreaBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public TextAreaBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public TextAreaBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public TextAreaBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public TextAreaBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public TextAreaBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public TextAreaBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public TextAreaBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public TextAreaBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public TextAreaBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public TextAreaBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public TextAreaBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public TextAreaBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public TextAreaBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public TextAreaBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
