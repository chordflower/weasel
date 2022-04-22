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
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.TableView.ResizeFeatures;
import javafx.scene.control.TableView.TableViewFocusModel;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import javafx.util.Callback;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class TableViewBuilder< S > {

  private final TableView< S > built = new TableView<>( );

  private TableViewBuilder( ) {

  }

  @Contract( " -> new" )
  public static < S > @NotNull TableViewBuilder< S > builder( ) {

    return new TableViewBuilder<>( );
  }

  @Contract( pure = true )
  public TableView< S > build( ) {

    return this.built;
  }

  public TableViewBuilder< S > withItems( ObservableList< S > value ) {

    built.setItems( value );
    return this;
  }

  public TableViewBuilder< S > withTableMenuButtonVisible( boolean value ) {

    built.setTableMenuButtonVisible( value );
    return this;
  }

  public TableViewBuilder< S > withColumnResizePolicy( @SuppressWarnings( "rawtypes" ) Callback< ResizeFeatures, Boolean > callback ) {

    built.setColumnResizePolicy( callback );
    return this;
  }

  public TableViewBuilder< S > withRowFactory( Callback< TableView< S >, TableRow< S > > value ) {

    built.setRowFactory( value );
    return this;
  }

  public TableViewBuilder< S > withPlaceholder( Node value ) {

    built.setPlaceholder( value );
    return this;
  }

  public TableViewBuilder< S > withSelectionModel( TableViewSelectionModel< S > value ) {

    built.setSelectionModel( value );
    return this;
  }

  public TableViewBuilder< S > withFocusModel( TableViewFocusModel< S > value ) {

    built.setFocusModel( value );
    return this;
  }

  public TableViewBuilder< S > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TableViewBuilder< S > withFixedCellSize( double value ) {

    built.setFixedCellSize( value );
    return this;
  }

  public TableViewBuilder< S > withSortPolicy( Callback< TableView< S >, Boolean > callback ) {

    built.setSortPolicy( callback );
    return this;
  }

  public TableViewBuilder< S > withOnSort( EventHandler< SortEvent< TableView< S > > > value ) {

    built.setOnSort( value );
    return this;
  }

  public TableViewBuilder< S > withOnScrollTo( EventHandler< ScrollToEvent< Integer > > value ) {

    built.setOnScrollTo( value );
    return this;
  }

  public TableViewBuilder< S > withOnScrollToColumn( EventHandler< ScrollToEvent< TableColumn< S, ? > > > value ) {

    built.setOnScrollToColumn( value );
    return this;
  }

  public TableViewBuilder< S > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public TableViewBuilder< S > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public TableViewBuilder< S > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TableViewBuilder< S > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public TableViewBuilder< S > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public TableViewBuilder< S > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public TableViewBuilder< S > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public TableViewBuilder< S > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public TableViewBuilder< S > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TableViewBuilder< S > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public TableViewBuilder< S > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public TableViewBuilder< S > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TableViewBuilder< S > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public TableViewBuilder< S > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TableViewBuilder< S > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TableViewBuilder< S > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public TableViewBuilder< S > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TableViewBuilder< S > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public TableViewBuilder< S > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public TableViewBuilder< S > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public TableViewBuilder< S > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public TableViewBuilder< S > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public TableViewBuilder< S > withId( String value ) {

    built.setId( value );
    return this;
  }

  public TableViewBuilder< S > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TableViewBuilder< S > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TableViewBuilder< S > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public TableViewBuilder< S > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public TableViewBuilder< S > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public TableViewBuilder< S > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public TableViewBuilder< S > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public TableViewBuilder< S > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public TableViewBuilder< S > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public TableViewBuilder< S > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public TableViewBuilder< S > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public TableViewBuilder< S > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public TableViewBuilder< S > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public TableViewBuilder< S > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public TableViewBuilder< S > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public TableViewBuilder< S > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public TableViewBuilder< S > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public TableViewBuilder< S > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public TableViewBuilder< S > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public TableViewBuilder< S > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public TableViewBuilder< S > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public TableViewBuilder< S > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public TableViewBuilder< S > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public TableViewBuilder< S > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public TableViewBuilder< S > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public TableViewBuilder< S > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public TableViewBuilder< S > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public TableViewBuilder< S > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public TableViewBuilder< S > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public TableViewBuilder< S > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public TableViewBuilder< S > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public TableViewBuilder< S > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public TableViewBuilder< S > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public TableViewBuilder< S > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public TableViewBuilder< S > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public TableViewBuilder< S > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public TableViewBuilder< S > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public TableViewBuilder< S > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public TableViewBuilder< S > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public TableViewBuilder< S > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public TableViewBuilder< S > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public TableViewBuilder< S > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public TableViewBuilder< S > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public TableViewBuilder< S > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public TableViewBuilder< S > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public TableViewBuilder< S > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public TableViewBuilder< S > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public TableViewBuilder< S > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public TableViewBuilder< S > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public TableViewBuilder< S > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public TableViewBuilder< S > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public TableViewBuilder< S > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public TableViewBuilder< S > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public TableViewBuilder< S > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public TableViewBuilder< S > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public TableViewBuilder< S > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public TableViewBuilder< S > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public TableViewBuilder< S > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public TableViewBuilder< S > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public TableViewBuilder< S > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public TableViewBuilder< S > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public TableViewBuilder< S > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public TableViewBuilder< S > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
