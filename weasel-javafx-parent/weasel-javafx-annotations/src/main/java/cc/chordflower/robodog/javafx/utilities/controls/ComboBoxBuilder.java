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
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import javafx.util.Callback;
import javafx.util.StringConverter;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX ComboBox.
 */
@AvailableSince( "0.1.0" )
public final class ComboBoxBuilder< T > {

  private final ComboBox< T > built = new ComboBox<>( );

  private ComboBoxBuilder( ) {

  }

  @Contract( " -> new" )
  public static < T > @NotNull ComboBoxBuilder< T > builder( ) {

    return new ComboBoxBuilder<>( );
  }

  @Contract( pure = true )
  public ComboBox< T > build( ) {

    return this.built;
  }

  public ComboBoxBuilder< T > withItems( ObservableList< T > value ) {

    built.setItems( value );
    return this;
  }

  public ComboBoxBuilder< T > withConverter( StringConverter< T > value ) {

    built.setConverter( value );
    return this;
  }

  public ComboBoxBuilder< T > withCellFactory( Callback< ListView< T >, ListCell< T > > value ) {

    built.setCellFactory( value );
    return this;
  }

  public ComboBoxBuilder< T > withButtonCell( ListCell< T > value ) {

    built.setButtonCell( value );
    return this;
  }

  public ComboBoxBuilder< T > withSelectionModel( SingleSelectionModel< T > value ) {

    built.setSelectionModel( value );
    return this;
  }

  public ComboBoxBuilder< T > withVisibleRowCount( int value ) {

    built.setVisibleRowCount( value );
    return this;
  }

  public ComboBoxBuilder< T > withPlaceholder( Node value ) {

    built.setPlaceholder( value );
    return this;
  }

  public ComboBoxBuilder< T > withValue( T value ) {

    built.setValue( value );
    return this;
  }

  public ComboBoxBuilder< T > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public ComboBoxBuilder< T > withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public ComboBoxBuilder< T > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ComboBoxBuilder< T > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ComboBoxBuilder< T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ComboBoxBuilder< T > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ComboBoxBuilder< T > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ComboBoxBuilder< T > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ComboBoxBuilder< T > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ComboBoxBuilder< T > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ComboBoxBuilder< T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ComboBoxBuilder< T > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ComboBoxBuilder< T > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ComboBoxBuilder< T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ComboBoxBuilder< T > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ComboBoxBuilder< T > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ComboBoxBuilder< T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ComboBoxBuilder< T > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ComboBoxBuilder< T > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ComboBoxBuilder< T > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ComboBoxBuilder< T > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ComboBoxBuilder< T > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ComboBoxBuilder< T > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ComboBoxBuilder< T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ComboBoxBuilder< T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public ComboBoxBuilder< T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ComboBoxBuilder< T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ComboBoxBuilder< T > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ComboBoxBuilder< T > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ComboBoxBuilder< T > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ComboBoxBuilder< T > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ComboBoxBuilder< T > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ComboBoxBuilder< T > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ComboBoxBuilder< T > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ComboBoxBuilder< T > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ComboBoxBuilder< T > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ComboBoxBuilder< T > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ComboBoxBuilder< T > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ComboBoxBuilder< T > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ComboBoxBuilder< T > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ComboBoxBuilder< T > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ComboBoxBuilder< T > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ComboBoxBuilder< T > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ComboBoxBuilder< T > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ComboBoxBuilder< T > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ComboBoxBuilder< T > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ComboBoxBuilder< T > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ComboBoxBuilder< T > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ComboBoxBuilder< T > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ComboBoxBuilder< T > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ComboBoxBuilder< T > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ComboBoxBuilder< T > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ComboBoxBuilder< T > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ComboBoxBuilder< T > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ComboBoxBuilder< T > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ComboBoxBuilder< T > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ComboBoxBuilder< T > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ComboBoxBuilder< T > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ComboBoxBuilder< T > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
