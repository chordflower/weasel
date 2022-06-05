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
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.ButtonBar.ButtonData;
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
 * This is a fluent builder for creating a JavaFX ButtonBar.
 */
@AvailableSince( "0.1.0" )
public class ButtonBarBuilder {

  private final ButtonBar buttonBar = new ButtonBar( );

  @Contract( " -> new" )
  public static @NotNull ButtonBarBuilder builder( ) {

    return new ButtonBarBuilder( );
  }

  public ButtonBar build( ) {

    return buttonBar;
  }

  public ButtonBarBuilder add( Button... buttons ) {

    this.buttonBar.getButtons( ).addAll( buttons );
    return this;
  }

  public ButtonBarBuilder withButtonData( Node button, ButtonData buttonData ) {

    ButtonBar.setButtonData( button, buttonData );
    return this;
  }

  public ButtonBarBuilder withButtonUniformSize( Node button, boolean uniformSize ) {

    ButtonBar.setButtonUniformSize( button, uniformSize );
    return this;
  }

  public ButtonBarBuilder withButtonOrder( String buttonOrder ) {

    buttonBar.setButtonOrder( buttonOrder );
    return this;
  }

  public ButtonBarBuilder withButtonMinWidth( double value ) {

    buttonBar.setButtonMinWidth( value );
    return this;
  }

  public ButtonBarBuilder withSkin( Skin< ? > value ) {

    buttonBar.setSkin( value );
    return this;
  }

  public ButtonBarBuilder withTooltip( Tooltip value ) {

    buttonBar.setTooltip( value );
    return this;
  }

  public ButtonBarBuilder withContextMenu( ContextMenu value ) {

    buttonBar.setContextMenu( value );
    return this;
  }

  public ButtonBarBuilder withSnapToPixel( boolean value ) {

    buttonBar.setSnapToPixel( value );
    return this;
  }

  public ButtonBarBuilder withPadding( Insets value ) {

    buttonBar.setPadding( value );
    return this;
  }

  public ButtonBarBuilder withBackground( Background value ) {

    buttonBar.setBackground( value );
    return this;
  }

  public ButtonBarBuilder withBorder( Border value ) {

    buttonBar.setBorder( value );
    return this;
  }

  public ButtonBarBuilder withOpaqueInsets( Insets value ) {

    buttonBar.setOpaqueInsets( value );
    return this;
  }

  public ButtonBarBuilder withMinWidth( double value ) {

    buttonBar.setMinWidth( value );
    return this;
  }

  public ButtonBarBuilder withMinHeight( double value ) {

    buttonBar.setMinHeight( value );
    return this;
  }

  public ButtonBarBuilder withMinSize( double minWidth, double minHeight ) {

    buttonBar.setMinSize( minWidth, minHeight );
    return this;
  }

  public ButtonBarBuilder withPrefWidth( double value ) {

    buttonBar.setPrefWidth( value );
    return this;
  }

  public ButtonBarBuilder withPrefHeight( double value ) {

    buttonBar.setPrefHeight( value );
    return this;
  }

