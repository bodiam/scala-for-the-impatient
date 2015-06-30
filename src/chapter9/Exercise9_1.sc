import scala.io.Source

/*
val source = Source.fromFile("/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/file.txt", "UTF-8").getLines()
var result = ""
for(line <- source) {
  result = line +"\n" + result
}
println(result)
*/

val source = Source.fromFile("/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/file.txt", "UTF-8")
val result = source.getLines.toArray[String].reverse.foreach(println(_))

