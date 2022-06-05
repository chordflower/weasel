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
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;

/**
 * This is a fluent builder for creating a JavaFX VBox.
 */
@AvailableSince( "0.1.0" )
public class VBoxBuilder {

  private final VBox vbox;

  private VBoxBuilder( ) {

    this.vbox = new VBox( );
  }

  public static VBoxBuilder builder( ) {

    return new VBoxBuilder( );
  }

  /**
   * Sets the vertical grow priority for the child when contained by a vbox.
   * If set, the vbox will use the priority value to allocate additional space if the
   * vbox is resized larger than its preferred height.
   * If multiple vbox children have the same vertical grow priority, then the
   * extra space will be split evenly between them.
   * If no vertical grow priority is set on a child, the vbox will never
   * allocate any additional vertical space for that child.
   * <p>
   * Setting the value to {@code null} will remove the constraint.
   * @param child the child of a vbox
   * @param value the vertical grow priority for the child
   */
  public VBoxBuilder withVgrow( Node child, Priority value ) {

    VBox.setVgrow( child, value );
    return this;
  }

  /**
   * Sets the margin for the child when contained by a vbox.
   * If set, the vbox will layout the child so that it has the margin space around it.
   * Setting the value to null will remove the constraint.
   * @param child the child mode of a vbox
   * @param value the margin of space around the child
   */
  public VBoxBuilder withMargin( Node child, Insets value ) {

    VBox.setMargin( child, value );
    return this;
  }

  public VBoxBuilder withSpacing( double value ) {

    vbox.setSpacing( value );
    return this;
  }

  public VBoxBuilder withAlignment( Pos value ) {

    vbox.setAlignment( value );
    return this;
  }

  public VBoxBuilder withFillWidth( boolean value ) {

    vbox.setFillWidth( value );
    return this;
  }

  public VBoxBuilder withSnapToPixel( boolean value ) {

    vbox.setSnapToPixel( value );
    return this;
  }

  public VBoxBuilder withPadding( Insets value ) {

    vbox.setPadding( value );
    return this;
  }

  public VBoxBuilder withBackground( Background value ) {

    vbox.setBackground( value );
    return this;
  }

  public VBoxBuilder withBorder( Border value ) {

    vbox.setBorder( value );
    return this;
  }

  public VBoxBuilder withOpaqueInsets( Insets value ) {

    vbox.setOpaqueInsets( value );
    return this;
  }

  public VBoxBuilder withMinWidth( double value ) {

    vbox.setMinWidth( value );
    return this;
  }

  public VBoxBuilder withMinHeight( double value ) {

    vbox.setMinHeight( value );
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
  public VBoxBuilder withMinSize( double minWidth, double minHeight ) {

    vbox.setMinSize( minWidth, minHeight );
    return this;
  }

  public VBoxBuilder withPrefWidth( double value ) {

    vbox.setPrefWidth( value );
    return this;
  }

  public VBoxBuilder withPrefHeight( double value ) {

    vbox.setPrefHeight( value );
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
  public VBoxBuilder withPrefSize( double prefWidth, double prefHeight ) {

    vbox.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public VBoxBuilder withMaxWidth( double value ) {

    vbox.setMaxWidth( value );
    return this;
  }

  public VBoxBuilder withMaxHeight( double value ) {

    vbox.setMaxHeight( value );
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
  public VBoxBuilder withMaxSize( double maxWidth, double maxHeight ) {

    vbox.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public VBoxBuilder withShape( Shape value ) {

    vbox.setShape( value );
    return this;
  }

  public VBoxBuilder withScaleShape( boolean value ) {

    vbox.setScaleShape( value );
    return this;
  }

  public VBoxBuilder withCenterShape( boolean value ) {

    vbox.setCenterShape( value );
    return this;
  }

  public VBoxBuilder withCacheShape( boolean value ) {

    vbox.setCacheShape( value );
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
  public VBoxBuilder withUserData( Object value ) {

    vbox.setUserData( value );
    return this;
  }

  public VBoxBuilder withId( String value ) {

    vbox.setId( value );
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
  public VBoxBuilder withStyle( String value ) {

    vbox.setStyle( value );
    return this;
  }

  public VBoxBuilder withVisible( boolean value ) {

    vbox.setVisible( value );
    return this;
  }

  public VBoxBuilder withCursor( Cursor value ) {

    vbox.setCursor( value );
    return this;
  }

  public VBoxBuilder withOpacity( double value ) {

    vbox.setOpacity( value );
    return this;
  }

  public VBoxBuilder withBlendMode( BlendMode value ) {

    vbox.setBlendMode( value );
    return this;
  }

  public VBoxBuilder withClip( Node value ) {

    vbox.setClip( value );
    return this;
  }

  public VBoxBuilder withCache( boolean value ) {

    vbox.setCache( value );
    return this;
  }

  public VBoxBuilder withCacheHint( CacheHint value ) {

    vbox.setCacheHint( value );
    return this;
  }

  public VBoxBuilder withEffect( Effect value ) {

    vbox.setEffect( value );
    return this;
  }

  public VBoxBuilder withDepthTest( DepthTest value ) {

    vbox.setDepthTest( value );
    return this;
  }

  public VBoxBuilder withDisable( boolean value ) {

    vbox.setDisable( value );
    return this;
  }

  public VBoxBuilder withPickOnBounds( boolean value ) {

    vbox.setPickOnBounds( value );
    return this;
  }

  public VBoxBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    vbox.setOnDragEntered( value );
    return this;
  }

  public VBoxBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    vbox.setOnDragExited( value );
    return this;
  }

  public VBoxBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    vbox.setOnDragOver( value );
    return this;
  }

  public VBoxBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    vbox.setOnDragDropped( value );
    return this;
  }

  public VBoxBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    vbox.setOnDragDone( value );
    return this;
  }

  public VBoxBuilder withManaged( boolean value ) {

    vbox.setManaged( value );
    return this;
  }

  public VBoxBuilder withLayoutX( double value ) {

    vbox.setLayoutX( value );
    return this;
  }

  public VBoxBuilder withLayoutY( double value ) {

    vbox.setLayoutY( value );
    return this;
  }

  public VBoxBuilder withViewOrder( double value ) {

    vbox.setViewOrder( value );
    return this;
  }

  public VBoxBuilder withTranslateX( double value ) {

    vbox.setTranslateX( value );
    return this;
  }

  public VBoxBuilder withTranslateY( double value ) {

    vbox.setTranslateY( value );
    return this;
  }

  public VBoxBuilder withTranslateZ( double value ) {

    vbox.setTranslateZ( value );
    return this;
  }

  public VBoxBuilder withScaleX( double value ) {

    vbox.setScaleX( value );
    return this;
  }

  public VBoxBuilder withScaleY( double value ) {

    vbox.setScaleY( value );
    return this;
  }

  public VBoxBuilder withScaleZ( double value ) {

    vbox.setScaleZ( value );
    return this;
  }

  public VBoxBuilder withRotate( double value ) {

    vbox.setRotate( value );
    return this;
  }

  public VBoxBuilder withRotationAxis( Point3D value ) {

    vbox.setRotationAxis( value );
    return this;
  }

  public VBoxBuilder withNodeOrientation( NodeOrientation orientation ) {

    vbox.setNodeOrientation( orientation );
    return this;
  }

  public VBoxBuilder withMouseTransparent( boolean value ) {

    vbox.setMouseTransparent( value );
    return this;
  }

  public VBoxBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    vbox.setOnContextMenuRequested( value );
    return this;
  }

  public VBoxBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMouseClicked( value );
    return this;
  }

