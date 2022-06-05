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

package cc.chordflower.weasel.javafx.runtime;

import cc.chordflower.weasel.javafx.runtime.JavaFxUtils;
import cc.chordflower.weasel.javafx.utilities.controls.*;
import cc.chordflower.weasel.javafx.utilities.layouts.ButtonBarBuilder;
import cc.chordflower.weasel.javafx.utilities.layouts.GridPaneBuilder;
import cc.chordflower.weasel.javafx.utilities.layouts.TitledPaneBuilder;
import cc.chordflower.weasel.javafx.utilities.layouts.VBoxBuilder;
import com.mscharhag.oleaster.matcher.Matchers;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.converter.LocalTimeStringConverter;
import org.javatuples.Triplet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.testfx.framework.junit5.ApplicationExtension;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@DisplayName( "#JavaFxUtils:" )
@ExtendWith(ApplicationExtension.class)
public class JavaFxUtilsTest {

  @BeforeEach
  public void openMocks() throws Exception {
    MockitoAnnotations.openMocks(this).close();
  }

  @Nested
  @DisplayName( "with a JavaFX component hierarchy" )
  public class Nested01 {

    @Test
    @DisplayName( "it should be able to search for an id in it" )
    public void test01( ) {

      List< Triplet< String, Node, ? > > provideArguments = this.provideArguments( );
      for( var i = 0; i < provideArguments.size( ); i++ ) {
        Triplet< String, Node, ? > arg = provideArguments.get( i );
        System.out.printf( "Running test %d\n", i );
        var result = JavaFxUtils.getInstance( ).lookup( arg.getValue0( ), arg.getValue1( ) );
        Matchers.expect( result.isPresent( ) ).toBeTrue( );
        Matchers.expect( result.orElse( null ) ).toBeInstanceOf( arg.getValue2( ).getClass( ) );
        Matchers.expect( result.orElse( null ) ).toEqual( arg.getValue2( ) );
      }
    }

    @Test
    @DisplayName( "it should not be able to find a non-existing id" )
    public void test02( ) {
      var firstName = TextFieldBuilder.builder( ).withId( "firstName" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );
      var result = JavaFxUtils.getInstance().lookup( "name", firstName );
      Matchers.expect( result.isPresent() ).toBeFalse();
    }

