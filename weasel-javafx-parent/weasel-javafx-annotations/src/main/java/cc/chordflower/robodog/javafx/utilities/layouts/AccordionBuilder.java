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
import javafx.scene.control.Accordion;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TitledPane;
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
 * This is a fluent builder for creating a JavaFX Accordion.
 */
@AvailableSince( "0.1.0" )
public class AccordionBuilder {

  private final Accordion accordion;

  private AccordionBuilder( ) {

    this.accordion = new Accordion( );
  }

  @Contract( " -> new" )
  public static @NotNull AccordionBuilder builder( ) {

    return new AccordionBuilder( );
  }

  public AccordionBuilder add( TitledPane... panes ) {

    this.accordion.getPanes( ).addAll( panes );
    return this;
  }

  public AccordionBuilder withExpandedPane( TitledPane value ) {

    accordion.setExpandedPane( value );
    return this;
  }

  public AccordionBuilder withTooltip( Tooltip value ) {

    accordion.setTooltip( value );
    return this;
  }

  public AccordionBuilder withContextMenu( ContextMenu value ) {

    accordion.setContextMenu( value );
    return this;
  }

  public AccordionBuilder withSnapToPixel( boolean value ) {

    accordion.setSnapToPixel( value );
    return this;
  }

  public AccordionBuilder withPadding( Insets value ) {

    accordion.setPadding( value );
    return this;
  }

  public AccordionBuilder withBackground( Background value ) {

    accordion.setBackground( value );
    return this;
  }

  public AccordionBuilder withBorder( Border value ) {

    accordion.setBorder( value );
    return this;
  }

  public AccordionBuilder withOpaqueInsets( Insets value ) {

    accordion.setOpaqueInsets( value );
    return this;
  }

  public AccordionBuilder withMinWidth( double value ) {

    accordion.setMinWidth( value );
    return this;
  }

  public AccordionBuilder withMinHeight( double value ) {

    accordion.setMinHeight( value );
    return this;
  }

  /**
   * Convenience method for overriding the region's computed minimum width and height.
   * This should only be called if the region's internally computed minimum size
   * doesn't meet the application's layout needs.
   *
   * @param minWidth  the override value for minimum width
   * @param minHeight the override value for minimum height
   */
  public AccordionBuilder withMinSize( double minWidth, double minHeight ) {

    accordion.setMinSize( minWidth, minHeight );
    return this;
  }

  public AccordionBuilder withPrefWidth( double value ) {

    accordion.setPrefWidth( value );
    return this;
  }

  public AccordionBuilder withPrefHeight( double value ) {

    accordion.setPrefHeight( value );
    return this;
  }

