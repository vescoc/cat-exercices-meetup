name := "cats"
version := "1.0"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

scalaVersion := "2.12.6"

unmanagedSources / excludeFilter := HiddenFileFilter || ".#*" || "*~"
