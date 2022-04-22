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

package cc.chordflower.robodog.javafx.annotations;

import java.lang.annotation.*;

/**
 * Associates the annotated field with the fxml component with the given id.
 */
@Target( ElementType.FIELD )
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface Component {

  /**
   * The id of the fxml component.
   *
   * Note: This is not the fxml:id!
   */
  String id();

}
