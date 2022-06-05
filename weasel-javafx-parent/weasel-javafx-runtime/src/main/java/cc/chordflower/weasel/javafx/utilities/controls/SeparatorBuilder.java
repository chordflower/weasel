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
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Separator;
import javafx.scene.control.Skin;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX Separator.
 */
@AvailableSince( "0.1.0" )
public final class SeparatorBuilder {

  private final Separator built = new Separator( );

  private SeparatorBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull SeparatorBuilder builder( ) {

    return new SeparatorBuilder( );
  }

  @Contract( pure = true )
  public Separator build( ) {

    return this.built;
  }

  public SeparatorBuilder withOrientation( Orientation value ) {

    built.setOrientation( value );
    return this;
  }

  public SeparatorBuilder withHalignment( HPos value ) {

    built.setHalignment( value );
    return this;
  }

  public SeparatorBuilder withValignment( VPos value ) {

    built.setValignment( value );
    return this;
  }

  public SeparatorBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public SeparatorBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public SeparatorBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public SeparatorBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public SeparatorBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public SeparatorBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public SeparatorBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public SeparatorBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public SeparatorBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public SeparatorBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public SeparatorBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public SeparatorBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public SeparatorBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public SeparatorBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public SeparatorBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public SeparatorBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public SeparatorBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public SeparatorBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public SeparatorBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public SeparatorBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public SeparatorBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public SeparatorBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public SeparatorBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public SeparatorBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public SeparatorBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public SeparatorBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public SeparatorBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public SeparatorBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public SeparatorBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public SeparatorBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public SeparatorBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public SeparatorBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public SeparatorBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public SeparatorBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public SeparatorBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public SeparatorBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public SeparatorBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public SeparatorBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public SeparatorBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public SeparatorBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public SeparatorBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public SeparatorBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public SeparatorBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public SeparatorBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public SeparatorBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public SeparatorBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public SeparatorBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public SeparatorBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public SeparatorBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public SeparatorBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public SeparatorBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public SeparatorBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public SeparatorBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public SeparatorBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public SeparatorBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public SeparatorBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public SeparatorBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public SeparatorBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public SeparatorBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public SeparatorBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public SeparatorBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public SeparatorBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public SeparatorBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public SeparatorBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public SeparatorBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public SeparatorBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public SeparatorBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public SeparatorBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public SeparatorBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public SeparatorBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public SeparatorBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public SeparatorBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public SeparatorBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public SeparatorBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public SeparatorBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public SeparatorBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public SeparatorBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public SeparatorBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public SeparatorBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public SeparatorBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public SeparatorBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public SeparatorBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public SeparatorBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public SeparatorBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public SeparatorBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public SeparatorBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public SeparatorBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public SeparatorBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public SeparatorBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public SeparatorBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public SeparatorBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public SeparatorBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public SeparatorBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public SeparatorBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public SeparatorBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
