# Annotation Processor

This section describes the annotation processor and how to use it.

## Available Annotations

The available annotations for the annotation processor are:

- View => Which describes a view class associated with a fxml file;
- Component => Describes a field of a view class, that is binded to a specific fxml component;
- EventFor => Describes a method of a view class, that is a listener to a event that a specific fxml component emits;
- EventsFor => Describes a method of a view class, that is a listener to various events from different fxml components;

Notice, that the id's that the annotation work with are **not fx:id** but the id field of the component.

Note that, you may have a listener for a fxml component, that isn't associated with a component annotation.

For example:

~~~java
@View( name = "example_form.fxml")
public abstract class ExampleWindow extends VBox {

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
  protected void onNewAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "closeMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "closeAction", action = "onAction", control = Button.class )
  } )
  protected void onCloseAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "saveMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "saveAction", action = "onAction", control = Button.class )
  } )
  protected void onSaveAction( ActionEvent event) { }

  @EventFor( id = "saveAsMenuItem", action = "onAction", control = MenuItem.class )
  protected void onSaveAsAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "revertMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "revertAction", action = "onAction", control = Button.class )
  } )
  protected void onRevertAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "preferencesMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "preferencesAction", action = "onAction", control = Button.class )
  } )
  protected void onPreferencesAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "quitMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "quitAction", action = "onAction", control = Button.class )
  } )
  protected void onQuitAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "undoMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "undoAction", action = "onAction", control = Button.class )
  } )
  protected void onUndoAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "redoMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "redoAction", action = "onAction", control = Button.class )
  } )
  protected void onRedoAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "cutMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "cutAction", action = "onAction", control = Button.class )
  } )
  protected void onCutAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "copyMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "copyAction", action = "onAction", control = Button.class )
  } )
  protected void onCopyAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "pasteMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "pasteAction", action = "onAction", control = Button.class )
  } )
  protected void onPasteAction( ActionEvent event) { }

  @EventsFor( {
      @EventFor( id = "deleteMenuItem", action = "onAction", control = MenuItem.class ),
      @EventFor( id = "deleteAction", action = "onAction", control = Button.class )
  } )
  protected void onDeleteAction( ActionEvent event) { }

  @EventFor( id = "selectAllMenuItem", action = "onAction", control = MenuItem.class )
  protected void onSelectAllAction( ActionEvent event) { }

  @EventFor( id = "aboutMenuItem", action = "onAction", control = MenuItem.class )
  protected void onAboutAction( ActionEvent event) { }

  @EventFor( id = "masterView", action = "onMouseClicked", control = ListView.class )
  protected void onItemSelected( MouseEvent event ) { }

  @EventFor( id = "newRecordAction", action = "onAction", control = Button.class )
  protected void onNewRecordAction( ActionEvent event) { }

  @EventFor( id = "deleteRecordAction", action = "onAction", control = Button.class )
  protected void onDeleteRecordAction( ActionEvent event) { }
  
}
~~~

Where the following **MUST** be true from a class containing the view annotation:

- The class **MUST** extend from the root element specified in the fxml file, in this case a VBox;
- The class **MUST** be public;
- It is **ADVISABLE** from the class to be abstract, so that no instances of it can be directly created;
- Any field annotated with **Component** **MUST** be protected or public, so that it can be accessible in the class created by the processor;
- The constructor **MUST** be protected or public, if it exists;
- The constructor **MAY** have any number of parameters, and in that case the class generated by the processor, will have those same parameters;
- The class **MAY** have a protected or public method named init, that is void and has no parameters, that will be called, after all components
  and events are bound, think of it as a post-construct;
- The methods annotated with **EventFor** or **EventsFor**, **MUST** be protected or public and have a compatible signature for the event they are for.

Also, for the example above, the given class will be generated:

~~~java
/**
 * This type contains the implementation of the view class without the View annotation
 * as generated by the weasel-javafx-processor
 */
