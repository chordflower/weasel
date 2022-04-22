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

package cc.chordflower.robodog.utils.reflection.runtime;

import cc.chordflower.robodog.utils.reflection.*;
import com.google.common.base.CaseFormat;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Streams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Optional;

@SuppressWarnings( "unchecked" )
public class RuntimeTypeInformation< T > extends TypeInformation {

  private final Class< T > type;

  private final ImmutableMultiset< Annotation > annotations;

  private final String name;

  private final String qualifiedName;

  private final String packageName;

  private final TypeKindsEnum kind;

  private final ImmutableSet< TypeModifiersEnum > modifiers;

  private ImmutableSet< FieldInformation< ? > > fields;

  private ImmutableSet< MethodInformation< ? > > methods;

  private ImmutableSet< PropertyInformation< ? > > properties;

  private ImmutableSet< ConstructorInformation > constructors;

  @SuppressWarnings( "rawtypes" )
  public RuntimeTypeInformation( Class< T > type, boolean initialized ) {
    this.type = type;
    this.name = type.getSimpleName();
    this.qualifiedName = type.getCanonicalName();
    this.packageName = type.getPackage().getName();
    if( type.isEnum() ) {
      this.kind = TypeKindsEnum.ENUM;
    } else if( type.isInterface() ) {
      this.kind = TypeKindsEnum.INTERFACE;
    } else if( type.isRecord() ) {
      this.kind = TypeKindsEnum.RECORD;
    } else {
      this.kind = TypeKindsEnum.CLASS;
    }
    this.modifiers = ReflectionUtils.getSetFromModifiers( type.getModifiers() );
    this.annotations = Arrays.stream( type.getAnnotations( ) ).collect( ImmutableMultiset.toImmutableMultiset() );
    if( initialized ) {

      this.fields = Streams.concat( Arrays.stream( type.getDeclaredFields() ), Arrays.stream( type.getFields( ) ) ).distinct()
          .filter( f -> !f.trySetAccessible( ) )
          .map( f -> new RuntimeFieldInformation<>( f, true, f.getType() ) )
          .collect( ImmutableSet.toImmutableSet() );

      this.methods = Streams.concat( Arrays.stream( type.getDeclaredMethods() ), Arrays.stream( type.getMethods() ) ).distinct()
          .filter( m -> !m.trySetAccessible() )
          .map( m -> new RuntimeMethodInformation<>( m, true, m.getReturnType() ) )
          .collect( ImmutableSet.toImmutableSet() );

      this.constructors = Streams.concat( Arrays.stream( type.getDeclaredConstructors() ), Arrays.stream( type.getConstructors() ) ).distinct()
          .filter( m -> !m.trySetAccessible() )
          .map( m -> new RuntimeConstructorInformation( m, true ) )
          .collect( ImmutableSet.toImmutableSet() );

      var prop = Sets.<PropertyInformation<?>>newHashSet( );
      for( FieldInformation< ? > field : this.fields ) {
        var getter = this.methods.stream()
            .filter( m -> ( m.Name().equals( CaseFormat.LOWER_CAMEL.to( CaseFormat.UPPER_CAMEL, field.Name() ) ) ||
                m.Name().equals( String.format( "get%s", field.Name() ) ) ||
                m.Name().equals( String.format( "is%s", field.Name() ) ) ) &&
                m.ReturnType().equals( field.FieldType() ) &&
                !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                m.Parameters().isEmpty() )
            .findFirst();
        if( getter.isPresent( ) ) {
          if( field.Modifiers( ).contains( TypeModifiersEnum.FINAL ) ) {
            prop.add( new RuntimePropertyInformation( field, getter.get(), null, true, field.FieldType() ) );
          } else {
            var setter = this.methods.stream()
                .filter( m -> m.Name().equals( String.format( "set%s", field.Name() ) ) &&
                    m.ReturnType().equals( Void.class ) &&
                    !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                    m.Parameters().size() == 1 &&
                    m.Parameters().stream( ).anyMatch( p -> p.ParameterType().equals( field.FieldType() ) ) )
                .findFirst();
            setter.ifPresent( sett -> prop.add( new RuntimePropertyInformation( field, getter.get( ), sett, true, field.FieldType() ) ) );
          }
        }
      }
      this.properties = ImmutableSet.copyOf( prop );
    }
  }

  /**
   * All annotations available in the type.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableMultiset< Annotation > Annotations( ) {
    return this.annotations;
  }

  /**
   * Checks if the type has the given annotation.
   *
   * @param annotationType The annotation type to check.
   * @return True if this annotation is in this type, false otherwise.
   */
  @Override
  public < A extends Annotation > boolean hasAnnotation( @NotNull Class< A > annotationType ) {
    return this.type.getAnnotation( annotationType ) != null;
  }