  public ButtonBarBuilder withPrefSize( double prefWidth, double prefHeight ) {

    buttonBar.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public ButtonBarBuilder withMaxWidth( double value ) {

    buttonBar.setMaxWidth( value );
    return this;
  }

  public ButtonBarBuilder withMaxHeight( double value ) {

    buttonBar.setMaxHeight( value );
    return this;
  }

  public ButtonBarBuilder withMaxSize( double maxWidth, double maxHeight ) {

    buttonBar.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public ButtonBarBuilder withShape( Shape value ) {

    buttonBar.setShape( value );
    return this;
  }

  public ButtonBarBuilder withScaleShape( boolean value ) {

    buttonBar.setScaleShape( value );
    return this;
  }

  public ButtonBarBuilder withCenterShape( boolean value ) {

    buttonBar.setCenterShape( value );
    return this;
  }

  public ButtonBarBuilder withCacheShape( boolean value ) {

    buttonBar.setCacheShape( value );
    return this;
  }

  public ButtonBarBuilder withUserData( Object value ) {

    buttonBar.setUserData( value );
    return this;
  }

  public ButtonBarBuilder withId( String value ) {

    buttonBar.setId( value );
    return this;
  }

  public ButtonBarBuilder withStyle( String value ) {

    buttonBar.setStyle( value );
    return this;
  }

  public ButtonBarBuilder withVisible( boolean value ) {

    buttonBar.setVisible( value );
    return this;
  }

  public ButtonBarBuilder withCursor( Cursor value ) {

    buttonBar.setCursor( value );
    return this;
  }

  public ButtonBarBuilder withOpacity( double value ) {

    buttonBar.setOpacity( value );
    return this;
  }

  public ButtonBarBuilder withBlendMode( BlendMode value ) {

    buttonBar.setBlendMode( value );
    return this;
  }

  public ButtonBarBuilder withClip( Node value ) {

    buttonBar.setClip( value );
    return this;
  }

  public ButtonBarBuilder withCache( boolean value ) {

    buttonBar.setCache( value );
    return this;
  }

  public ButtonBarBuilder withCacheHint( CacheHint value ) {

    buttonBar.setCacheHint( value );
    return this;
  }

  public ButtonBarBuilder withEffect( Effect value ) {

    buttonBar.setEffect( value );
    return this;
  }

  public ButtonBarBuilder withDepthTest( DepthTest value ) {

    buttonBar.setDepthTest( value );
    return this;
  }

  public ButtonBarBuilder withDisable( boolean value ) {

    buttonBar.setDisable( value );
    return this;
  }

  public ButtonBarBuilder withPickOnBounds( boolean value ) {

    buttonBar.setPickOnBounds( value );
    return this;
  }

  public ButtonBarBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    buttonBar.setOnDragEntered( value );
    return this;
  }

  public ButtonBarBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    buttonBar.setOnDragExited( value );
    return this;
  }