    public List< Triplet<String, Node, ?> > provideArguments() {
      var nameLabel = LabelBuilder.builder().withId( "nameLabel" ).withAlignment( Pos.TOP_CENTER ).withText( "Name" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).withPadding( new Insets( 7d, 0d, 0d, 0d ) ).build();

      var firstName = TextFieldBuilder.builder( ).withId( "firstName" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );

      var lastName = TextFieldBuilder.builder( ).withId( "lastName" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );

      var firstNameLabel = LabelBuilder.builder().withId( "firstNameLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "First Name" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var lastNameLabel = LabelBuilder.builder().withId( "lastNameLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "Last Name" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var emailLabel = LabelBuilder.builder().withId( "emailLabel" ).withAlignment( Pos.CENTER )
          .withText( "Email Label" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var email = TextFieldBuilder.builder( ).withId( "email" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );

      var roomTypeLabel = LabelBuilder.builder().withId( "roomTypeLabel" ).withAlignment( Pos.CENTER )
          .withText( "Room Type" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var roomType = ComboBoxBuilder.<String>builder().withId( "roomType" ).withVisibleRowCount( 5 )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).withItems( FXCollections.unmodifiableObservableList(
              FXCollections.observableArrayList(
                  "Single", "Double",
                  "Triple", "Quad",
                  "Queen", "King",
                  "Twin", "Double Double",
                  "Studio", "Suite" ) ) ).build();

      var numberGuestsLabel = LabelBuilder.builder().withId( "numberGuestsLabel" ).withAlignment( Pos.CENTER )
          .withText( "Number of Guests" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var numberGuests = SpinnerBuilder.<Integer>builder().withId( "numberGuests" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withValueFactory( new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 8, 1, 1) ).build();

      var arrivalDateLabel = LabelBuilder.builder().withId( "arrivalDateLabel" ).withAlignment( Pos.CENTER )
          .withText( "Arrival Date and Time" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var arrivalDate = DatePickerBuilder.builder().withId( "arrivalDate" ).withValue( LocalDate.now().plusMonths( 1 ) )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var arrivalDateTime = TextFieldBuilder.builder( ).withId( "arrivalDateTime" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withTextFormatter( new TextFormatter<>( new LocalTimeStringConverter( DateTimeFormatter.ofPattern( "HH:mm" ), null ), LocalTime.NOON ) ).build( );

      var arrivalDateDateLabel = LabelBuilder.builder().withId( "arrivalDateDateLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "Date" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var arrivalDateTimeLabel = LabelBuilder.builder().withId( "arrivalDateTimeLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "Time ( HH:MM )" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var departureLabel = LabelBuilder.builder().withId( "departureLabel" ).withAlignment( Pos.CENTER )
          .withText( "Departure Date" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var departure = DatePickerBuilder.builder().withId( "departure" ).withValue( LocalDate.now().plusMonths( 1 ) )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var observationsLabel = LabelBuilder.builder().withId( "observationsLabel" ).withAlignment( Pos.TOP_CENTER )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).withText( "Observations" ).withPadding( new Insets( 7d, 0d, 0d, 0d ) ).build();

      var observations = TextAreaBuilder.builder().withId( "observations" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      GridPane gridPane = GridPaneBuilder.builder( )
          .withId( "grid" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withHgap( 5.0d )
          .withVgap( 5.0d )
          .withPadding( new Insets( 5d, 5d, 5d, 5d ) )
          .add( nameLabel, 0, 0, 2, 2 ).add( firstName, 2, 0 ).add( lastName, 3, 0 )
          .add( firstNameLabel, 2, 1 ).add( lastNameLabel, 3, 1 )
          .add( emailLabel, 0, 2, 2, 1 ).add( email, 2, 2, 2, 1 )
          .add( roomTypeLabel, 0, 3, 2, 1 ).add( roomType, 2, 3, 2, 1 )
          .add( numberGuestsLabel, 0, 4, 2, 1 ).add( numberGuests, 2, 4, 2, 1 )
          .add( arrivalDateLabel, 0, 5, 2, 1 ).add( arrivalDate, 2, 5 ).add( arrivalDateTime, 3, 5 )
          .add( arrivalDateDateLabel, 2, 6 ).add( arrivalDateTimeLabel, 3, 6 )
          .add( departureLabel, 0, 7, 2, 1 ).add( departure, 2, 7, 2, 1 )
          .add( observationsLabel, 0, 8, 2, 2 ).add( observations, 2, 8, 2, 2 )
          .withMargin( roomTypeLabel, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( roomType, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( numberGuestsLabel, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( numberGuests, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( arrivalDateLabel, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( arrivalDate, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( arrivalDateTime, new Insets( 15d, 0d, 0d, 0d ) )
          .build( );

      Button submit = ButtonBuilder.builder( )
          .withId( "submit" )
          .withDefaultButton( true )
          .withMnemonicParsing( false )
          .withStyle( "-fx-background-color: dodgerblue; -fx-font-weight: bold;" )
          .withText( "Submit" )
          .withTextFill( Color.WHITE )
          .build( );

      Button cancel = ButtonBuilder.builder( )
          .withId( "cancel" )
          .withCancelButton( true )
          .withMnemonicParsing( false )
          .withText( "Cancel" )
          .build( );

      ButtonBar buttonBar = ButtonBarBuilder.builder( )
          .add( submit, cancel )
          .withId( "buttons" )
          .build( );

      VBox vBox = VBoxBuilder.builder( )
          .withId( "center" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .add( gridPane, buttonBar )
          .withMargin( gridPane, new Insets( 5.0d, 5.0d, 5.0d, 5.0d ) )
          .withVgrow( gridPane, Priority.ALWAYS )
          .build( );

      TitledPane titledPane = TitledPaneBuilder.builder( )
          .withId( "form" )
          .withCollapsible( false )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withText( "Hotel Booking" )
          .withFont( Font.font( 18.0d ) )
          .withContent( vBox )
          .build( );

      var example = VBoxBuilder.builder().withId( "example" ).build();

      var fileMenu = MenuBuilder.builder().withMnemonicParsing( false ).withId( "fileMenu" ).withText( "File" )
          .add( MenuItemBuilder.builder( ).withId( "newItem" ).withText( "New" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "openItem" ).withText( "Open..." ).withMnemonicParsing( false ).build( ) )
          .add( MenuBuilder.builder( ).withId( "openRecentItem" ).withText( "Open Recent" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "closeItem" ).withText( "Close" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "saveItem" ).withText( "Save" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "saveAsItem" ).withText( "Save As..." ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "revertItem" ).withText( "Revert" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "preferencesItem" ).withText( "Preferences..." ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "quitItem" ).withText( "Quit" ).withMnemonicParsing( false ).build( ) )
          .build();

      var sample = MenuItemBuilder.builder( ).withId( "copyItem" ).withText( "Copy" ).withMnemonicParsing( false ).build( );

      var editMenu = MenuBuilder.builder().withMnemonicParsing( false ).withId( "editMenu" ).withText( "Edit" )
          .add( MenuItemBuilder.builder( ).withId( "undoItem" ).withText( "Undo" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "redoItem" ).withText( "Redo" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "cutItem" ).withText( "Cut" ).withMnemonicParsing( false ).build( ) )
          .add( sample )
          .add( MenuItemBuilder.builder( ).withId( "pasteItem" ).withText( "Paste" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "deleteItem" ).withText( "Delete" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "selectAllItem" ).withText( "Select All" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "unselectAllItem" ).withText( "Unselect All" ).withMnemonicParsing( false ).build( ) )
          .build();

      var helpMenu = MenuBuilder.builder().withMnemonicParsing( false ).withId( "helpMenu" ).withText( "Help" )
          .add( MenuItemBuilder.builder( ).withId( "about" ).withText( "About" ).withMnemonicParsing( false ).build( ) )
          .build();

      var menuBar = MenuBarBuilder.builder().withId( "menuBar" ).withUseSystemMenuBar( true )
          .add( fileMenu, editMenu, helpMenu )
          .build();

      var nameLabel1 = LabelBuilder.builder().withId( "nameLabel" ).withAlignment( Pos.TOP_CENTER ).withText( "Name" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).withPadding( new Insets( 7d, 0d, 0d, 0d ) ).build();

      var firstName1 = TextFieldBuilder.builder( ).withId( "firstName" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );

      var lastName1 = TextFieldBuilder.builder( ).withId( "lastName" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );

      var firstNameLabel1 = LabelBuilder.builder().withId( "firstNameLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "First Name" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var lastNameLabel1 = LabelBuilder.builder().withId( "lastNameLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "Last Name" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var emailLabel1 = LabelBuilder.builder().withId( "emailLabel" ).withAlignment( Pos.CENTER )
          .withText( "Email Label" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var email1 = TextFieldBuilder.builder( ).withId( "email" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build( );

      var roomTypeLabel1 = LabelBuilder.builder().withId( "roomTypeLabel" ).withAlignment( Pos.CENTER )
          .withText( "Room Type" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var roomType1 = ComboBoxBuilder.<String>builder().withId( "roomType" ).withVisibleRowCount( 5 )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).withItems( FXCollections.unmodifiableObservableList(
              FXCollections.observableArrayList(
                  "Single", "Double",
                  "Triple", "Quad",
                  "Queen", "King",
                  "Twin", "Double Double",
                  "Studio", "Suite" ) ) ).build();

      var numberGuestsLabel1 = LabelBuilder.builder().withId( "numberGuestsLabel" ).withAlignment( Pos.CENTER )
          .withText( "Number of Guests" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var numberGuests1 = SpinnerBuilder.<Integer>builder().withId( "numberGuests" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withValueFactory( new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 8, 1, 1) ).build();

      var arrivalDateLabel1 = LabelBuilder.builder().withId( "arrivalDateLabel" ).withAlignment( Pos.CENTER )
          .withText( "Arrival Date and Time" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var arrivalDate1 = DatePickerBuilder.builder().withId( "arrivalDate" ).withValue( LocalDate.now().plusMonths( 1 ) )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var arrivalDateTime1 = TextFieldBuilder.builder( ).withId( "arrivalDateTime" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withTextFormatter( new TextFormatter<>( new LocalTimeStringConverter( DateTimeFormatter.ofPattern( "HH:mm" ), null ), LocalTime.NOON ) ).build( );

      var arrivalDateDateLabel1 = LabelBuilder.builder().withId( "arrivalDateDateLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "Date" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var arrivalDateTimeLabel1 = LabelBuilder.builder().withId( "arrivalDateTimeLabel" ).withAlignment( Pos.TOP_LEFT )
          .withText( "Time ( HH:MM )" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var departureLabel1 = LabelBuilder.builder().withId( "departureLabel" ).withAlignment( Pos.CENTER )
          .withText( "Departure Date" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var departure1 = DatePickerBuilder.builder().withId( "departure" ).withValue( LocalDate.now().plusMonths( 1 ) )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      var observationsLabel1 = LabelBuilder.builder().withId( "observationsLabel" ).withAlignment( Pos.TOP_CENTER )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).withText( "Observations" ).withPadding( new Insets( 7d, 0d, 0d, 0d ) ).build();

      var observations1 = TextAreaBuilder.builder().withId( "observations" ).withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE ).build();

      GridPane gridPane1 = GridPaneBuilder.builder( )
          .withId( "grid" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withHgap( 5.0d )
          .withVgap( 5.0d )
          .withPadding( new Insets( 5d, 5d, 5d, 5d ) )
          .add( nameLabel1, 0, 0, 2, 2 ).add( firstName1, 2, 0 ).add( lastName1, 3, 0 )
          .add( firstNameLabel1, 2, 1 ).add( lastNameLabel1, 3, 1 )
          .add( emailLabel1, 0, 2, 2, 1 ).add( email1, 2, 2, 2, 1 )
          .add( roomTypeLabel1, 0, 3, 2, 1 ).add( roomType1, 2, 3, 2, 1 )
          .add( numberGuestsLabel1, 0, 4, 2, 1 ).add( numberGuests1, 2, 4, 2, 1 )
          .add( arrivalDateLabel1, 0, 5, 2, 1 ).add( arrivalDate1, 2, 5 ).add( arrivalDateTime1, 3, 5 )
          .add( arrivalDateDateLabel1, 2, 6 ).add( arrivalDateTimeLabel1, 3, 6 )
          .add( departureLabel1, 0, 7, 2, 1 ).add( departure1, 2, 7, 2, 1 )
          .add( observationsLabel1, 0, 8, 2, 2 ).add( observations1, 2, 8, 2, 2 )
          .withMargin( roomTypeLabel1, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( roomType1, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( numberGuestsLabel1, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( numberGuests1, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( arrivalDateLabel1, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( arrivalDate1, new Insets( 15d, 0d, 0d, 0d ) )
          .withMargin( arrivalDateTime1, new Insets( 15d, 0d, 0d, 0d ) )
          .build( );

      Button submit1 = ButtonBuilder.builder( )
          .withId( "submit" )
          .withDefaultButton( true )
          .withMnemonicParsing( false )
          .withStyle( "-fx-background-color: dodgerblue; -fx-font-weight: bold;" )
          .withText( "Submit" )
          .withTextFill( Color.WHITE )
          .build( );

      Button cancel1 = ButtonBuilder.builder( )
          .withId( "cancel" )
          .withCancelButton( true )
          .withMnemonicParsing( false )
          .withText( "Cancel" )
          .build( );

      ButtonBar buttonBar1 = ButtonBarBuilder.builder( )
          .add( submit1, cancel1 )
          .withId( "buttons" )
          .build( );

      VBox vBox1 = VBoxBuilder.builder( )
          .withId( "center" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .add( menuBar, gridPane1, buttonBar1 )
          .withMargin( gridPane, new Insets( 5.0d, 5.0d, 5.0d, 5.0d ) )
          .withVgrow( gridPane, Priority.ALWAYS )
          .build( );

      TitledPane titledPane1 = TitledPaneBuilder.builder( )
          .withId( "form" )
          .withCollapsible( false )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .withText( "Hotel Booking" )
          .withFont( Font.font( 18.0d ) )
          .withContent( vBox1 )
          .build( );

      var fileMenu1 = MenuBuilder.builder().withMnemonicParsing( false ).withId( "fileMenu" ).withText( "File" )
          .add( MenuItemBuilder.builder( ).withId( "newItem" ).withText( "New" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "openItem" ).withText( "Open..." ).withMnemonicParsing( false ).build( ) )
          .add( MenuBuilder.builder( ).withId( "openRecentItem" ).withText( "Open Recent" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "closeItem" ).withText( "Close" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "saveItem" ).withText( "Save" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "saveAsItem" ).withText( "Save As..." ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "revertItem" ).withText( "Revert" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "preferencesItem" ).withText( "Preferences..." ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "quitItem" ).withText( "Quit" ).withMnemonicParsing( false ).build( ) )
          .build();

      var sample1 = MenuItemBuilder.builder( ).withId( "copyItem" ).withText( "Copy" ).withMnemonicParsing( false ).build( );

      var editMenu1 = MenuBuilder.builder().withMnemonicParsing( false ).withId( "editMenu" ).withText( "Edit" )
          .add( MenuItemBuilder.builder( ).withId( "undoItem" ).withText( "Undo" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "redoItem" ).withText( "Redo" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "cutItem" ).withText( "Cut" ).withMnemonicParsing( false ).build( ) )
          .add( sample1 )
          .add( MenuItemBuilder.builder( ).withId( "pasteItem" ).withText( "Paste" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "deleteItem" ).withText( "Delete" ).withMnemonicParsing( false ).build( ) )
          .add( SeparatorMenuItemBuilder.builder( ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "selectAllItem" ).withText( "Select All" ).withMnemonicParsing( false ).build( ) )
          .add( MenuItemBuilder.builder( ).withId( "unselectAllItem" ).withText( "Unselect All" ).withMnemonicParsing( false ).build( ) )
          .build();

      var helpMenu1 = MenuBuilder.builder().withMnemonicParsing( false ).withId( "helpMenu" ).withText( "Help" )
          .add( MenuItemBuilder.builder( ).withId( "about" ).withText( "About" ).withMnemonicParsing( false ).build( ) )
          .build();

      var menuBar1 = MenuBarBuilder.builder().withId( "menuBar" ).withUseSystemMenuBar( true )
          .add( fileMenu1, editMenu1, helpMenu1 )
          .build();

      VBox vBox2 = VBoxBuilder.builder( )
          .withId( "center" )
          .withMaxSize( Double.MAX_VALUE, Double.MAX_VALUE )
          .add( menuBar1 )
          .withMargin( gridPane, new Insets( 5.0d, 5.0d, 5.0d, 5.0d ) )
          .withVgrow( gridPane, Priority.ALWAYS )
          .build( );
/*
Things that we need to test for:

- Single nodes;
- Parent nodes without children;
- Parent nodes with some children;
- Menus;
- Parent nodes with menus;
- Parent nodes with menus and children;

- Parameters:
  - id, root, expectedNode
 */

      return Arrays.asList(
          Triplet.with( "lastNameLabel", lastNameLabel, lastNameLabel ),
          Triplet.with( "example", example, example ),
          Triplet.with( "nameLabel", titledPane, nameLabel ),
          Triplet.with( "email", titledPane, email ),
          Triplet.with( "submit", titledPane, submit ),
          Triplet.with( "editMenu", menuBar, editMenu ),
          Triplet.with( "copyItem", menuBar, sample ),
          Triplet.with( "editMenu", vBox2, editMenu1 ),
          Triplet.with( "copyItem", vBox2, sample1 ),
          Triplet.with( "editMenu", titledPane1, editMenu ),
          Triplet.with( "copyItem", titledPane1, sample ),
          Triplet.with( "nameLabel", titledPane1, nameLabel1 ),
          Triplet.with( "email", titledPane1, email1 ),
          Triplet.with( "submit", titledPane1, submit1 )
      );
    }

  }

}
