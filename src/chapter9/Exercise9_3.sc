import scala.io.Source

//“Write a Scala code snippet that reads a file and prints all words with more than 12 characters to the console. Extra credit if you can do this in a single line”

val fileName: String = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/longwords.txt"

val filter = Source.fromFile(fileName).mkString.split(" ").filter(_.length > 4)
