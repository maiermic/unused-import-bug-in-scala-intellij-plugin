name := "unused-import-bug-in-scala-intellij-plugin"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.1",
  "com.typesafe.akka" %% "akka-remote" % "2.4.1",
  "org.scalafx" %% "scalafx" % "8.0.60-R9"
)