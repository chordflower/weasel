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

public class TitledPaneBuilder {

  private final TitledPane titledPane;

  private TitledPaneBuilder( ) {

    titledPane = new TitledPane( );
  }

  @Contract( value = " -> new", pure = true )
  public static @NotNull TitledPaneBuilder builder( ) {

    return new TitledPaneBuilder( );
  }

  public TitledPane build( ) {

    return titledPane;
  }

  public TitledPaneBuilder withContent( Node value ) {

    titledPane.setContent( value );
    return this;
  }

  public TitledPaneBuilder withExpanded( boolean value ) {

    titledPane.setExpanded( value );
    return this;
  }

  public TitledPaneBuilder withAnimated( boolean value ) {

    titledPane.setAnimated( value );
    return this;
  }

  public TitledPaneBuilder withCollapsible( boolean value ) {

    titledPane.setCollapsible( value );
    return this;
  }

  public TitledPaneBuilder withText( String value ) {

    titledPane.setText( value );
    return this;
  }

  public TitledPaneBuilder withAlignment( Pos value ) {

    titledPane.setAlignment( value );
    return this;
  }

  public TitledPaneBuilder withTextAlignment( TextAlignment value ) {

    titledPane.setTextAlignment( value );
    return this;
  }

  public TitledPaneBuilder withTextOverrun( OverrunStyle value ) {

    titledPane.setTextOverrun( value );
    return this;
  }

  public TitledPaneBuilder withEllipsisString( String value ) {

    titledPane.setEllipsisString( value );
    return this;
  }

  public TitledPaneBuilder withWrapText( boolean value ) {

    titledPane.setWrapText( value );
    return this;
  }

  public TitledPaneBuilder withFont( Font value ) {

    titledPane.setFont( value );
    return this;
  }

  public TitledPaneBuilder withGraphic( Node value ) {

    titledPane.setGraphic( value );
    return this;
  }

  public TitledPaneBuilder withUnderline( boolean value ) {

    titledPane.setUnderline( value );
    return this;
  }

  public TitledPaneBuilder withLineSpacing( double value ) {

    titledPane.setLineSpacing( value );
    return this;
  }

  public TitledPaneBuilder withContentDisplay( ContentDisplay value ) {

    titledPane.setContentDisplay( value );
    return this;
  }

  public TitledPaneBuilder withGraphicTextGap( double value ) {

    titledPane.setGraphicTextGap( value );
    return this;
  }

  public TitledPaneBuilder withTextFill( Paint value ) {

    titledPane.setTextFill( value );
    return this;
  }

  public TitledPaneBuilder withMnemonicParsing( boolean value ) {

    titledPane.setMnemonicParsing( value );
    return this;
  }

  public TitledPaneBuilder withSkin( Skin< ? > value ) {

    titledPane.setSkin( value );
    return this;
  }

  public TitledPaneBuilder withTooltip( Tooltip value ) {

    titledPane.setTooltip( value );
    return this;
  }

  public TitledPaneBuilder withContextMenu( ContextMenu value ) {

    titledPane.setContextMenu( value );
    return this;
  }

  public TitledPaneBuilder withSnapToPixel( boolean value ) {

    titledPane.setSnapToPixel( value );
    return this;
  }

  public TitledPaneBuilder withPadding( Insets value ) {

    titledPane.setPadding( value );
    return this;
  }

  public TitledPaneBuilder withBackground( Background value ) {

    titledPane.setBackground( value );
    return this;
  }

  public TitledPaneBuilder withBorder( Border value ) {

    titledPane.setBorder( value );
    return this;
  }

  public TitledPaneBuilder withOpaqueInsets( Insets value ) {

    titledPane.setOpaqueInsets( value );
    return this;
  }

  public TitledPaneBuilder withMinWidth( double value ) {

    titledPane.setMinWidth( value );
    return this;
  }

  public TitledPaneBuilder withMinHeight( double value ) {

    titledPane.setMinHeight( value );
    return this;
  }