  /**
   * Returns the annotation referenced by the argument.
   *
   * @param annotationType The annotation to return.
   * @return The annotation referenced by the argument or an empty optional, if there isn't any on this type.
   */
  @Override
  public @NotNull < A extends Annotation > Optional< A > Annotation( @NotNull Class< A > annotationType ) {
    return Optional.ofNullable( this.type.getAnnotation( annotationType ) );
  }

  /**
   * Simple name of the type.
   */
  @Override
  public @NotNull String Name( ) {
    return this.name;
  }

  /**
   * The qualified name of the type.
   */
  @Override
  public @NotNull String QualifiedName( ) {
    return this.qualifiedName;
  }

  /**
   * The package name of the type.
   */
  @Override
  public @NotNull String PackageName( ) {
    return this.packageName;
  }

  /**
   * The kind of the referenced type.
   */
  @Override
  public @NotNull TypeKindsEnum Type( ) {
    return this.kind;
  }

  /**
   * The type modifiers.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< TypeModifiersEnum > Modifiers( ) {
    return this.modifiers;
  }

  /**
   * The type fields.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< FieldInformation< ? > > Fields( ) {
    if( this.fields == null ) {
      this.fields = Streams.concat( Arrays.stream( type.getDeclaredFields() ), Arrays.stream( type.getFields( ) ) ).distinct()
          .filter( f -> !f.trySetAccessible( ) )
          .map( f -> new RuntimeFieldInformation<>( f, false, f.getType() ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.fields;
  }

  /**
   * The type methods.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< MethodInformation< ? > > Methods( ) {
    if( this.methods == null ) {
      this.methods = Streams.concat( Arrays.stream( type.getDeclaredMethods() ), Arrays.stream( type.getMethods() ) ).distinct()
          .filter( m -> !m.trySetAccessible() )
          .map( m -> new RuntimeMethodInformation<>( m, false, m.getReturnType() ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.methods;
  }

  /**
   * The type constructors.
   */
  @Override
  public @Unmodifiable @NotNull ImmutableSet< ConstructorInformation > Constructors( ) {
    if( this.constructors == null ) {
      this.constructors = Streams.concat( Arrays.stream( type.getDeclaredConstructors() ), Arrays.stream( type.getConstructors() ) ).distinct()
          .filter( m -> !m.trySetAccessible() )
          .map( m -> new RuntimeConstructorInformation( m, false ) )
          .collect( ImmutableSet.toImmutableSet() );
    }
    return this.constructors;
  }

  /**
   * The type properties.
   */
  @SuppressWarnings( "rawtypes" )
  @Override
  public @Unmodifiable @NotNull ImmutableSet< PropertyInformation< ? > > Properties( ) {
    if( this.properties == null ) {
      var prop = Sets.<PropertyInformation<?>>newHashSet( );
      for( FieldInformation< ? > field : this.Fields() ) {
        var getter = this.Methods().stream()
            .filter( m -> ( m.Name().equals( CaseFormat.LOWER_CAMEL.to( CaseFormat.UPPER_CAMEL, field.Name() ) ) ||
                m.Name().equals( String.format( "get%s", field.Name() ) ) ||
                m.Name().equals( String.format( "is%s", field.Name() ) ) ) &&
                m.ReturnType().equals( field.FieldType() ) &&
                !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                m.Parameters().isEmpty() )
            .findFirst();
        if( getter.isPresent( ) ) {
          if( field.Modifiers( ).contains( TypeModifiersEnum.FINAL ) ) {
            prop.add( new RuntimePropertyInformation( field, getter.get(), null, true, field.FieldType() ) );
          } else {
            var setter = this.Methods().stream()
                .filter( m -> m.Name().equals( String.format( "set%s", field.Name() ) ) &&
                    m.ReturnType().equals( Void.class ) &&
                    !m.Modifiers().contains( TypeModifiersEnum.STATIC ) &&
                    m.Parameters().size() == 1 &&
                    m.Parameters().stream( ).anyMatch( p -> p.ParameterType().equals( field.FieldType() ) ) )
                .findFirst();
            setter.ifPresent( sett -> prop.add( new RuntimePropertyInformation( field, getter.get( ), sett, true, field.FieldType() ) ) );
          }
        }
      }
      this.properties = ImmutableSet.copyOf( prop );
    }
    return this.properties;
  }

}
