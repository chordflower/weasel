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

package cc.chordflower.weasel.javafx.utilities.charts;

import javafx.collections.ObservableList;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Point3D;
import javafx.geometry.Side;
import javafx.scene.*;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
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
 * Contains a fluent api for a JavaFX PieChart.
 */
@AvailableSince( "0.1.0" )
public final class PieChartBuilder {

  private final PieChart built = new PieChart( );

  private PieChartBuilder( ) {

  }

  @Contract( " -> new" )
  public static @NotNull PieChartBuilder builder( ) {

    return new PieChartBuilder( );
  }

  @Contract( pure = true )
  public PieChart build( ) {

    return this.built;
  }

  public PieChartBuilder withData( ObservableList< Data > value ) {

    built.setData( value );
    return this;
  }

  public PieChartBuilder withStartAngle( double value ) {

    built.setStartAngle( value );
    return this;
  }

  public PieChartBuilder withClockwise( boolean value ) {

    built.setClockwise( value );
    return this;
  }

  public PieChartBuilder withLabelLineLength( double value ) {

    built.setLabelLineLength( value );
    return this;
  }

  public PieChartBuilder withLabelsVisible( boolean value ) {

    built.setLabelsVisible( value );
    return this;
  }

  public PieChartBuilder withTitle( String value ) {

    built.setTitle( value );
    return this;
  }

  public PieChartBuilder withTitleSide( Side value ) {

    built.setTitleSide( value );
    return this;
  }

  public PieChartBuilder withLegendVisible( boolean value ) {

    built.setLegendVisible( value );
    return this;
  }

  public PieChartBuilder withLegendSide( Side value ) {

    built.setLegendSide( value );
    return this;
  }

  public PieChartBuilder withAnimated( boolean value ) {

    built.setAnimated( value );
    return this;
  }

  public PieChartBuilder withSnapToPixel( boolean value ) {

    built.setSnapToPixel( value );
    return this;
  }

  public PieChartBuilder withPadding( Insets value ) {

    built.setPadding( value );
    return this;
  }

  public PieChartBuilder withBackground( Background value ) {

    built.setBackground( value );
    return this;
  }

  public PieChartBuilder withBorder( Border value ) {

    built.setBorder( value );
    return this;
  }

  public PieChartBuilder withOpaqueInsets( Insets value ) {

    built.setOpaqueInsets( value );
    return this;
  }

  public PieChartBuilder withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public PieChartBuilder withMinHeight( double value ) {

    built.setMinHeight( value );
    return this;
  }

  public PieChartBuilder withMinSize( double minWidth, double minHeight ) {

    built.setMinSize( minWidth, minHeight );
    return this;
  }

  public PieChartBuilder withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public PieChartBuilder withPrefHeight( double value ) {

    built.setPrefHeight( value );
    return this;
  }

  public PieChartBuilder withPrefSize( double prefWidth, double prefHeight ) {

    built.setPrefSize( prefWidth, prefHeight );
    return this;
  }

  public PieChartBuilder withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public PieChartBuilder withMaxHeight( double value ) {

    built.setMaxHeight( value );
    return this;
  }

  public PieChartBuilder withMaxSize( double maxWidth, double maxHeight ) {

    built.setMaxSize( maxWidth, maxHeight );
    return this;
  }

  public PieChartBuilder withShape( Shape value ) {

    built.setShape( value );
    return this;
  }

  public PieChartBuilder withScaleShape( boolean value ) {

    built.setScaleShape( value );
    return this;
  }

  public PieChartBuilder withCenterShape( boolean value ) {

    built.setCenterShape( value );
    return this;
  }

  public PieChartBuilder withCacheShape( boolean value ) {

    built.setCacheShape( value );
    return this;
  }

  public PieChartBuilder withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

  public PieChartBuilder withId( String value ) {

    built.setId( value );
    return this;
  }

  public PieChartBuilder withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public PieChartBuilder withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public PieChartBuilder withCursor( Cursor value ) {

    built.setCursor( value );
    return this;
  }

  public PieChartBuilder withOpacity( double value ) {

    built.setOpacity( value );
    return this;
  }

