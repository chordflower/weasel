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

package cc.chordflower.weasel.javafx.utilities.controls;

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
 * This is a fluent builder for creating a JavaFX TextField.
 */
@AvailableSince( "0.1.0" )
public final class TextFieldBuilder {

  private final TextField built = new TextField( );

  private TextFieldBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull TextFieldBuilder builder( ) {

    return new TextFieldBuilder( );
  }

  @Contract( pure = true )
  public TextField build( ) {

    return this.built;
  }

  public TextFieldBuilder withPrefColumnCount( int value ) {

    built.setPrefColumnCount( value );
    return this;
  }

  public TextFieldBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public TextFieldBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public TextFieldBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public TextFieldBuilder withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public TextFieldBuilder withTextFormatter( TextFormatter< ? > value ) {

    built.setTextFormatter( value );
    return this;
  }

  public TextFieldBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public TextFieldBuilder withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TextFieldBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public TextFieldBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public TextFieldBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TextFieldBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public TextFieldBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public TextFieldBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public TextFieldBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public TextFieldBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public TextFieldBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TextFieldBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public TextFieldBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public TextFieldBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TextFieldBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public TextFieldBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TextFieldBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TextFieldBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public TextFieldBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TextFieldBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public TextFieldBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public TextFieldBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public TextFieldBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public TextFieldBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public TextFieldBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public TextFieldBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TextFieldBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TextFieldBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public TextFieldBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public TextFieldBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public TextFieldBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public TextFieldBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public TextFieldBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public TextFieldBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public TextFieldBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public TextFieldBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public TextFieldBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public TextFieldBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public TextFieldBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public TextFieldBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public TextFieldBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public TextFieldBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public TextFieldBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public TextFieldBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public TextFieldBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public TextFieldBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public TextFieldBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public TextFieldBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public TextFieldBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public TextFieldBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public TextFieldBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public TextFieldBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public TextFieldBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public TextFieldBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public TextFieldBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public TextFieldBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public TextFieldBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public TextFieldBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public TextFieldBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public TextFieldBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public TextFieldBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public TextFieldBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public TextFieldBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public TextFieldBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public TextFieldBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public TextFieldBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public TextFieldBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public TextFieldBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public TextFieldBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public TextFieldBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public TextFieldBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public TextFieldBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public TextFieldBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public TextFieldBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public TextFieldBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public TextFieldBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public TextFieldBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public TextFieldBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public TextFieldBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public TextFieldBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public TextFieldBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public TextFieldBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public TextFieldBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public TextFieldBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public TextFieldBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public TextFieldBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public TextFieldBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public TextFieldBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public TextFieldBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public TextFieldBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public TextFieldBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public TextFieldBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public TextFieldBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public TextFieldBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public TextFieldBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public TextFieldBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public TextFieldBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
