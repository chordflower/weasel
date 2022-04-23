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
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableColumn.SortType;
import javafx.util.Callback;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * This is a fluent builder for creating a JavaFX TableColumn.
 */
@AvailableSince( "0.1.0" )
public final class TableColumnBuilder< S, T > {

  private final TableColumn< S, T > built = new TableColumn<>( );

  private TableColumnBuilder( ) {

  }

  @Contract( " -> new" )
  public static < S, T > @NotNull TableColumnBuilder< S, T > builder( ) {

    return new TableColumnBuilder<>( );
  }

  @Contract( pure = true )
  public TableColumn< S, T > build( ) {

    return this.built;
  }

  public TableColumnBuilder< S, T > withCellValueFactory( Callback< CellDataFeatures< S, T >, ObservableValue< T > > value ) {

    built.setCellValueFactory( value );
    return this;
  }

  public TableColumnBuilder< S, T > withCellFactory( Callback< TableColumn< S, T >, TableCell< S, T > > value ) {

    built.setCellFactory( value );
    return this;
  }

  public TableColumnBuilder< S, T > withSortType( SortType value ) {

    built.setSortType( value );
    return this;
  }

  public TableColumnBuilder< S, T > withOnEditStart( EventHandler< CellEditEvent< S, T > > value ) {

    built.setOnEditStart( value );
    return this;
  }

  public TableColumnBuilder< S, T > withOnEditCommit( EventHandler< CellEditEvent< S, T > > value ) {

    built.setOnEditCommit( value );
    return this;
  }

  public TableColumnBuilder< S, T > withOnEditCancel( EventHandler< CellEditEvent< S, T > > value ) {

    built.setOnEditCancel( value );
    return this;
  }

  public TableColumnBuilder< S, T > withText( String value ) {

    built.setText( value );
    return this;
  }

  public TableColumnBuilder< S, T > withVisible( boolean value ) {

    built.setVisible( value );
    return this;
  }

  public TableColumnBuilder< S, T > withContextMenu( ContextMenu value ) {

    built.setContextMenu( value );
    return this;
  }

  public TableColumnBuilder< S, T > withId( String value ) {

    built.setId( value );
    return this;
  }

  public TableColumnBuilder< S, T > withStyle( String value ) {

    built.setStyle( value );
    return this;
  }

  public TableColumnBuilder< S, T > withGraphic( Node value ) {

    built.setGraphic( value );
    return this;
  }

  public TableColumnBuilder< S, T > withSortNode( Node value ) {

    built.setSortNode( value );
    return this;
  }

  public TableColumnBuilder< S, T > withMinWidth( double value ) {

    built.setMinWidth( value );
    return this;
  }

  public TableColumnBuilder< S, T > withPrefWidth( double value ) {

    built.setPrefWidth( value );
    return this;
  }

  public TableColumnBuilder< S, T > withMaxWidth( double value ) {

    built.setMaxWidth( value );
    return this;
  }

  public TableColumnBuilder< S, T > withResizable( boolean value ) {

    built.setResizable( value );
    return this;
  }

  public TableColumnBuilder< S, T > withSortable( boolean value ) {

    built.setSortable( value );
    return this;
  }

  public TableColumnBuilder< S, T > withReorderable( boolean value ) {

    built.setReorderable( value );
    return this;
  }

  public TableColumnBuilder< S, T > withComparator( Comparator< T > value ) {

    built.setComparator( value );
    return this;
  }

  public TableColumnBuilder< S, T > withEditable( boolean value ) {

    built.setEditable( value );
    return this;
  }

  public TableColumnBuilder< S, T > withUserData( Object value ) {

    built.setUserData( value );
    return this;
  }

}