  public PieChartBuilder withBlendMode( BlendMode value ) {

    built.setBlendMode( value );
    return this;
  }

  public PieChartBuilder withClip( Node value ) {

    built.setClip( value );
    return this;
  }

  public PieChartBuilder withCache( boolean value ) {

    built.setCache( value );
    return this;
  }

  public PieChartBuilder withCacheHint( CacheHint value ) {

    built.setCacheHint( value );
    return this;
  }

  public PieChartBuilder withEffect( Effect value ) {

    built.setEffect( value );
    return this;
  }

  public PieChartBuilder withDepthTest( DepthTest value ) {

    built.setDepthTest( value );
    return this;
  }

  public PieChartBuilder withDisable( boolean value ) {

    built.setDisable( value );
    return this;
  }

  public PieChartBuilder withPickOnBounds( boolean value ) {

    built.setPickOnBounds( value );
    return this;
  }

  public PieChartBuilder withOnDragEntered( EventHandler< ? super DragEvent > value ) {

    built.setOnDragEntered( value );
    return this;
  }

  public PieChartBuilder withOnDragExited( EventHandler< ? super DragEvent > value ) {

    built.setOnDragExited( value );
    return this;
  }

  public PieChartBuilder withOnDragOver( EventHandler< ? super DragEvent > value ) {

    built.setOnDragOver( value );
    return this;
  }

  public PieChartBuilder withOnDragDropped( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDropped( value );
    return this;
  }

  public PieChartBuilder withOnDragDone( EventHandler< ? super DragEvent > value ) {

    built.setOnDragDone( value );
    return this;
  }

  public PieChartBuilder withManaged( boolean value ) {

    built.setManaged( value );
    return this;
  }

  public PieChartBuilder withLayoutX( double value ) {

    built.setLayoutX( value );
    return this;
  }

  public PieChartBuilder withLayoutY( double value ) {

    built.setLayoutY( value );
    return this;
  }

  public PieChartBuilder withViewOrder( double value ) {

    built.setViewOrder( value );
    return this;
  }

  public PieChartBuilder withTranslateX( double value ) {

    built.setTranslateX( value );
    return this;
  }

  public PieChartBuilder withTranslateY( double value ) {

    built.setTranslateY( value );
    return this;
  }

  public PieChartBuilder withTranslateZ( double value ) {

    built.setTranslateZ( value );
    return this;
  }

  public PieChartBuilder withScaleX( double value ) {

    built.setScaleX( value );
    return this;
  }

  public PieChartBuilder withScaleY( double value ) {

    built.setScaleY( value );
    return this;
  }

  public PieChartBuilder withScaleZ( double value ) {

    built.setScaleZ( value );
    return this;
  }

  public PieChartBuilder withRotate( double value ) {

    built.setRotate( value );
    return this;
  }

  public PieChartBuilder withRotationAxis( Point3D value ) {

    built.setRotationAxis( value );
    return this;
  }

  public PieChartBuilder withNodeOrientation( NodeOrientation orientation ) {

    built.setNodeOrientation( orientation );
    return this;
  }

  public PieChartBuilder withMouseTransparent( boolean value ) {

    built.setMouseTransparent( value );
    return this;
  }

  public PieChartBuilder withOnContextMenuRequested( EventHandler< ? super ContextMenuEvent > value ) {

    built.setOnContextMenuRequested( value );
    return this;
  }

  public PieChartBuilder withOnMouseClicked( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseClicked( value );
    return this;
  }

  public PieChartBuilder withOnMouseDragged( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseDragged( value );
    return this;
  }

  public PieChartBuilder withOnMouseEntered( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseEntered( value );
    return this;
  }

  public PieChartBuilder withOnMouseExited( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseExited( value );
    return this;
  }

  public PieChartBuilder withOnMouseMoved( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseMoved( value );
    return this;
  }

  public PieChartBuilder withOnMousePressed( EventHandler< ? super MouseEvent > value ) {

    built.setOnMousePressed( value );
    return this;
  }

