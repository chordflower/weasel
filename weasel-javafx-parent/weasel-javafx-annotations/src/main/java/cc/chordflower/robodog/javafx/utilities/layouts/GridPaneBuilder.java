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
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This is a fluent builder for creating a JavaFX GridPane.
 */
@AvailableSince( "0.1.0" )
public class GridPaneBuilder {

  private final GridPane gridPane = new GridPane( );

  @Contract( " -> new" )
  public static @NotNull GridPaneBuilder builder( ) {

    return new GridPaneBuilder( );
  }

  public GridPane build( ) {

    return gridPane;
  }

  public GridPaneBuilder withRowIndex( Node child, Integer value ) {

    GridPane.setRowIndex( child, value );
    return this;
  }

  public GridPaneBuilder withColumnIndex( Node child, Integer value ) {

    GridPane.setColumnIndex( child, value );
    return this;
  }

  public GridPaneBuilder withRowSpan( Node child, Integer value ) {

    GridPane.setRowSpan( child, value );
    return this;
  }

  public GridPaneBuilder withColumnSpan( Node child, Integer value ) {

    GridPane.setColumnSpan( child, value );
    return this;
  }

  public GridPaneBuilder withMargin( Node child, Insets value ) {

    GridPane.setMargin( child, value );
    return this;
  }

  public GridPaneBuilder withHalignment( Node child, HPos value ) {

    GridPane.setHalignment( child, value );
    return this;
  }

  public GridPaneBuilder withValignment( Node child, VPos value ) {

    GridPane.setValignment( child, value );
    return this;
  }

  public GridPaneBuilder withHgrow( Node child, Priority value ) {

    GridPane.setHgrow( child, value );
    return this;
  }

  public GridPaneBuilder withVgrow( Node child, Priority value ) {

    GridPane.setVgrow( child, value );
    return this;
  }

  public GridPaneBuilder withFillWidth( Node child, Boolean value ) {

    GridPane.setFillWidth( child, value );
    return this;
  }

  public GridPaneBuilder withFillHeight( Node child, Boolean value ) {

    GridPane.setFillHeight( child, value );
    return this;
  }

  public GridPaneBuilder withConstraints( Node child, int columnIndex, int rowIndex ) {

    GridPane.setConstraints( child, columnIndex, rowIndex );
    return this;
  }

  public GridPaneBuilder withConstraints( Node child, int columnIndex, int rowIndex, int columnspan, int rowspan ) {

    GridPane.setConstraints( child, columnIndex, rowIndex, columnspan, rowspan );
    return this;
  }

  public GridPaneBuilder withConstraints( Node child, int columnIndex, int rowIndex, int columnspan, int rowspan, HPos halignment, VPos valignment ) {

    GridPane.setConstraints( child, columnIndex, rowIndex, columnspan, rowspan, halignment, valignment );
    return this;
  }

  public GridPaneBuilder withConstraints( Node child, int columnIndex, int rowIndex, int columnspan, int rowspan, HPos halignment, VPos valignment, Priority hgrow, Priority vgrow ) {

    GridPane.setConstraints( child, columnIndex, rowIndex, columnspan, rowspan, halignment, valignment, hgrow, vgrow );
    return this;
  }

  public GridPaneBuilder withConstraints( Node child, int columnIndex, int rowIndex, int columnspan, int rowspan, HPos halignment, VPos valignment, Priority hgrow, Priority vgrow, Insets margin ) {

    GridPane.setConstraints( child, columnIndex, rowIndex, columnspan, rowspan, halignment, valignment, hgrow, vgrow, margin );
    return this;
  }

  public GridPaneBuilder withHgap( double value ) {

    gridPane.setHgap( value );
    return this;
  }

  public GridPaneBuilder withVgap( double value ) {

    gridPane.setVgap( value );
    return this;
  }

  public GridPaneBuilder withAlignment( Pos value ) {

    gridPane.setAlignment( value );
    return this;
  }

  public GridPaneBuilder withGridLinesVisible( boolean value ) {

    gridPane.setGridLinesVisible( value );
    return this;
  }

  public GridPaneBuilder withSnapToPixel( boolean value ) {

    gridPane.setSnapToPixel( value );
    return this;
  }

  public GridPaneBuilder withPadding( Insets value ) {

    gridPane.setPadding( value );
    return this;
  }

  public GridPaneBuilder withBackground( Background value ) {

    gridPane.setBackground( value );
    return this;
  }

  public GridPaneBuilder withBorder( Border value ) {

    gridPane.setBorder( value );
    return this;
  }

  public GridPaneBuilder withOpaqueInsets( Insets value ) {

    gridPane.setOpaqueInsets( value );
    return this;
  }

  public GridPaneBuilder withMinWidth( double value ) {

    gridPane.setMinWidth( value );
    return this;
  }

