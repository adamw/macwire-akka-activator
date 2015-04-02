name := "macwire-akka-activator"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % "1.0.0",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9"
)
