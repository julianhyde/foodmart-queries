/*
// Licensed to Julian Hyde under one or more contributor license
// agreements. See the NOTICE file distributed with this work for
// additional information regarding copyright ownership.
//
// Julian Hyde licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except in
// compliance with the License. You may obtain a copy of the License at:
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
*/
package net.hydromatic.foodmart.queries;

import java.io.IOException;
import java.io.InputStream;

/** Collection of SQL queries issued by Mondrian against the FoodMart data set,
 * in JSON format. */
public class FoodmartQuerySet {
  /** Creates a FoodmartQuerySet. */
  public FoodmartQuerySet() {
  }

  /** Returns the JSON document that contains the queries and their expected
   * results. */
  public InputStream getQueries() throws IOException {
    return FoodmartQuerySet.class.getClassLoader()
        .getResourceAsStream("queries.json");
  }
}

// End FoodMartQuerySet.java
