import sbt._
import Keys._

object WarmUpBuild extends Build {
  
  val appName = "warm-up"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "postgresql" % "postgresql" % "8.4-702.jdbc4"
  )
	
  val main = play.Project(appName, appVersion, appDependencies).settings(
  
  )
	
}