  /**
   * Convenience method for overriding the region's computed preferred width and height.
   * This should only be called if the region's internally computed preferred size
   * doesn't meet the application's layout needs.
   *
   * @param prefWidth the override value for preferred width
   * @param prefHeight the override value for preferred height
   */
  public AccordionBuilder withPrefSize( double prefWidth, double prefHeight ) {

    accordion.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public AccordionBuilder withMaxWidth( double value ) {

    accordion.setMaxWidth( value );
    return this;
  }

  public AccordionBuilder withMaxHeight( double value ) {

    accordion.setMaxHeight( value );
    return this;
  }

  /**
   * Convenience method for overriding the region's computed maximum width and height.
   * This should only be called if the region's internally computed maximum size
   * doesn't meet the application's layout needs.
   *
   * @param maxWidth  the override value for maximum width
   * @param maxHeight the override value for maximum height
   */
  public AccordionBuilder withMaxSize( double maxWidth, double maxHeight ) {

    accordion.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public AccordionBuilder withShape( Shape value ) {

    accordion.setShape( value );
    return this;
  }

  public AccordionBuilder withScaleShape( boolean value ) {

    accordion.setScaleShape( value );
    return this;
  }

  public AccordionBuilder withCenterShape( boolean value ) {

    accordion.setCenterShape( value );
    return this;
  }

  public AccordionBuilder withCacheShape( boolean value ) {

    accordion.setCacheShape( value );
    return this;
  }

  /**
   * Convenience method for setting a single Object property that can be
   * retrieved at a later date. This is functionally equivalent to calling
   * the getProperties().put(Object key, Object value) method. This can later
   * be retrieved by calling {@link Node#getUserData()}.
   *
   * @param value The value to be stored - this can later be retrieved by calling
   *          {@link Node#getUserData()}.
   */
  public AccordionBuilder withUserData( Object value ) {

    accordion.setUserData( value );
    return this;
  }

  public AccordionBuilder withId( String value ) {

    accordion.setId( value );
    return this;
  }

  /**
   * A string representation of the CSS style associated with this
   * specific {@code Node}. This is analogous to the "style" attribute of an
   * HTML element. Note that, like the HTML style attribute, this
   * variable contains style properties and values and not the
   * selector portion of a style rule.
   * @param value The inline CSS style to use for this {@code Node}.
   *         {@code null} is implicitly converted to an empty String.
   */
  public AccordionBuilder withStyle( String value ) {

    accordion.setStyle( value );
    return this;
  }

  public AccordionBuilder withVisible( boolean value ) {

    accordion.setVisible( value );
    return this;
  }

  public AccordionBuilder withCursor( Cursor value ) {

    accordion.setCursor( value );
    return this;
  }

  public AccordionBuilder withOpacity( double value ) {

    accordion.setOpacity( value );
    return this;
  }

  public AccordionBuilder withBlendMode( BlendMode value ) {

    accordion.setBlendMode( value );
    return this;
  }

  public AccordionBuilder withClip( Node value ) {

    accordion.setClip( value );
    return this;
  }

  public AccordionBuilder withCache( boolean value ) {

    accordion.setCache( value );
    return this;
  }

  public AccordionBuilder withCacheHint( CacheHint value ) {

    accordion.setCacheHint( value );
    return this;
  }

  public AccordionBuilder withEffect( Effect value ) {

    accordion.setEffect( value );
    return this;
  }

  public AccordionBuilder withDepthTest( DepthTest value ) {

    accordion.setDepthTest( value );
    return this;
  }

  public AccordionBuilder withDisable( boolean value ) {

    accordion.setDisable( value );
    return this;
  }

  public AccordionBuilder withPickOnBounds( boolean value ) {

    accordion.setPickOnBounds( value );
    return this;
  }

  public AccordionBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    accordion.setOnDragEntered( value );
    return this;
  }

  public AccordionBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    accordion.setOnDragExited( value );
    return this;
  }

