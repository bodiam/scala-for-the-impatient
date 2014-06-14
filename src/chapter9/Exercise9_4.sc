import scala.io.Source

val location = "/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/floats.txt"

val lines = Source.fromFile(location, "UTF-8").getLines().toList.map(_.toFloat)

println(lines.reduceLeft(_+_))
println(lines.reduceLeft(_+_) / lines.size)
println(lines.max)
println(lines.min)