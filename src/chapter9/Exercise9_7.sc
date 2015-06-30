import scala.io.{BufferedSource, Source}

// “Write a Scala program that reads a text file and prints all tokens in the file that are not floating-point numbers. Use a regular expression.”

val pattern = "^[0-9]+(\\\\.[0-9]+)?$".r
val fileName = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/Exercise9_7.txt"
/*

val filter = Source.fromFile(fileName).mkString.split( """\s+""").filter(
  pattern findFirstIn _ match {
    case Some(_) => false
    case None => true
  }
)*/

val tokens = io.Source.fromFile(fileName).mkString.split("""\s+""").filter(
  "^[0-9]*(\\.[0-9]+)?$".r findFirstIn _ match {
    case Some(_) => false
    case None => true
  }
)

println("Tokents: " + tokens.mkString(", "))

