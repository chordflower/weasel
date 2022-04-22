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

package cc.chordflower.robodog.javafx.runtime;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;

import java.util.*;

public final class JavaFxUtils {

  private JavaFxUtils() {}

  public static JavaFxUtils getInstance() {
    return new JavaFxUtils();
  }

  @SuppressWarnings( "unchecked" )
  public <T> Optional<T> lookup( String id, Node root ) {
    Objects.requireNonNull( id );
    Objects.requireNonNull( root );
    if( id.equals( root.getId( ) ) ) {
      return Optional.of( ( T ) root );
    } else if( root instanceof TitledPane titledPane ) {
      if( titledPane.getContent( ) != null ) {
        return lookup( id, titledPane.getContent( ) );
      }
    } else if( root instanceof ScrollPane scrollPane ) {
      if( scrollPane.getContent( ) != null ) {
        return lookup( id, scrollPane.getContent( ) );
      }
    } else if( root instanceof DialogPane dialogPane ) {
      Optional<T> res = Optional.empty();
      if( dialogPane.getHeader() != null ) {
        res = lookup( id, dialogPane.getHeader() );
      }
      if( res.isPresent() ) {
        return res;
      } else {
        if( dialogPane.getContent() != null ) {
          res = lookup( id, dialogPane.getContent() );
        }
        if( res.isPresent() ) {
          return res;
        } else {
          if( dialogPane.getExpandableContent() != null ) {
            res = lookup( id, dialogPane.getExpandableContent() );
          }
          if( res.isPresent() ) {
            return res;
          }
        }
      }
    } else if( root instanceof Accordion accordion ) {
      Optional<T> res = Optional.empty();
      for( Node node : accordion.getPanes() ) {
        res = lookup( id, node );
        if( res.isPresent() ) {
          break;
        }
      }
      return res;
    } else if( root instanceof TabPane tabPane ) {
      for( Tab tab : tabPane.getTabs( ) ) {
        if( id.equals( tab.getId() ) ) {
          return Optional.of( (T) tab );
        }
      }

    } else if( root instanceof MenuBar menuBar ) {
      for( Menu menu : menuBar.getMenus( ) ) {
        if( id.equals( menu.getId( ) ) ) {
          return Optional.of( ( T ) menu );
        }
        for( MenuItem item : menu.getItems( ) ) {
          if( id.equals( item.getId( ) ) ) {
            return Optional.of( ( T ) item );
          }
        }
      }
    } else if( root instanceof ButtonBar buttonBar ) {
      Optional<T> res = Optional.empty();
      for( Node node : buttonBar.getButtons() ) {
        res = lookup( id, node );
        if( res.isPresent() ) {
          break;
        }
      }
      return res;
    } else if( root instanceof Parent parent ) {
      Optional<T> res = Optional.empty();
      for( Node node : parent.getChildrenUnmodifiable() ) {
        res = lookup( id, node );
        if( res.isPresent() ) {
          break;
        }
      }
      return res;
    }
    return Optional.empty( );
  }

}
