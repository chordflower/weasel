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

package cc.chordflower.weasel.javafx.annotations;

import org.jetbrains.annotations.ApiStatus.AvailableSince;

import java.lang.annotation.*;

/**
 * This annotation allows one to associate a method with multiple events.
 */
@Target( ElementType.METHOD )
@Retention( RetentionPolicy.SOURCE )
@AvailableSince( "0.2.0" )
@Documented
public @interface EventsFor {

  EventFor[] value();

}
