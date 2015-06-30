import scala.io.Source

// “Write a Scala program that reads a text file containing only floating-point numbers. Print the sum, average, maximum, and minimum of the numbers in the file.”

val file = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/floatingpoints.txt"

val floats = Source.fromFile(file).getLines().map(_.toFloat).toList
println(floats.sum)
println(floats.sum / floats.length)
println(floats.min)
println(floats.max)
