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
import javafx.scene.control.*;
import javafx.scene.control.TreeView.EditEvent;
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
 * This is a fluent APi builder for a JavaFX TreeView.
 * @param <T>
 */
@AvailableSince( "0.1.0" )
public final class TreeViewBuilder< T > {

  private final TreeView< T > built = new TreeView<>( );

  private TreeViewBuilder( ) {

  }

  @Contract( " -> new" )
  public static < T > @NotNull TreeViewBuilder< T > builder( ) {

    return new TreeViewBuilder<>( );
  }

  @Contract( pure = true )
  public TreeView< T > build( ) {

    return this.built;
  }

  public TreeViewBuilder< T > withCellFactory( Callback< TreeView< T >, TreeCell< T > > value ) {

    built.setCellFactory( value );
    return this;
  }

  public TreeViewBuilder< T > withRoot( TreeItem< T > value ) {

    built.setRoot( value );
    return this;
  }

  public TreeViewBuilder< T > withShowRoot( boolean value ) {

    built.setShowRoot( value );
    return this;
  }

  public TreeViewBuilder< T > withSelectionModel( MultipleSelectionModel< TreeItem< T > > value ) {

    built.setSelectionModel( value );
    return this;
  }

  public TreeViewBuilder< T > withFocusModel( FocusModel< TreeItem< T > > value ) {

    built.setFocusModel( value );
    return this;
  }

  public TreeViewBuilder< T > withFixedCellSize( double value ) {

    built.setFixedCellSize( value );
    return this;
  }

  public TreeViewBuilder< T > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TreeViewBuilder< T > withOnEditStart( EventHandler< EditEvent< T > > value ) {

    built.setOnEditStart( value );
    return this;
  }

  public TreeViewBuilder< T > withOnEditCommit( EventHandler< EditEvent< T > > value ) {

    built.setOnEditCommit( value );
    return this;
  }

  public TreeViewBuilder< T > withOnEditCancel( EventHandler< EditEvent< T > > value ) {

    built.setOnEditCancel( value );
    return this;
  }

  public TreeViewBuilder< T > withOnScrollTo( EventHandler< ScrollToEvent< Integer > > value ) {

    built.setOnScrollTo( value );
    return this;
  }

  public TreeViewBuilder< T > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public TreeViewBuilder< T > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public TreeViewBuilder< T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TreeViewBuilder< T > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public TreeViewBuilder< T > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public TreeViewBuilder< T > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public TreeViewBuilder< T > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public TreeViewBuilder< T > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public TreeViewBuilder< T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TreeViewBuilder< T > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public TreeViewBuilder< T > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public TreeViewBuilder< T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TreeViewBuilder< T > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public TreeViewBuilder< T > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TreeViewBuilder< T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TreeViewBuilder< T > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public TreeViewBuilder< T > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TreeViewBuilder< T > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public TreeViewBuilder< T > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public TreeViewBuilder< T > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public TreeViewBuilder< T > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public TreeViewBuilder< T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public TreeViewBuilder< T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public TreeViewBuilder< T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TreeViewBuilder< T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TreeViewBuilder< T > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public TreeViewBuilder< T > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public TreeViewBuilder< T > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public TreeViewBuilder< T > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public TreeViewBuilder< T > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public TreeViewBuilder< T > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public TreeViewBuilder< T > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public TreeViewBuilder< T > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public TreeViewBuilder< T > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public TreeViewBuilder< T > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public TreeViewBuilder< T > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public TreeViewBuilder< T > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public TreeViewBuilder< T > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public TreeViewBuilder< T > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public TreeViewBuilder< T > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public TreeViewBuilder< T > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public TreeViewBuilder< T > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public TreeViewBuilder< T > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public TreeViewBuilder< T > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public TreeViewBuilder< T > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public TreeViewBuilder< T > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public TreeViewBuilder< T > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public TreeViewBuilder< T > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public TreeViewBuilder< T > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public TreeViewBuilder< T > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public TreeViewBuilder< T > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public TreeViewBuilder< T > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public TreeViewBuilder< T > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public TreeViewBuilder< T > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public TreeViewBuilder< T > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public TreeViewBuilder< T > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public TreeViewBuilder< T > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public TreeViewBuilder< T > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public TreeViewBuilder< T > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public TreeViewBuilder< T > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public TreeViewBuilder< T > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public TreeViewBuilder< T > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public TreeViewBuilder< T > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public TreeViewBuilder< T > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public TreeViewBuilder< T > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public TreeViewBuilder< T > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public TreeViewBuilder< T > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public TreeViewBuilder< T > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public TreeViewBuilder< T > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public TreeViewBuilder< T > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public TreeViewBuilder< T > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public TreeViewBuilder< T > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public TreeViewBuilder< T > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public TreeViewBuilder< T > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public TreeViewBuilder< T > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public TreeViewBuilder< T > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public TreeViewBuilder< T > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public TreeViewBuilder< T > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public TreeViewBuilder< T > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public TreeViewBuilder< T > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public TreeViewBuilder< T > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public TreeViewBuilder< T > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public TreeViewBuilder< T > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public TreeViewBuilder< T > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public TreeViewBuilder< T > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
