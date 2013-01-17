import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "succubus"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "org.scalaj" %% "scalaj-time" % "0.6"
      // Add your project dependencies here,
    )

    val scala_redis = RootProject(uri("git://github.com/debasishg/scala-redis.git#master"))

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    ).dependsOn(scala_redis)

}
