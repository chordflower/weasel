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
import javafx.geometry.Orientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Skin;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ScrollBarBuilder {

  private final ScrollBar built = new ScrollBar( );

  private ScrollBarBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull ScrollBarBuilder builder( ) {

    return new ScrollBarBuilder( );
  }

  @Contract( pure = true )
  public ScrollBar build( ) {

    return this.built;
  }

  public ScrollBarBuilder withMin( double value ) {

    built.setMin( value );
    return this;
  }

  public ScrollBarBuilder withMax( double value ) {

    built.setMax( value );
    return this;
  }

  public ScrollBarBuilder withValue( double value ) {

    built.setValue( value );
    return this;
  }

  public ScrollBarBuilder withOrientation( Orientation value ) {

    built.setOrientation( value );
    return this;
  }

  public ScrollBarBuilder withUnitIncrement( double value ) {

    built.setUnitIncrement( value );
    return this;
  }

  public ScrollBarBuilder withBlockIncrement( double value ) {

    built.setBlockIncrement( value );
    return this;
  }

  public ScrollBarBuilder withVisibleAmount( double value ) {

    built.setVisibleAmount( value );
    return this;
  }

  public ScrollBarBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public ScrollBarBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public ScrollBarBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public ScrollBarBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public ScrollBarBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public ScrollBarBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public ScrollBarBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public ScrollBarBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public ScrollBarBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public ScrollBarBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public ScrollBarBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public ScrollBarBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public ScrollBarBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public ScrollBarBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ScrollBarBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public ScrollBarBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public ScrollBarBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ScrollBarBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public ScrollBarBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public ScrollBarBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public ScrollBarBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public ScrollBarBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public ScrollBarBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public ScrollBarBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public ScrollBarBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public ScrollBarBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public ScrollBarBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public ScrollBarBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public ScrollBarBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public ScrollBarBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public ScrollBarBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public ScrollBarBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public ScrollBarBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public ScrollBarBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public ScrollBarBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public ScrollBarBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public ScrollBarBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public ScrollBarBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public ScrollBarBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public ScrollBarBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public ScrollBarBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public ScrollBarBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public ScrollBarBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public ScrollBarBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public ScrollBarBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public ScrollBarBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public ScrollBarBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public ScrollBarBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public ScrollBarBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public ScrollBarBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public ScrollBarBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public ScrollBarBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public ScrollBarBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public ScrollBarBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public ScrollBarBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public ScrollBarBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public ScrollBarBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public ScrollBarBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public ScrollBarBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public ScrollBarBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public ScrollBarBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public ScrollBarBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public ScrollBarBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public ScrollBarBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public ScrollBarBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public ScrollBarBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public ScrollBarBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public ScrollBarBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public ScrollBarBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public ScrollBarBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public ScrollBarBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public ScrollBarBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public ScrollBarBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public ScrollBarBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public ScrollBarBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public ScrollBarBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public ScrollBarBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public ScrollBarBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public ScrollBarBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public ScrollBarBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public ScrollBarBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public ScrollBarBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public ScrollBarBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public ScrollBarBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public ScrollBarBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public ScrollBarBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
