ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaDeveloperTest",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
