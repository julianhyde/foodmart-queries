<!--
{% comment %}
Licensed to Julian Hyde under one or more contributor license
agreements.  See the NOTICE file distributed with this work
for additional information regarding copyright ownership.
Julian Hyde licenses this file to you under the Apache
License, Version 2.0 (the "License"); you may not use this
file except in compliance with the License.  You may obtain a
copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied.  See the License for the specific
language governing permissions and limitations under the
License.
{% endcomment %}
-->
[![Build Status](https://github.com/julianhyde/foodmart-queries/actions/workflows/main.yml/badge.svg?branch=main)](https://github.com/julianhyde/foodmart-queries/actions?query=branch%3Amain)

# foodmart-queries
SQL queries issued by Mondrian against the FoodMart data set, in JSON format

It was generated by the test suite of the
<a href="http://mondrian.pentaho.org">Pentaho Mondrian OLAP engine</a>,
but serves as a challenging benchmark for any SQL engine.

### Download and build

Java version 8 or higher.

```bash
$ git clone git://github.com/julianhyde/foodmart-queries.git
$ cd foodmart-queries
$ ./mvnw install
```

On Windows, the last line is

```bash
> mvnw install
```

## See also

Similar data sets:
* [chinook-data-hsqldb](https://github.com/julianhyde/chinook-data-hsqldb)
* [foodmart-data-hsqldb](https://github.com/julianhyde/foodmart-data-hsqldb)
* [foodmart-data-json](https://github.com/julianhyde/foodmart-data-json)
* [foodmart-data-mysql](https://github.com/julianhyde/foodmart-data-mysql)
* [scott-data-hsqldb](https://github.com/julianhyde/scott-data-hsqldb)
* [scott-data-hsqldb](https://github.com/julianhyde/scott-data-hsqldb)
* [steelwheels-data-hsqldb](https://github.com/julianhyde/steelwheels-data-hsqldb)

## More information

* License: Apache License, Version 2.0
* Author: Julian Hyde
* Blog: http://julianhyde.blogspot.com
* Project page: http://www.hydromatic.net/foodmart-queries
* Source code: http://github.com/julianhyde/foodmart-queries
* Developers list:
  <a href="mailto:dev@calcite.incubator.apache.org">dev at calcite.incubator.apache.org</a>
  (<a href="http://mail-archives.apache.org/mod_mbox/incubator-calcite-dev/">archive</a>,
  <a href="mailto:dev-subscribe@calcite.incubator.apache.org">subscribe</a>)
* Issues: https://github.com/julianhyde/foodmart-queries/issues
* <a href="HISTORY.md">Release notes and history</a>
