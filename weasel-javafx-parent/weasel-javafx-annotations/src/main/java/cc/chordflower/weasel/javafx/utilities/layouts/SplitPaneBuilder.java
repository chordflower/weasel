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

package cc.chordflower.weasel.javafx.utilities.layouts;

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Skin;
import javafx.scene.control.SplitPane;
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
 * This is a fluent builder for creating a JavaFX SplitPane.
 */
@AvailableSince( "0.1.0" )
public class SplitPaneBuilder {

  private final SplitPane splitPane = new SplitPane( );

  @Contract( " -> new" )
  public static @NotNull SplitPaneBuilder builder( ) {

    return new SplitPaneBuilder( );
  }

  public SplitPane build( ) {

    return splitPane;
  }

  public SplitPaneBuilder add( Node... nodes ) {

    this.splitPane.getItems( ).addAll( nodes );
    return this;
  }

  public SplitPaneBuilder withResizableWithParent( Node node, Boolean value ) {

    SplitPane.setResizableWithParent( node, value );
    return this;
  }

  public SplitPaneBuilder withOrientation( Orientation value ) {

    splitPane.setOrientation( value );
    return this;
  }

  public SplitPaneBuilder withDividerPosition( int dividerIndex, double position ) {

    splitPane.setDividerPosition( dividerIndex, position );
    return this;
  }

  public SplitPaneBuilder withDividerPositions( double... positions ) {

    splitPane.setDividerPositions( positions );
    return this;
  }

  public SplitPaneBuilder withSkin( Skin< ? > value ) {

    splitPane.setSkin( value );
    return this;
  }

  public SplitPaneBuilder withTooltip( Tooltip value ) {

    splitPane.setTooltip( value );
    return this;
  }

  public SplitPaneBuilder withContextMenu( ContextMenu value ) {

    splitPane.setContextMenu( value );
    return this;
  }

  public SplitPaneBuilder withSnapToPixel( boolean value ) {

    splitPane.setSnapToPixel( value );
    return this;
  }

  public SplitPaneBuilder withPadding( Insets value ) {

    splitPane.setPadding( value );
    return this;
  }

  public SplitPaneBuilder withBackground( Background value ) {

    splitPane.setBackground( value );
    return this;
  }

  public SplitPaneBuilder withBorder( Border value ) {

    splitPane.setBorder( value );
    return this;
  }

  public SplitPaneBuilder withOpaqueInsets( Insets value ) {

    splitPane.setOpaqueInsets( value );
    return this;
  }

  public SplitPaneBuilder withMinWidth( double value ) {

    splitPane.setMinWidth( value );
    return this;
  }

  public SplitPaneBuilder withMinHeight( double value ) {

    splitPane.setMinHeight( value );
    return this;
  }

  public SplitPaneBuilder withMinSize( double minWidth, double minHeight ) {

    splitPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public SplitPaneBuilder withPrefWidth( double value ) {

    splitPane.setPrefWidth( value );
    return this;
  }

  public SplitPaneBuilder withPrefHeight( double value ) {

    splitPane.setPrefHeight( value );
    return this;
  }

  public SplitPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    splitPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public SplitPaneBuilder withMaxWidth( double value ) {

    splitPane.setMaxWidth( value );
    return this;
  }

  public SplitPaneBuilder withMaxHeight( double value ) {

    splitPane.setMaxHeight( value );
    return this;
  }

  public SplitPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    splitPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public SplitPaneBuilder withShape( Shape value ) {

    splitPane.setShape( value );
    return this;
  }

  public SplitPaneBuilder withScaleShape( boolean value ) {

    splitPane.setScaleShape( value );
    return this;
  }

  public SplitPaneBuilder withCenterShape( boolean value ) {

    splitPane.setCenterShape( value );
    return this;
  }

  public SplitPaneBuilder withCacheShape( boolean value ) {

    splitPane.setCacheShape( value );
    return this;
  }

  public SplitPaneBuilder withUserData( Object value ) {

    splitPane.setUserData( value );
    return this;
  }

  public SplitPaneBuilder withId( String value ) {

    splitPane.setId( value );
    return this;
  }

  public SplitPaneBuilder withStyle( String value ) {

    splitPane.setStyle( value );
    return this;
  }

  public SplitPaneBuilder withVisible( boolean value ) {

    splitPane.setVisible( value );
    return this;
  }

  public SplitPaneBuilder withCursor( Cursor value ) {

    splitPane.setCursor( value );
    return this;
  }

  public SplitPaneBuilder withOpacity( double value ) {

    splitPane.setOpacity( value );
    return this;
  }

  public SplitPaneBuilder withBlendMode( BlendMode value ) {

    splitPane.setBlendMode( value );
    return this;
  }

  public SplitPaneBuilder withClip( Node value ) {

    splitPane.setClip( value );
    return this;
  }

  public SplitPaneBuilder withCache( boolean value ) {

    splitPane.setCache( value );
    return this;
  }

  public SplitPaneBuilder withCacheHint( CacheHint value ) {

    splitPane.setCacheHint( value );
    return this;
  }

  public SplitPaneBuilder withEffect( Effect value ) {

    splitPane.setEffect( value );
    return this;
  }

  public SplitPaneBuilder withDepthTest( DepthTest value ) {

    splitPane.setDepthTest( value );
    return this;
  }

  public SplitPaneBuilder withDisable( boolean value ) {

    splitPane.setDisable( value );
    return this;
  }

  public SplitPaneBuilder withPickOnBounds( boolean value ) {

    splitPane.setPickOnBounds( value );
    return this;
  }

  public SplitPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    splitPane.setOnDragEntered( value );
    return this;
  }

