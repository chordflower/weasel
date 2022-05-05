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

package cc.chordflower.weasel.javafx.annotations;

import java.lang.annotation.*;

import static org.jetbrains.annotations.ApiStatus.*;

/**
 * Declares a class as being a JavaFX view.
 */
@Target( ElementType.TYPE )
@Retention( RetentionPolicy.SOURCE )
@Documented
@AvailableSince( "0.1.0" )
public @interface View {

  /**
   * Name of the fxml file to associate with this class.
   */
  String name();

}
