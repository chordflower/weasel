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

import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.control.TreeTableColumn.CellEditEvent;
import javafx.scene.control.TreeTableColumn.SortType;
import javafx.util.Callback;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * This is a fluent builder for creating a JavaFX TreeTableColumn.
 */
@AvailableSince( "0.1.0" )
public final class TreeTableColumnBuilder< S, T > {

  private final TreeTableColumn< S, T > built = new TreeTableColumn<>( );

  private TreeTableColumnBuilder( ) {

  }

  @Contract( " -> new" )
  public static < S, T > @NotNull TreeTableColumnBuilder< S, T > builder( ) {

    return new TreeTableColumnBuilder<>( );
  }

  @Contract( pure = true )
  public TreeTableColumn< S, T > build( ) {

    return this.built;
  }

  public TreeTableColumnBuilder< S, T > withCellValueFactory( Callback< CellDataFeatures< S, T >, ObservableValue< T > > value ) {

    built.setCellValueFactory( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withCellFactory( Callback< TreeTableColumn< S, T >, TreeTableCell< S, T > > value ) {

    built.setCellFactory( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withSortType( SortType value ) {

    built.setSortType( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withOnEditStart( EventHandler< CellEditEvent< S, T > > value ) {

    built.setOnEditStart( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withOnEditCommit( EventHandler< CellEditEvent< S, T > > value ) {

    built.setOnEditCommit( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withOnEditCancel( EventHandler< CellEditEvent< S, T > > value ) {

    built.setOnEditCancel( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withText( String value ) {

    built.setText( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withSortNode( Node value ) {

    built.setSortNode( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withResizable( boolean value ) {

    built.setResizable( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withSortable( boolean value ) {

    built.setSortable( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withReorderable( boolean value ) {

    built.setReorderable( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withComparator( Comparator< T > value ) {

    built.setComparator( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TreeTableColumnBuilder< S, T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

}
