import sbt._
import Keys._

object BuildSettings {
  val paradiseVersion = "2.1.0-M5"
  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "none",
    version := "1.0.0",
    scalacOptions ++= Seq("-deprecation"),
    scalaVersion := "2.10.5",
    crossScalaVersions := Seq( "2.10.5", "2.11.7"),
    resolvers += Resolver.sonatypeRepo("snapshots"),
    resolvers += Resolver.sonatypeRepo("releases")
  )
}

object MyBuild extends Build {
  import BuildSettings._

  lazy val hello = taskKey[Unit]("Prints 'Hello World'")

  hello := println("hello world!")

  lazy val root: Project = Project(
    "root",
    file("."),
    settings = buildSettings ++ Seq(
      //scalacOptions := Seq("-deprecation")
    )
  ) aggregate(dependency, dependencyConsumer)

  lazy val dependency: Project = Project(
    "dependency",
    file("dependency"),
    settings = buildSettings ++ Seq(
        libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.12",
        libraryDependencies += "com.typesafe.play" %% "play-json" % "2.4.1",
        libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2",
        name         := "dependency",
        organization := "articlio",
        version      := "0.1-SNAPSHOT"
      )
  ) 

  lazy val dependencyConsumer: Project = Project(
    "dependencyConsumer",
    file("consumer"),
    settings = buildSettings ++ Seq(
    )
  ) dependsOn(dependency)

}
