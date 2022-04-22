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
import javafx.scene.control.DialogPane;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class DialogPaneBuilder {

  private final DialogPane dialogPane = new DialogPane( );

  @Contract( " -> new" )
  public static @NotNull DialogPaneBuilder builder( ) {

    return new DialogPaneBuilder( );
  }

  public DialogPane build( ) {

    return dialogPane;
  }

  public DialogPaneBuilder withGraphic( Node graphic ) {

    dialogPane.setGraphic( graphic );
    return this;
  }

  public DialogPaneBuilder withHeader( Node header ) {

    dialogPane.setHeader( header );
    return this;
  }

  public DialogPaneBuilder withHeaderText( String headerText ) {

    dialogPane.setHeaderText( headerText );
    return this;
  }

  public DialogPaneBuilder withContent( Node content ) {

    dialogPane.setContent( content );
    return this;
  }

  public DialogPaneBuilder withContentText( String contentText ) {

    dialogPane.setContentText( contentText );
    return this;
  }

  public DialogPaneBuilder withExpandableContent( Node content ) {

    dialogPane.setExpandableContent( content );
    return this;
  }

  public DialogPaneBuilder withExpanded( boolean value ) {

    dialogPane.setExpanded( value );
    return this;
  }

  public DialogPaneBuilder withSnapToPixel( boolean value ) {

    dialogPane.setSnapToPixel( value );
    return this;
  }

  public DialogPaneBuilder withPadding( Insets value ) {

    dialogPane.setPadding( value );
    return this;
  }

  public DialogPaneBuilder withBackground( Background value ) {

    dialogPane.setBackground( value );
    return this;
  }

  public DialogPaneBuilder withBorder( Border value ) {

    dialogPane.setBorder( value );
    return this;
  }

  public DialogPaneBuilder withOpaqueInsets( Insets value ) {

    dialogPane.setOpaqueInsets( value );
    return this;
  }

  public DialogPaneBuilder withMinWidth( double value ) {

    dialogPane.setMinWidth( value );
    return this;
  }

  public DialogPaneBuilder withMinHeight( double value ) {

    dialogPane.setMinHeight( value );
    return this;
  }

  public DialogPaneBuilder withMinSize( double minWidth, double minHeight ) {

    dialogPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public DialogPaneBuilder withPrefWidth( double value ) {

    dialogPane.setPrefWidth( value );
    return this;
  }

  public DialogPaneBuilder withPrefHeight( double value ) {

    dialogPane.setPrefHeight( value );
    return this;
  }

  public DialogPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    dialogPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public DialogPaneBuilder withMaxWidth( double value ) {

    dialogPane.setMaxWidth( value );
    return this;
  }

  public DialogPaneBuilder withMaxHeight( double value ) {

    dialogPane.setMaxHeight( value );
    return this;
  }

  public DialogPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    dialogPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public DialogPaneBuilder withShape( Shape value ) {

    dialogPane.setShape( value );
    return this;
  }

  public DialogPaneBuilder withScaleShape( boolean value ) {

    dialogPane.setScaleShape( value );
    return this;
  }

  public DialogPaneBuilder withCenterShape( boolean value ) {

    dialogPane.setCenterShape( value );
    return this;
  }

  public DialogPaneBuilder withCacheShape( boolean value ) {

    dialogPane.setCacheShape( value );
    return this;
  }

  public DialogPaneBuilder withUserData( Object value ) {

    dialogPane.setUserData( value );
    return this;
  }

  public DialogPaneBuilder withId( String value ) {

    dialogPane.setId( value );
    return this;
  }

  public DialogPaneBuilder withStyle( String value ) {

    dialogPane.setStyle( value );
    return this;
  }

  public DialogPaneBuilder withVisible( boolean value ) {

    dialogPane.setVisible( value );
    return this;
  }

  public DialogPaneBuilder withCursor( Cursor value ) {

    dialogPane.setCursor( value );
    return this;
  }

  public DialogPaneBuilder withOpacity( double value ) {

    dialogPane.setOpacity( value );
    return this;
  }

  public DialogPaneBuilder withBlendMode( BlendMode value ) {

    dialogPane.setBlendMode( value );
    return this;
  }

  public DialogPaneBuilder withClip( Node value ) {

    dialogPane.setClip( value );
    return this;
  }

  public DialogPaneBuilder withCache( boolean value ) {

    dialogPane.setCache( value );
    return this;
  }

  public DialogPaneBuilder withCacheHint( CacheHint value ) {

    dialogPane.setCacheHint( value );
    return this;
  }

  public DialogPaneBuilder withEffect( Effect value ) {

    dialogPane.setEffect( value );
    return this;
  }

  public DialogPaneBuilder withDepthTest( DepthTest value ) {

    dialogPane.setDepthTest( value );
    return this;
  }

  public DialogPaneBuilder withDisable( boolean value ) {

    dialogPane.setDisable( value );
    return this;
  }

  public DialogPaneBuilder withPickOnBounds( boolean value ) {

    dialogPane.setPickOnBounds( value );
    return this;
  }

  public DialogPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    dialogPane.setOnDragEntered( value );
    return this;
  }

  public DialogPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    dialogPane.setOnDragExited( value );
    return this;
  }

  public DialogPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    dialogPane.setOnDragOver( value );
    return this;
  }

  public DialogPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    dialogPane.setOnDragDropped( value );
    return this;
  }

  public DialogPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    dialogPane.setOnDragDone( value );
    return this;
  }

  public DialogPaneBuilder withManaged( boolean value ) {

    dialogPane.setManaged( value );
    return this;
  }

  public DialogPaneBuilder withLayoutX( double value ) {

    dialogPane.setLayoutX( value );
    return this;
  }

  public DialogPaneBuilder withLayoutY( double value ) {

    dialogPane.setLayoutY( value );
    return this;
  }

  public DialogPaneBuilder withViewOrder( double value ) {

    dialogPane.setViewOrder( value );
    return this;
  }

  public DialogPaneBuilder withTranslateX( double value ) {

    dialogPane.setTranslateX( value );
    return this;
  }

  public DialogPaneBuilder withTranslateY( double value ) {

    dialogPane.setTranslateY( value );
    return this;
  }

  public DialogPaneBuilder withTranslateZ( double value ) {

    dialogPane.setTranslateZ( value );
    return this;
  }

  public DialogPaneBuilder withScaleX( double value ) {

    dialogPane.setScaleX( value );
    return this;
  }

  public DialogPaneBuilder withScaleY( double value ) {

    dialogPane.setScaleY( value );
    return this;
  }

  public DialogPaneBuilder withScaleZ( double value ) {

    dialogPane.setScaleZ( value );
    return this;
  }

  public DialogPaneBuilder withRotate( double value ) {

    dialogPane.setRotate( value );
    return this;
  }

  public DialogPaneBuilder withRotationAxis( Point3D value ) {

    dialogPane.setRotationAxis( value );
    return this;
  }

  public DialogPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    dialogPane.setNodeOrientation( orientation );
    return this;
  }

  public DialogPaneBuilder withMouseTransparent( boolean value ) {

    dialogPane.setMouseTransparent( value );
    return this;
  }

  public DialogPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    dialogPane.setOnContextMenuRequested( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMouseClicked( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMouseDragged( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMouseEntered( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMouseExited( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMouseMoved( value );
    return this;
  }

  public DialogPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMousePressed( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnMouseReleased( value );
    return this;
  }

  public DialogPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    dialogPane.setOnDragDetected( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    dialogPane.setOnMouseDragOver( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    dialogPane.setOnMouseDragReleased( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    dialogPane.setOnMouseDragEntered( value );
    return this;
  }

  public DialogPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    dialogPane.setOnMouseDragExited( value );
    return this;
  }

  public DialogPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    dialogPane.setOnScrollStarted( value );
    return this;
  }

  public DialogPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    dialogPane.setOnScroll( value );
    return this;
  }

  public DialogPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    dialogPane.setOnScrollFinished( value );
    return this;
  }

  public DialogPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    dialogPane.setOnRotationStarted( value );
    return this;
  }

  public DialogPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    dialogPane.setOnRotate( value );
    return this;
  }

  public DialogPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    dialogPane.setOnRotationFinished( value );
    return this;
  }

  public DialogPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    dialogPane.setOnZoomStarted( value );
    return this;
  }

  public DialogPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    dialogPane.setOnZoom( value );
    return this;
  }

  public DialogPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    dialogPane.setOnZoomFinished( value );
    return this;
  }

  public DialogPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    dialogPane.setOnSwipeUp( value );
    return this;
  }

  public DialogPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    dialogPane.setOnSwipeDown( value );
    return this;
  }

  public DialogPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    dialogPane.setOnSwipeLeft( value );
    return this;
  }

  public DialogPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    dialogPane.setOnSwipeRight( value );
    return this;
  }

  public DialogPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    dialogPane.setOnTouchPressed( value );
    return this;
  }

  public DialogPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    dialogPane.setOnTouchMoved( value );
    return this;
  }

  public DialogPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    dialogPane.setOnTouchReleased( value );
    return this;
  }

  public DialogPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    dialogPane.setOnTouchStationary( value );
    return this;
  }

  public DialogPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    dialogPane.setOnKeyPressed( value );
    return this;
  }

  public DialogPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    dialogPane.setOnKeyReleased( value );
    return this;
  }

  public DialogPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    dialogPane.setOnKeyTyped( value );
    return this;
  }

  public DialogPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    dialogPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public DialogPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    dialogPane.setInputMethodRequests( value );
    return this;
  }

  public DialogPaneBuilder withFocusTraversable( boolean value ) {

    dialogPane.setFocusTraversable( value );
    return this;
  }

  public DialogPaneBuilder withEventDispatcher( EventDispatcher value ) {

    dialogPane.setEventDispatcher( value );
    return this;
  }

  public DialogPaneBuilder withAccessibleRole( AccessibleRole value ) {

    dialogPane.setAccessibleRole( value );
    return this;
  }

  public DialogPaneBuilder withAccessibleRoleDescription( String value ) {

    dialogPane.setAccessibleRoleDescription( value );
    return this;
  }

  public DialogPaneBuilder withAccessibleText( String value ) {

    dialogPane.setAccessibleText( value );
    return this;
  }

  public DialogPaneBuilder withAccessibleHelp( String value ) {

    dialogPane.setAccessibleHelp( value );
    return this;
  }

}
