# Utilities

There are several utilities available inside the module weasel-javafx-runtime:

- Annotations to support the processor;
- Builders that enable one to create JavaFX controls in a fluent style.

## Annotations

The annotations that support the processor, have all source retention, meaning that they are not
available at runtime, and are:

- Component;
- EventFor;
- EventsFor;
- View.

They are described in more detail in the page about the processor.

## Fluent Builders

In the packages:

- cc.chordflower.weasel.javafx.utilities.chart;
- cc.chordflower.weasel.javafx.utilities.controls;
- cc.chordflower.weasel.javafx.utilities.layouts.

There are builders, for:

- Chart based components;
- JavaFX controls;
- JavaFX layouts.

That allow to set properties in a fluent style, using **with** methods, that return the own builder, like the example 
bellow:

~~~java
public final class MenuItemBuilder {

  public static @NotNull MenuItemBuilder builder( ); // ...

  public MenuItem build( ); // ...

  public MenuItemBuilder withId( String value ); // ...

  public MenuItemBuilder withStyle( String value ); // ...

  public MenuItemBuilder withText( String value ); // ...

  public MenuItemBuilder withGraphic( Node value ); // ...

  public MenuItemBuilder withOnAction( EventHandler< ActionEvent > value ); // ...

  public MenuItemBuilder withOnMenuValidation( EventHandler< Event > value ); // ...

  public MenuItemBuilder withDisable( boolean value ); // ...

  public MenuItemBuilder withVisible( boolean value ); // ...

  public MenuItemBuilder withAccelerator( KeyCombination value ); // ...

  public MenuItemBuilder withMnemonicParsing( boolean value ); // ...

  public MenuItemBuilder withUserData( Object value ); // ...
}
~~~

Allowing one to use code like the following, for creating a component:

~~~java
public class Example {
  
  public Example() {
    var menuItem = MenuItemBuilder.builder().withId( "newFileItem" ).withText( "New..." ).build();
  }
}
~~~

Instead of:

~~~java
public class Example {
  
  public Example() {
    var menuItem = new MenuItem();
    menuItem.setId("newFileItem");
    menuItem.setText("New...");
  }
}
~~~

And there is one for each standard component of JavaFX.