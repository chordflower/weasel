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
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX TilePane.
 */
@AvailableSince( "0.1.0" )
public class TilePaneBuilder {

  private final TilePane tilePane;

  private TilePaneBuilder( ) {

    tilePane = new TilePane( );
  }

  @Contract( " -> new" )
  public static @NotNull TilePaneBuilder builder( ) {

    return new TilePaneBuilder( );
  }

  public TilePaneBuilder withAlignment( Node node, Pos value ) {

    TilePane.setAlignment( node, value );
    return this;
  }

  public TilePaneBuilder withMargin( Node node, Insets value ) {

    TilePane.setMargin( node, value );
    return this;
  }

  public TilePaneBuilder withOrientation( Orientation value ) {

    tilePane.setOrientation( value );
    return this;
  }

  public TilePaneBuilder withPrefRows( int value ) {

    tilePane.setPrefRows( value );
    return this;
  }

  public TilePaneBuilder withPrefColumns( int value ) {

    tilePane.setPrefColumns( value );
    return this;
  }

  public TilePaneBuilder withPrefTileWidth( double value ) {

    tilePane.setPrefTileWidth( value );
    return this;
  }

  public TilePaneBuilder withPrefTileHeight( double value ) {

    tilePane.setPrefTileHeight( value );
    return this;
  }

  public TilePaneBuilder withHgap( double value ) {

    tilePane.setHgap( value );
    return this;
  }

  public TilePaneBuilder withVgap( double value ) {

    tilePane.setVgap( value );
    return this;
  }

  public TilePaneBuilder withAlignment( Pos value ) {

    tilePane.setAlignment( value );
    return this;
  }

  public TilePaneBuilder withTileAlignment( Pos value ) {

    tilePane.setTileAlignment( value );
    return this;
  }

  public TilePaneBuilder withSnapToPixel( boolean value ) {

    tilePane.setSnapToPixel( value );
    return this;
  }

  public TilePaneBuilder withPadding( Insets value ) {

    tilePane.setPadding( value );
    return this;
  }

  public TilePaneBuilder withBackground( Background value ) {

    tilePane.setBackground( value );
    return this;
  }

  public TilePaneBuilder withBorder( Border value ) {

    tilePane.setBorder( value );
    return this;
  }

  public TilePaneBuilder withOpaqueInsets( Insets value ) {

    tilePane.setOpaqueInsets( value );
    return this;
  }

  public TilePaneBuilder withMinWidth( double value ) {

    tilePane.setMinWidth( value );
    return this;
  }

  public TilePaneBuilder withMinHeight( double value ) {

    tilePane.setMinHeight( value );
    return this;
  }

  public TilePaneBuilder withMinSize( double minWidth, double minHeight ) {

    tilePane.setMinSize( minWidth, minHeight );
    return this;
  }

  public TilePaneBuilder withPrefWidth( double value ) {

    tilePane.setPrefWidth( value );
    return this;
  }

  public TilePaneBuilder withPrefHeight( double value ) {

    tilePane.setPrefHeight( value );
    return this;
  }

  public TilePaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    tilePane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TilePaneBuilder withMaxWidth( double value ) {

    tilePane.setMaxWidth( value );
    return this;
  }

  public TilePaneBuilder withMaxHeight( double value ) {

    tilePane.setMaxHeight( value );
    return this;
  }

  public TilePaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    tilePane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TilePaneBuilder withShape( Shape value ) {

    tilePane.setShape( value );
    return this;
  }

  public TilePaneBuilder withScaleShape( boolean value ) {

    tilePane.setScaleShape( value );
    return this;
  }

  public TilePaneBuilder withCenterShape( boolean value ) {

    tilePane.setCenterShape( value );
    return this;
  }

  public TilePaneBuilder withCacheShape( boolean value ) {

    tilePane.setCacheShape( value );
    return this;
  }

  public TilePaneBuilder withUserData( Object value ) {

    tilePane.setUserData( value );
    return this;
  }

  public TilePaneBuilder withId( String value ) {

    tilePane.setId( value );
    return this;
  }

  public TilePaneBuilder withStyle( String value ) {

    tilePane.setStyle( value );
    return this;
  }

  public TilePaneBuilder withVisible( boolean value ) {

    tilePane.setVisible( value );
    return this;
  }

  public TilePaneBuilder withCursor( Cursor value ) {

    tilePane.setCursor( value );
    return this;
  }

  public TilePaneBuilder withOpacity( double value ) {

    tilePane.setOpacity( value );
    return this;
  }

  public TilePaneBuilder withBlendMode( BlendMode value ) {

    tilePane.setBlendMode( value );
    return this;
  }

  public TilePaneBuilder withClip( Node value ) {

    tilePane.setClip( value );
    return this;
  }

  public TilePaneBuilder withCache( boolean value ) {

    tilePane.setCache( value );
    return this;
  }

  public TilePaneBuilder withCacheHint( CacheHint value ) {

    tilePane.setCacheHint( value );
    return this;
  }

  public TilePaneBuilder withEffect( Effect value ) {

    tilePane.setEffect( value );
    return this;
  }

  public TilePaneBuilder withDepthTest( DepthTest value ) {

    tilePane.setDepthTest( value );
    return this;
  }

  public TilePaneBuilder withDisable( boolean value ) {

    tilePane.setDisable( value );
    return this;
  }

  public TilePaneBuilder withPickOnBounds( boolean value ) {

    tilePane.setPickOnBounds( value );
    return this;
  }

