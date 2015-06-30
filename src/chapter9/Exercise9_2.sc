import java.io.PrintWriter

import scala.io.Source

val tabstop = 2
val fileLocation: String = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/tabs.txt"
val file = Source.fromFile(fileLocation)

val contents = file.mkString
var replacedContent = contents.replaceAll("\t", " " * tabstop)
val out = new PrintWriter(fileLocation)
out.println(replacedContent)
out.close()