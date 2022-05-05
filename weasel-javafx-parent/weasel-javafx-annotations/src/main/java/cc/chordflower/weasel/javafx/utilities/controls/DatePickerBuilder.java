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

import java.time.LocalDate;
import java.time.chrono.Chronology;

/**
 * This is a fluent builder for creating a JavaFX DatePicker.
 */
@AvailableSince( "0.1.0" )
public final class DatePickerBuilder {

  private final DatePicker built = new DatePicker( );

  private DatePickerBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull DatePickerBuilder builder( ) {

    return new DatePickerBuilder( );
  }

  @Contract( pure = true )
  public DatePicker build( ) {

    return this.built;
  }

  public DatePickerBuilder withDayCellFactory( Callback< DatePicker, DateCell > value ) {

    built.setDayCellFactory( value );
    return this;
  }

  public DatePickerBuilder withChronology( Chronology value ) {

    built.setChronology( value );
    return this;
  }

  public DatePickerBuilder withShowWeekNumbers( boolean value ) {

    built.setShowWeekNumbers( value );
    return this;
  }

  public DatePickerBuilder withConverter( StringConverter< LocalDate > value ) {

    built.setConverter( value );
    return this;
  }

  public DatePickerBuilder withValue( LocalDate value ) {

    built.setValue( value );
    return this;
  }

  public DatePickerBuilder withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public DatePickerBuilder withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public DatePickerBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public DatePickerBuilder withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public DatePickerBuilder withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public DatePickerBuilder withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public DatePickerBuilder withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public DatePickerBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public DatePickerBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public DatePickerBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public DatePickerBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public DatePickerBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public DatePickerBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public DatePickerBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public DatePickerBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public DatePickerBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public DatePickerBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public DatePickerBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public DatePickerBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public DatePickerBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public DatePickerBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public DatePickerBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public DatePickerBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public DatePickerBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public DatePickerBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public DatePickerBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public DatePickerBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public DatePickerBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public DatePickerBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public DatePickerBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public DatePickerBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public DatePickerBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public DatePickerBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public DatePickerBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public DatePickerBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public DatePickerBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public DatePickerBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public DatePickerBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public DatePickerBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public DatePickerBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public DatePickerBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public DatePickerBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public DatePickerBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public DatePickerBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public DatePickerBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public DatePickerBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public DatePickerBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public DatePickerBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public DatePickerBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public DatePickerBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public DatePickerBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public DatePickerBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public DatePickerBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public DatePickerBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public DatePickerBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public DatePickerBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public DatePickerBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public DatePickerBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public DatePickerBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public DatePickerBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public DatePickerBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public DatePickerBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public DatePickerBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public DatePickerBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public DatePickerBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public DatePickerBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public DatePickerBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public DatePickerBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public DatePickerBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public DatePickerBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public DatePickerBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public DatePickerBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public DatePickerBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public DatePickerBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public DatePickerBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public DatePickerBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public DatePickerBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public DatePickerBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public DatePickerBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public DatePickerBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public DatePickerBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public DatePickerBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public DatePickerBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public DatePickerBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public DatePickerBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public DatePickerBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public DatePickerBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public DatePickerBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public DatePickerBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public DatePickerBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public DatePickerBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public DatePickerBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public DatePickerBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public DatePickerBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public DatePickerBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public DatePickerBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public DatePickerBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public DatePickerBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public DatePickerBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public DatePickerBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public DatePickerBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public DatePickerBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
