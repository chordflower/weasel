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
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.text.TextFlow;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX TextFlow.
 */
@AvailableSince( "0.1.0" )
public class TextFlowBuilder {

  private final TextFlow textFlow = new TextFlow( );

  @Contract( " -> new" )
  public static @NotNull TextFlowBuilder builder( ) {

    return new TextFlowBuilder( );
  }

  public TextFlow build( ) {

    return textFlow;
  }

  public TextFlowBuilder add( Node... nodes ) {

    textFlow.getChildren( ).addAll( nodes );
    return this;
  }

  public TextFlowBuilder withUserData( Object value ) {

    textFlow.setUserData( value );
    return this;
  }

  public TextFlowBuilder withId( String value ) {

    textFlow.setId( value );
    return this;
  }

  public TextFlowBuilder withStyle( String value ) {

    textFlow.setStyle( value );
    return this;
  }

  public TextFlowBuilder withVisible( boolean value ) {

    textFlow.setVisible( value );
    return this;
  }

  public TextFlowBuilder withCursor( Cursor value ) {

    textFlow.setCursor( value );
    return this;
  }

  public TextFlowBuilder withOpacity( double value ) {

    textFlow.setOpacity( value );
    return this;
  }

  public TextFlowBuilder withBlendMode( BlendMode value ) {

    textFlow.setBlendMode( value );
    return this;
  }

  public TextFlowBuilder withClip( Node value ) {

    textFlow.setClip( value );
    return this;
  }

  public TextFlowBuilder withCache( boolean value ) {

    textFlow.setCache( value );
    return this;
  }

  public TextFlowBuilder withCacheHint( CacheHint value ) {

    textFlow.setCacheHint( value );
    return this;
  }

  public TextFlowBuilder withEffect( Effect value ) {

    textFlow.setEffect( value );
    return this;
  }

  public TextFlowBuilder withDepthTest( DepthTest value ) {

    textFlow.setDepthTest( value );
    return this;
  }

  public TextFlowBuilder withDisable( boolean value ) {

    textFlow.setDisable( value );
    return this;
  }

  public TextFlowBuilder withPickOnBounds( boolean value ) {

    textFlow.setPickOnBounds( value );
    return this;
  }