  public TitledPaneBuilder withMinSize( double minWidth, double minHeight ) {

    titledPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public TitledPaneBuilder withPrefWidth( double value ) {

    titledPane.setPrefWidth( value );
    return this;
  }

  public TitledPaneBuilder withPrefHeight( double value ) {

    titledPane.setPrefHeight( value );
    return this;
  }

  public TitledPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    titledPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TitledPaneBuilder withMaxWidth( double value ) {

    titledPane.setMaxWidth( value );
    return this;
  }

  public TitledPaneBuilder withMaxHeight( double value ) {

    titledPane.setMaxHeight( value );
    return this;
  }

  public TitledPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    titledPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TitledPaneBuilder withShape( Shape value ) {

    titledPane.setShape( value );
    return this;
  }

  public TitledPaneBuilder withScaleShape( boolean value ) {

    titledPane.setScaleShape( value );
    return this;
  }

  public TitledPaneBuilder withCenterShape( boolean value ) {

    titledPane.setCenterShape( value );
    return this;
  }

  public TitledPaneBuilder withCacheShape( boolean value ) {

    titledPane.setCacheShape( value );
    return this;
  }

  public TitledPaneBuilder withUserData( Object value ) {

    titledPane.setUserData( value );
    return this;
  }

  public TitledPaneBuilder withId( String value ) {

    titledPane.setId( value );
    return this;
  }

  public TitledPaneBuilder withStyle( String value ) {

    titledPane.setStyle( value );
    return this;
  }

  public TitledPaneBuilder withVisible( boolean value ) {

    titledPane.setVisible( value );
    return this;
  }

  public TitledPaneBuilder withCursor( Cursor value ) {

    titledPane.setCursor( value );
    return this;
  }

  public TitledPaneBuilder withOpacity( double value ) {

    titledPane.setOpacity( value );
    return this;
  }

  public TitledPaneBuilder withBlendMode( BlendMode value ) {

    titledPane.setBlendMode( value );
    return this;
  }

  public TitledPaneBuilder withClip( Node value ) {

    titledPane.setClip( value );
    return this;
  }

  public TitledPaneBuilder withCache( boolean value ) {

    titledPane.setCache( value );
    return this;
  }

  public TitledPaneBuilder withCacheHint( CacheHint value ) {

    titledPane.setCacheHint( value );
    return this;
  }

  public TitledPaneBuilder withEffect( Effect value ) {

    titledPane.setEffect( value );
    return this;
  }

  public TitledPaneBuilder withDepthTest( DepthTest value ) {

    titledPane.setDepthTest( value );
    return this;
  }

  public TitledPaneBuilder withDisable( boolean value ) {

    titledPane.setDisable( value );
    return this;
  }

  public TitledPaneBuilder withPickOnBounds( boolean value ) {

    titledPane.setPickOnBounds( value );
    return this;
  }

  public TitledPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    titledPane.setOnDragEntered( value );
    return this;
  }

