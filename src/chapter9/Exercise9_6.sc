import scala.io.Source

//“Make a regular expression searching for quoted strings "like this, maybe with \" or \\" in a Java or C++ program.
// Write a Scala program that prints out all such strings in a source file.”

val pattern = """"([^"\\]*([\\]+"[^"\\]*)*)"""".r

val fileName: String = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/Test.java"

val lines: Iterator[String] = Source.fromFile(fileName).getLines()

for(line <- lines) {
  pattern findFirstIn line match {
    case Some(s:String) => println(s)
    case None =>
  }
}
