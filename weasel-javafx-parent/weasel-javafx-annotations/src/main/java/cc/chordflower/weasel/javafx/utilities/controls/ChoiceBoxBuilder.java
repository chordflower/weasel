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
import javafx.util.StringConverter;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX ChoiceBox.
 */
@AvailableSince( "0.1.0" )
public final class ChoiceBoxBuilder< T > {

  private final ChoiceBox< T > built = new ChoiceBox<>( );

  private ChoiceBoxBuilder( ) {

  }

  @Contract( " -> new" )
  public static < T > @NotNull ChoiceBoxBuilder< T > builder( ) {

    return new ChoiceBoxBuilder<>( );
  }

  @Contract( pure = true )
  public ChoiceBox< T > build( ) {

    return this.built;
  }

  public ChoiceBoxBuilder< T > withSelectionModel( SingleSelectionModel< T > value ) {

    built.setSelectionModel( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withItems( ObservableList< T > value ) {

    built.setItems( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withConverter( StringConverter< T > value ) {

    built.setConverter( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withValue( T value ) {

    built.setValue( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ChoiceBoxBuilder< T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ChoiceBoxBuilder< T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ChoiceBoxBuilder< T > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ChoiceBoxBuilder< T > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ChoiceBoxBuilder< T > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
