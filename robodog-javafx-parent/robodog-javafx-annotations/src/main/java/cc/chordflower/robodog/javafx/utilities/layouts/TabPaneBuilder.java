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

package cc.chordflower.robodog.javafx.utilities.layouts;

import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.geometry.Side;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TabPane.TabDragPolicy;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class TabPaneBuilder {

  private final TabPane tabPane = new TabPane( );

  @Contract( " -> new" )
  public static @NotNull TabPaneBuilder builder( ) {

    return new TabPaneBuilder( );
  }

  public TabPane build( ) {

    return tabPane;
  }

  public TabPaneBuilder add( Tab... elements ) {

    this.tabPane.getTabs( ).addAll( elements );
    return this;
  }

  public TabPaneBuilder withSelectionModel( SingleSelectionModel< Tab > value ) {

    tabPane.setSelectionModel( value );
    return this;
  }

  public TabPaneBuilder withSide( Side value ) {

    tabPane.setSide( value );
    return this;
  }

  public TabPaneBuilder withTabClosingPolicy( TabClosingPolicy value ) {

    tabPane.setTabClosingPolicy( value );
    return this;
  }

  public TabPaneBuilder withRotateGraphic( boolean value ) {

    tabPane.setRotateGraphic( value );
    return this;
  }

  public TabPaneBuilder withTabMinWidth( double value ) {

    tabPane.setTabMinWidth( value );
    return this;
  }

  public TabPaneBuilder withTabMaxWidth( double value ) {

    tabPane.setTabMaxWidth( value );
    return this;
  }

  public TabPaneBuilder withTabMinHeight( double value ) {

    tabPane.setTabMinHeight( value );
    return this;
  }

  public TabPaneBuilder withTabMaxHeight( double value ) {

    tabPane.setTabMaxHeight( value );
    return this;
  }

  public TabPaneBuilder withTabDragPolicy( TabDragPolicy value ) {

    tabPane.setTabDragPolicy( value );
    return this;
  }

  public TabPaneBuilder withSkin( Skin< ? > value ) {

    tabPane.setSkin( value );
    return this;
  }

  public TabPaneBuilder withTooltip( Tooltip value ) {

    tabPane.setTooltip( value );
    return this;
  }

  public TabPaneBuilder withContextMenu( ContextMenu value ) {

    tabPane.setContextMenu( value );
    return this;
  }

  public TabPaneBuilder withSnapToPixel( boolean value ) {

    tabPane.setSnapToPixel( value );
    return this;
  }

  public TabPaneBuilder withPadding( Insets value ) {

    tabPane.setPadding( value );
    return this;
  }

  public TabPaneBuilder withBackground( Background value ) {

    tabPane.setBackground( value );
    return this;
  }

  public TabPaneBuilder withBorder( Border value ) {

    tabPane.setBorder( value );
    return this;
  }

  public TabPaneBuilder withOpaqueInsets( Insets value ) {

    tabPane.setOpaqueInsets( value );
    return this;
  }

  public TabPaneBuilder withMinWidth( double value ) {

    tabPane.setMinWidth( value );
    return this;
  }

  public TabPaneBuilder withMinHeight( double value ) {

    tabPane.setMinHeight( value );
    return this;
  }

  public TabPaneBuilder withMinSize( double minWidth, double minHeight ) {

    tabPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public TabPaneBuilder withPrefWidth( double value ) {

    tabPane.setPrefWidth( value );
    return this;
  }

  public TabPaneBuilder withPrefHeight( double value ) {

    tabPane.setPrefHeight( value );
    return this;
  }

  public TabPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    tabPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public TabPaneBuilder withMaxWidth( double value ) {

    tabPane.setMaxWidth( value );
    return this;
  }

  public TabPaneBuilder withMaxHeight( double value ) {

    tabPane.setMaxHeight( value );
    return this;
  }

  public TabPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    tabPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public TabPaneBuilder withShape( Shape value ) {

    tabPane.setShape( value );
    return this;
  }

  public TabPaneBuilder withScaleShape( boolean value ) {

    tabPane.setScaleShape( value );
    return this;
  }

  public TabPaneBuilder withCenterShape( boolean value ) {

    tabPane.setCenterShape( value );
    return this;
  }

  public TabPaneBuilder withCacheShape( boolean value ) {

    tabPane.setCacheShape( value );
    return this;
  }

  public TabPaneBuilder withUserData( Object value ) {

    tabPane.setUserData( value );
    return this;
  }

  public TabPaneBuilder withId( String value ) {

    tabPane.setId( value );
    return this;
  }

  public TabPaneBuilder withStyle( String value ) {

    tabPane.setStyle( value );
    return this;
  }

  public TabPaneBuilder withVisible( boolean value ) {

    tabPane.setVisible( value );
    return this;
  }

  public TabPaneBuilder withCursor( Cursor value ) {

    tabPane.setCursor( value );
    return this;
  }

  public TabPaneBuilder withOpacity( double value ) {

    tabPane.setOpacity( value );
    return this;
  }

  public TabPaneBuilder withBlendMode( BlendMode value ) {

    tabPane.setBlendMode( value );
    return this;
  }

  public TabPaneBuilder withClip( Node value ) {

    tabPane.setClip( value );
    return this;
  }

  public TabPaneBuilder withCache( boolean value ) {

    tabPane.setCache( value );
    return this;
  }

  public TabPaneBuilder withCacheHint( CacheHint value ) {

    tabPane.setCacheHint( value );
    return this;
  }

  public TabPaneBuilder withEffect( Effect value ) {

    tabPane.setEffect( value );
    return this;
  }

  public TabPaneBuilder withDepthTest( DepthTest value ) {

    tabPane.setDepthTest( value );
    return this;
  }

  public TabPaneBuilder withDisable( boolean value ) {

    tabPane.setDisable( value );
    return this;
  }

  public TabPaneBuilder withPickOnBounds( boolean value ) {

    tabPane.setPickOnBounds( value );
    return this;
  }

  public TabPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    tabPane.setOnDragEntered( value );
    return this;
  }

  public TabPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    tabPane.setOnDragExited( value );
    return this;
  }

  public TabPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    tabPane.setOnDragOver( value );
    return this;
  }

  public TabPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    tabPane.setOnDragDropped( value );
    return this;
  }

  public TabPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    tabPane.setOnDragDone( value );
    return this;
  }

  public TabPaneBuilder withManaged( boolean value ) {

    tabPane.setManaged( value );
    return this;
  }

  public TabPaneBuilder withLayoutX( double value ) {

    tabPane.setLayoutX( value );
    return this;
  }

  public TabPaneBuilder withLayoutY( double value ) {

    tabPane.setLayoutY( value );
    return this;
  }

  public TabPaneBuilder withViewOrder( double value ) {

    tabPane.setViewOrder( value );
    return this;
  }

  public TabPaneBuilder withTranslateX( double value ) {

    tabPane.setTranslateX( value );
    return this;
  }

  public TabPaneBuilder withTranslateY( double value ) {

    tabPane.setTranslateY( value );
    return this;
  }

  public TabPaneBuilder withTranslateZ( double value ) {

    tabPane.setTranslateZ( value );
    return this;
  }

  public TabPaneBuilder withScaleX( double value ) {

    tabPane.setScaleX( value );
    return this;
  }

  public TabPaneBuilder withScaleY( double value ) {

    tabPane.setScaleY( value );
    return this;
  }

  public TabPaneBuilder withScaleZ( double value ) {

    tabPane.setScaleZ( value );
    return this;
  }

  public TabPaneBuilder withRotate( double value ) {

    tabPane.setRotate( value );
    return this;
  }

  public TabPaneBuilder withRotationAxis( Point3D value ) {

    tabPane.setRotationAxis( value );
    return this;
  }

  public TabPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    tabPane.setNodeOrientation( orientation );
    return this;
  }

  public TabPaneBuilder withMouseTransparent( boolean value ) {

    tabPane.setMouseTransparent( value );
    return this;
  }

  public TabPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    tabPane.setOnContextMenuRequested( value );
    return this;
  }

  public TabPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMouseClicked( value );
    return this;
  }

  public TabPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMouseDragged( value );
    return this;
  }

  public TabPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMouseEntered( value );
    return this;
  }

  public TabPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMouseExited( value );
    return this;
  }

  public TabPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMouseMoved( value );
    return this;
  }

  public TabPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMousePressed( value );
    return this;
  }

  public TabPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnMouseReleased( value );
    return this;
  }

  public TabPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    tabPane.setOnDragDetected( value );
    return this;
  }

  public TabPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    tabPane.setOnMouseDragOver( value );
    return this;
  }

  public TabPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    tabPane.setOnMouseDragReleased( value );
    return this;
  }

  public TabPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    tabPane.setOnMouseDragEntered( value );
    return this;
  }

  public TabPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    tabPane.setOnMouseDragExited( value );
    return this;
  }

  public TabPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    tabPane.setOnScrollStarted( value );
    return this;
  }

  public TabPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    tabPane.setOnScroll( value );
    return this;
  }

  public TabPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    tabPane.setOnScrollFinished( value );
    return this;
  }

  public TabPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    tabPane.setOnRotationStarted( value );
    return this;
  }

  public TabPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    tabPane.setOnRotate( value );
    return this;
  }

  public TabPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    tabPane.setOnRotationFinished( value );
    return this;
  }

  public TabPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    tabPane.setOnZoomStarted( value );
    return this;
  }

  public TabPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    tabPane.setOnZoom( value );
    return this;
  }

  public TabPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    tabPane.setOnZoomFinished( value );
    return this;
  }

  public TabPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    tabPane.setOnSwipeUp( value );
    return this;
  }

  public TabPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    tabPane.setOnSwipeDown( value );
    return this;
  }

  public TabPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    tabPane.setOnSwipeLeft( value );
    return this;
  }

  public TabPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    tabPane.setOnSwipeRight( value );
    return this;
  }

  public TabPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    tabPane.setOnTouchPressed( value );
    return this;
  }

  public TabPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    tabPane.setOnTouchMoved( value );
    return this;
  }

  public TabPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    tabPane.setOnTouchReleased( value );
    return this;
  }

  public TabPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    tabPane.setOnTouchStationary( value );
    return this;
  }

  public TabPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    tabPane.setOnKeyPressed( value );
    return this;
  }

  public TabPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    tabPane.setOnKeyReleased( value );
    return this;
  }

  public TabPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    tabPane.setOnKeyTyped( value );
    return this;
  }

  public TabPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    tabPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public TabPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    tabPane.setInputMethodRequests( value );
    return this;
  }

  public TabPaneBuilder withFocusTraversable( boolean value ) {

    tabPane.setFocusTraversable( value );
    return this;
  }

  public TabPaneBuilder withEventDispatcher( EventDispatcher value ) {

    tabPane.setEventDispatcher( value );
    return this;
  }

  public TabPaneBuilder withAccessibleRole( AccessibleRole value ) {

    tabPane.setAccessibleRole( value );
    return this;
  }

  public TabPaneBuilder withAccessibleRoleDescription( String value ) {

    tabPane.setAccessibleRoleDescription( value );
    return this;
  }

  public TabPaneBuilder withAccessibleText( String value ) {

    tabPane.setAccessibleText( value );
    return this;
  }

  public TabPaneBuilder withAccessibleHelp( String value ) {

    tabPane.setAccessibleHelp( value );
    return this;
  }

}
