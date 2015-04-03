name := "macwire-akka-activator"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % "1.0.1",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

mainClass := Some("activator.LuckyNumberDemo")
