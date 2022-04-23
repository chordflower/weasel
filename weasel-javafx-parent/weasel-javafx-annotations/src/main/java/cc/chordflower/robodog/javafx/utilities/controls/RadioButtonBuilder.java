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
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX RadioButton.
 */
@AvailableSince( "0.1.0" )
public final class RadioButtonBuilder {

  private final RadioButton built = new RadioButton( );

  private RadioButtonBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull RadioButtonBuilder builder( ) {

    return new RadioButtonBuilder( );
  }

  @Contract( pure = true )
  public RadioButton build( ) {

    return this.built;
  }

  public RadioButtonBuilder withSelected( boolean value ) {

    built.setSelected( value );
    return this;
  }

  public RadioButtonBuilder withToggleGroup( ToggleGroup value ) {

    built.setToggleGroup( value );
    return this;
  }

  public RadioButtonBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public RadioButtonBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public RadioButtonBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public RadioButtonBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public RadioButtonBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public RadioButtonBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public RadioButtonBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public RadioButtonBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public RadioButtonBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public RadioButtonBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public RadioButtonBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public RadioButtonBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public RadioButtonBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public RadioButtonBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public RadioButtonBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public RadioButtonBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public RadioButtonBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public RadioButtonBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public RadioButtonBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public RadioButtonBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public RadioButtonBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public RadioButtonBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public RadioButtonBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public RadioButtonBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public RadioButtonBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public RadioButtonBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public RadioButtonBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public RadioButtonBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public RadioButtonBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public RadioButtonBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public RadioButtonBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public RadioButtonBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public RadioButtonBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public RadioButtonBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public RadioButtonBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public RadioButtonBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public RadioButtonBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public RadioButtonBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public RadioButtonBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public RadioButtonBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public RadioButtonBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public RadioButtonBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public RadioButtonBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public RadioButtonBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public RadioButtonBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public RadioButtonBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public RadioButtonBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public RadioButtonBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public RadioButtonBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public RadioButtonBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public RadioButtonBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public RadioButtonBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public RadioButtonBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public RadioButtonBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public RadioButtonBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public RadioButtonBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public RadioButtonBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public RadioButtonBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public RadioButtonBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public RadioButtonBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public RadioButtonBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public RadioButtonBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public RadioButtonBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public RadioButtonBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public RadioButtonBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public RadioButtonBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public RadioButtonBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public RadioButtonBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public RadioButtonBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public RadioButtonBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public RadioButtonBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public RadioButtonBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public RadioButtonBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public RadioButtonBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public RadioButtonBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public RadioButtonBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public RadioButtonBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public RadioButtonBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public RadioButtonBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public RadioButtonBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public RadioButtonBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public RadioButtonBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public RadioButtonBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public RadioButtonBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public RadioButtonBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public RadioButtonBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public RadioButtonBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public RadioButtonBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public RadioButtonBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public RadioButtonBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public RadioButtonBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public RadioButtonBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public RadioButtonBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public RadioButtonBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public RadioButtonBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public RadioButtonBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public RadioButtonBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public RadioButtonBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public RadioButtonBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public RadioButtonBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public RadioButtonBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
