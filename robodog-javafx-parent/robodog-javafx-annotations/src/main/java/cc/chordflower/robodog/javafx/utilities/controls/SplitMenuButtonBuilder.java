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

public final class SplitMenuButtonBuilder {

  private final SplitMenuButton built = new SplitMenuButton( );

  private SplitMenuButtonBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull SplitMenuButtonBuilder builder( ) {

    return new SplitMenuButtonBuilder( );
  }

  @Contract( pure = true )
  public SplitMenuButton build( ) {

    return this.built;
  }

  public SplitMenuButtonBuilder withPopupSide( Side value ) {

    built.setPopupSide( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnShowing( EventHandler< Event > value ) {

    built.setOnShowing( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnShown( EventHandler< Event > value ) {

    built.setOnShown( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnHiding( EventHandler< Event > value ) {

    built.setOnHiding( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnHidden( EventHandler< Event > value ) {

    built.setOnHidden( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public SplitMenuButtonBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public SplitMenuButtonBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public SplitMenuButtonBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public SplitMenuButtonBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public SplitMenuButtonBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public SplitMenuButtonBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public SplitMenuButtonBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public SplitMenuButtonBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public SplitMenuButtonBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public SplitMenuButtonBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public SplitMenuButtonBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public SplitMenuButtonBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public SplitMenuButtonBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public SplitMenuButtonBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public SplitMenuButtonBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public SplitMenuButtonBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public SplitMenuButtonBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public SplitMenuButtonBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public SplitMenuButtonBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public SplitMenuButtonBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public SplitMenuButtonBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public SplitMenuButtonBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public SplitMenuButtonBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public SplitMenuButtonBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public SplitMenuButtonBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public SplitMenuButtonBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public SplitMenuButtonBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public SplitMenuButtonBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public SplitMenuButtonBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public SplitMenuButtonBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public SplitMenuButtonBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public SplitMenuButtonBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public SplitMenuButtonBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public SplitMenuButtonBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public SplitMenuButtonBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public SplitMenuButtonBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public SplitMenuButtonBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public SplitMenuButtonBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public SplitMenuButtonBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public SplitMenuButtonBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public SplitMenuButtonBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public SplitMenuButtonBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public SplitMenuButtonBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public SplitMenuButtonBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public SplitMenuButtonBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public SplitMenuButtonBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public SplitMenuButtonBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public SplitMenuButtonBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public SplitMenuButtonBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public SplitMenuButtonBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public SplitMenuButtonBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public SplitMenuButtonBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public SplitMenuButtonBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public SplitMenuButtonBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public SplitMenuButtonBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public SplitMenuButtonBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public SplitMenuButtonBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public SplitMenuButtonBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public SplitMenuButtonBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public SplitMenuButtonBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public SplitMenuButtonBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public SplitMenuButtonBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public SplitMenuButtonBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public SplitMenuButtonBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public SplitMenuButtonBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public SplitMenuButtonBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public SplitMenuButtonBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public SplitMenuButtonBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public SplitMenuButtonBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public SplitMenuButtonBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public SplitMenuButtonBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
