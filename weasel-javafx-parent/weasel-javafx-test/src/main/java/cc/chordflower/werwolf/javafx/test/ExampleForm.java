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

package cc.chordflower.werwolf.javafx.test;

import cc.chordflower.robodog.javafx.annotations.Component;
import cc.chordflower.robodog.javafx.annotations.EventFor;
import cc.chordflower.robodog.javafx.annotations.EventsFor;
import cc.chordflower.robodog.javafx.annotations.View;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

@View( name = "example_form.fxml")
public abstract class ExampleForm extends VBox {

  private final Long initialRecord;

  @Component( id = "newAction" )
  protected Button newAction;

  @Component( id = "saveAction" )
  protected Button saveAction;

  @Component( id = "closeAction" )
  protected Button closeAction;

  @Component( id = "revertAction" )
  protected Button revertAction;

  @Component( id = "preferencesAction" )
  protected Button preferencesAction;

  @Component( id = "quitAction" )
  protected Button quitAction;

  @Component( id = "undoAction" )
  protected Button undoAction;

  @Component( id = "redoAction" )
  protected Button redoAction;

  @Component( id = "cutAction" )
  protected Button cutAction;

  @Component( id = "copyAction" )
  protected Button copyAction;

  @Component( id = "pasteAction" )
  protected Button pasteAction;

  @Component( id = "deleteAction" )
  protected Button deleteAction;

  @Component( id = "masterView" )
  protected ListView<PortEntry> masterView;

  @Component( id = "port" )
  protected Spinner<Integer> port;

  @Component( id = "name" )
  protected TextField name;

  @Component( id = "description" )
  protected TextField description;

  @Component( id = "protocol" )
  protected ComboBox<String> protocol;

  @Component( id = "secure" )
  protected CheckBox secure;

  @Component( id = "creationDate" )
  protected TextField creationDate;

  @Component( id = "modificationDate" )
  protected TextField modificationDate;

  @Component( id = "tooltip" )
  protected Label tooltip;

  protected ExampleForm( Long initialRecord ) {

    this.initialRecord = initialRecord;
    this.setMaxSize( Double.MAX_VALUE, Double.MAX_VALUE );
  }

  // Called after initializing all fields
  protected void init() {
    this.port.setValueFactory( new IntegerSpinnerValueFactory( 1, 65535, 1024, 1 ) );
    this.protocol.setItems( FXCollections.observableArrayList(
        "tcp", "udp", "http", "pop3", "ldap", "imap", "smtp", "other" ) );
  }

  @EventsFor( {
      @EventFor( id = "newMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "newAction", action = "onAction", control = Button.class )
  } )
  protected void onNewAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "closeMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "closeAction", action = "onAction", control = Button.class )
  } )
  protected void onCloseAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "saveMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "saveAction", action = "onAction", control = Button.class )
  } )
  protected void onSaveAction( ActionEvent event) {

  }

  @EventFor( id = "saveAsMenuItem", action = "onAction", control = MenuItem.class )
  protected void onSaveAsAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "revertMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "revertAction", action = "onAction", control = Button.class )
  } )
  protected void onRevertAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "preferencesMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "preferencesAction", action = "onAction", control = Button.class )
  } )
  protected void onPreferencesAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "quitMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "quitAction", action = "onAction", control = Button.class )
  } )
  protected void onQuitAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "undoMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "undoAction", action = "onAction", control = Button.class )
  } )
  protected void onUndoAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "redoMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "redoAction", action = "onAction", control = Button.class )
  } )
  protected void onRedoAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "cutMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "cutAction", action = "onAction", control = Button.class )
  } )
  protected void onCutAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "copyMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "copyAction", action = "onAction", control = Button.class )
  } )
  protected void onCopyAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "pasteMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "pasteAction", action = "onAction", control = Button.class )
  } )
  protected void onPasteAction( ActionEvent event) {

  }

  @EventsFor( {
      @EventFor( id = "deleteMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "deleteAction", action = "onAction", control = Button.class )
  } )
  protected void onDeleteAction( ActionEvent event) {

  }

  @EventFor( id = "selectAllMenuItem", action = "onAction", control = MenuItem.class )
  protected void onSelectAllAction( ActionEvent event) {

  }

  @EventFor( id = "aboutMenuItem", action = "onAction", control = MenuItem.class )
  protected void onAboutAction( ActionEvent event) {

  }

  @EventFor( id = "masterView", action = "onMouseClicked", control = ListView.class )
  protected void onItemSelected( MouseEvent event ) {

  }

  @EventFor( id = "newRecordAction", action = "onAction", control = Button.class )
  protected void onNewRecordAction( ActionEvent event) {

  }

  @EventFor( id = "deleteRecordAction", action = "onAction", control = Button.class )
  protected void onDeleteRecordAction( ActionEvent event) {

  }

  public Long InitialRecord( ) {

    return initialRecord;
  }

}
