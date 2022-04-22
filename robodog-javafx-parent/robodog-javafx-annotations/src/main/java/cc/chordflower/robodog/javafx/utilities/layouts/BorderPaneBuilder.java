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
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BorderPaneBuilder {

  private final BorderPane borderPane = new BorderPane( );

  @Contract( " -> new" )
  public static @NotNull BorderPaneBuilder builder( ) {

    return new BorderPaneBuilder( );
  }

  public BorderPane build( ) {

    return borderPane;
  }

  public BorderPaneBuilder withAlignment( Node child, Pos value ) {

    BorderPane.setAlignment( child, value );
    return this;
  }

  public BorderPaneBuilder withMargin( Node child, Insets value ) {

    BorderPane.setMargin( child, value );
    return this;
  }

  public BorderPaneBuilder withCenter( Node value ) {

    borderPane.setCenter( value );
    return this;
  }

  public BorderPaneBuilder withTop( Node value ) {

    borderPane.setTop( value );
    return this;
  }

  public BorderPaneBuilder withBottom( Node value ) {

    borderPane.setBottom( value );
    return this;
  }

  public BorderPaneBuilder withLeft( Node value ) {

    borderPane.setLeft( value );
    return this;
  }

  public BorderPaneBuilder withRight( Node value ) {

    borderPane.setRight( value );
    return this;
  }

  public BorderPaneBuilder withSnapToPixel( boolean value ) {

    borderPane.setSnapToPixel( value );
    return this;
  }

  public BorderPaneBuilder withPadding( Insets value ) {

    borderPane.setPadding( value );
    return this;
  }

  public BorderPaneBuilder withBackground( Background value ) {

    borderPane.setBackground( value );
    return this;
  }

  public BorderPaneBuilder withBorder( Border value ) {

    borderPane.setBorder( value );
    return this;
  }

  public BorderPaneBuilder withOpaqueInsets( Insets value ) {

    borderPane.setOpaqueInsets( value );
    return this;
  }

  public BorderPaneBuilder withMinWidth( double value ) {

    borderPane.setMinWidth( value );
    return this;
  }

  public BorderPaneBuilder withMinHeight( double value ) {

    borderPane.setMinHeight( value );
    return this;
  }

  public BorderPaneBuilder withMinSize( double minWidth, double minHeight ) {

    borderPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public BorderPaneBuilder withPrefWidth( double value ) {

    borderPane.setPrefWidth( value );
    return this;
  }

  public BorderPaneBuilder withPrefHeight( double value ) {

    borderPane.setPrefHeight( value );
    return this;
  }

  public BorderPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    borderPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public BorderPaneBuilder withMaxWidth( double value ) {

    borderPane.setMaxWidth( value );
    return this;
  }

  public BorderPaneBuilder withMaxHeight( double value ) {

    borderPane.setMaxHeight( value );
    return this;
  }

  public BorderPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    borderPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public BorderPaneBuilder withShape( Shape value ) {

    borderPane.setShape( value );
    return this;
  }

  public BorderPaneBuilder withScaleShape( boolean value ) {

    borderPane.setScaleShape( value );
    return this;
  }

  public BorderPaneBuilder withCenterShape( boolean value ) {

    borderPane.setCenterShape( value );
    return this;
  }

  public BorderPaneBuilder withCacheShape( boolean value ) {

    borderPane.setCacheShape( value );
    return this;
  }

  public BorderPaneBuilder withUserData( Object value ) {

    borderPane.setUserData( value );
    return this;
  }

  public BorderPaneBuilder withId( String value ) {

    borderPane.setId( value );
    return this;
  }

  public BorderPaneBuilder withStyle( String value ) {

    borderPane.setStyle( value );
    return this;
  }

  public BorderPaneBuilder withVisible( boolean value ) {

    borderPane.setVisible( value );
    return this;
  }

  public BorderPaneBuilder withCursor( Cursor value ) {

    borderPane.setCursor( value );
    return this;
  }

  public BorderPaneBuilder withOpacity( double value ) {

    borderPane.setOpacity( value );
    return this;
  }

  public BorderPaneBuilder withBlendMode( BlendMode value ) {

    borderPane.setBlendMode( value );
    return this;
  }

  public BorderPaneBuilder withClip( Node value ) {

    borderPane.setClip( value );
    return this;
  }

  public BorderPaneBuilder withCache( boolean value ) {

    borderPane.setCache( value );
    return this;
  }

  public BorderPaneBuilder withCacheHint( CacheHint value ) {

    borderPane.setCacheHint( value );
    return this;
  }

  public BorderPaneBuilder withEffect( Effect value ) {

    borderPane.setEffect( value );
    return this;
  }

  public BorderPaneBuilder withDepthTest( DepthTest value ) {

    borderPane.setDepthTest( value );
    return this;
  }

  public BorderPaneBuilder withDisable( boolean value ) {

    borderPane.setDisable( value );
    return this;
  }

  public BorderPaneBuilder withPickOnBounds( boolean value ) {

    borderPane.setPickOnBounds( value );
    return this;
  }

  public BorderPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    borderPane.setOnDragEntered( value );
    return this;
  }

  public BorderPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    borderPane.setOnDragExited( value );
    return this;
  }

  public BorderPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    borderPane.setOnDragOver( value );
    return this;
  }

  public BorderPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    borderPane.setOnDragDropped( value );
    return this;
  }

  public BorderPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    borderPane.setOnDragDone( value );
    return this;
  }

  public BorderPaneBuilder withManaged( boolean value ) {

    borderPane.setManaged( value );
    return this;
  }

  public BorderPaneBuilder withLayoutX( double value ) {

    borderPane.setLayoutX( value );
    return this;
  }

  public BorderPaneBuilder withLayoutY( double value ) {

    borderPane.setLayoutY( value );
    return this;
  }

  public BorderPaneBuilder withViewOrder( double value ) {

    borderPane.setViewOrder( value );
    return this;
  }

  public BorderPaneBuilder withTranslateX( double value ) {

    borderPane.setTranslateX( value );
    return this;
  }

  public BorderPaneBuilder withTranslateY( double value ) {

    borderPane.setTranslateY( value );
    return this;
  }

  public BorderPaneBuilder withTranslateZ( double value ) {

    borderPane.setTranslateZ( value );
    return this;
  }

  public BorderPaneBuilder withScaleX( double value ) {

    borderPane.setScaleX( value );
    return this;
  }

  public BorderPaneBuilder withScaleY( double value ) {

    borderPane.setScaleY( value );
    return this;
  }

  public BorderPaneBuilder withScaleZ( double value ) {

    borderPane.setScaleZ( value );
    return this;
  }

  public BorderPaneBuilder withRotate( double value ) {

    borderPane.setRotate( value );
    return this;
  }

  public BorderPaneBuilder withRotationAxis( Point3D value ) {

    borderPane.setRotationAxis( value );
    return this;
  }

  public BorderPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    borderPane.setNodeOrientation( orientation );
    return this;
  }

  public BorderPaneBuilder withMouseTransparent( boolean value ) {

    borderPane.setMouseTransparent( value );
    return this;
  }

  public BorderPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    borderPane.setOnContextMenuRequested( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMouseClicked( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMouseDragged( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMouseEntered( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMouseExited( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMouseMoved( value );
    return this;
  }

  public BorderPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMousePressed( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnMouseReleased( value );
    return this;
  }

  public BorderPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    borderPane.setOnDragDetected( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    borderPane.setOnMouseDragOver( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    borderPane.setOnMouseDragReleased( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    borderPane.setOnMouseDragEntered( value );
    return this;
  }

  public BorderPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    borderPane.setOnMouseDragExited( value );
    return this;
  }

  public BorderPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    borderPane.setOnScrollStarted( value );
    return this;
  }

  public BorderPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    borderPane.setOnScroll( value );
    return this;
  }

  public BorderPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    borderPane.setOnScrollFinished( value );
    return this;
  }

  public BorderPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    borderPane.setOnRotationStarted( value );
    return this;
  }

  public BorderPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    borderPane.setOnRotate( value );
    return this;
  }

  public BorderPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    borderPane.setOnRotationFinished( value );
    return this;
  }

  public BorderPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    borderPane.setOnZoomStarted( value );
    return this;
  }

  public BorderPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    borderPane.setOnZoom( value );
    return this;
  }

  public BorderPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    borderPane.setOnZoomFinished( value );
    return this;
  }

  public BorderPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    borderPane.setOnSwipeUp( value );
    return this;
  }

  public BorderPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    borderPane.setOnSwipeDown( value );
    return this;
  }

  public BorderPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    borderPane.setOnSwipeLeft( value );
    return this;
  }

  public BorderPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    borderPane.setOnSwipeRight( value );
    return this;
  }

  public BorderPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    borderPane.setOnTouchPressed( value );
    return this;
  }

  public BorderPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    borderPane.setOnTouchMoved( value );
    return this;
  }

  public BorderPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    borderPane.setOnTouchReleased( value );
    return this;
  }

  public BorderPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    borderPane.setOnTouchStationary( value );
    return this;
  }

  public BorderPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    borderPane.setOnKeyPressed( value );
    return this;
  }

  public BorderPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    borderPane.setOnKeyReleased( value );
    return this;
  }

  public BorderPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    borderPane.setOnKeyTyped( value );
    return this;
  }

  public BorderPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    borderPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public BorderPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    borderPane.setInputMethodRequests( value );
    return this;
  }

  public BorderPaneBuilder withFocusTraversable( boolean value ) {

    borderPane.setFocusTraversable( value );
    return this;
  }

  public BorderPaneBuilder withEventDispatcher( EventDispatcher value ) {

    borderPane.setEventDispatcher( value );
    return this;
  }

  public BorderPaneBuilder withAccessibleRole( AccessibleRole value ) {

    borderPane.setAccessibleRole( value );
    return this;
  }

  public BorderPaneBuilder withAccessibleRoleDescription( String value ) {

    borderPane.setAccessibleRoleDescription( value );
    return this;
  }

  public BorderPaneBuilder withAccessibleText( String value ) {

    borderPane.setAccessibleText( value );
    return this;
  }

  public BorderPaneBuilder withAccessibleHelp( String value ) {

    borderPane.setAccessibleHelp( value );
    return this;
  }

}
