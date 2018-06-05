name := "cats-exercices-meetup"
version := "1.0"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-Xfatal-warnings",
  "-Ypartial-unification"
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.0.1",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

scalaVersion := "2.12.6"

unmanagedSources / excludeFilter := HiddenFileFilter || ".#*" || "*~"
