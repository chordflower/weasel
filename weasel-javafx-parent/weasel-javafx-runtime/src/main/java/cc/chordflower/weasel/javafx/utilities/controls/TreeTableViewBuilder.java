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

package cc.chordflower.weasel.javafx.utilities.controls;

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.TreeTableView.ResizeFeatures;
import javafx.scene.control.TreeTableView.TreeTableViewFocusModel;
import javafx.scene.control.TreeTableView.TreeTableViewSelectionModel;
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
 * This is a fluent builder for creating a JavaFX TreeTableView.
 */
@AvailableSince( "0.1.0" )
public final class TreeTableViewBuilder< S > {

  private final TreeTableView< S > built = new TreeTableView<>( );

  private TreeTableViewBuilder( ) {

  }

  @Contract( " -> new" )
  public static < S > @NotNull TreeTableViewBuilder< S > builder( ) {

    return new TreeTableViewBuilder<>( );
  }

  @Contract( pure = true )
  public TreeTableView< S > build( ) {

    return this.built;
  }

  public TreeTableViewBuilder< S > withRoot( TreeItem< S > value ) {

    built.setRoot( value );
    return this;
  }

  public TreeTableViewBuilder< S > withShowRoot( boolean value ) {

    built.setShowRoot( value );
    return this;
  }

  public TreeTableViewBuilder< S > withTreeColumn( TreeTableColumn< S, ? > value ) {

    built.setTreeColumn( value );
    return this;
  }

  public TreeTableViewBuilder< S > withSelectionModel( TreeTableViewSelectionModel< S > value ) {

    built.setSelectionModel( value );
    return this;
  }

  public TreeTableViewBuilder< S > withFocusModel( TreeTableViewFocusModel< S > value ) {

    built.setFocusModel( value );
    return this;
  }

  public TreeTableViewBuilder< S > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TreeTableViewBuilder< S > withTableMenuButtonVisible( boolean value ) {

    built.setTableMenuButtonVisible( value );
    return this;
  }

  public TreeTableViewBuilder< S > withColumnResizePolicy( @SuppressWarnings( "rawtypes" ) Callback< ResizeFeatures, Boolean > callback ) {

    built.setColumnResizePolicy( callback );
    return this;
  }

  public TreeTableViewBuilder< S > withRowFactory( Callback< TreeTableView< S >, TreeTableRow< S > > value ) {

    built.setRowFactory( value );
    return this;
  }

  public TreeTableViewBuilder< S > withPlaceholder( Node value ) {

    built.setPlaceholder( value );
    return this;
  }

  public TreeTableViewBuilder< S > withFixedCellSize( double value ) {

    built.setFixedCellSize( value );
    return this;
  }

  public TreeTableViewBuilder< S > withSortMode( TreeSortMode value ) {

    built.setSortMode( value );
    return this;
  }

  public TreeTableViewBuilder< S > withSortPolicy( Callback< TreeTableView< S >, Boolean > callback ) {

    built.setSortPolicy( callback );
    return this;
  }

  public TreeTableViewBuilder< S > withOnSort( EventHandler< SortEvent< TreeTableView< S > > > value ) {

    built.setOnSort( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnScrollTo( EventHandler< ScrollToEvent< Integer > > value ) {

    built.setOnScrollTo( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnScrollToColumn( EventHandler< ScrollToEvent< TreeTableColumn< S, ? > > > value ) {

    built.setOnScrollToColumn( value );
    return this;
  }

  public TreeTableViewBuilder< S > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public TreeTableViewBuilder< S > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public TreeTableViewBuilder< S > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TreeTableViewBuilder< S > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public TreeTableViewBuilder< S > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public TreeTableViewBuilder< S > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public TreeTableViewBuilder< S > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public TreeTableViewBuilder< S > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TreeTableViewBuilder< S > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public TreeTableViewBuilder< S > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public TreeTableViewBuilder< S > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TreeTableViewBuilder< S > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public TreeTableViewBuilder< S > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TreeTableViewBuilder< S > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TreeTableViewBuilder< S > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public TreeTableViewBuilder< S > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TreeTableViewBuilder< S > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public TreeTableViewBuilder< S > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public TreeTableViewBuilder< S > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public TreeTableViewBuilder< S > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public TreeTableViewBuilder< S > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public TreeTableViewBuilder< S > withId( String value ) {

    built.setId( value );
    return this;
  }

  public TreeTableViewBuilder< S > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TreeTableViewBuilder< S > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TreeTableViewBuilder< S > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public TreeTableViewBuilder< S > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public TreeTableViewBuilder< S > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public TreeTableViewBuilder< S > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public TreeTableViewBuilder< S > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public TreeTableViewBuilder< S > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public TreeTableViewBuilder< S > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public TreeTableViewBuilder< S > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public TreeTableViewBuilder< S > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public TreeTableViewBuilder< S > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public TreeTableViewBuilder< S > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public TreeTableViewBuilder< S > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public TreeTableViewBuilder< S > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public TreeTableViewBuilder< S > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public TreeTableViewBuilder< S > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public TreeTableViewBuilder< S > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public TreeTableViewBuilder< S > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public TreeTableViewBuilder< S > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public TreeTableViewBuilder< S > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public TreeTableViewBuilder< S > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public TreeTableViewBuilder< S > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public TreeTableViewBuilder< S > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public TreeTableViewBuilder< S > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public TreeTableViewBuilder< S > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public TreeTableViewBuilder< S > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public TreeTableViewBuilder< S > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public TreeTableViewBuilder< S > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public TreeTableViewBuilder< S > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public TreeTableViewBuilder< S > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public TreeTableViewBuilder< S > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public TreeTableViewBuilder< S > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
