scala-js-pdfkit
===============

[![Build Status](https://travis-ci.org/kapp-technology/scala-js-pdfkit.svg?branch=master)](https://travis-ci.org/DefinitelyScala/scala-js-pdfkit)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.15.svg)](https://www.scala-js.org/)

Scala.js facades for [pdfkit](http://twitter.github.com/pdfkit/).

This project depends on `scala-js-jquery`.

Generated from [TypeScript definitions](https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/pdfkit) based on pdfkit 3.3.5.

Usage
-----

First, add the JCenter resolver to your build file:
 
```
resolvers += Resolver.jcenterRepo,
```

Then, add it to your SBT dependencies:

```
libraryDependencies += "com.definitelyscala" %%% "scala-js-pdfkit" % "1.0.2"
```

Classes and traits are available in the package `com.definitelyscala.pdfkit`, scaladoc is provided.

This project provides Scala.js facades. You will still need to include the JavaScript library source in your web page.

License
-------

The MIT License (MIT)

Copyright (c) 2017 DefinitelyScala

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.