# Reflection Utilities

There is a set of reflection utilities in this module, that are based on TypeInformation, particularly
its two static methods:

~~~java
public class TypeInformation {

  // ...

  public static < T > TypeInformation getTypeInformation( Class< T > type, boolean initialized );

  public static TypeInformation getTypeInformation( TypeElement type, boolean initialized );

}

~~~

Where:

1. The first method, returns an type information that uses reflection to operate;
2. The second method, returns an type information that uses mirrors to operate, and therefore useful in annotation processors;

Aditionally they take an extra boolean parameters, to indicate if expensive operations, like extracting all methods,
fields and properties should be done at initialization or only when the respective methods are called.

Note that, for a mirrored field information, obtained using either:

- The method Fields from the TypeInformation;
- The method FieldInformation from the TypeInformation.

The result of the method FieldType may be inaccurate, so a method named Field is also available, that returns the
corresponding VariableElement, if you need it.