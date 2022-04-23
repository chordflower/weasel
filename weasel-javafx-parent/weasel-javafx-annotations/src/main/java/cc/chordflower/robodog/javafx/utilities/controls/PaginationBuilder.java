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
import javafx.scene.*;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Pagination;
import javafx.scene.control.Skin;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import javafx.util.Callback;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX Pagination.
 */
@AvailableSince( "0.1.0" )
public final class PaginationBuilder {

  private final Pagination built = new Pagination( );

  private PaginationBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull PaginationBuilder builder( ) {

    return new PaginationBuilder( );
  }

  @Contract( pure = true )
  public Pagination build( ) {

    return this.built;
  }

  public PaginationBuilder withMaxPageIndicatorCount( int value ) {

    built.setMaxPageIndicatorCount( value );
    return this;
  }

  public PaginationBuilder withPageCount( int value ) {

    built.setPageCount( value );
    return this;
  }

  public PaginationBuilder withCurrentPageIndex( int value ) {

    built.setCurrentPageIndex( value );
    return this;
  }

  public PaginationBuilder withPageFactory( Callback< Integer, Node > value ) {

    built.setPageFactory( value );
    return this;
  }

  public PaginationBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public PaginationBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public PaginationBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public PaginationBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public PaginationBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public PaginationBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public PaginationBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public PaginationBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public PaginationBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public PaginationBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public PaginationBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public PaginationBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public PaginationBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public PaginationBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public PaginationBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public PaginationBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public PaginationBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public PaginationBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public PaginationBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public PaginationBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public PaginationBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public PaginationBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public PaginationBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public PaginationBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public PaginationBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public PaginationBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public PaginationBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public PaginationBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public PaginationBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public PaginationBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public PaginationBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public PaginationBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public PaginationBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public PaginationBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public PaginationBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public PaginationBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public PaginationBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public PaginationBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public PaginationBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public PaginationBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public PaginationBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public PaginationBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public PaginationBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public PaginationBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public PaginationBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public PaginationBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public PaginationBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public PaginationBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public PaginationBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public PaginationBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public PaginationBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public PaginationBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public PaginationBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public PaginationBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public PaginationBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public PaginationBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public PaginationBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public PaginationBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public PaginationBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public PaginationBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public PaginationBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public PaginationBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public PaginationBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public PaginationBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public PaginationBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public PaginationBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public PaginationBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public PaginationBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public PaginationBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public PaginationBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public PaginationBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public PaginationBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public PaginationBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public PaginationBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public PaginationBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public PaginationBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public PaginationBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public PaginationBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public PaginationBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public PaginationBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public PaginationBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public PaginationBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public PaginationBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public PaginationBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public PaginationBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public PaginationBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public PaginationBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public PaginationBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public PaginationBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public PaginationBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public PaginationBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public PaginationBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public PaginationBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public PaginationBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public PaginationBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
