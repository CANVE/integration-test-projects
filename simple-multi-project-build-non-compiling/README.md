SBT project which uses [macro paradise](http://docs.scala-lang.org/overviews/macros/paradise.html) to demonstrate obtaining the call graph of a scala 2.11 project.

In this working prototype, the scala project to produce data for, is simply a project contained within this repo.

 Usage: `sbt run`. Create a subdirectory named `out` before running.
 
 Development: 
 Use `~ ;clean ;run` if you work on the code

The output written to json files in `out`, and mirrored to the console.

Huge thanks to the template at https://github.com/scalamacros/sbt-example-paradise from which this was initially forked, and to https://github.com/dk14.
