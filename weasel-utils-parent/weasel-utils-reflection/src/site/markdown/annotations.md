# Generic Annotations

In the utils module, there is one annotation that can be useful to annotate generic types, so that one can at runtime
find out the specific type of the generic.
For example in types:

~~~java
import cc.chordflower.weasel.utils.reflection.annotations.GenericParameter;

@GenericParameter( String.class )
public class Example extends Optional< String > {

}
~~~

Or in fields:

~~~java
import cc.chordflower.weasel.utils.reflection.annotations.GenericParameter;

public class Example {

  @GenericParameter( Integer.class )
  public List< Integer > sequences;

}
~~~

Or in method parameters:

~~~java

import cc.chordflower.weasel.utils.reflection.annotations.GenericParameter;

public class Example {

  public void doStuff( @GenericParameter( Integer.class ) List< Integer > sequence ) {

  }

}
~~~

Or in methods, to indicate the generic return type:

~~~java

import cc.chordflower.weasel.utils.reflection.annotations.GenericParameter;

import java.util.List;

public class Example {

  @GenericParameter( Integer.class )
  public List< Integer > doStuff( int... args ) {

    return List.of( args );
  }

}
~~~

Note that, by default there are no other utilities to specifically use this information, they merely serve to help the 
user for whatever purpose he/she sees fit.