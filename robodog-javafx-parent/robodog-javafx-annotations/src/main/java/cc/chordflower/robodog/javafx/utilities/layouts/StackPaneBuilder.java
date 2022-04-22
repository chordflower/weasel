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
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class StackPaneBuilder {

  private final StackPane stackPane = new StackPane( );

  @Contract( " -> new" )
  public static @NotNull StackPaneBuilder builder( ) {

    return new StackPaneBuilder( );
  }

  public StackPane build( ) {

    return stackPane;
  }

  public StackPaneBuilder add( Node... nodes ) {

    this.stackPane.getChildren( ).addAll( nodes );
    return this;
  }

  public StackPaneBuilder withAlignment( Node child, Pos value ) {

    StackPane.setAlignment( child, value );
    return this;
  }

  public StackPaneBuilder withMargin( Node child, Insets value ) {

    StackPane.setMargin( child, value );
    return this;
  }

  public StackPaneBuilder withAlignment( Pos value ) {

    stackPane.setAlignment( value );
    return this;
  }

  public StackPaneBuilder withSnapToPixel( boolean value ) {

    stackPane.setSnapToPixel( value );
    return this;
  }

  public StackPaneBuilder withPadding( Insets value ) {

    stackPane.setPadding( value );
    return this;
  }

  public StackPaneBuilder withBackground( Background value ) {

    stackPane.setBackground( value );
    return this;
  }

  public StackPaneBuilder withBorder( Border value ) {

    stackPane.setBorder( value );
    return this;
  }

  public StackPaneBuilder withOpaqueInsets( Insets value ) {

    stackPane.setOpaqueInsets( value );
    return this;
  }

  public StackPaneBuilder withMinWidth( double value ) {

    stackPane.setMinWidth( value );
    return this;
  }

  public StackPaneBuilder withMinHeight( double value ) {

    stackPane.setMinHeight( value );
    return this;
  }

  public StackPaneBuilder withMinSize( double minWidth, double minHeight ) {

    stackPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public StackPaneBuilder withPrefWidth( double value ) {

    stackPane.setPrefWidth( value );
    return this;
  }

  public StackPaneBuilder withPrefHeight( double value ) {

    stackPane.setPrefHeight( value );
    return this;
  }

  public StackPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    stackPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public StackPaneBuilder withMaxWidth( double value ) {

    stackPane.setMaxWidth( value );
    return this;
  }

  public StackPaneBuilder withMaxHeight( double value ) {

    stackPane.setMaxHeight( value );
    return this;
  }

  public StackPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    stackPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public StackPaneBuilder withShape( Shape value ) {

    stackPane.setShape( value );
    return this;
  }

  public StackPaneBuilder withScaleShape( boolean value ) {

    stackPane.setScaleShape( value );
    return this;
  }

  public StackPaneBuilder withCenterShape( boolean value ) {

    stackPane.setCenterShape( value );
    return this;
  }

  public StackPaneBuilder withCacheShape( boolean value ) {

    stackPane.setCacheShape( value );
    return this;
  }

  public StackPaneBuilder withUserData( Object value ) {

    stackPane.setUserData( value );
    return this;
  }

  public StackPaneBuilder withId( String value ) {

    stackPane.setId( value );
    return this;
  }

  public StackPaneBuilder withStyle( String value ) {

    stackPane.setStyle( value );
    return this;
  }

  public StackPaneBuilder withVisible( boolean value ) {

    stackPane.setVisible( value );
    return this;
  }

  public StackPaneBuilder withCursor( Cursor value ) {

    stackPane.setCursor( value );
    return this;
  }

  public StackPaneBuilder withOpacity( double value ) {

    stackPane.setOpacity( value );
    return this;
  }

  public StackPaneBuilder withBlendMode( BlendMode value ) {

    stackPane.setBlendMode( value );
    return this;
  }

  public StackPaneBuilder withClip( Node value ) {

    stackPane.setClip( value );
    return this;
  }

  public StackPaneBuilder withCache( boolean value ) {

    stackPane.setCache( value );
    return this;
  }

  public StackPaneBuilder withCacheHint( CacheHint value ) {

    stackPane.setCacheHint( value );
    return this;
  }

  public StackPaneBuilder withEffect( Effect value ) {

    stackPane.setEffect( value );
    return this;
  }

  public StackPaneBuilder withDepthTest( DepthTest value ) {

    stackPane.setDepthTest( value );
    return this;
  }

  public StackPaneBuilder withDisable( boolean value ) {

    stackPane.setDisable( value );
    return this;
  }

  public StackPaneBuilder withPickOnBounds( boolean value ) {

    stackPane.setPickOnBounds( value );
    return this;
  }

  public StackPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    stackPane.setOnDragEntered( value );
    return this;
  }

  public StackPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    stackPane.setOnDragExited( value );
    return this;
  }

  public StackPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    stackPane.setOnDragOver( value );
    return this;
  }

  public StackPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    stackPane.setOnDragDropped( value );
    return this;
  }

  public StackPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    stackPane.setOnDragDone( value );
    return this;
  }

  public StackPaneBuilder withManaged( boolean value ) {

    stackPane.setManaged( value );
    return this;
  }

  public StackPaneBuilder withLayoutX( double value ) {

    stackPane.setLayoutX( value );
    return this;
  }

  public StackPaneBuilder withLayoutY( double value ) {

    stackPane.setLayoutY( value );
    return this;
  }

  public StackPaneBuilder withViewOrder( double value ) {

    stackPane.setViewOrder( value );
    return this;
  }

  public StackPaneBuilder withTranslateX( double value ) {

    stackPane.setTranslateX( value );
    return this;
  }

  public StackPaneBuilder withTranslateY( double value ) {

    stackPane.setTranslateY( value );
    return this;
  }

  public StackPaneBuilder withTranslateZ( double value ) {

    stackPane.setTranslateZ( value );
    return this;
  }

  public StackPaneBuilder withScaleX( double value ) {

    stackPane.setScaleX( value );
    return this;
  }

  public StackPaneBuilder withScaleY( double value ) {

    stackPane.setScaleY( value );
    return this;
  }

  public StackPaneBuilder withScaleZ( double value ) {

    stackPane.setScaleZ( value );
    return this;
  }

  public StackPaneBuilder withRotate( double value ) {

    stackPane.setRotate( value );
    return this;
  }

  public StackPaneBuilder withRotationAxis( Point3D value ) {

    stackPane.setRotationAxis( value );
    return this;
  }

  public StackPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    stackPane.setNodeOrientation( orientation );
    return this;
  }

  public StackPaneBuilder withMouseTransparent( boolean value ) {

    stackPane.setMouseTransparent( value );
    return this;
  }

  public StackPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    stackPane.setOnContextMenuRequested( value );
    return this;
  }

  public StackPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMouseClicked( value );
    return this;
  }

  public StackPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMouseDragged( value );
    return this;
  }

  public StackPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMouseEntered( value );
    return this;
  }

  public StackPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMouseExited( value );
    return this;
  }

  public StackPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMouseMoved( value );
    return this;
  }

  public StackPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMousePressed( value );
    return this;
  }

  public StackPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnMouseReleased( value );
    return this;
  }

  public StackPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    stackPane.setOnDragDetected( value );
    return this;
  }

  public StackPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    stackPane.setOnMouseDragOver( value );
    return this;
  }

  public StackPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    stackPane.setOnMouseDragReleased( value );
    return this;
  }

  public StackPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    stackPane.setOnMouseDragEntered( value );
    return this;
  }

  public StackPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    stackPane.setOnMouseDragExited( value );
    return this;
  }

  public StackPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    stackPane.setOnScrollStarted( value );
    return this;
  }

  public StackPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    stackPane.setOnScroll( value );
    return this;
  }

  public StackPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    stackPane.setOnScrollFinished( value );
    return this;
  }

  public StackPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    stackPane.setOnRotationStarted( value );
    return this;
  }

  public StackPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    stackPane.setOnRotate( value );
    return this;
  }

  public StackPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    stackPane.setOnRotationFinished( value );
    return this;
  }

  public StackPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    stackPane.setOnZoomStarted( value );
    return this;
  }

  public StackPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    stackPane.setOnZoom( value );
    return this;
  }

  public StackPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    stackPane.setOnZoomFinished( value );
    return this;
  }

  public StackPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    stackPane.setOnSwipeUp( value );
    return this;
  }

  public StackPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    stackPane.setOnSwipeDown( value );
    return this;
  }

  public StackPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    stackPane.setOnSwipeLeft( value );
    return this;
  }

  public StackPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    stackPane.setOnSwipeRight( value );
    return this;
  }

  public StackPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    stackPane.setOnTouchPressed( value );
    return this;
  }

  public StackPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    stackPane.setOnTouchMoved( value );
    return this;
  }

  public StackPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    stackPane.setOnTouchReleased( value );
    return this;
  }

  public StackPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    stackPane.setOnTouchStationary( value );
    return this;
  }

  public StackPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    stackPane.setOnKeyPressed( value );
    return this;
  }

  public StackPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    stackPane.setOnKeyReleased( value );
    return this;
  }

  public StackPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    stackPane.setOnKeyTyped( value );
    return this;
  }

  public StackPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    stackPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public StackPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    stackPane.setInputMethodRequests( value );
    return this;
  }

  public StackPaneBuilder withFocusTraversable( boolean value ) {

    stackPane.setFocusTraversable( value );
    return this;
  }

  public StackPaneBuilder withEventDispatcher( EventDispatcher value ) {

    stackPane.setEventDispatcher( value );
    return this;
  }

  public StackPaneBuilder withAccessibleRole( AccessibleRole value ) {

    stackPane.setAccessibleRole( value );
    return this;
  }

  public StackPaneBuilder withAccessibleRoleDescription( String value ) {

    stackPane.setAccessibleRoleDescription( value );
    return this;
  }

  public StackPaneBuilder withAccessibleText( String value ) {

    stackPane.setAccessibleText( value );
    return this;
  }

  public StackPaneBuilder withAccessibleHelp( String value ) {

    stackPane.setAccessibleHelp( value );
    return this;
  }

}