  public GridPaneBuilder withMinHeight( double value ) {

    gridPane.setMinHeight( value );
    return this;
  }

  public GridPaneBuilder withMinSize( double minWidth, double minHeight ) {

    gridPane.setMinSize( minWidth, minHeight );
    return this;
  }

  public GridPaneBuilder withPrefWidth( double value ) {

    gridPane.setPrefWidth( value );
    return this;
  }

  public GridPaneBuilder withPrefHeight( double value ) {

    gridPane.setPrefHeight( value );
    return this;
  }

  public GridPaneBuilder withPrefSize( double prefWidth, double prefHeight ) {

    gridPane.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public GridPaneBuilder withMaxWidth( double value ) {

    gridPane.setMaxWidth( value );
    return this;
  }

  public GridPaneBuilder withMaxHeight( double value ) {

    gridPane.setMaxHeight( value );
    return this;
  }

  public GridPaneBuilder withMaxSize( double maxWidth, double maxHeight ) {

    gridPane.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public GridPaneBuilder withShape( Shape value ) {

    gridPane.setShape( value );
    return this;
  }

  public GridPaneBuilder withScaleShape( boolean value ) {

    gridPane.setScaleShape( value );
    return this;
  }

  public GridPaneBuilder withCenterShape( boolean value ) {

    gridPane.setCenterShape( value );
    return this;
  }

  public GridPaneBuilder withCacheShape( boolean value ) {

    gridPane.setCacheShape( value );
    return this;
  }

  public GridPaneBuilder withUserData( Object value ) {

    gridPane.setUserData( value );
    return this;
  }

  public GridPaneBuilder withId( String value ) {

    gridPane.setId( value );
    return this;
  }

  public GridPaneBuilder withStyle( String value ) {

    gridPane.setStyle( value );
    return this;
  }

  public GridPaneBuilder withVisible( boolean value ) {

    gridPane.setVisible( value );
    return this;
  }

  public GridPaneBuilder withCursor( Cursor value ) {

    gridPane.setCursor( value );
    return this;
  }

  public GridPaneBuilder withOpacity( double value ) {

    gridPane.setOpacity( value );
    return this;
  }

  public GridPaneBuilder withBlendMode( BlendMode value ) {

    gridPane.setBlendMode( value );
    return this;
  }

  public GridPaneBuilder withClip( Node value ) {

    gridPane.setClip( value );
    return this;
  }

  public GridPaneBuilder withCache( boolean value ) {

    gridPane.setCache( value );
    return this;
  }

  public GridPaneBuilder withCacheHint( CacheHint value ) {

    gridPane.setCacheHint( value );
    return this;
  }

  public GridPaneBuilder withEffect( Effect value ) {

    gridPane.setEffect( value );
    return this;
  }

  public GridPaneBuilder withDepthTest( DepthTest value ) {

    gridPane.setDepthTest( value );
    return this;
  }

  public GridPaneBuilder withDisable( boolean value ) {

    gridPane.setDisable( value );
    return this;
  }

  public GridPaneBuilder withPickOnBounds( boolean value ) {

    gridPane.setPickOnBounds( value );
    return this;
  }

  public GridPaneBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    gridPane.setOnDragEntered( value );
    return this;
  }

  public GridPaneBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    gridPane.setOnDragExited( value );
    return this;
  }

