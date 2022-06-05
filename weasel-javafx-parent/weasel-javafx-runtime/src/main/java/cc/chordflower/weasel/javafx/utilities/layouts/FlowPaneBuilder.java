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

package cc.chordflower.weasel.javafx.utilities.layouts;

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX FlowPane.
 */
@AvailableSince( "0.1.0" )
public class FlowPaneBuilder {

  private final FlowPane flowPane = new FlowPane( );

  @Contract( " -> new" )
  public static @NotNull FlowPaneBuilder builder( ) {

    return new FlowPaneBuilder( );
  }

  public FlowPane build( ) {

    return flowPane;
  }

  public FlowPaneBuilder add( Node... nodes ) {

    this.flowPane.getChildren( ).addAll( nodes );
    return this;
  }

  public FlowPaneBuilder withMargin( Node child, Insets value ) {

    FlowPane.setMargin( child, value );
    return this;
  }

  public FlowPaneBuilder withOrientation( Orientation value ) {

    flowPane.setOrientation( value );
    return this;
  }

  public FlowPaneBuilder withHgap( double value ) {

    flowPane.setHgap( value );
    return this;
  }

  public FlowPaneBuilder withVgap( double value ) {

    flowPane.setVgap( value );
    return this;
  }

  public FlowPaneBuilder withPrefWrapLength( double value ) {

    flowPane.setPrefWrapLength( value );
    return this;
  }

  public FlowPaneBuilder withAlignment( Pos value ) {

    flowPane.setAlignment( value );
    return this;
  }

  public FlowPaneBuilder withColumnHalignment( HPos value ) {

    flowPane.setColumnHalignment( value );
    return this;
  }

  public FlowPaneBuilder withRowValignment( VPos value ) {

    flowPane.setRowValignment( value );
    return this;
  }

  public FlowPaneBuilder withSnapToPixel( boolean value ) {

    flowPane.setSnapToPixel( value );
    return this;
  }

  public FlowPaneBuilder withPadding( Insets value ) {

    flowPane.setPadding( value );
    return this;
  }

  public FlowPaneBuilder withBackground( Background value ) {

    flowPane.setBackground( value );
    return this;
  }

  public FlowPaneBuilder withBorder( Border value ) {

    flowPane.setBorder( value );
    return this;
  }

  public FlowPaneBuilder withOpaqueInsets( Insets value ) {

    flowPane.setOpaqueInsets( value );
    return this;
  }

  public FlowPaneBuilder withMinWidth( double value ) {

    flowPane.setMinWidth( value );
    return this;
  }

  public FlowPaneBuilder withMinHeight( double value ) {

    flowPane.setMinHeight( value );
    return this;
  }

  public FlowPaneBuilder withMinSize( double minWidth, double minHeight ) {

    flowPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public FlowPaneBuilder withPrefWidth( double value ) {

    flowPane.setPrefWidth( value );
    return this;
  }

  public FlowPaneBuilder withPrefHeight( double value ) {

    flowPane.setPrefHeight( value );
    return this;
  }

  public FlowPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    flowPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public FlowPaneBuilder withMaxWidth( double value ) {

    flowPane.setMaxWidth( value );
    return this;
  }

  public FlowPaneBuilder withMaxHeight( double value ) {

    flowPane.setMaxHeight( value );
    return this;
  }

  public FlowPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    flowPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public FlowPaneBuilder withShape( Shape value ) {

    flowPane.setShape( value );
    return this;
  }

  public FlowPaneBuilder withScaleShape( boolean value ) {

    flowPane.setScaleShape( value );
    return this;
  }

  public FlowPaneBuilder withCenterShape( boolean value ) {

    flowPane.setCenterShape( value );
    return this;
  }

  public FlowPaneBuilder withCacheShape( boolean value ) {

    flowPane.setCacheShape( value );
    return this;
  }

  public FlowPaneBuilder withUserData( Object value ) {

    flowPane.setUserData( value );
    return this;
  }

  public FlowPaneBuilder withId( String value ) {

    flowPane.setId( value );
    return this;
  }

  public FlowPaneBuilder withStyle( String value ) {

    flowPane.setStyle( value );
    return this;
  }

  public FlowPaneBuilder withVisible( boolean value ) {

    flowPane.setVisible( value );
    return this;
  }

  public FlowPaneBuilder withCursor( Cursor value ) {

    flowPane.setCursor( value );
    return this;
  }

  public FlowPaneBuilder withOpacity( double value ) {

    flowPane.setOpacity( value );
    return this;
  }

  public FlowPaneBuilder withBlendMode( BlendMode value ) {

    flowPane.setBlendMode( value );
    return this;
  }

  public FlowPaneBuilder withClip( Node value ) {

    flowPane.setClip( value );
    return this;
  }

  public FlowPaneBuilder withCache( boolean value ) {

    flowPane.setCache( value );
    return this;
  }

  public FlowPaneBuilder withCacheHint( CacheHint value ) {

    flowPane.setCacheHint( value );
    return this;
  }

  public FlowPaneBuilder withEffect( Effect value ) {

    flowPane.setEffect( value );
    return this;
  }

  public FlowPaneBuilder withDepthTest( DepthTest value ) {

    flowPane.setDepthTest( value );
    return this;
  }

  public FlowPaneBuilder withDisable( boolean value ) {

    flowPane.setDisable( value );
    return this;
  }

  public FlowPaneBuilder withPickOnBounds( boolean value ) {

    flowPane.setPickOnBounds( value );
    return this;
  }

  public FlowPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    flowPane.setOnDragEntered( value );
    return this;
  }

