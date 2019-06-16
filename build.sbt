name := "tdd-scala"
version := "1.0"
scalaVersion := "2.12.8"

lazy val V = new {
  val scalatest = "3.0.5"
}

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % V.scalatest % "test"
)
