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
 */
package cc.chordflower.werwolf.javafx.test;

import cc.chordflower.robodog.javafx.annotations.Component;
import cc.chordflower.robodog.javafx.annotations.EventFor;
import cc.chordflower.robodog.javafx.annotations.View;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * This is a test window for experimenting with werwolf annotations...
 */
@View( name="main_window.fxml" ) // Specifies a view component, with the given fxml component
public abstract class MainWindow extends VBox {

  @Component( id="menuBar" ) // Injects the component with the given id from the fxml into this component.
  protected MenuBar menuBar;

  @Component( id="toolbar" )
  protected ToolBar toolbar;

  @Component( id="centerPane" )
  protected SplitPane centerPane;

  @Component( id="statusBar" )
  protected HBox statusBar;

  @Component( id="sidebar" )
  protected TreeView<String> sidebar;

  /**
   * The default constructor
   */
  protected MainWindow() {
  }

  @EventFor( id="aboutMenuEntry", action="onAction", control = MenuItem.class ) // Annotation that describes the event to listen to
  public void onAboutAction( ActionEvent event) {

  }

  @EventFor( id="closeMenuEntry", action="onAction", control = MenuItem.class )
  public void onCloseAction(ActionEvent event) {

  }

  @EventFor( id="closeTabMenuEntry", action="onAction", control = MenuItem.class )
  public void onCloseTabAction(ActionEvent event) {

  }

  @EventFor( id="copyMenuEntry", action="onAction", control = MenuItem.class )
  public void onCopyAction(ActionEvent event) {

  }

  @EventFor( id="customizeToolbarMenuEntry", action="onAction", control = MenuItem.class )
  public void onCustomizeToolbarAction(ActionEvent event) {

  }

  @EventFor( id="cutMenuEntry", action="onAction", control = MenuItem.class )
  public void onCutAction(ActionEvent event) {

  }

  @EventFor( id="deleteMenuEntry", action="onAction", control = MenuItem.class )
  public void onDeleteAction(ActionEvent event) {

  }

  @EventFor( id="enterExitFullScreenMenuEntry", action="onAction", control = MenuItem.class )
  public void onEnterExitFullScreenAction(ActionEvent event) {

  }

  @EventFor( id="exportAsMenuEntry", action="onAction", control = MenuItem.class )
  public void onExportAsAction(ActionEvent event) {

  }

  @EventFor( id="findMenuOption", action="onAction", control = MenuItem.class )
  public void onFindAction(ActionEvent event) {

  }

  @EventFor( id="findReplaceMenuEntry", action="onAction", control = MenuItem.class )
  public void onFindAndReplaceAction(ActionEvent event) {

  }

  @EventFor( id="findNextMenuEntry", action="onAction", control = MenuItem.class )
  public void onFindNextAction(ActionEvent event) {

  }

  @EventFor( id="findPreviousMenuEntry", action="onAction", control = MenuItem.class )
  public void onFindPreviousAction(ActionEvent event) {

  }

  @EventFor( id="helpMenuEntry", action="onAction", control = MenuItem.class )
  public void onHelpAction(ActionEvent event) {

  }

  @EventFor( id="hideMenuEntry", action="onAction", control = MenuItem.class )
  public void onHideAppAction(ActionEvent event) {

  }

  @EventFor( id="hideOthersMenuEntry", action="onAction", control = MenuItem.class )
  public void onHideOthersAction(ActionEvent event) {

  }

  @EventFor( id="newMenuEntry", action="onAction", control = MenuItem.class )
  public void onNewAction(ActionEvent event) {

  }

  @EventFor( id="pageSetupMenuEntry", action="onAction", control = MenuItem.class )
  public void onPageSetupAction(ActionEvent event) {

  }

  @EventFor( id="pasteMenuEntry", action="onAction", control = MenuItem.class )
  public void onPasteAction(ActionEvent event) {

  }

  @EventFor( id="printMenuEntry", action="onAction", control = MenuItem.class )
  public void onPrintAction(ActionEvent event) {

  }

  @EventFor( id="quitMenuEntry", action="onAction", control = MenuItem.class )
  public void onQuitAppAction(ActionEvent event) {

  }

  @EventFor( id="redoMenuEntry", action="onAction", control = MenuItem.class )
  public void onRedoAction(ActionEvent event) {

  }

  @EventFor( id="selectAllMenuEntry", action="onAction", control = MenuItem.class )
  public void onSelectAllAction(ActionEvent event) {

  }

  @EventFor( id="servicesMenuItem", action="onAction", control = MenuItem.class )
  public void onServicesAction(ActionEvent event) {

  }

  @EventFor( id="showAllMenuEntry", action="onAction", control = MenuItem.class )
  public void onShowAllAction(ActionEvent event) {

  }

  @EventFor( id="showHideToolbarMenuEntry", action="onAction", control = MenuItem.class )
  public void onShowHideToolbarAction(ActionEvent event) {

  }

  @EventFor( id="undoMenuEntry", action="onAction", control = MenuItem.class )
  public void onUndoAction(ActionEvent event) {

  }

  protected MenuBar getMenuBar( ) {
    return this.menuBar;
  }

}