  public SplitPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    splitPane.setOnDragExited( value );
    return this;
  }

  public SplitPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    splitPane.setOnDragOver( value );
    return this;
  }

  public SplitPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    splitPane.setOnDragDropped( value );
    return this;
  }

  public SplitPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    splitPane.setOnDragDone( value );
    return this;
  }

  public SplitPaneBuilder withManaged( boolean value ) {

    splitPane.setManaged( value );
    return this;
  }

  public SplitPaneBuilder withLayoutX( double value ) {

    splitPane.setLayoutX( value );
    return this;
  }

  public SplitPaneBuilder withLayoutY( double value ) {

    splitPane.setLayoutY( value );
    return this;
  }

  public SplitPaneBuilder withViewOrder( double value ) {

    splitPane.setViewOrder( value );
    return this;
  }

  public SplitPaneBuilder withTranslateX( double value ) {

    splitPane.setTranslateX( value );
    return this;
  }

  public SplitPaneBuilder withTranslateY( double value ) {

    splitPane.setTranslateY( value );
    return this;
  }

  public SplitPaneBuilder withTranslateZ( double value ) {

    splitPane.setTranslateZ( value );
    return this;
  }

  public SplitPaneBuilder withScaleX( double value ) {

    splitPane.setScaleX( value );
    return this;
  }

  public SplitPaneBuilder withScaleY( double value ) {

    splitPane.setScaleY( value );
    return this;
  }

  public SplitPaneBuilder withScaleZ( double value ) {

    splitPane.setScaleZ( value );
    return this;
  }

  public SplitPaneBuilder withRotate( double value ) {

    splitPane.setRotate( value );
    return this;
  }

  public SplitPaneBuilder withRotationAxis( Point3D value ) {

    splitPane.setRotationAxis( value );
    return this;
  }

  public SplitPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    splitPane.setNodeOrientation( orientation );
    return this;
  }

  public SplitPaneBuilder withMouseTransparent( boolean value ) {

    splitPane.setMouseTransparent( value );
    return this;
  }

  public SplitPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    splitPane.setOnContextMenuRequested( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMouseClicked( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMouseDragged( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMouseEntered( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMouseExited( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMouseMoved( value );
    return this;
  }

  public SplitPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMousePressed( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnMouseReleased( value );
    return this;
  }

  public SplitPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    splitPane.setOnDragDetected( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    splitPane.setOnMouseDragOver( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    splitPane.setOnMouseDragReleased( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    splitPane.setOnMouseDragEntered( value );
    return this;
  }

  public SplitPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    splitPane.setOnMouseDragExited( value );
    return this;
  }

  public SplitPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    splitPane.setOnScrollStarted( value );
    return this;
  }

  public SplitPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    splitPane.setOnScroll( value );
    return this;
  }

  public SplitPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    splitPane.setOnScrollFinished( value );
    return this;
  }

  public SplitPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    splitPane.setOnRotationStarted( value );
    return this;
  }

  public SplitPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    splitPane.setOnRotate( value );
    return this;
  }

  public SplitPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    splitPane.setOnRotationFinished( value );
    return this;
  }

  public SplitPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    splitPane.setOnZoomStarted( value );
    return this;
  }

  public SplitPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    splitPane.setOnZoom( value );
    return this;
  }

  public SplitPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    splitPane.setOnZoomFinished( value );
    return this;
  }

  public SplitPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    splitPane.setOnSwipeUp( value );
    return this;
  }

  public SplitPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    splitPane.setOnSwipeDown( value );
    return this;
  }

  public SplitPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    splitPane.setOnSwipeLeft( value );
    return this;
  }

  public SplitPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    splitPane.setOnSwipeRight( value );
    return this;
  }

  public SplitPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    splitPane.setOnTouchPressed( value );
    return this;
  }

  public SplitPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    splitPane.setOnTouchMoved( value );
    return this;
  }

  public SplitPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    splitPane.setOnTouchReleased( value );
    return this;
  }

  public SplitPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    splitPane.setOnTouchStationary( value );
    return this;
  }

  public SplitPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    splitPane.setOnKeyPressed( value );
    return this;
  }

  public SplitPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    splitPane.setOnKeyReleased( value );
    return this;
  }

  public SplitPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    splitPane.setOnKeyTyped( value );
    return this;
  }

  public SplitPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    splitPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public SplitPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    splitPane.setInputMethodRequests( value );
    return this;
  }

  public SplitPaneBuilder withFocusTraversable( boolean value ) {

    splitPane.setFocusTraversable( value );
    return this;
  }

  public SplitPaneBuilder withEventDispatcher( EventDispatcher value ) {

    splitPane.setEventDispatcher( value );
    return this;
  }

  public SplitPaneBuilder withAccessibleRole( AccessibleRole value ) {

    splitPane.setAccessibleRole( value );
    return this;
  }

  public SplitPaneBuilder withAccessibleRoleDescription( String value ) {

    splitPane.setAccessibleRoleDescription( value );
    return this;
  }

  public SplitPaneBuilder withAccessibleText( String value ) {

    splitPane.setAccessibleText( value );
    return this;
  }

  public SplitPaneBuilder withAccessibleHelp( String value ) {

    splitPane.setAccessibleHelp( value );
    return this;
  }

}
