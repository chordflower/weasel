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
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.geometry.Pos;
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

public final class CheckBoxBuilder {

  private final CheckBox built = new CheckBox( );

  private CheckBoxBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull CheckBoxBuilder builder( ) {

    return new CheckBoxBuilder( );
  }

  @Contract( pure = true )
  public CheckBox build( ) {

    return this.built;
  }

  @Contract( "_ -> this" )
  public CheckBoxBuilder withIndeterminate( boolean value ) {

    built.setIndeterminate( value );
    return this;
  }

  @Contract( "_ -> this" )
  public CheckBoxBuilder withSelected( boolean value ) {

    built.setSelected( value );
    return this;
  }

  @Contract( "_ -> this" )
  public CheckBoxBuilder withAllowIndeterminate( boolean value ) {

    built.setAllowIndeterminate( value );
    return this;
  }

  @Contract( "_ -> this" )
  public CheckBoxBuilder withOnAction( EventHandler< ActionEvent > value ) {

    built.setOnAction( value );
    return this;
  }

  public CheckBoxBuilder withText( String value ) {

    built.setText( value );
    return this;
  }

  public CheckBoxBuilder withAlignment( Pos value ) {

    built.setAlignment( value );
    return this;
  }

  public CheckBoxBuilder withTextAlignment( TextAlignment value ) {

    built.setTextAlignment( value );
    return this;
  }

  public CheckBoxBuilder withTextOverrun( OverrunStyle value ) {

    built.setTextOverrun( value );
    return this;
  }

  public CheckBoxBuilder withEllipsisString( String value ) {

    built.setEllipsisString( value );
    return this;
  }

  public CheckBoxBuilder withWrapText( boolean value ) {

    built.setWrapText( value );
    return this;
  }

  public CheckBoxBuilder withFont( Font value ) {

    built.setFont( value );
    return this;
  }

  public CheckBoxBuilder withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public CheckBoxBuilder withUnderline( boolean value ) {

    built.setUnderline( value );
    return this;
  }

  public CheckBoxBuilder withLineSpacing( double value ) {

    built.setLineSpacing( value );
    return this;
  }

  public CheckBoxBuilder withContentDisplay( ContentDisplay value ) {

    built.setContentDisplay( value );
    return this;
  }

  public CheckBoxBuilder withGraphicTextGap( double value ) {

    built.setGraphicTextGap( value );
    return this;
  }

  public CheckBoxBuilder withTextFill( Paint value ) {

    built.setTextFill( value );
    return this;
  }

  public CheckBoxBuilder withMnemonicParsing( boolean value ) {

    built.setMnemonicParsing( value );
    return this;
  }

  public CheckBoxBuilder withSkin( Skin< ? > value ) {

    built.setSkin( value );
    return this;
  }

  public CheckBoxBuilder withTooltip( Tooltip value ) {

    built.setTooltip( value );
    return this;
  }

  public CheckBoxBuilder withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public CheckBoxBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public CheckBoxBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public CheckBoxBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public CheckBoxBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public CheckBoxBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public CheckBoxBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public CheckBoxBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public CheckBoxBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public CheckBoxBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public CheckBoxBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public CheckBoxBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public CheckBoxBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public CheckBoxBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public CheckBoxBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public CheckBoxBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public CheckBoxBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public CheckBoxBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public CheckBoxBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public CheckBoxBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public CheckBoxBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public CheckBoxBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public CheckBoxBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public CheckBoxBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public CheckBoxBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public CheckBoxBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public CheckBoxBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public CheckBoxBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public CheckBoxBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public CheckBoxBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public CheckBoxBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public CheckBoxBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public CheckBoxBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public CheckBoxBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public CheckBoxBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public CheckBoxBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public CheckBoxBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public CheckBoxBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public CheckBoxBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public CheckBoxBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public CheckBoxBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public CheckBoxBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public CheckBoxBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public CheckBoxBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public CheckBoxBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public CheckBoxBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public CheckBoxBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public CheckBoxBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public CheckBoxBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public CheckBoxBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public CheckBoxBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public CheckBoxBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public CheckBoxBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public CheckBoxBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public CheckBoxBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public CheckBoxBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public CheckBoxBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public CheckBoxBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public CheckBoxBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public CheckBoxBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public CheckBoxBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public CheckBoxBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public CheckBoxBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public CheckBoxBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public CheckBoxBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public CheckBoxBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public CheckBoxBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public CheckBoxBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public CheckBoxBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public CheckBoxBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public CheckBoxBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public CheckBoxBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public CheckBoxBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public CheckBoxBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public CheckBoxBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public CheckBoxBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public CheckBoxBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public CheckBoxBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public CheckBoxBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public CheckBoxBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public CheckBoxBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public CheckBoxBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public CheckBoxBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public CheckBoxBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