  public TextFlowBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    textFlow.setOnDragEntered( value );
    return this;
  }

  public TextFlowBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    textFlow.setOnDragExited( value );
    return this;
  }

  public TextFlowBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    textFlow.setOnDragOver( value );
    return this;
  }

  public TextFlowBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    textFlow.setOnDragDropped( value );
    return this;
  }

  public TextFlowBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    textFlow.setOnDragDone( value );
    return this;
  }

  public TextFlowBuilder withManaged( boolean value ) {

    textFlow.setManaged( value );
    return this;
  }

  public TextFlowBuilder withLayoutX( double value ) {

    textFlow.setLayoutX( value );
    return this;
  }

  public TextFlowBuilder withLayoutY( double value ) {

    textFlow.setLayoutY( value );
    return this;
  }

  public TextFlowBuilder withViewOrder( double value ) {

    textFlow.setViewOrder( value );
    return this;
  }

  public TextFlowBuilder withTranslateX( double value ) {

    textFlow.setTranslateX( value );
    return this;
  }

  public TextFlowBuilder withTranslateY( double value ) {

    textFlow.setTranslateY( value );
    return this;
  }

  public TextFlowBuilder withTranslateZ( double value ) {

    textFlow.setTranslateZ( value );
    return this;
  }

  public TextFlowBuilder withScaleX( double value ) {

    textFlow.setScaleX( value );
    return this;
  }

  public TextFlowBuilder withScaleY( double value ) {

    textFlow.setScaleY( value );
    return this;
  }

  public TextFlowBuilder withScaleZ( double value ) {

    textFlow.setScaleZ( value );
    return this;
  }

  public TextFlowBuilder withRotate( double value ) {

    textFlow.setRotate( value );
    return this;
  }

  public TextFlowBuilder withRotationAxis( Point3D value ) {

    textFlow.setRotationAxis( value );
    return this;
  }

  public TextFlowBuilder withNodeOrientation( NodeOrientation orientation ) {

    textFlow.setNodeOrientation( orientation );
    return this;
  }

  public TextFlowBuilder withMouseTransparent( boolean value ) {

    textFlow.setMouseTransparent( value );
    return this;
  }

  public TextFlowBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    textFlow.setOnContextMenuRequested( value );
    return this;
  }

  public TextFlowBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMouseClicked( value );
    return this;
  }

  public TextFlowBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMouseDragged( value );
    return this;
  }

  public TextFlowBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMouseEntered( value );
    return this;
  }

  public TextFlowBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMouseExited( value );
    return this;
  }

  public TextFlowBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMouseMoved( value );
    return this;
  }

  public TextFlowBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMousePressed( value );
    return this;
  }

  public TextFlowBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnMouseReleased( value );
    return this;
  }

  public TextFlowBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    textFlow.setOnDragDetected( value );
    return this;
  }

  public TextFlowBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    textFlow.setOnMouseDragOver( value );
    return this;
  }

  public TextFlowBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    textFlow.setOnMouseDragReleased( value );
    return this;
  }

  public TextFlowBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    textFlow.setOnMouseDragEntered( value );
    return this;
  }

  public TextFlowBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    textFlow.setOnMouseDragExited( value );
    return this;
  }

  public TextFlowBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    textFlow.setOnScrollStarted( value );
    return this;
  }

  public TextFlowBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    textFlow.setOnScroll( value );
    return this;
  }

  public TextFlowBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    textFlow.setOnScrollFinished( value );
    return this;
  }

  public TextFlowBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    textFlow.setOnRotationStarted( value );
    return this;
  }

  public TextFlowBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    textFlow.setOnRotate( value );
    return this;
  }

  public TextFlowBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    textFlow.setOnRotationFinished( value );
    return this;
  }

  public TextFlowBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    textFlow.setOnZoomStarted( value );
    return this;
  }

  public TextFlowBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    textFlow.setOnZoom( value );
    return this;
  }

  public TextFlowBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    textFlow.setOnZoomFinished( value );
    return this;
  }

  public TextFlowBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    textFlow.setOnSwipeUp( value );
    return this;
  }

  public TextFlowBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    textFlow.setOnSwipeDown( value );
    return this;
  }

  public TextFlowBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    textFlow.setOnSwipeLeft( value );
    return this;
  }

  public TextFlowBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    textFlow.setOnSwipeRight( value );
    return this;
  }

  public TextFlowBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    textFlow.setOnTouchPressed( value );
    return this;
  }

  public TextFlowBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    textFlow.setOnTouchMoved( value );
    return this;
  }

  public TextFlowBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    textFlow.setOnTouchReleased( value );
    return this;
  }

  public TextFlowBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    textFlow.setOnTouchStationary( value );
    return this;
  }

  public TextFlowBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    textFlow.setOnKeyPressed( value );
    return this;
  }

  public TextFlowBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    textFlow.setOnKeyReleased( value );
    return this;
  }

  public TextFlowBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    textFlow.setOnKeyTyped( value );
    return this;
  }

  public TextFlowBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    textFlow.setOnInputMethodTextChanged( value );
    return this;
  }

  public TextFlowBuilder withInputMethodRequests( InputMethodRequests value ) {

    textFlow.setInputMethodRequests( value );
    return this;
  }

  public TextFlowBuilder withFocusTraversable( boolean value ) {

    textFlow.setFocusTraversable( value );
    return this;
  }

  public TextFlowBuilder withEventDispatcher( EventDispatcher value ) {

    textFlow.setEventDispatcher( value );
    return this;
  }

  public TextFlowBuilder withAccessibleRole( AccessibleRole value ) {

    textFlow.setAccessibleRole( value );
    return this;
  }

  public TextFlowBuilder withAccessibleRoleDescription( String value ) {

    textFlow.setAccessibleRoleDescription( value );
    return this;
  }

  public TextFlowBuilder withAccessibleText( String value ) {

    textFlow.setAccessibleText( value );
    return this;
  }

  public TextFlowBuilder withAccessibleHelp( String value ) {

    textFlow.setAccessibleHelp( value );
    return this;
  }

}
