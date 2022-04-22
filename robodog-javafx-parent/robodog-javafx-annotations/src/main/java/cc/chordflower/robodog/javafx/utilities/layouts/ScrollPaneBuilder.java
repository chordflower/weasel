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
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.Skin;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ScrollPaneBuilder {

  private final ScrollPane scrollPane = new ScrollPane( );

  @Contract( " -> new" )
  public static @NotNull ScrollPaneBuilder builder( ) {

    return new ScrollPaneBuilder( );
  }

  public ScrollPane build( ) {

    return scrollPane;
  }

  public ScrollPaneBuilder withHbarPolicy( ScrollBarPolicy value ) {

    scrollPane.setHbarPolicy( value );
    return this;
  }

  public ScrollPaneBuilder withVbarPolicy( ScrollBarPolicy value ) {

    scrollPane.setVbarPolicy( value );
    return this;
  }

  public ScrollPaneBuilder withContent( Node value ) {

    scrollPane.setContent( value );
    return this;
  }

  public ScrollPaneBuilder withHvalue( double value ) {

    scrollPane.setHvalue( value );
    return this;
  }

  public ScrollPaneBuilder withVvalue( double value ) {

    scrollPane.setVvalue( value );
    return this;
  }

  public ScrollPaneBuilder withHmin( double value ) {

    scrollPane.setHmin( value );
    return this;
  }

  public ScrollPaneBuilder withVmin( double value ) {

    scrollPane.setVmin( value );
    return this;
  }

  public ScrollPaneBuilder withHmax( double value ) {

    scrollPane.setHmax( value );
    return this;
  }

  public ScrollPaneBuilder withVmax( double value ) {

    scrollPane.setVmax( value );
    return this;
  }

  public ScrollPaneBuilder withFitToWidth( boolean value ) {

    scrollPane.setFitToWidth( value );
    return this;
  }

  public ScrollPaneBuilder withFitToHeight( boolean value ) {

    scrollPane.setFitToHeight( value );
    return this;
  }

  public ScrollPaneBuilder withPannable( boolean value ) {

    scrollPane.setPannable( value );
    return this;
  }

  public ScrollPaneBuilder withPrefViewportWidth( double value ) {

    scrollPane.setPrefViewportWidth( value );
    return this;
  }

  public ScrollPaneBuilder withPrefViewportHeight( double value ) {

    scrollPane.setPrefViewportHeight( value );
    return this;
  }

  public ScrollPaneBuilder withMinViewportWidth( double value ) {

    scrollPane.setMinViewportWidth( value );
    return this;
  }

  public ScrollPaneBuilder withMinViewportHeight( double value ) {

    scrollPane.setMinViewportHeight( value );
    return this;
  }

  public ScrollPaneBuilder withViewportBounds( Bounds value ) {

    scrollPane.setViewportBounds( value );
    return this;
  }

  public ScrollPaneBuilder withSkin( Skin< ? > value ) {

    scrollPane.setSkin( value );
    return this;
  }

  public ScrollPaneBuilder withTooltip( Tooltip value ) {

    scrollPane.setTooltip( value );
    return this;
  }

  public ScrollPaneBuilder withContextMenu( ContextMenu value ) {

    scrollPane.setContextMenu( value );
    return this;
  }

  public ScrollPaneBuilder withSnapToPixel( boolean value ) {

    scrollPane.setSnapToPixel( value );
    return this;
  }

  public ScrollPaneBuilder withPadding( Insets value ) {

    scrollPane.setPadding( value );
    return this;
  }

  public ScrollPaneBuilder withBackground( Background value ) {

    scrollPane.setBackground( value );
    return this;
  }

  public ScrollPaneBuilder withBorder( Border value ) {

    scrollPane.setBorder( value );
    return this;
  }

  public ScrollPaneBuilder withOpaqueInsets( Insets value ) {

    scrollPane.setOpaqueInsets( value );
    return this;
  }

  public ScrollPaneBuilder withMinWidth( double value ) {

    scrollPane.setMinWidth( value );
    return this;
  }

  public ScrollPaneBuilder withMinHeight( double value ) {

    scrollPane.setMinHeight( value );
    return this;
  }

  public ScrollPaneBuilder withMinSize( double minWidth, double minHeight ) {

    scrollPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public ScrollPaneBuilder withPrefWidth( double value ) {

    scrollPane.setPrefWidth( value );
    return this;
  }

  public ScrollPaneBuilder withPrefHeight( double value ) {

    scrollPane.setPrefHeight( value );
    return this;
  }

  public ScrollPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    scrollPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ScrollPaneBuilder withMaxWidth( double value ) {

    scrollPane.setMaxWidth( value );
    return this;
  }

  public ScrollPaneBuilder withMaxHeight( double value ) {

    scrollPane.setMaxHeight( value );
    return this;
  }

  public ScrollPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    scrollPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ScrollPaneBuilder withShape( Shape value ) {

    scrollPane.setShape( value );
    return this;
  }

  public ScrollPaneBuilder withScaleShape( boolean value ) {

    scrollPane.setScaleShape( value );
    return this;
  }

  public ScrollPaneBuilder withCenterShape( boolean value ) {

    scrollPane.setCenterShape( value );
    return this;
  }

  public ScrollPaneBuilder withCacheShape( boolean value ) {

    scrollPane.setCacheShape( value );
    return this;
  }

  public ScrollPaneBuilder withUserData( Object value ) {

    scrollPane.setUserData( value );
    return this;
  }

  public ScrollPaneBuilder withId( String value ) {

    scrollPane.setId( value );
    return this;
  }

  public ScrollPaneBuilder withStyle( String value ) {

    scrollPane.setStyle( value );
    return this;
  }

  public ScrollPaneBuilder withVisible( boolean value ) {

    scrollPane.setVisible( value );
    return this;
  }

  public ScrollPaneBuilder withCursor( Cursor value ) {

    scrollPane.setCursor( value );
    return this;
  }

  public ScrollPaneBuilder withOpacity( double value ) {

    scrollPane.setOpacity( value );
    return this;
  }

  public ScrollPaneBuilder withBlendMode( BlendMode value ) {

    scrollPane.setBlendMode( value );
    return this;
  }

  public ScrollPaneBuilder withClip( Node value ) {

    scrollPane.setClip( value );
    return this;
  }

  public ScrollPaneBuilder withCache( boolean value ) {

    scrollPane.setCache( value );
    return this;
  }

  public ScrollPaneBuilder withCacheHint( CacheHint value ) {

    scrollPane.setCacheHint( value );
    return this;
  }

  public ScrollPaneBuilder withEffect( Effect value ) {

    scrollPane.setEffect( value );
    return this;
  }

  public ScrollPaneBuilder withDepthTest( DepthTest value ) {

    scrollPane.setDepthTest( value );
    return this;
  }

  public ScrollPaneBuilder withDisable( boolean value ) {

    scrollPane.setDisable( value );
    return this;
  }

  public ScrollPaneBuilder withPickOnBounds( boolean value ) {

    scrollPane.setPickOnBounds( value );
    return this;
  }

  public ScrollPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    scrollPane.setOnDragEntered( value );
    return this;
  }

  public ScrollPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    scrollPane.setOnDragExited( value );
    return this;
  }

  public ScrollPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    scrollPane.setOnDragOver( value );
    return this;
  }

  public ScrollPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    scrollPane.setOnDragDropped( value );
    return this;
  }

  public ScrollPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    scrollPane.setOnDragDone( value );
    return this;
  }

  public ScrollPaneBuilder withManaged( boolean value ) {

    scrollPane.setManaged( value );
    return this;
  }

  public ScrollPaneBuilder withLayoutX( double value ) {

    scrollPane.setLayoutX( value );
    return this;
  }

  public ScrollPaneBuilder withLayoutY( double value ) {

    scrollPane.setLayoutY( value );
    return this;
  }

  public ScrollPaneBuilder withViewOrder( double value ) {

    scrollPane.setViewOrder( value );
    return this;
  }

  public ScrollPaneBuilder withTranslateX( double value ) {

    scrollPane.setTranslateX( value );
    return this;
  }

  public ScrollPaneBuilder withTranslateY( double value ) {

    scrollPane.setTranslateY( value );
    return this;
  }

  public ScrollPaneBuilder withTranslateZ( double value ) {

    scrollPane.setTranslateZ( value );
    return this;
  }

  public ScrollPaneBuilder withScaleX( double value ) {

    scrollPane.setScaleX( value );
    return this;
  }

  public ScrollPaneBuilder withScaleY( double value ) {

    scrollPane.setScaleY( value );
    return this;
  }

  public ScrollPaneBuilder withScaleZ( double value ) {

    scrollPane.setScaleZ( value );
    return this;
  }

  public ScrollPaneBuilder withRotate( double value ) {

    scrollPane.setRotate( value );
    return this;
  }

  public ScrollPaneBuilder withRotationAxis( Point3D value ) {

    scrollPane.setRotationAxis( value );
    return this;
  }

  public ScrollPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    scrollPane.setNodeOrientation( orientation );
    return this;
  }

  public ScrollPaneBuilder withMouseTransparent( boolean value ) {

    scrollPane.setMouseTransparent( value );
    return this;
  }

  public ScrollPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    scrollPane.setOnContextMenuRequested( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMouseClicked( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMouseDragged( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMouseEntered( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMouseExited( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMouseMoved( value );
    return this;
  }

  public ScrollPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMousePressed( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnMouseReleased( value );
    return this;
  }

  public ScrollPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    scrollPane.setOnDragDetected( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    scrollPane.setOnMouseDragOver( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    scrollPane.setOnMouseDragReleased( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    scrollPane.setOnMouseDragEntered( value );
    return this;
  }

  public ScrollPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    scrollPane.setOnMouseDragExited( value );
    return this;
  }

  public ScrollPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    scrollPane.setOnScrollStarted( value );
    return this;
  }

  public ScrollPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    scrollPane.setOnScroll( value );
    return this;
  }

  public ScrollPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    scrollPane.setOnScrollFinished( value );
    return this;
  }

  public ScrollPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    scrollPane.setOnRotationStarted( value );
    return this;
  }

  public ScrollPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    scrollPane.setOnRotate( value );
    return this;
  }

  public ScrollPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    scrollPane.setOnRotationFinished( value );
    return this;
  }

  public ScrollPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    scrollPane.setOnZoomStarted( value );
    return this;
  }

  public ScrollPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    scrollPane.setOnZoom( value );
    return this;
  }

  public ScrollPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    scrollPane.setOnZoomFinished( value );
    return this;
  }

  public ScrollPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    scrollPane.setOnSwipeUp( value );
    return this;
  }

  public ScrollPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    scrollPane.setOnSwipeDown( value );
    return this;
  }

  public ScrollPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    scrollPane.setOnSwipeLeft( value );
    return this;
  }

  public ScrollPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    scrollPane.setOnSwipeRight( value );
    return this;
  }

  public ScrollPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    scrollPane.setOnTouchPressed( value );
    return this;
  }

  public ScrollPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    scrollPane.setOnTouchMoved( value );
    return this;
  }

  public ScrollPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    scrollPane.setOnTouchReleased( value );
    return this;
  }

  public ScrollPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    scrollPane.setOnTouchStationary( value );
    return this;
  }

  public ScrollPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    scrollPane.setOnKeyPressed( value );
    return this;
  }

  public ScrollPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    scrollPane.setOnKeyReleased( value );
    return this;
  }

  public ScrollPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    scrollPane.setOnKeyTyped( value );
    return this;
  }

  public ScrollPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    scrollPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public ScrollPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    scrollPane.setInputMethodRequests( value );
    return this;
  }

  public ScrollPaneBuilder withFocusTraversable( boolean value ) {

    scrollPane.setFocusTraversable( value );
    return this;
  }

  public ScrollPaneBuilder withEventDispatcher( EventDispatcher value ) {

    scrollPane.setEventDispatcher( value );
    return this;
  }

  public ScrollPaneBuilder withAccessibleRole( AccessibleRole value ) {

    scrollPane.setAccessibleRole( value );
    return this;
  }

  public ScrollPaneBuilder withAccessibleRoleDescription( String value ) {

    scrollPane.setAccessibleRoleDescription( value );
    return this;
  }

  public ScrollPaneBuilder withAccessibleText( String value ) {

    scrollPane.setAccessibleText( value );
    return this;
  }

  public ScrollPaneBuilder withAccessibleHelp( String value ) {

    scrollPane.setAccessibleHelp( value );
    return this;
  }

}