  public VBoxBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMouseDragged( value );
    return this;
  }

  public VBoxBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMouseEntered( value );
    return this;
  }

  public VBoxBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMouseExited( value );
    return this;
  }

  public VBoxBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMouseMoved( value );
    return this;
  }

  public VBoxBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMousePressed( value );
    return this;
  }

  public VBoxBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnMouseReleased( value );
    return this;
  }

  public VBoxBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    vbox.setOnDragDetected( value );
    return this;
  }

  public VBoxBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    vbox.setOnMouseDragOver( value );
    return this;
  }

  public VBoxBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    vbox.setOnMouseDragReleased( value );
    return this;
  }

  public VBoxBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    vbox.setOnMouseDragEntered( value );
    return this;
  }

  public VBoxBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    vbox.setOnMouseDragExited( value );
    return this;
  }

  public VBoxBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    vbox.setOnScrollStarted( value );
    return this;
  }

  public VBoxBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    vbox.setOnScroll( value );
    return this;
  }

  public VBoxBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    vbox.setOnScrollFinished( value );
    return this;
  }

  public VBoxBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    vbox.setOnRotationStarted( value );
    return this;
  }

  public VBoxBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    vbox.setOnRotate( value );
    return this;
  }

  public VBoxBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    vbox.setOnRotationFinished( value );
    return this;
  }

  public VBoxBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    vbox.setOnZoomStarted( value );
    return this;
  }

  public VBoxBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    vbox.setOnZoom( value );
    return this;
  }

  public VBoxBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    vbox.setOnZoomFinished( value );
    return this;
  }

  public VBoxBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    vbox.setOnSwipeUp( value );
    return this;
  }

  public VBoxBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    vbox.setOnSwipeDown( value );
    return this;
  }

  public VBoxBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    vbox.setOnSwipeLeft( value );
    return this;
  }

  public VBoxBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    vbox.setOnSwipeRight( value );
    return this;
  }

  public VBoxBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    vbox.setOnTouchPressed( value );
    return this;
  }

  public VBoxBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    vbox.setOnTouchMoved( value );
    return this;
  }

  public VBoxBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    vbox.setOnTouchReleased( value );
    return this;
  }

  public VBoxBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    vbox.setOnTouchStationary( value );
    return this;
  }

  public VBoxBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    vbox.setOnKeyPressed( value );
    return this;
  }

  public VBoxBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    vbox.setOnKeyReleased( value );
    return this;
  }

  public VBoxBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    vbox.setOnKeyTyped( value );
    return this;
  }

  public VBoxBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    vbox.setOnInputMethodTextChanged( value );
    return this;
  }

  public VBoxBuilder withInputMethodRequests( InputMethodRequests value ) {

    vbox.setInputMethodRequests( value );
    return this;
  }

  public VBoxBuilder withFocusTraversable( boolean value ) {

    vbox.setFocusTraversable( value );
    return this;
  }

  public VBoxBuilder withEventDispatcher( EventDispatcher value ) {

    vbox.setEventDispatcher( value );
    return this;
  }

  public VBoxBuilder withAccessibleRole( AccessibleRole value ) {

    vbox.setAccessibleRole( value );
    return this;
  }

  public VBoxBuilder withAccessibleRoleDescription( String value ) {

    vbox.setAccessibleRoleDescription( value );
    return this;
  }

  public VBoxBuilder withAccessibleText( String value ) {

    vbox.setAccessibleText( value );
    return this;
  }

  public VBoxBuilder withAccessibleHelp( String value ) {

    vbox.setAccessibleHelp( value );
    return this;
  }

  public VBoxBuilder add( Node... nodes ) {

    vbox.getChildren( ).addAll( nodes );
    return this;
  }

  public VBox build( ) {

    return this.vbox;
  }

}
