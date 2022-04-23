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
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX AnchorPane.
 */
@AvailableSince( "0.1.0" )
public class AnchorPaneBuilder {

  private final AnchorPane anchorPane = new AnchorPane( );

  @Contract( " -> new" )
  public static @NotNull AnchorPaneBuilder builder( ) {

    return new AnchorPaneBuilder( );
  }

  public AnchorPane build( ) {

    return anchorPane;
  }

  public AnchorPaneBuilder add( Node... nodes ) {

    this.anchorPane.getChildren( ).addAll( nodes );
    return this;
  }

  public AnchorPaneBuilder withTopAnchor( Node child, Double value ) {

    AnchorPane.setTopAnchor( child, value );
    return this;
  }

  public AnchorPaneBuilder withLeftAnchor( Node child, Double value ) {

    AnchorPane.setLeftAnchor( child, value );
    return this;
  }

  public AnchorPaneBuilder withBottomAnchor( Node child, Double value ) {

    AnchorPane.setBottomAnchor( child, value );
    return this;
  }

  public AnchorPaneBuilder withRightAnchor( Node child, Double value ) {

    AnchorPane.setRightAnchor( child, value );
    return this;
  }

  public AnchorPaneBuilder withSnapToPixel( boolean value ) {

    anchorPane.setSnapToPixel( value );
    return this;
  }

  public AnchorPaneBuilder withPadding( Insets value ) {

    anchorPane.setPadding( value );
    return this;
  }

  public AnchorPaneBuilder withBackground( Background value ) {

    anchorPane.setBackground( value );
    return this;
  }

  public AnchorPaneBuilder withBorder( Border value ) {

    anchorPane.setBorder( value );
    return this;
  }

  public AnchorPaneBuilder withOpaqueInsets( Insets value ) {

    anchorPane.setOpaqueInsets( value );
    return this;
  }

  public AnchorPaneBuilder withMinWidth( double value ) {

    anchorPane.setMinWidth( value );
    return this;
  }

  public AnchorPaneBuilder withMinHeight( double value ) {

    anchorPane.setMinHeight( value );
    return this;
  }

  public AnchorPaneBuilder withMinSize( double minWidth, double minHeight ) {

    anchorPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public AnchorPaneBuilder withPrefWidth( double value ) {

    anchorPane.setPrefWidth( value );
    return this;
  }

  public AnchorPaneBuilder withPrefHeight( double value ) {

    anchorPane.setPrefHeight( value );
    return this;
  }

  public AnchorPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    anchorPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public AnchorPaneBuilder withMaxWidth( double value ) {

    anchorPane.setMaxWidth( value );
    return this;
  }

  public AnchorPaneBuilder withMaxHeight( double value ) {

    anchorPane.setMaxHeight( value );
    return this;
  }

  public AnchorPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    anchorPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public AnchorPaneBuilder withShape( Shape value ) {

    anchorPane.setShape( value );
    return this;
  }

  public AnchorPaneBuilder withScaleShape( boolean value ) {

    anchorPane.setScaleShape( value );
    return this;
  }

  public AnchorPaneBuilder withCenterShape( boolean value ) {

    anchorPane.setCenterShape( value );
    return this;
  }

  public AnchorPaneBuilder withCacheShape( boolean value ) {

    anchorPane.setCacheShape( value );
    return this;
  }

  public AnchorPaneBuilder withUserData( Object value ) {

    anchorPane.setUserData( value );
    return this;
  }

  public AnchorPaneBuilder withId( String value ) {

    anchorPane.setId( value );
    return this;
  }

  public AnchorPaneBuilder withStyle( String value ) {

    anchorPane.setStyle( value );
    return this;
  }

  public AnchorPaneBuilder withVisible( boolean value ) {

    anchorPane.setVisible( value );
    return this;
  }

  public AnchorPaneBuilder withCursor( Cursor value ) {

    anchorPane.setCursor( value );
    return this;
  }

  public AnchorPaneBuilder withOpacity( double value ) {

    anchorPane.setOpacity( value );
    return this;
  }

  public AnchorPaneBuilder withBlendMode( BlendMode value ) {

    anchorPane.setBlendMode( value );
    return this;
  }

  public AnchorPaneBuilder withClip( Node value ) {

    anchorPane.setClip( value );
    return this;
  }

  public AnchorPaneBuilder withCache( boolean value ) {

    anchorPane.setCache( value );
    return this;
  }

  public AnchorPaneBuilder withCacheHint( CacheHint value ) {

    anchorPane.setCacheHint( value );
    return this;
  }

  public AnchorPaneBuilder withEffect( Effect value ) {

    anchorPane.setEffect( value );
    return this;
  }

  public AnchorPaneBuilder withDepthTest( DepthTest value ) {

    anchorPane.setDepthTest( value );
    return this;
  }

  public AnchorPaneBuilder withDisable( boolean value ) {

    anchorPane.setDisable( value );
    return this;
  }

  public AnchorPaneBuilder withPickOnBounds( boolean value ) {

    anchorPane.setPickOnBounds( value );
    return this;
  }

  public AnchorPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    anchorPane.setOnDragEntered( value );
    return this;
  }

