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

import javafx.collections.ObservableList;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.ListView.EditEvent;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import javafx.util.Callback;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ListViewBuilder< T > {

  private final ListView< T > built = new ListView<>( );

  private ListViewBuilder( ) {

  }

  @Contract( " -> new" )
  public static < T > @NotNull ListViewBuilder< T > builder( ) {

    return new ListViewBuilder<>( );
  }

  @Contract( pure = true )
  public ListView< T > build( ) {

    return this.built;
  }

  public ListViewBuilder< T > withItems( ObservableList< T > value ) {

    built.setItems( value );
    return this;
  }

  public ListViewBuilder< T > withPlaceholder( Node value ) {

    built.setPlaceholder( value );
    return this;
  }

  public ListViewBuilder< T > withSelectionModel( MultipleSelectionModel< T > value ) {

    built.setSelectionModel( value );
    return this;
  }

  public ListViewBuilder< T > withFocusModel( FocusModel< T > value ) {

    built.setFocusModel( value );
    return this;
  }

  public ListViewBuilder< T > withOrientation( Orientation value ) {

    built.setOrientation( value );
    return this;
  }

  public ListViewBuilder< T > withCellFactory( Callback< ListView< T >, ListCell< T > > value ) {

    built.setCellFactory( value );
    return this;
  }

  public ListViewBuilder< T > withFixedCellSize( double value ) {

    built.setFixedCellSize( value );
    return this;
  }

  public ListViewBuilder< T > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public ListViewBuilder< T > withOnEditStart( EventHandler< EditEvent< T > > value ) {

    built.setOnEditStart( value );
    return this;
  }

  public ListViewBuilder< T > withOnEditCommit( EventHandler< EditEvent< T > > value ) {

    built.setOnEditCommit( value );
    return this;
  }

  public ListViewBuilder< T > withOnEditCancel( EventHandler< EditEvent< T > > value ) {

    built.setOnEditCancel( value );
    return this;
  }

  public ListViewBuilder< T > withOnScrollTo( EventHandler< ScrollToEvent< Integer > > value ) {

    built.setOnScrollTo( value );
    return this;
  }

  public ListViewBuilder< T > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ListViewBuilder< T > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ListViewBuilder< T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ListViewBuilder< T > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ListViewBuilder< T > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ListViewBuilder< T > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ListViewBuilder< T > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ListViewBuilder< T > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ListViewBuilder< T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ListViewBuilder< T > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ListViewBuilder< T > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ListViewBuilder< T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ListViewBuilder< T > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ListViewBuilder< T > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ListViewBuilder< T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ListViewBuilder< T > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ListViewBuilder< T > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ListViewBuilder< T > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ListViewBuilder< T > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ListViewBuilder< T > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ListViewBuilder< T > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ListViewBuilder< T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ListViewBuilder< T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public ListViewBuilder< T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ListViewBuilder< T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ListViewBuilder< T > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ListViewBuilder< T > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ListViewBuilder< T > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ListViewBuilder< T > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ListViewBuilder< T > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ListViewBuilder< T > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ListViewBuilder< T > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ListViewBuilder< T > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ListViewBuilder< T > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ListViewBuilder< T > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ListViewBuilder< T > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ListViewBuilder< T > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ListViewBuilder< T > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ListViewBuilder< T > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ListViewBuilder< T > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ListViewBuilder< T > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ListViewBuilder< T > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ListViewBuilder< T > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ListViewBuilder< T > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ListViewBuilder< T > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ListViewBuilder< T > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ListViewBuilder< T > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ListViewBuilder< T > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ListViewBuilder< T > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ListViewBuilder< T > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ListViewBuilder< T > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ListViewBuilder< T > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ListViewBuilder< T > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ListViewBuilder< T > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ListViewBuilder< T > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ListViewBuilder< T > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ListViewBuilder< T > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ListViewBuilder< T > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ListViewBuilder< T > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ListViewBuilder< T > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ListViewBuilder< T > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ListViewBuilder< T > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ListViewBuilder< T > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ListViewBuilder< T > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ListViewBuilder< T > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ListViewBuilder< T > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ListViewBuilder< T > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ListViewBuilder< T > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ListViewBuilder< T > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ListViewBuilder< T > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ListViewBuilder< T > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ListViewBuilder< T > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ListViewBuilder< T > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ListViewBuilder< T > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ListViewBuilder< T > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ListViewBuilder< T > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ListViewBuilder< T > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ListViewBuilder< T > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ListViewBuilder< T > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ListViewBuilder< T > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ListViewBuilder< T > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ListViewBuilder< T > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ListViewBuilder< T > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ListViewBuilder< T > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ListViewBuilder< T > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ListViewBuilder< T > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
