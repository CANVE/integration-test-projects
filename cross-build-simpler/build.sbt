val scala12version = "2.12.0-M3"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.4", "2.11.7", scala12version)

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.12"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"