  public PieChartBuilder withOnMouseReleased( EventHandler< ? super MouseEvent > value ) {

    built.setOnMouseReleased( value );
    return this;
  }

  public PieChartBuilder withOnDragDetected( EventHandler< ? super MouseEvent > value ) {

    built.setOnDragDetected( value );
    return this;
  }

  public PieChartBuilder withOnMouseDragOver( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragOver( value );
    return this;
  }

  public PieChartBuilder withOnMouseDragReleased( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragReleased( value );
    return this;
  }

  public PieChartBuilder withOnMouseDragEntered( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragEntered( value );
    return this;
  }

  public PieChartBuilder withOnMouseDragExited( EventHandler< ? super MouseDragEvent > value ) {

    built.setOnMouseDragExited( value );
    return this;
  }

  public PieChartBuilder withOnScrollStarted( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollStarted( value );
    return this;
  }

  public PieChartBuilder withOnScroll( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScroll( value );
    return this;
  }

  public PieChartBuilder withOnScrollFinished( EventHandler< ? super ScrollEvent > value ) {

    built.setOnScrollFinished( value );
    return this;
  }

  public PieChartBuilder withOnRotationStarted( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationStarted( value );
    return this;
  }

  public PieChartBuilder withOnRotate( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotate( value );
    return this;
  }

  public PieChartBuilder withOnRotationFinished( EventHandler< ? super RotateEvent > value ) {

    built.setOnRotationFinished( value );
    return this;
  }

  public PieChartBuilder withOnZoomStarted( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomStarted( value );
    return this;
  }

  public PieChartBuilder withOnZoom( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoom( value );
    return this;
  }

  public PieChartBuilder withOnZoomFinished( EventHandler< ? super ZoomEvent > value ) {

    built.setOnZoomFinished( value );
    return this;
  }

  public PieChartBuilder withOnSwipeUp( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeUp( value );
    return this;
  }

  public PieChartBuilder withOnSwipeDown( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeDown( value );
    return this;
  }

  public PieChartBuilder withOnSwipeLeft( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeLeft( value );
    return this;
  }

  public PieChartBuilder withOnSwipeRight( EventHandler< ? super SwipeEvent > value ) {

    built.setOnSwipeRight( value );
    return this;
  }

  public PieChartBuilder withOnTouchPressed( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchPressed( value );
    return this;
  }

  public PieChartBuilder withOnTouchMoved( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchMoved( value );
    return this;
  }

  public PieChartBuilder withOnTouchReleased( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchReleased( value );
    return this;
  }

  public PieChartBuilder withOnTouchStationary( EventHandler< ? super TouchEvent > value ) {

    built.setOnTouchStationary( value );
    return this;
  }

  public PieChartBuilder withOnKeyPressed( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyPressed( value );
    return this;
  }

  public PieChartBuilder withOnKeyReleased( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyReleased( value );
    return this;
  }

  public PieChartBuilder withOnKeyTyped( EventHandler< ? super KeyEvent > value ) {

    built.setOnKeyTyped( value );
    return this;
  }

  public PieChartBuilder withOnInputMethodTextChanged( EventHandler< ? super InputMethodEvent > value ) {

    built.setOnInputMethodTextChanged( value );
    return this;
  }

  public PieChartBuilder withInputMethodRequests( InputMethodRequests value ) {

    built.setInputMethodRequests( value );
    return this;
  }

  public PieChartBuilder withFocusTraversable( boolean value ) {

    built.setFocusTraversable( value );
    return this;
  }

  public PieChartBuilder withEventDispatcher( EventDispatcher value ) {

    built.setEventDispatcher( value );
    return this;
  }

  public PieChartBuilder withAccessibleRole( AccessibleRole value ) {

    built.setAccessibleRole( value );
    return this;
  }

  public PieChartBuilder withAccessibleRoleDescription( String value ) {

    built.setAccessibleRoleDescription( value );
    return this;
  }

  public PieChartBuilder withAccessibleText( String value ) {

    built.setAccessibleText( value );
    return this;
  }

  public PieChartBuilder withAccessibleHelp( String value ) {

    built.setAccessibleHelp( value );
    return this;
  }

}