  public AnchorPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    anchorPane.setOnDragExited( value );
    return this;
  }

  public AnchorPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    anchorPane.setOnDragOver( value );
    return this;
  }

  public AnchorPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    anchorPane.setOnDragDropped( value );
    return this;
  }

  public AnchorPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    anchorPane.setOnDragDone( value );
    return this;
  }

  public AnchorPaneBuilder withManaged( boolean value ) {

    anchorPane.setManaged( value );
    return this;
  }

  public AnchorPaneBuilder withLayoutX( double value ) {

    anchorPane.setLayoutX( value );
    return this;
  }

  public AnchorPaneBuilder withLayoutY( double value ) {

    anchorPane.setLayoutY( value );
    return this;
  }

  public AnchorPaneBuilder withViewOrder( double value ) {

    anchorPane.setViewOrder( value );
    return this;
  }

  public AnchorPaneBuilder withTranslateX( double value ) {

    anchorPane.setTranslateX( value );
    return this;
  }

  public AnchorPaneBuilder withTranslateY( double value ) {

    anchorPane.setTranslateY( value );
    return this;
  }

  public AnchorPaneBuilder withTranslateZ( double value ) {

    anchorPane.setTranslateZ( value );
    return this;
  }

  public AnchorPaneBuilder withScaleX( double value ) {

    anchorPane.setScaleX( value );
    return this;
  }

  public AnchorPaneBuilder withScaleY( double value ) {

    anchorPane.setScaleY( value );
    return this;
  }

  public AnchorPaneBuilder withScaleZ( double value ) {

    anchorPane.setScaleZ( value );
    return this;
  }

  public AnchorPaneBuilder withRotate( double value ) {

    anchorPane.setRotate( value );
    return this;
  }

  public AnchorPaneBuilder withRotationAxis( Point3D value ) {

    anchorPane.setRotationAxis( value );
    return this;
  }

  public AnchorPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    anchorPane.setNodeOrientation( orientation );
    return this;
  }

  public AnchorPaneBuilder withMouseTransparent( boolean value ) {

    anchorPane.setMouseTransparent( value );
    return this;
  }

  public AnchorPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    anchorPane.setOnContextMenuRequested( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMouseClicked( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMouseDragged( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMouseEntered( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMouseExited( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMouseMoved( value );
    return this;
  }

  public AnchorPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMousePressed( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnMouseReleased( value );
    return this;
  }

  public AnchorPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    anchorPane.setOnDragDetected( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    anchorPane.setOnMouseDragOver( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    anchorPane.setOnMouseDragReleased( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    anchorPane.setOnMouseDragEntered( value );
    return this;
  }

  public AnchorPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    anchorPane.setOnMouseDragExited( value );
    return this;
  }

  public AnchorPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    anchorPane.setOnScrollStarted( value );
    return this;
  }

  public AnchorPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    anchorPane.setOnScroll( value );
    return this;
  }

  public AnchorPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    anchorPane.setOnScrollFinished( value );
    return this;
  }

  public AnchorPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    anchorPane.setOnRotationStarted( value );
    return this;
  }

  public AnchorPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    anchorPane.setOnRotate( value );
    return this;
  }

  public AnchorPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    anchorPane.setOnRotationFinished( value );
    return this;
  }

  public AnchorPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    anchorPane.setOnZoomStarted( value );
    return this;
  }

  public AnchorPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    anchorPane.setOnZoom( value );
    return this;
  }

  public AnchorPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    anchorPane.setOnZoomFinished( value );
    return this;
  }

  public AnchorPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    anchorPane.setOnSwipeUp( value );
    return this;
  }

  public AnchorPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    anchorPane.setOnSwipeDown( value );
    return this;
  }

  public AnchorPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    anchorPane.setOnSwipeLeft( value );
    return this;
  }

  public AnchorPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    anchorPane.setOnSwipeRight( value );
    return this;
  }

  public AnchorPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    anchorPane.setOnTouchPressed( value );
    return this;
  }

  public AnchorPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    anchorPane.setOnTouchMoved( value );
    return this;
  }

  public AnchorPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    anchorPane.setOnTouchReleased( value );
    return this;
  }

  public AnchorPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    anchorPane.setOnTouchStationary( value );
    return this;
  }

  public AnchorPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    anchorPane.setOnKeyPressed( value );
    return this;
  }

  public AnchorPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    anchorPane.setOnKeyReleased( value );
    return this;
  }

  public AnchorPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    anchorPane.setOnKeyTyped( value );
    return this;
  }

  public AnchorPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    anchorPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public AnchorPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    anchorPane.setInputMethodRequests( value );
    return this;
  }

  public AnchorPaneBuilder withFocusTraversable( boolean value ) {

    anchorPane.setFocusTraversable( value );
    return this;
  }

  public AnchorPaneBuilder withEventDispatcher( EventDispatcher value ) {

    anchorPane.setEventDispatcher( value );
    return this;
  }

  public AnchorPaneBuilder withAccessibleRole( AccessibleRole value ) {

    anchorPane.setAccessibleRole( value );
    return this;
  }

  public AnchorPaneBuilder withAccessibleRoleDescription( String value ) {

    anchorPane.setAccessibleRoleDescription( value );
    return this;
  }

  public AnchorPaneBuilder withAccessibleText( String value ) {

    anchorPane.setAccessibleText( value );
    return this;
  }

  public AnchorPaneBuilder withAccessibleHelp( String value ) {

    anchorPane.setAccessibleHelp( value );
    return this;
  }

}
