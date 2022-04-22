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
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ButtonBuilder {

  private final Button button = new Button( );

  @Contract( " -> new" )
  public static @NotNull ButtonBuilder builder( ) {

    return new ButtonBuilder( );
  }

  public Button build( ) {

    return button;
  }

  public ButtonBuilder withDefaultButton( boolean value ) {

    button.setDefaultButton( value );
    return this;
  }

  public ButtonBuilder withCancelButton( boolean value ) {

    button.setCancelButton( value );
    return this;
  }

  public ButtonBuilder withOnAction( EventHandler< ActionEvent > value ) {

    button.setOnAction( value );
    return this;
  }

  public ButtonBuilder withText( String value ) {

    button.setText( value );
    return this;
  }

  public ButtonBuilder withAlignment( Pos value ) {

    button.setAlignment( value );
    return this;
  }

  public ButtonBuilder withTextAlignment( TextAlignment value ) {

    button.setTextAlignment( value );
    return this;
  }

  public ButtonBuilder withTextOverrun( OverrunStyle value ) {

    button.setTextOverrun( value );
    return this;
  }

  public ButtonBuilder withEllipsisString( String value ) {

    button.setEllipsisString( value );
    return this;
  }

  public ButtonBuilder withWrapText( boolean value ) {

    button.setWrapText( value );
    return this;
  }

  public ButtonBuilder withFont( Font value ) {

    button.setFont( value );
    return this;
  }

  public ButtonBuilder withGraphic( Node value ) {

    button.setGraphic( value );
    return this;
  }

  public ButtonBuilder withUnderline( boolean value ) {

    button.setUnderline( value );
    return this;
  }

  public ButtonBuilder withLineSpacing( double value ) {

    button.setLineSpacing( value );
    return this;
  }

  public ButtonBuilder withContentDisplay( ContentDisplay value ) {

    button.setContentDisplay( value );
    return this;
  }

  public ButtonBuilder withGraphicTextGap( double value ) {

    button.setGraphicTextGap( value );
    return this;
  }

  public ButtonBuilder withTextFill( Paint value ) {

    button.setTextFill( value );
    return this;
  }

  public ButtonBuilder withMnemonicParsing( boolean value ) {

    button.setMnemonicParsing( value );
    return this;
  }

  public ButtonBuilder withSkin( Skin< ? > value ) {

    button.setSkin( value );
    return this;
  }

  public ButtonBuilder withTooltip( Tooltip value ) {

    button.setTooltip( value );
    return this;
  }

  public ButtonBuilder withContextMenu( ContextMenu value ) {

    button.setContextMenu( value );
    return this;
  }

  public ButtonBuilder withSnapToPixel( boolean value ) {

    button.setSnapToPixel( value );
    return this;
  }

  public ButtonBuilder withPadding( Insets value ) {

    button.setPadding( value );
    return this;
  }

  public ButtonBuilder withBackground( Background value ) {

    button.setBackground( value );
    return this;
  }

  public ButtonBuilder withBorder( Border value ) {

    button.setBorder( value );
    return this;
  }

  public ButtonBuilder withOpaqueInsets( Insets value ) {

    button.setOpaqueInsets( value );
    return this;
  }

  public ButtonBuilder withMinWidth( double value ) {

    button.setMinWidth( value );
    return this;
  }

  public ButtonBuilder withMinHeight( double value ) {

    button.setMinHeight( value );
    return this;
  }

  public ButtonBuilder withMinSize( double minWidth, double minHeight ) {

    button.setMinSize( minWidth, minHeight );
    return this;
  }

  public ButtonBuilder withPrefWidth( double value ) {

    button.setPrefWidth( value );
    return this;
  }

  public ButtonBuilder withPrefHeight( double value ) {

    button.setPrefHeight( value );
    return this;
  }

  public ButtonBuilder withPrefSize( double prefWidth, double prefHeight ) {

    button.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ButtonBuilder withMaxWidth( double value ) {

    button.setMaxWidth( value );
    return this;
  }

  public ButtonBuilder withMaxHeight( double value ) {

    button.setMaxHeight( value );
    return this;
  }

  public ButtonBuilder withMaxSize( double maxWidth, double maxHeight ) {

    button.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ButtonBuilder withShape( Shape value ) {

    button.setShape( value );
    return this;
  }

  public ButtonBuilder withScaleShape( boolean value ) {

    button.setScaleShape( value );
    return this;
  }

  public ButtonBuilder withCenterShape( boolean value ) {

    button.setCenterShape( value );
    return this;
  }

  public ButtonBuilder withCacheShape( boolean value ) {

    button.setCacheShape( value );
    return this;
  }

  public ButtonBuilder withUserData( Object value ) {

    button.setUserData( value );
    return this;
  }

  public ButtonBuilder withId( String value ) {

    button.setId( value );
    return this;
  }

  public ButtonBuilder withStyle( String value ) {

    button.setStyle( value );
    return this;
  }

  public ButtonBuilder withVisible( boolean value ) {

    button.setVisible( value );
    return this;
  }

  public ButtonBuilder withCursor( Cursor value ) {

    button.setCursor( value );
    return this;
  }

  public ButtonBuilder withOpacity( double value ) {

    button.setOpacity( value );
    return this;
  }

  public ButtonBuilder withBlendMode( BlendMode value ) {

    button.setBlendMode( value );
    return this;
  }

  public ButtonBuilder withClip( Node value ) {

    button.setClip( value );
    return this;
  }

  public ButtonBuilder withCache( boolean value ) {

    button.setCache( value );
    return this;
  }

  public ButtonBuilder withCacheHint( CacheHint value ) {

    button.setCacheHint( value );
    return this;
  }

  public ButtonBuilder withEffect( Effect value ) {

    button.setEffect( value );
    return this;
  }

  public ButtonBuilder withDepthTest( DepthTest value ) {

    button.setDepthTest( value );
    return this;
  }

  public ButtonBuilder withDisable( boolean value ) {

    button.setDisable( value );
    return this;
  }

  public ButtonBuilder withPickOnBounds( boolean value ) {

    button.setPickOnBounds( value );
    return this;
  }

  public ButtonBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    button.setOnDragEntered( value );
    return this;
  }

  public ButtonBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    button.setOnDragExited( value );
    return this;
  }

  public ButtonBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    button.setOnDragOver( value );
    return this;
  }

  public ButtonBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    button.setOnDragDropped( value );
    return this;
  }

  public ButtonBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    button.setOnDragDone( value );
    return this;
  }

  public ButtonBuilder withManaged( boolean value ) {

    button.setManaged( value );
    return this;
  }

  public ButtonBuilder withLayoutX( double value ) {

    button.setLayoutX( value );
    return this;
  }

  public ButtonBuilder withLayoutY( double value ) {

    button.setLayoutY( value );
    return this;
  }

  public ButtonBuilder withViewOrder( double value ) {

    button.setViewOrder( value );
    return this;
  }

  public ButtonBuilder withTranslateX( double value ) {

    button.setTranslateX( value );
    return this;
  }

  public ButtonBuilder withTranslateY( double value ) {

    button.setTranslateY( value );
    return this;
  }

  public ButtonBuilder withTranslateZ( double value ) {

    button.setTranslateZ( value );
    return this;
  }

  public ButtonBuilder withScaleX( double value ) {

    button.setScaleX( value );
    return this;
  }

  public ButtonBuilder withScaleY( double value ) {

    button.setScaleY( value );
    return this;
  }

  public ButtonBuilder withScaleZ( double value ) {

    button.setScaleZ( value );
    return this;
  }

  public ButtonBuilder withRotate( double value ) {

    button.setRotate( value );
    return this;
  }

  public ButtonBuilder withRotationAxis( Point3D value ) {

    button.setRotationAxis( value );
    return this;
  }

  public ButtonBuilder withNodeOrientation( NodeOrientation orientation ) {

    button.setNodeOrientation( orientation );
    return this;
  }

  public ButtonBuilder withMouseTransparent( boolean value ) {

    button.setMouseTransparent( value );
    return this;
  }

  public ButtonBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    button.setOnContextMenuRequested( value );
    return this;
  }

  public ButtonBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    button.setOnMouseClicked( value );
    return this;
  }

  public ButtonBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    button.setOnMouseDragged( value );
    return this;
  }

  public ButtonBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    button.setOnMouseEntered( value );
    return this;
  }

  public ButtonBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    button.setOnMouseExited( value );
    return this;
  }

  public ButtonBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    button.setOnMouseMoved( value );
    return this;
  }

  public ButtonBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    button.setOnMousePressed( value );
    return this;
  }

  public ButtonBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    button.setOnMouseReleased( value );
    return this;
  }

  public ButtonBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    button.setOnDragDetected( value );
    return this;
  }

  public ButtonBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    button.setOnMouseDragOver( value );
    return this;
  }

  public ButtonBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    button.setOnMouseDragReleased( value );
    return this;
  }

  public ButtonBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    button.setOnMouseDragEntered( value );
    return this;
  }

  public ButtonBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    button.setOnMouseDragExited( value );
    return this;
  }

  public ButtonBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    button.setOnScrollStarted( value );
    return this;
  }

  public ButtonBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    button.setOnScroll( value );
    return this;
  }

  public ButtonBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    button.setOnScrollFinished( value );
    return this;
  }

  public ButtonBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    button.setOnRotationStarted( value );
    return this;
  }

  public ButtonBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    button.setOnRotate( value );
    return this;
  }

  public ButtonBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    button.setOnRotationFinished( value );
    return this;
  }

  public ButtonBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    button.setOnZoomStarted( value );
    return this;
  }

  public ButtonBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    button.setOnZoom( value );
    return this;
  }

  public ButtonBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    button.setOnZoomFinished( value );
    return this;
  }

  public ButtonBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    button.setOnSwipeUp( value );
    return this;
  }

  public ButtonBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    button.setOnSwipeDown( value );
    return this;
  }

  public ButtonBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    button.setOnSwipeLeft( value );
    return this;
  }

  public ButtonBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    button.setOnSwipeRight( value );
    return this;
  }

  public ButtonBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    button.setOnTouchPressed( value );
    return this;
  }

  public ButtonBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    button.setOnTouchMoved( value );
    return this;
  }

  public ButtonBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    button.setOnTouchReleased( value );
    return this;
  }

  public ButtonBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    button.setOnTouchStationary( value );
    return this;
  }

  public ButtonBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    button.setOnKeyPressed( value );
    return this;
  }

  public ButtonBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    button.setOnKeyReleased( value );
    return this;
  }

  public ButtonBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    button.setOnKeyTyped( value );
    return this;
  }

  public ButtonBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    button.setOnInputMethodTextChanged( value );
    return this;
  }

  public ButtonBuilder withInputMethodRequests( InputMethodRequests value ) {

    button.setInputMethodRequests( value );
    return this;
  }

  public ButtonBuilder withFocusTraversable( boolean value ) {

    button.setFocusTraversable( value );
    return this;
  }

  public ButtonBuilder withEventDispatcher( EventDispatcher value ) {

    button.setEventDispatcher( value );
    return this;
  }

  public ButtonBuilder withAccessibleRole( AccessibleRole value ) {

    button.setAccessibleRole( value );
    return this;
  }

  public ButtonBuilder withAccessibleRoleDescription( String value ) {

    button.setAccessibleRoleDescription( value );
    return this;
  }

  public ButtonBuilder withAccessibleText( String value ) {

    button.setAccessibleText( value );
    return this;
  }

  public ButtonBuilder withAccessibleHelp( String value ) {

    button.setAccessibleHelp( value );
    return this;
  }

}