  public FlowPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    flowPane.setOnDragExited( value );
    return this;
  }

  public FlowPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    flowPane.setOnDragOver( value );
    return this;
  }

  public FlowPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    flowPane.setOnDragDropped( value );
    return this;
  }

  public FlowPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    flowPane.setOnDragDone( value );
    return this;
  }

  public FlowPaneBuilder withManaged( boolean value ) {

    flowPane.setManaged( value );
    return this;
  }

  public FlowPaneBuilder withLayoutX( double value ) {

    flowPane.setLayoutX( value );
    return this;
  }

  public FlowPaneBuilder withLayoutY( double value ) {

    flowPane.setLayoutY( value );
    return this;
  }

  public FlowPaneBuilder withViewOrder( double value ) {

    flowPane.setViewOrder( value );
    return this;
  }

  public FlowPaneBuilder withTranslateX( double value ) {

    flowPane.setTranslateX( value );
    return this;
  }

  public FlowPaneBuilder withTranslateY( double value ) {

    flowPane.setTranslateY( value );
    return this;
  }

  public FlowPaneBuilder withTranslateZ( double value ) {

    flowPane.setTranslateZ( value );
    return this;
  }

  public FlowPaneBuilder withScaleX( double value ) {

    flowPane.setScaleX( value );
    return this;
  }

  public FlowPaneBuilder withScaleY( double value ) {

    flowPane.setScaleY( value );
    return this;
  }

  public FlowPaneBuilder withScaleZ( double value ) {

    flowPane.setScaleZ( value );
    return this;
  }

  public FlowPaneBuilder withRotate( double value ) {

    flowPane.setRotate( value );
    return this;
  }

  public FlowPaneBuilder withRotationAxis( Point3D value ) {

    flowPane.setRotationAxis( value );
    return this;
  }

  public FlowPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    flowPane.setNodeOrientation( orientation );
    return this;
  }

  public FlowPaneBuilder withMouseTransparent( boolean value ) {

    flowPane.setMouseTransparent( value );
    return this;
  }

  public FlowPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    flowPane.setOnContextMenuRequested( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMouseClicked( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMouseDragged( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMouseEntered( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMouseExited( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMouseMoved( value );
    return this;
  }

  public FlowPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMousePressed( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnMouseReleased( value );
    return this;
  }

  public FlowPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    flowPane.setOnDragDetected( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    flowPane.setOnMouseDragOver( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    flowPane.setOnMouseDragReleased( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    flowPane.setOnMouseDragEntered( value );
    return this;
  }

  public FlowPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    flowPane.setOnMouseDragExited( value );
    return this;
  }

  public FlowPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    flowPane.setOnScrollStarted( value );
    return this;
  }

  public FlowPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    flowPane.setOnScroll( value );
    return this;
  }

  public FlowPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    flowPane.setOnScrollFinished( value );
    return this;
  }

  public FlowPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    flowPane.setOnRotationStarted( value );
    return this;
  }

  public FlowPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    flowPane.setOnRotate( value );
    return this;
  }

  public FlowPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    flowPane.setOnRotationFinished( value );
    return this;
  }

  public FlowPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    flowPane.setOnZoomStarted( value );
    return this;
  }

  public FlowPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    flowPane.setOnZoom( value );
    return this;
  }

  public FlowPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    flowPane.setOnZoomFinished( value );
    return this;
  }

  public FlowPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    flowPane.setOnSwipeUp( value );
    return this;
  }

  public FlowPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    flowPane.setOnSwipeDown( value );
    return this;
  }

  public FlowPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    flowPane.setOnSwipeLeft( value );
    return this;
  }

  public FlowPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    flowPane.setOnSwipeRight( value );
    return this;
  }

  public FlowPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    flowPane.setOnTouchPressed( value );
    return this;
  }

  public FlowPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    flowPane.setOnTouchMoved( value );
    return this;
  }

  public FlowPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    flowPane.setOnTouchReleased( value );
    return this;
  }

  public FlowPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    flowPane.setOnTouchStationary( value );
    return this;
  }

  public FlowPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    flowPane.setOnKeyPressed( value );
    return this;
  }

  public FlowPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    flowPane.setOnKeyReleased( value );
    return this;
  }

  public FlowPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    flowPane.setOnKeyTyped( value );
    return this;
  }

  public FlowPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    flowPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public FlowPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    flowPane.setInputMethodRequests( value );
    return this;
  }

  public FlowPaneBuilder withFocusTraversable( boolean value ) {

    flowPane.setFocusTraversable( value );
    return this;
  }

  public FlowPaneBuilder withEventDispatcher( EventDispatcher value ) {

    flowPane.setEventDispatcher( value );
    return this;
  }

  public FlowPaneBuilder withAccessibleRole( AccessibleRole value ) {

    flowPane.setAccessibleRole( value );
    return this;
  }

  public FlowPaneBuilder withAccessibleRoleDescription( String value ) {

    flowPane.setAccessibleRoleDescription( value );
    return this;
  }

  public FlowPaneBuilder withAccessibleText( String value ) {

    flowPane.setAccessibleText( value );
    return this;
  }

  public FlowPaneBuilder withAccessibleHelp( String value ) {

    flowPane.setAccessibleHelp( value );
    return this;
  }

}
