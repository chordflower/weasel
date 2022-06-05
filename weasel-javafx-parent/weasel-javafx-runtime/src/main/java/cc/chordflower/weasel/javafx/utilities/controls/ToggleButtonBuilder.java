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
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX ToggleButton.
 */
@AvailableSince( "0.1.0" )
public final class ToggleButtonBuilder {

  private final ToggleButton built = new ToggleButton( );

  private ToggleButtonBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull ToggleButtonBuilder builder( ) {

    return new ToggleButtonBuilder( );
  }

  @Contract( pure = true )
  public ToggleButton build( ) {

    return this.built;
  }

  public ToggleButtonBuilder withSelected( boolean value ) {

    built.setSelected( value );
    return this;
  }

  public ToggleButtonBuilder withToggleGroup( ToggleGroup value ) {

    built.setToggleGroup( value );
    return this;
  }

  public ToggleButtonBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public ToggleButtonBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public ToggleButtonBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public ToggleButtonBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public ToggleButtonBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public ToggleButtonBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public ToggleButtonBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public ToggleButtonBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public ToggleButtonBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public ToggleButtonBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public ToggleButtonBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public ToggleButtonBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public ToggleButtonBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public ToggleButtonBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public ToggleButtonBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public ToggleButtonBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ToggleButtonBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ToggleButtonBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ToggleButtonBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ToggleButtonBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ToggleButtonBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ToggleButtonBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ToggleButtonBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ToggleButtonBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ToggleButtonBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ToggleButtonBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ToggleButtonBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ToggleButtonBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ToggleButtonBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ToggleButtonBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ToggleButtonBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ToggleButtonBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ToggleButtonBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ToggleButtonBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ToggleButtonBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ToggleButtonBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ToggleButtonBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ToggleButtonBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public ToggleButtonBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ToggleButtonBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ToggleButtonBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ToggleButtonBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ToggleButtonBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ToggleButtonBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ToggleButtonBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ToggleButtonBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ToggleButtonBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ToggleButtonBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ToggleButtonBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ToggleButtonBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ToggleButtonBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ToggleButtonBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ToggleButtonBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ToggleButtonBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ToggleButtonBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ToggleButtonBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ToggleButtonBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ToggleButtonBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ToggleButtonBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ToggleButtonBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ToggleButtonBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ToggleButtonBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ToggleButtonBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ToggleButtonBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ToggleButtonBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ToggleButtonBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ToggleButtonBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ToggleButtonBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ToggleButtonBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ToggleButtonBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ToggleButtonBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ToggleButtonBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ToggleButtonBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ToggleButtonBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ToggleButtonBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ToggleButtonBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ToggleButtonBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ToggleButtonBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ToggleButtonBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ToggleButtonBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ToggleButtonBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ToggleButtonBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ToggleButtonBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ToggleButtonBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ToggleButtonBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ToggleButtonBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ToggleButtonBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ToggleButtonBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ToggleButtonBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ToggleButtonBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ToggleButtonBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ToggleButtonBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ToggleButtonBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ToggleButtonBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ToggleButtonBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ToggleButtonBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ToggleButtonBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ToggleButtonBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ToggleButtonBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ToggleButtonBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ToggleButtonBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
