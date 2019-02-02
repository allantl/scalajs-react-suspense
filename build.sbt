
lazy val root = (project in file("."))
  .settings(
    name := "scalajs-react-suspense",
    scalaVersion := "2.12.8",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "com.github.japgolly.scalajs-react" %%% "core" % "1.4.0",
      "org.scala-js" %%% "scalajs-dom" % "0.9.6"
    ),
    npmDependencies in Compile ++= Seq(
      "react" -> "16.7.0",
      "react-dom" -> "16.7.0"
    )
  )
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalaJSBundlerPlugin)