  public GridPaneBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    gridPane.setOnDragOver( value );
    return this;
  }

  public GridPaneBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    gridPane.setOnDragDropped( value );
    return this;
  }

  public GridPaneBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    gridPane.setOnDragDone( value );
    return this;
  }

  public GridPaneBuilder withManaged( boolean value ) {

    gridPane.setManaged( value );
    return this;
  }

  public GridPaneBuilder withLayoutX( double value ) {

    gridPane.setLayoutX( value );
    return this;
  }

  public GridPaneBuilder withLayoutY( double value ) {

    gridPane.setLayoutY( value );
    return this;
  }

  public GridPaneBuilder withViewOrder( double value ) {

    gridPane.setViewOrder( value );
    return this;
  }

  public GridPaneBuilder withTranslateX( double value ) {

    gridPane.setTranslateX( value );
    return this;
  }

  public GridPaneBuilder withTranslateY( double value ) {

    gridPane.setTranslateY( value );
    return this;
  }

  public GridPaneBuilder withTranslateZ( double value ) {

    gridPane.setTranslateZ( value );
    return this;
  }

  public GridPaneBuilder withScaleX( double value ) {

    gridPane.setScaleX( value );
    return this;
  }

  public GridPaneBuilder withScaleY( double value ) {

    gridPane.setScaleY( value );
    return this;
  }

  public GridPaneBuilder withScaleZ( double value ) {

    gridPane.setScaleZ( value );
    return this;
  }

  public GridPaneBuilder withRotate( double value ) {

    gridPane.setRotate( value );
    return this;
  }

  public GridPaneBuilder withRotationAxis( Point3D value ) {

    gridPane.setRotationAxis( value );
    return this;
  }

  public GridPaneBuilder withNodeOrientation( NodeOrientation orientation ) {

    gridPane.setNodeOrientation( orientation );
    return this;
  }

  public GridPaneBuilder withMouseTransparent( boolean value ) {

    gridPane.setMouseTransparent( value );
    return this;
  }

  public GridPaneBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    gridPane.setOnContextMenuRequested( value );
    return this;
  }

  public GridPaneBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMouseClicked( value );
    return this;
  }

  public GridPaneBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMouseDragged( value );
    return this;
  }

  public GridPaneBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMouseEntered( value );
    return this;
  }

  public GridPaneBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMouseExited( value );
    return this;
  }

  public GridPaneBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMouseMoved( value );
    return this;
  }

  public GridPaneBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMousePressed( value );
    return this;
  }

  public GridPaneBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnMouseReleased( value );
    return this;
  }

  public GridPaneBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    gridPane.setOnDragDetected( value );
    return this;
  }

  public GridPaneBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    gridPane.setOnMouseDragOver( value );
    return this;
  }

  public GridPaneBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    gridPane.setOnMouseDragReleased( value );
    return this;
  }

  public GridPaneBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    gridPane.setOnMouseDragEntered( value );
    return this;
  }

  public GridPaneBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    gridPane.setOnMouseDragExited( value );
    return this;
  }

  public GridPaneBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    gridPane.setOnScrollStarted( value );
    return this;
  }

  public GridPaneBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    gridPane.setOnScroll( value );
    return this;
  }

  public GridPaneBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    gridPane.setOnScrollFinished( value );
    return this;
  }

  public GridPaneBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    gridPane.setOnRotationStarted( value );
    return this;
  }

  public GridPaneBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    gridPane.setOnRotate( value );
    return this;
  }

  public GridPaneBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    gridPane.setOnRotationFinished( value );
    return this;
  }

  public GridPaneBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    gridPane.setOnZoomStarted( value );
    return this;
  }

  public GridPaneBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    gridPane.setOnZoom( value );
    return this;
  }

  public GridPaneBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    gridPane.setOnZoomFinished( value );
    return this;
  }

  public GridPaneBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    gridPane.setOnSwipeUp( value );
    return this;
  }

  public GridPaneBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    gridPane.setOnSwipeDown( value );
    return this;
  }

  public GridPaneBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    gridPane.setOnSwipeLeft( value );
    return this;
  }

  public GridPaneBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    gridPane.setOnSwipeRight( value );
    return this;
  }

  public GridPaneBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    gridPane.setOnTouchPressed( value );
    return this;
  }

  public GridPaneBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    gridPane.setOnTouchMoved( value );
    return this;
  }

  public GridPaneBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    gridPane.setOnTouchReleased( value );
    return this;
  }

  public GridPaneBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    gridPane.setOnTouchStationary( value );
    return this;
  }

  public GridPaneBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    gridPane.setOnKeyPressed( value );
    return this;
  }

  public GridPaneBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    gridPane.setOnKeyReleased( value );
    return this;
  }

  public GridPaneBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    gridPane.setOnKeyTyped( value );
    return this;
  }

  public GridPaneBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    gridPane.setOnInputMethodTextChanged( value );
    return this;
  }

  public GridPaneBuilder withInputMethodRequests( InputMethodRequests value ) {

    gridPane.setInputMethodRequests( value );
    return this;
  }

  public GridPaneBuilder withFocusTraversable( boolean value ) {

    gridPane.setFocusTraversable( value );
    return this;
  }

  public GridPaneBuilder withEventDispatcher( EventDispatcher value ) {

    gridPane.setEventDispatcher( value );
    return this;
  }

  public GridPaneBuilder withAccessibleRole( AccessibleRole value ) {

    gridPane.setAccessibleRole( value );
    return this;
  }

  public GridPaneBuilder withAccessibleRoleDescription( String value ) {

    gridPane.setAccessibleRoleDescription( value );
    return this;
  }

  public GridPaneBuilder withAccessibleText( String value ) {

    gridPane.setAccessibleText( value );
    return this;
  }

  public GridPaneBuilder withAccessibleHelp( String value ) {

    gridPane.setAccessibleHelp( value );
    return this;
  }

  public GridPaneBuilder add( Node node, int col, int row, int colspan, int rowspan ) {
    this.gridPane.add( node, col, row, colspan, rowspan );
    return this;
  }

  public GridPaneBuilder add( Node node, int col, int row ) {
    this.gridPane.add( node, col, row );
    return this;
  }

}
