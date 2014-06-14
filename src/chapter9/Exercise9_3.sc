import scala.io.Source

val name: String = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/12char.txt"
Source.fromFile(name, "UTF-8").mkString.split("\\s+").filter(_.length > 12).foreach(println(_))

