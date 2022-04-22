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

package cc.chordflower.robodog.utils.reflection;

import cc.chordflower.robodog.utils.ExceptionUtils;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.jetbrains.annotations.ApiStatus.AvailableSince;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import java.lang.reflect.Modifier;

/**
 * Utility class with some static methods used on this package.
 */
@SuppressWarnings( "unchecked" )
@AvailableSince( "0.1.0" )
@Internal
public class ReflectionUtils {

  @Contract( pure = true )
  private ReflectionUtils() { }

  /**
   * Returns a set of type modifiers given a int of modifiers.
   * @param modifiers The int modifiers.
   * @return A set of type modifiers.
   */
  public static @NotNull ImmutableSet< TypeModifiersEnum > getSetFromModifiers( int modifiers ) {
    var mods = Sets.<TypeModifiersEnum>newHashSet( );

    // PUBLIC
    if( Modifier.isPublic( modifiers ) ) {
      mods.add( TypeModifiersEnum.PUBLIC );
    }

    // PROTECTED
    if( Modifier.isProtected( modifiers ) ) {
      mods.add( TypeModifiersEnum.PROTECTED );
    }

    // PRIVATE
    if( Modifier.isPrivate( modifiers ) ) {
      mods.add( TypeModifiersEnum.PRIVATE );
    }

    // ABSTRACT
    if( Modifier.isAbstract( modifiers ) ) {
      mods.add( TypeModifiersEnum.ABSTRACT );
    }

    // STATIC
    if( Modifier.isStatic( modifiers ) ) {
      mods.add( TypeModifiersEnum.STATIC );
    }

    // FINAL
    if( Modifier.isFinal( modifiers ) ) {
      mods.add( TypeModifiersEnum.FINAL );
    }

    // TRANSIENT
    if( Modifier.isTransient( modifiers ) ) {
      mods.add( TypeModifiersEnum.TRANSIENT );
    }

    // VOLATILE
    if( Modifier.isVolatile( modifiers ) ) {
      mods.add( TypeModifiersEnum.VOLATILE );
    }

    // SYNCHRONIZED
    if( Modifier.isSynchronized( modifiers ) ) {
      mods.add( TypeModifiersEnum.SYNCHRONIZED );
    }

    // NATIVE
    if( Modifier.isNative( modifiers ) ) {
      mods.add( TypeModifiersEnum.NATIVE );
    }

    // STRICT
    if( Modifier.isStrict( modifiers ) ) {
      mods.add( TypeModifiersEnum.STRICT );
    }

    return ImmutableSet.copyOf( mods );
  }

  /**
   * Wrap the given object toString in quotes.
   * @param obj The object to wrap.
   * @return The wrapped toString.
   */
  public static String wrapMe( @NotNull Object obj ) {
    return String.format( "\"%s\"", obj );
  }

  /**
   * Returns the class from the given type.
   * @param type The type to return the class from.
   * @return The class corresponding to the given type.
   */
  public static <Q> Class<Q> getClassFromType( @NotNull TypeMirror type ) {
    switch( type.getKind( ) ) {
      case BOOLEAN:
        return ( Class< Q > ) boolean.class;
      case BYTE:
        return ( Class< Q > ) byte.class;
      case SHORT:
        return ( Class< Q > ) short.class;
      case INT:
        return ( Class< Q > ) int.class;
      case LONG:
        return ( Class< Q > ) long.class;
      case CHAR:
        return ( Class< Q > ) char.class;
      case FLOAT:
        return ( Class< Q > ) float.class;
      case DOUBLE:
        return ( Class< Q > ) double.class;
      case VOID:
        return ( Class< Q > ) void.class;
      case ARRAY:
        var res = getClassFromType((( ArrayType )type).getComponentType());
        return ( Class< Q > ) res.arrayType();
      case DECLARED:
        var res1 = (( DeclaredType )type).asElement();
        var clazz = ExceptionUtils.convertToTry( () -> Class.forName( (( TypeElement )res1).getQualifiedName().toString() ) );
        if( clazz.isEmpty( ) ) {
          return ( Class< Q > ) Object.class;
        }
        return ( Class< Q > ) clazz.get( );
      default:
        return ( Class< Q > ) Object.class;
    }
  }

}
