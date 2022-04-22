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

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class MenuButtonBuilder {

  private final MenuButton built = new MenuButton();

  private MenuButtonBuilder( ) {
  }

  @Contract( " -> new" )
  public static @NotNull MenuButtonBuilder builder( ) {
    return new MenuButtonBuilder();
  }

  @Contract( pure = true )
  public MenuButton build( ) {
    return this.built;
  }

  public MenuButtonBuilder withPopupSide( Side value ) {

    built.setPopupSide( value );
    return this;
  }

  public MenuButtonBuilder withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public MenuButtonBuilder withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public MenuButtonBuilder withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public MenuButtonBuilder withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public MenuButtonBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public MenuButtonBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public MenuButtonBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public MenuButtonBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public MenuButtonBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public MenuButtonBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public MenuButtonBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public MenuButtonBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public MenuButtonBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public MenuButtonBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public MenuButtonBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public MenuButtonBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public MenuButtonBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public MenuButtonBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public MenuButtonBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public MenuButtonBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public MenuButtonBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public MenuButtonBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public MenuButtonBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public MenuButtonBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public MenuButtonBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public MenuButtonBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public MenuButtonBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public MenuButtonBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public MenuButtonBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public MenuButtonBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public MenuButtonBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public MenuButtonBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public MenuButtonBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public MenuButtonBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public MenuButtonBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public MenuButtonBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public MenuButtonBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public MenuButtonBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public MenuButtonBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public MenuButtonBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public MenuButtonBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public MenuButtonBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public MenuButtonBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public MenuButtonBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public MenuButtonBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public MenuButtonBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public MenuButtonBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public MenuButtonBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public MenuButtonBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public MenuButtonBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public MenuButtonBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public MenuButtonBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public MenuButtonBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public MenuButtonBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public MenuButtonBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public MenuButtonBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public MenuButtonBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public MenuButtonBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public MenuButtonBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public MenuButtonBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public MenuButtonBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public MenuButtonBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public MenuButtonBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public MenuButtonBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public MenuButtonBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public MenuButtonBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public MenuButtonBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public MenuButtonBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public MenuButtonBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public MenuButtonBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public MenuButtonBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public MenuButtonBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public MenuButtonBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public MenuButtonBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public MenuButtonBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public MenuButtonBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public MenuButtonBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public MenuButtonBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public MenuButtonBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public MenuButtonBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public MenuButtonBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public MenuButtonBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public MenuButtonBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public MenuButtonBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public MenuButtonBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public MenuButtonBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public MenuButtonBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public MenuButtonBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public MenuButtonBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public MenuButtonBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public MenuButtonBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public MenuButtonBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public MenuButtonBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public MenuButtonBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public MenuButtonBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public MenuButtonBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public MenuButtonBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public MenuButtonBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public MenuButtonBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public MenuButtonBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public MenuButtonBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public MenuButtonBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public MenuButtonBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public MenuButtonBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public MenuButtonBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
