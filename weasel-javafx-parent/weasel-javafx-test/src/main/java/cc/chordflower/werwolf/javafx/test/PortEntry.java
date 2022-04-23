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

import javafx.beans.property.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.StringJoiner;

public class PortEntry {

  private final IntegerProperty port = new SimpleIntegerProperty();

  private final StringProperty name = new SimpleStringProperty();

  private final StringProperty description = new SimpleStringProperty();

  private final StringProperty protocol = new SimpleStringProperty();

  private final BooleanProperty secure = new SimpleBooleanProperty();

  private final StringProperty creationDate = new SimpleStringProperty();

  private final StringProperty modificationDate = new SimpleStringProperty();

  public static PortEntry of( Integer port, String name, String description, String protocol, boolean secure, LocalDate creationDate, LocalDate modificationDate ) {
    return new PortEntry( port, name, description, protocol, secure, creationDate, modificationDate );
  }

  private PortEntry( Integer port, String name, String description, String protocol, boolean secure, LocalDate creationDate, LocalDate modificationDate ) {
    this.port.setValue( Objects.requireNonNull( port ) );
    this.name.setValue( Objects.requireNonNull( name ) );
    this.description.setValue( Objects.requireNonNull( description ) );
    this.protocol.setValue( Objects.requireNonNull( protocol ) );
    this.secure.setValue( secure );
    this.creationDate.setValue( Objects.requireNonNull( creationDate ).format( DateTimeFormatter.ISO_DATE ) );
    this.modificationDate.setValue( Objects.requireNonNull( modificationDate ).format( DateTimeFormatter.ISO_DATE ) );
  }

  public int getPort( ) {
    return port.get( );
  }

  public IntegerProperty portProperty( ) {
    return port;
  }

  public void setPort( int port ) {
    this.port.set( port );
  }

  public String getName( ) {
    return name.get( );
  }

  public StringProperty nameProperty( ) {
    return name;
  }

  public void setName( String name ) {
    this.name.set( name );
  }

  public String getDescription( ) {
    return description.get( );
  }

  public StringProperty descriptionProperty( ) {
    return description;
  }

  public void setDescription( String description ) {
    this.description.set( description );
  }

  public String getProtocol( ) {
    return protocol.get( );
  }

  public StringProperty protocolProperty( ) {
    return protocol;
  }

  public void setProtocol( String protocol ) {
    this.protocol.set( protocol );
  }

  public boolean isSecure( ) {
    return secure.get( );
  }

  public BooleanProperty secureProperty( ) {
    return secure;
  }

  public void setSecure( boolean secure ) {
    this.secure.set( secure );
  }

  public String getCreationDate( ) {
    return creationDate.get( );
  }

  public StringProperty creationDateProperty( ) {
    return creationDate;
  }

  public void setCreationDate( String creationDate ) {
    this.creationDate.set( creationDate );
  }

  public String getModificationDate( ) {
    return modificationDate.get( );
  }

  public StringProperty modificationDateProperty( ) {
    return modificationDate;
  }

  public void setModificationDate( String modificationDate ) {
    this.modificationDate.set( modificationDate );
  }

  @Override
  public boolean equals( Object o ) {
    if( this == o ) {
      return true;
    }
    if( o == null || getClass( ) != o.getClass( ) ) {
      return false;
    }
    PortEntry portEntry = ( PortEntry ) o;
    return Objects.equals( port, portEntry.port ) && Objects.equals( name, portEntry.name ) && Objects.equals( description, portEntry.description ) && Objects.equals( protocol, portEntry.protocol ) && Objects.equals( secure, portEntry.secure ) && Objects.equals( creationDate, portEntry.creationDate ) && Objects.equals( modificationDate, portEntry.modificationDate );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( port, name, description, protocol, secure, creationDate, modificationDate );
  }

  @Override
  public String toString( ) {

    return new StringJoiner( ", ", PortEntry.class.getSimpleName( ) + "[", "]" )
        .add( "port=" + port )
        .add( "name=" + name )
        .add( "description=" + description )
        .add( "protocol=" + protocol )
        .add( "secure=" + secure )
        .add( "creationDate=" + creationDate )
        .add( "modificationDate=" + modificationDate )
        .toString( );
  }

}
