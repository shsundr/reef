/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.reef.task;

import org.apache.reef.annotations.audience.EvaluatorSide;
import org.apache.reef.annotations.audience.Public;
import org.apache.reef.util.Optional;

/**
 * Message source for control flow messages from a task to the Driver.
 * <p>
 * The getMessage() method in an Implementation of this interface will be called by the Evaluator resourcemanager
 * whenever it is about to communicate with the Driver anyway.
 * Hence, this can be used for occasional status updates etc.
 */
@Public
@EvaluatorSide
public interface TaskMessageSource {

  /**
   * @return a message to be sent back to the Driver, or Optional.empty() if no message shall be sent at this time.
   */
  Optional<TaskMessage> getMessage();
}
