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

public final class HyperlinkBuilder {

  private final Hyperlink built = new Hyperlink( );

  private HyperlinkBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull HyperlinkBuilder builder( ) {

    return new HyperlinkBuilder( );
  }

  @Contract( pure = true )
  public Hyperlink build( ) {

    return this.built;
  }

  public HyperlinkBuilder withVisited( boolean value ) {

    built.setVisited( value );
    return this;
  }

  public HyperlinkBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public HyperlinkBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public HyperlinkBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public HyperlinkBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public HyperlinkBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public HyperlinkBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public HyperlinkBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public HyperlinkBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public HyperlinkBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public HyperlinkBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public HyperlinkBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public HyperlinkBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public HyperlinkBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public HyperlinkBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public HyperlinkBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public HyperlinkBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public HyperlinkBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public HyperlinkBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public HyperlinkBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public HyperlinkBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public HyperlinkBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public HyperlinkBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public HyperlinkBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public HyperlinkBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public HyperlinkBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public HyperlinkBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public HyperlinkBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public HyperlinkBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public HyperlinkBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public HyperlinkBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public HyperlinkBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public HyperlinkBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public HyperlinkBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public HyperlinkBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public HyperlinkBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public HyperlinkBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public HyperlinkBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public HyperlinkBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public HyperlinkBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public HyperlinkBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public HyperlinkBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public HyperlinkBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public HyperlinkBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public HyperlinkBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public HyperlinkBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public HyperlinkBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public HyperlinkBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public HyperlinkBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public HyperlinkBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public HyperlinkBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public HyperlinkBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public HyperlinkBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public HyperlinkBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public HyperlinkBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public HyperlinkBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public HyperlinkBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public HyperlinkBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public HyperlinkBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public HyperlinkBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public HyperlinkBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public HyperlinkBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public HyperlinkBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public HyperlinkBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public HyperlinkBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public HyperlinkBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public HyperlinkBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public HyperlinkBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public HyperlinkBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public HyperlinkBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public HyperlinkBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public HyperlinkBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public HyperlinkBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public HyperlinkBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public HyperlinkBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public HyperlinkBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public HyperlinkBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public HyperlinkBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public HyperlinkBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public HyperlinkBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public HyperlinkBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public HyperlinkBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public HyperlinkBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public HyperlinkBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public HyperlinkBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public HyperlinkBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public HyperlinkBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public HyperlinkBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public HyperlinkBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public HyperlinkBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public HyperlinkBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public HyperlinkBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public HyperlinkBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public HyperlinkBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public HyperlinkBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public HyperlinkBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public HyperlinkBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public HyperlinkBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public HyperlinkBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public HyperlinkBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public HyperlinkBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public HyperlinkBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
