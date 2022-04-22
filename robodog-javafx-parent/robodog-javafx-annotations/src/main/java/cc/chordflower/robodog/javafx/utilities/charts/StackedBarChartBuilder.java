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

package cc.chordflower.robodog.javafx.utilities.charts;

import javafx.collections.ObservableList;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.geometry.Side;
import javafx.scene.*;
import javafx.scene.chart.Axis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.shape.Shape;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class StackedBarChartBuilder< X, Y > {

  private final StackedBarChart< X, Y > built;

  private StackedBarChartBuilder( Axis< X > xAxis, Axis< Y > yAxis ) {

    built = new StackedBarChart<>( xAxis, yAxis );
  }

  @Contract( "_, _ -> new" )
  public static < X, Y > @NotNull StackedBarChartBuilder< X, Y > builder( Axis< X > xAxis, Axis< Y > yAxis ) {

    return new StackedBarChartBuilder<>( xAxis, yAxis );
  }

  @Contract( pure = true )
  public StackedBarChart< X, Y > build( ) {

    return this.built;
  }

  public StackedBarChartBuilder< X, Y > withCategoryGap( double value ) {

    built.setCategoryGap( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withData( ObservableList< Series< X, Y > > value ) {

    built.setData( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withVerticalGridLinesVisible( boolean value ) {

    built.setVerticalGridLinesVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withHorizontalGridLinesVisible( boolean value ) {

    built.setHorizontalGridLinesVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAlternativeColumnFillVisible( boolean value ) {

    built.setAlternativeColumnFillVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAlternativeRowFillVisible( boolean value ) {

    built.setAlternativeRowFillVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withVerticalZeroLineVisible( boolean value ) {

    built.setVerticalZeroLineVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withHorizontalZeroLineVisible( boolean value ) {

    built.setHorizontalZeroLineVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withTitle( String value ) {

    built.setTitle( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withTitleSide( Side value ) {

    built.setTitleSide( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withLegendVisible( boolean value ) {

    built.setLegendVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withLegendSide( Side value ) {

    built.setLegendSide( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAnimated( boolean value ) {

    built.setAnimated( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withId( String value ) {

    built.setId( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public StackedBarChartBuilder< X, Y > withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