  public AccordionBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    accordion.setOnDragOver( value );
    return this;
  }

  public AccordionBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    accordion.setOnDragDropped( value );
    return this;
  }

  public AccordionBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    accordion.setOnDragDone( value );
    return this;
  }

  public AccordionBuilder withManaged( boolean value ) {

    accordion.setManaged( value );
    return this;
  }

  public AccordionBuilder withLayoutX( double value ) {

    accordion.setLayoutX( value );
    return this;
  }

  public AccordionBuilder withLayoutY( double value ) {

    accordion.setLayoutY( value );
    return this;
  }

  public AccordionBuilder withViewOrder( double value ) {

    accordion.setViewOrder( value );
    return this;
  }

  public AccordionBuilder withTranslateX( double value ) {

    accordion.setTranslateX( value );
    return this;
  }

  public AccordionBuilder withTranslateY( double value ) {

    accordion.setTranslateY( value );
    return this;
  }

  public AccordionBuilder withTranslateZ( double value ) {

    accordion.setTranslateZ( value );
    return this;
  }

  public AccordionBuilder withScaleX( double value ) {

    accordion.setScaleX( value );
    return this;
  }

  public AccordionBuilder withScaleY( double value ) {

    accordion.setScaleY( value );
    return this;
  }

  public AccordionBuilder withScaleZ( double value ) {

    accordion.setScaleZ( value );
    return this;
  }

  public AccordionBuilder withRotate( double value ) {

    accordion.setRotate( value );
    return this;
  }

  public AccordionBuilder withRotationAxis( Point3D value ) {

    accordion.setRotationAxis( value );
    return this;
  }

  public AccordionBuilder withNodeOrientation( NodeOrientation orientation ) {

    accordion.setNodeOrientation( orientation );
    return this;
  }

  public AccordionBuilder withMouseTransparent( boolean value ) {

    accordion.setMouseTransparent( value );
    return this;
  }

  public AccordionBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    accordion.setOnContextMenuRequested( value );
    return this;
  }

  public AccordionBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMouseClicked( value );
    return this;
  }

  public AccordionBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMouseDragged( value );
    return this;
  }

  public AccordionBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMouseEntered( value );
    return this;
  }

  public AccordionBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMouseExited( value );
    return this;
  }

  public AccordionBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMouseMoved( value );
    return this;
  }

  public AccordionBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMousePressed( value );
    return this;
  }

  public AccordionBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnMouseReleased( value );
    return this;
  }

  public AccordionBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    accordion.setOnDragDetected( value );
    return this;
  }

  public AccordionBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    accordion.setOnMouseDragOver( value );
    return this;
  }

  public AccordionBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    accordion.setOnMouseDragReleased( value );
    return this;
  }

  public AccordionBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    accordion.setOnMouseDragEntered( value );
    return this;
  }

  public AccordionBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    accordion.setOnMouseDragExited( value );
    return this;
  }

  public AccordionBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    accordion.setOnScrollStarted( value );
    return this;
  }

  public AccordionBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    accordion.setOnScroll( value );
    return this;
  }

  public AccordionBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    accordion.setOnScrollFinished( value );
    return this;
  }

  public AccordionBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    accordion.setOnRotationStarted( value );
    return this;
  }

  public AccordionBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    accordion.setOnRotate( value );
    return this;
  }

  public AccordionBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    accordion.setOnRotationFinished( value );
    return this;
  }

  public AccordionBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    accordion.setOnZoomStarted( value );
    return this;
  }

  public AccordionBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    accordion.setOnZoom( value );
    return this;
  }

  public AccordionBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    accordion.setOnZoomFinished( value );
    return this;
  }

  public AccordionBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    accordion.setOnSwipeUp( value );
    return this;
  }

  public AccordionBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    accordion.setOnSwipeDown( value );
    return this;
  }

  public AccordionBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    accordion.setOnSwipeLeft( value );
    return this;
  }

  public AccordionBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    accordion.setOnSwipeRight( value );
    return this;
  }

  public AccordionBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    accordion.setOnTouchPressed( value );
    return this;
  }

  public AccordionBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    accordion.setOnTouchMoved( value );
    return this;
  }

  public AccordionBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    accordion.setOnTouchReleased( value );
    return this;
  }

  public AccordionBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    accordion.setOnTouchStationary( value );
    return this;
  }

  public AccordionBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    accordion.setOnKeyPressed( value );
    return this;
  }

  public AccordionBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    accordion.setOnKeyReleased( value );
    return this;
  }

  public AccordionBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    accordion.setOnKeyTyped( value );
    return this;
  }

  public AccordionBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    accordion.setOnInputMethodTextChanged( value );
    return this;
  }

  public AccordionBuilder withInputMethodRequests( InputMethodRequests value ) {

    accordion.setInputMethodRequests( value );
    return this;
  }

  public AccordionBuilder withFocusTraversable( boolean value ) {

    accordion.setFocusTraversable( value );
    return this;
  }

  public AccordionBuilder withEventDispatcher( EventDispatcher value ) {

    accordion.setEventDispatcher( value );
    return this;
  }

  public AccordionBuilder withAccessibleRole( AccessibleRole value ) {

    accordion.setAccessibleRole( value );
    return this;
  }

  public AccordionBuilder withAccessibleRoleDescription( String value ) {

    accordion.setAccessibleRoleDescription( value );
    return this;
  }

  public AccordionBuilder withAccessibleText( String value ) {

    accordion.setAccessibleText( value );
    return this;
  }

  public AccordionBuilder withAccessibleHelp( String value ) {

    accordion.setAccessibleHelp( value );
    return this;
  }

  public Accordion build( ) {

    return this.accordion;
  }

}
