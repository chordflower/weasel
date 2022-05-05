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
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Skin;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX ColorPicker.
 */
@AvailableSince( "0.1.0" )
public final class ColorPickerBuilder {

  private final ColorPicker built = new ColorPicker( );

  private ColorPickerBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull ColorPickerBuilder builder( ) {

    return new ColorPickerBuilder( );
  }

  @Contract( pure = true )
  public ColorPicker build( ) {

    return this.built;
  }

  public ColorPickerBuilder withValue( Color value ) {

    built.setValue( value );
    return this;
  }

  public ColorPickerBuilder withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public ColorPickerBuilder withPromptText( String value ) {

    built.setPromptText( value );
    return this;
  }

  public ColorPickerBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public ColorPickerBuilder withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public ColorPickerBuilder withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public ColorPickerBuilder withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public ColorPickerBuilder withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public ColorPickerBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ColorPickerBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ColorPickerBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ColorPickerBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ColorPickerBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ColorPickerBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ColorPickerBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ColorPickerBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ColorPickerBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ColorPickerBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ColorPickerBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ColorPickerBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ColorPickerBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ColorPickerBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ColorPickerBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ColorPickerBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ColorPickerBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ColorPickerBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ColorPickerBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ColorPickerBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ColorPickerBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ColorPickerBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ColorPickerBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public ColorPickerBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ColorPickerBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ColorPickerBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ColorPickerBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ColorPickerBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ColorPickerBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ColorPickerBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ColorPickerBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ColorPickerBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ColorPickerBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ColorPickerBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ColorPickerBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ColorPickerBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ColorPickerBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ColorPickerBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ColorPickerBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ColorPickerBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ColorPickerBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ColorPickerBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ColorPickerBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ColorPickerBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ColorPickerBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ColorPickerBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ColorPickerBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ColorPickerBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ColorPickerBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ColorPickerBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ColorPickerBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ColorPickerBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ColorPickerBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ColorPickerBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ColorPickerBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ColorPickerBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ColorPickerBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ColorPickerBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ColorPickerBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ColorPickerBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ColorPickerBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ColorPickerBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ColorPickerBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ColorPickerBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ColorPickerBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ColorPickerBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ColorPickerBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ColorPickerBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ColorPickerBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ColorPickerBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ColorPickerBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ColorPickerBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ColorPickerBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ColorPickerBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ColorPickerBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ColorPickerBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ColorPickerBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ColorPickerBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ColorPickerBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ColorPickerBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ColorPickerBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ColorPickerBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ColorPickerBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ColorPickerBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ColorPickerBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ColorPickerBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