@Generated(
    value = "weasel-javafx-processor",
    date = "2022-05-07",
    comments = "Can't touch this!"
)
@Named("exampleForm")
public final class ExampleFormWeasel extends ExampleForm {
  @Inject
  public ExampleFormWeasel(Long initialRecord) {
    super(initialRecord);
    // Attempt to load the given fxml file, inside the root provided by this view
    FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "example_form.fxml" ) );
    fxmlLoader.setRoot( this );
    fxmlLoader.setController( this );
    try {
      fxmlLoader.load();
    } catch( IOException ex ) {
      throw new RuntimeException(ex);
    }

    // Inject the fields from the fxml
    this.newAction = JavaFxUtils.getInstance().<Button>lookup( "#newAction", this ).get();
    this.saveAction = JavaFxUtils.getInstance().<Button>lookup( "#saveAction", this ).get();
    this.closeAction = JavaFxUtils.getInstance().<Button>lookup( "#closeAction", this ).get();
    this.revertAction = JavaFxUtils.getInstance().<Button>lookup( "#revertAction", this ).get();
    this.preferencesAction = JavaFxUtils.getInstance().<Button>lookup( "#preferencesAction", this ).get();
    this.quitAction = JavaFxUtils.getInstance().<Button>lookup( "#quitAction", this ).get();
    this.undoAction = JavaFxUtils.getInstance().<Button>lookup( "#undoAction", this ).get();
    this.redoAction = JavaFxUtils.getInstance().<Button>lookup( "#redoAction", this ).get();
    this.cutAction = JavaFxUtils.getInstance().<Button>lookup( "#cutAction", this ).get();
    this.copyAction = JavaFxUtils.getInstance().<Button>lookup( "#copyAction", this ).get();
    this.pasteAction = JavaFxUtils.getInstance().<Button>lookup( "#pasteAction", this ).get();
    this.deleteAction = JavaFxUtils.getInstance().<Button>lookup( "#deleteAction", this ).get();
    this.masterView = JavaFxUtils.getInstance().<ListView<PortEntry>>lookup( "#masterView", this ).get();
    this.port = JavaFxUtils.getInstance().<Spinner<Integer>>lookup( "#port", this ).get();
    this.name = JavaFxUtils.getInstance().<TextField>lookup( "#name", this ).get();
    this.description = JavaFxUtils.getInstance().<TextField>lookup( "#description", this ).get();
    this.protocol = JavaFxUtils.getInstance().<ComboBox<String>>lookup( "#protocol", this ).get();
    this.secure = JavaFxUtils.getInstance().<CheckBox>lookup( "#secure", this ).get();
    this.creationDate = JavaFxUtils.getInstance().<TextField>lookup( "#creationDate", this ).get();
    this.modificationDate = JavaFxUtils.getInstance().<TextField>lookup( "#modificationDate", this ).get();
    this.tooltip = JavaFxUtils.getInstance().<Label>lookup( "#tooltip", this ).get();

    // Inject the events in the proper event handler
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#saveAsMenuItem", this ).get()).onActionProperty().set( this::onSaveAsAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#selectAllMenuItem", this ).get()).onActionProperty().set( this::onSelectAllAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#aboutMenuItem", this ).get()).onActionProperty().set( this::onAboutAction );
    (JavaFxUtils.getInstance().<ListView>lookup( "#masterView", this ).get()).onMouseClickedProperty().set( this::onItemSelected );
    (JavaFxUtils.getInstance().<Button>lookup( "#newRecordAction", this ).get()).onActionProperty().set( this::onNewRecordAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#deleteRecordAction", this ).get()).onActionProperty().set( this::onDeleteRecordAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#newMenuItem", this ).get()).onActionProperty().set( this::onNewAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#newAction", this ).get()).onActionProperty().set( this::onNewAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#closeMenuItem", this ).get()).onActionProperty().set( this::onCloseAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#closeAction", this ).get()).onActionProperty().set( this::onCloseAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#saveMenuItem", this ).get()).onActionProperty().set( this::onSaveAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#saveAction", this ).get()).onActionProperty().set( this::onSaveAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#revertMenuItem", this ).get()).onActionProperty().set( this::onRevertAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#revertAction", this ).get()).onActionProperty().set( this::onRevertAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#preferencesMenuItem", this ).get()).onActionProperty().set( this::onPreferencesAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#preferencesAction", this ).get()).onActionProperty().set( this::onPreferencesAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#quitMenuItem", this ).get()).onActionProperty().set( this::onQuitAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#quitAction", this ).get()).onActionProperty().set( this::onQuitAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#undoMenuItem", this ).get()).onActionProperty().set( this::onUndoAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#undoAction", this ).get()).onActionProperty().set( this::onUndoAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#redoMenuItem", this ).get()).onActionProperty().set( this::onRedoAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#redoAction", this ).get()).onActionProperty().set( this::onRedoAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#cutMenuItem", this ).get()).onActionProperty().set( this::onCutAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#cutAction", this ).get()).onActionProperty().set( this::onCutAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#copyMenuItem", this ).get()).onActionProperty().set( this::onCopyAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#copyAction", this ).get()).onActionProperty().set( this::onCopyAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#pasteMenuItem", this ).get()).onActionProperty().set( this::onPasteAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#pasteAction", this ).get()).onActionProperty().set( this::onPasteAction );
    (JavaFxUtils.getInstance().<MenuItem>lookup( "#deleteMenuItem", this ).get()).onActionProperty().set( this::onDeleteAction );
    (JavaFxUtils.getInstance().<Button>lookup( "#deleteAction", this ).get()).onActionProperty().set( this::onDeleteAction );

    // Call the init method
    this.init();
  }
}
~~~

As noted in the example above, the generated class:

- Will always be named **[BaseClass]**Weasel, and extend from the class annotated with View.
- Next, we will try to load the fxml file, described in the View annotation, setting the root and controller as the own
  class;
- Following this the fields annotated with Component will be injected;
- Then, the events will be bound to the respective methods;
- And finally the init method if present, will be called.
- Note, that the created class will have the Named annotation and its constructor the Inject annotation, since it
  is meant for weasel, to be used with a javax.inject dependency injector, preferably Dagger, since it is in the same
  spirit as weasel.