  public TilePaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    tilePane.setOnDragEntered( value );
    return this;
  }

  public TilePaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    tilePane.setOnDragExited( value );
    return this;
  }

  public TilePaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    tilePane.setOnDragOver( value );
    return this;
  }

  public TilePaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    tilePane.setOnDragDropped( value );
    return this;
  }

  public TilePaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    tilePane.setOnDragDone( value );
    return this;
  }

  public TilePaneBuilder withManaged( boolean value ) {

    tilePane.setManaged( value );
    return this;
  }

  public TilePaneBuilder withLayoutX( double value ) {

    tilePane.setLayoutX( value );
    return this;
  }

  public TilePaneBuilder withLayoutY( double value ) {

    tilePane.setLayoutY( value );
    return this;
  }

  public TilePaneBuilder withViewOrder( double value ) {

    tilePane.setViewOrder( value );
    return this;
  }

  public TilePaneBuilder withTranslateX( double value ) {

    tilePane.setTranslateX( value );
    return this;
  }

  public TilePaneBuilder withTranslateY( double value ) {

    tilePane.setTranslateY( value );
    return this;
  }

  public TilePaneBuilder withTranslateZ( double value ) {

    tilePane.setTranslateZ( value );
    return this;
  }

  public TilePaneBuilder withScaleX( double value ) {

    tilePane.setScaleX( value );
    return this;
  }

  public TilePaneBuilder withScaleY( double value ) {

    tilePane.setScaleY( value );
    return this;
  }

  public TilePaneBuilder withScaleZ( double value ) {

    tilePane.setScaleZ( value );
    return this;
  }

  public TilePaneBuilder withRotate( double value ) {

    tilePane.setRotate( value );
    return this;
  }

  public TilePaneBuilder withRotationAxis( Point3D value ) {

    tilePane.setRotationAxis( value );
    return this;
  }

  public TilePaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    tilePane.setNodeOrientation( orientation );
    return this;
  }

  public TilePaneBuilder withMouseTransparent( boolean value ) {

    tilePane.setMouseTransparent( value );
    return this;
  }

  public TilePaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    tilePane.setOnContextMenuRequested( value );
    return this;
  }

  public TilePaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMouseClicked( value );
    return this;
  }

  public TilePaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMouseDragged( value );
    return this;
  }

  public TilePaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMouseEntered( value );
    return this;
  }

  public TilePaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMouseExited( value );
    return this;
  }

  public TilePaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMouseMoved( value );
    return this;
  }

  public TilePaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMousePressed( value );
    return this;
  }

  public TilePaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnMouseReleased( value );
    return this;
  }

  public TilePaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    tilePane.setOnDragDetected( value );
    return this;
  }

  public TilePaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    tilePane.setOnMouseDragOver( value );
    return this;
  }

  public TilePaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    tilePane.setOnMouseDragReleased( value );
    return this;
  }

  public TilePaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    tilePane.setOnMouseDragEntered( value );
    return this;
  }

  public TilePaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    tilePane.setOnMouseDragExited( value );
    return this;
  }

  public TilePaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    tilePane.setOnScrollStarted( value );
    return this;
  }

  public TilePaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    tilePane.setOnScroll( value );
    return this;
  }

  public TilePaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    tilePane.setOnScrollFinished( value );
    return this;
  }

  public TilePaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    tilePane.setOnRotationStarted( value );
    return this;
  }

  public TilePaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    tilePane.setOnRotate( value );
    return this;
  }

  public TilePaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    tilePane.setOnRotationFinished( value );
    return this;
  }

  public TilePaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    tilePane.setOnZoomStarted( value );
    return this;
  }

  public TilePaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    tilePane.setOnZoom( value );
    return this;
  }

  public TilePaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    tilePane.setOnZoomFinished( value );
    return this;
  }

  public TilePaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    tilePane.setOnSwipeUp( value );
    return this;
  }

  public TilePaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    tilePane.setOnSwipeDown( value );
    return this;
  }

  public TilePaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    tilePane.setOnSwipeLeft( value );
    return this;
  }

  public TilePaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    tilePane.setOnSwipeRight( value );
    return this;
  }

  public TilePaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    tilePane.setOnTouchPressed( value );
    return this;
  }

  public TilePaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    tilePane.setOnTouchMoved( value );
    return this;
  }

  public TilePaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    tilePane.setOnTouchReleased( value );
    return this;
  }

  public TilePaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    tilePane.setOnTouchStationary( value );
    return this;
  }

  public TilePaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    tilePane.setOnKeyPressed( value );
    return this;
  }

  public TilePaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    tilePane.setOnKeyReleased( value );
    return this;
  }

  public TilePaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    tilePane.setOnKeyTyped( value );
    return this;
  }

  public TilePaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    tilePane.setOnInputMethodTextChanged( value );
    return this;
  }

  public TilePaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    tilePane.setInputMethodRequests( value );
    return this;
  }

  public TilePaneBuilder withFocusTraversable( boolean value ) {

    tilePane.setFocusTraversable( value );
    return this;
  }

  public TilePaneBuilder withEventDispatcher( EventDispatcher value ) {

    tilePane.setEventDispatcher( value );
    return this;
  }

  public TilePaneBuilder withAccessibleRole( AccessibleRole value ) {

    tilePane.setAccessibleRole( value );
    return this;
  }

  public TilePaneBuilder withAccessibleRoleDescription( String value ) {

    tilePane.setAccessibleRoleDescription( value );
    return this;
  }

  public TilePaneBuilder withAccessibleText( String value ) {

    tilePane.setAccessibleText( value );
    return this;
  }

  public TilePaneBuilder withAccessibleHelp( String value ) {

    tilePane.setAccessibleHelp( value );
    return this;
  }

  public TilePaneBuilder add( Node... nodes ) {

    tilePane.getChildren( ).addAll( nodes );
    return this;
  }

  public TilePane build( ) {

    return tilePane;
  }

}
