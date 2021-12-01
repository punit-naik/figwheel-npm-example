# figwheel-npm-example

[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.punit-naik/figwheel-npm-example.svg)](https://clojars.org/org.clojars.punit-naik/figwheel-npm-example)

Shows the usage of NPM deps with leiningen.

## Overview

Stores a string with left padding using the [lef-pad](https://www.npmjs.com/package/left-pad/v/1.1.3) in the [`app-state`](https://github.com/punit-naik/figwheel-npm-example/blob/main/src/org/clojars/punit_naik/figwheel_npm_example/core.cljs#L10) atom and prints it to the browser console after every hot code reload.

## Setup

To get an interactive development environment run:


    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
