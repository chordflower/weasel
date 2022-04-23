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
 * This is a fluent builder for creating a JavaFX Label.
 */
@AvailableSince( "0.1.0" )
public final class LabelBuilder {

  private final Label built = new Label( );

  private LabelBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull LabelBuilder builder( ) {

    return new LabelBuilder( );
  }

  @Contract( pure = true )
  public Label build( ) {

    return this.built;
  }

  public LabelBuilder withLabelFor( Node value ) {

    built.setLabelFor( value );
    return this;
  }

  public LabelBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public LabelBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public LabelBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public LabelBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public LabelBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public LabelBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public LabelBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public LabelBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public LabelBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public LabelBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public LabelBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public LabelBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public LabelBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public LabelBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public LabelBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public LabelBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public LabelBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public LabelBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public LabelBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public LabelBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public LabelBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public LabelBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public LabelBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public LabelBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public LabelBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public LabelBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public LabelBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public LabelBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public LabelBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public LabelBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public LabelBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public LabelBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public LabelBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public LabelBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public LabelBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public LabelBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public LabelBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public LabelBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public LabelBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public LabelBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public LabelBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public LabelBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public LabelBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public LabelBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public LabelBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public LabelBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public LabelBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public LabelBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public LabelBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public LabelBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public LabelBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public LabelBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public LabelBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public LabelBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public LabelBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public LabelBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public LabelBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public LabelBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public LabelBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public LabelBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public LabelBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public LabelBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public LabelBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public LabelBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public LabelBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public LabelBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public LabelBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public LabelBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public LabelBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public LabelBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public LabelBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public LabelBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public LabelBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public LabelBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public LabelBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public LabelBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public LabelBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public LabelBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public LabelBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public LabelBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public LabelBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public LabelBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public LabelBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public LabelBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public LabelBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public LabelBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public LabelBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public LabelBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public LabelBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public LabelBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public LabelBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public LabelBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public LabelBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public LabelBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public LabelBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public LabelBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public LabelBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public LabelBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public LabelBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public LabelBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public LabelBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public LabelBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public LabelBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public LabelBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public LabelBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public LabelBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public LabelBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public LabelBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public LabelBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