  public TitledPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    titledPane.setOnDragExited( value );
    return this;
  }

  public TitledPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    titledPane.setOnDragOver( value );
    return this;
  }

  public TitledPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    titledPane.setOnDragDropped( value );
    return this;
  }

  public TitledPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    titledPane.setOnDragDone( value );
    return this;
  }

  public TitledPaneBuilder withManaged( boolean value ) {

    titledPane.setManaged( value );
    return this;
  }

  public TitledPaneBuilder withLayoutX( double value ) {

    titledPane.setLayoutX( value );
    return this;
  }

  public TitledPaneBuilder withLayoutY( double value ) {

    titledPane.setLayoutY( value );
    return this;
  }

  public TitledPaneBuilder withViewOrder( double value ) {

    titledPane.setViewOrder( value );
    return this;
  }

  public TitledPaneBuilder withTranslateX( double value ) {

    titledPane.setTranslateX( value );
    return this;
  }

  public TitledPaneBuilder withTranslateY( double value ) {

    titledPane.setTranslateY( value );
    return this;
  }

  public TitledPaneBuilder withTranslateZ( double value ) {

    titledPane.setTranslateZ( value );
    return this;
  }

  public TitledPaneBuilder withScaleX( double value ) {

    titledPane.setScaleX( value );
    return this;
  }

  public TitledPaneBuilder withScaleY( double value ) {

    titledPane.setScaleY( value );
    return this;
  }

  public TitledPaneBuilder withScaleZ( double value ) {

    titledPane.setScaleZ( value );
    return this;
  }

  public TitledPaneBuilder withRotate( double value ) {

    titledPane.setRotate( value );
    return this;
  }

  public TitledPaneBuilder withRotationAxis( Point3D value ) {

    titledPane.setRotationAxis( value );
    return this;
  }

  public TitledPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    titledPane.setNodeOrientation( orientation );
    return this;
  }

  public TitledPaneBuilder withMouseTransparent( boolean value ) {

    titledPane.setMouseTransparent( value );
    return this;
  }

  public TitledPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    titledPane.setOnContextMenuRequested( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMouseClicked( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMouseDragged( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMouseEntered( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMouseExited( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMouseMoved( value );
    return this;
  }

  public TitledPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMousePressed( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnMouseReleased( value );
    return this;
  }

  public TitledPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    titledPane.setOnDragDetected( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    titledPane.setOnMouseDragOver( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    titledPane.setOnMouseDragReleased( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    titledPane.setOnMouseDragEntered( value );
    return this;
  }

  public TitledPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    titledPane.setOnMouseDragExited( value );
    return this;
  }

  public TitledPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    titledPane.setOnScrollStarted( value );
    return this;
  }

  public TitledPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    titledPane.setOnScroll( value );
    return this;
  }

  public TitledPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    titledPane.setOnScrollFinished( value );
    return this;
  }

  public TitledPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    titledPane.setOnRotationStarted( value );
    return this;
  }

  public TitledPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    titledPane.setOnRotate( value );
    return this;
  }

  public TitledPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    titledPane.setOnRotationFinished( value );
    return this;
  }

  public TitledPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    titledPane.setOnZoomStarted( value );
    return this;
  }

  public TitledPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    titledPane.setOnZoom( value );
    return this;
  }

  public TitledPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    titledPane.setOnZoomFinished( value );
    return this;
  }

  public TitledPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    titledPane.setOnSwipeUp( value );
    return this;
  }

  public TitledPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    titledPane.setOnSwipeDown( value );
    return this;
  }

  public TitledPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    titledPane.setOnSwipeLeft( value );
    return this;
  }

  public TitledPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    titledPane.setOnSwipeRight( value );
    return this;
  }

  public TitledPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    titledPane.setOnTouchPressed( value );
    return this;
  }

  public TitledPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    titledPane.setOnTouchMoved( value );
    return this;
  }

  public TitledPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    titledPane.setOnTouchReleased( value );
    return this;
  }

  public TitledPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    titledPane.setOnTouchStationary( value );
    return this;
  }

  public TitledPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    titledPane.setOnKeyPressed( value );
    return this;
  }

  public TitledPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    titledPane.setOnKeyReleased( value );
    return this;
  }

  public TitledPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    titledPane.setOnKeyTyped( value );
    return this;
  }

  public TitledPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    titledPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public TitledPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    titledPane.setInputMethodRequests( value );
    return this;
  }

  public TitledPaneBuilder withFocusTraversable( boolean value ) {

    titledPane.setFocusTraversable( value );
    return this;
  }

  public TitledPaneBuilder withEventDispatcher( EventDispatcher value ) {

    titledPane.setEventDispatcher( value );
    return this;
  }

  public TitledPaneBuilder withAccessibleRole( AccessibleRole value ) {

    titledPane.setAccessibleRole( value );
    return this;
  }

  public TitledPaneBuilder withAccessibleRoleDescription( String value ) {

    titledPane.setAccessibleRoleDescription( value );
    return this;
  }

  public TitledPaneBuilder withAccessibleText( String value ) {

    titledPane.setAccessibleText( value );
    return this;
  }

  public TitledPaneBuilder withAccessibleHelp( String value ) {

    titledPane.setAccessibleHelp( value );
    return this;
  }

}