  public ButtonBarBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    buttonBar.setOnDragOver( value );
    return this;
  }

  public ButtonBarBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    buttonBar.setOnDragDropped( value );
    return this;
  }

  public ButtonBarBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    buttonBar.setOnDragDone( value );
    return this;
  }

  public ButtonBarBuilder withManaged( boolean value ) {

    buttonBar.setManaged( value );
    return this;
  }

  public ButtonBarBuilder withLayoutX( double value ) {

    buttonBar.setLayoutX( value );
    return this;
  }

  public ButtonBarBuilder withLayoutY( double value ) {

    buttonBar.setLayoutY( value );
    return this;
  }

  public ButtonBarBuilder withViewOrder( double value ) {

    buttonBar.setViewOrder( value );
    return this;
  }

  public ButtonBarBuilder withTranslateX( double value ) {

    buttonBar.setTranslateX( value );
    return this;
  }

  public ButtonBarBuilder withTranslateY( double value ) {

    buttonBar.setTranslateY( value );
    return this;
  }

  public ButtonBarBuilder withTranslateZ( double value ) {

    buttonBar.setTranslateZ( value );
    return this;
  }

  public ButtonBarBuilder withScaleX( double value ) {

    buttonBar.setScaleX( value );
    return this;
  }

  public ButtonBarBuilder withScaleY( double value ) {

    buttonBar.setScaleY( value );
    return this;
  }

  public ButtonBarBuilder withScaleZ( double value ) {

    buttonBar.setScaleZ( value );
    return this;
  }

  public ButtonBarBuilder withRotate( double value ) {

    buttonBar.setRotate( value );
    return this;
  }

  public ButtonBarBuilder withRotationAxis( Point3D value ) {

    buttonBar.setRotationAxis( value );
    return this;
  }

  public ButtonBarBuilder withNodeOrientation( NodeOrientation orientation ) {

    buttonBar.setNodeOrientation( orientation );
    return this;
  }

  public ButtonBarBuilder withMouseTransparent( boolean value ) {

    buttonBar.setMouseTransparent( value );
    return this;
  }

  public ButtonBarBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    buttonBar.setOnContextMenuRequested( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMouseClicked( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMouseDragged( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMouseEntered( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMouseExited( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMouseMoved( value );
    return this;
  }

  public ButtonBarBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMousePressed( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnMouseReleased( value );
    return this;
  }

  public ButtonBarBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    buttonBar.setOnDragDetected( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    buttonBar.setOnMouseDragOver( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    buttonBar.setOnMouseDragReleased( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    buttonBar.setOnMouseDragEntered( value );
    return this;
  }

  public ButtonBarBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    buttonBar.setOnMouseDragExited( value );
    return this;
  }

  public ButtonBarBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    buttonBar.setOnScrollStarted( value );
    return this;
  }

  public ButtonBarBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    buttonBar.setOnScroll( value );
    return this;
  }

  public ButtonBarBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    buttonBar.setOnScrollFinished( value );
    return this;
  }

  public ButtonBarBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    buttonBar.setOnRotationStarted( value );
    return this;
  }

  public ButtonBarBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    buttonBar.setOnRotate( value );
    return this;
  }

  public ButtonBarBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    buttonBar.setOnRotationFinished( value );
    return this;
  }

  public ButtonBarBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    buttonBar.setOnZoomStarted( value );
    return this;
  }

  public ButtonBarBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    buttonBar.setOnZoom( value );
    return this;
  }

  public ButtonBarBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    buttonBar.setOnZoomFinished( value );
    return this;
  }

  public ButtonBarBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    buttonBar.setOnSwipeUp( value );
    return this;
  }

  public ButtonBarBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    buttonBar.setOnSwipeDown( value );
    return this;
  }

  public ButtonBarBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    buttonBar.setOnSwipeLeft( value );
    return this;
  }

  public ButtonBarBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    buttonBar.setOnSwipeRight( value );
    return this;
  }

  public ButtonBarBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    buttonBar.setOnTouchPressed( value );
    return this;
  }

  public ButtonBarBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    buttonBar.setOnTouchMoved( value );
    return this;
  }

  public ButtonBarBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    buttonBar.setOnTouchReleased( value );
    return this;
  }

  public ButtonBarBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    buttonBar.setOnTouchStationary( value );
    return this;
  }

  public ButtonBarBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    buttonBar.setOnKeyPressed( value );
    return this;
  }

  public ButtonBarBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    buttonBar.setOnKeyReleased( value );
    return this;
  }

  public ButtonBarBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    buttonBar.setOnKeyTyped( value );
    return this;
  }

  public ButtonBarBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    buttonBar.setOnInputMethodTextChanged( value );
    return this;
  }

  public ButtonBarBuilder withInputMethodRequests( InputMethodRequests value ) {

    buttonBar.setInputMethodRequests( value );
    return this;
  }

  public ButtonBarBuilder withFocusTraversable( boolean value ) {

    buttonBar.setFocusTraversable( value );
    return this;
  }

  public ButtonBarBuilder withEventDispatcher( EventDispatcher value ) {

    buttonBar.setEventDispatcher( value );
    return this;
  }

  public ButtonBarBuilder withAccessibleRole( AccessibleRole value ) {

    buttonBar.setAccessibleRole( value );
    return this;
  }

  public ButtonBarBuilder withAccessibleRoleDescription( String value ) {

    buttonBar.setAccessibleRoleDescription( value );
    return this;
  }

  public ButtonBarBuilder withAccessibleText( String value ) {

    buttonBar.setAccessibleText( value );
    return this;
  }

  public ButtonBarBuilder withAccessibleHelp( String value ) {

    buttonBar.setAccessibleHelp( value );
    return this;
  }

}
