import scala.io.Source
import java.io.PrintWriter

val column = 8
var count: Int = 0

val source = Source.fromFile("/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/tabs.txt")
val out = new PrintWriter("/tmp/tabs.out")

for (c <- source) c match {
  case '\t' =>
    out.print(" " * (column - count % column))
    count = 0
  case '\n' =>
    out.print(c)
    count = 0
  case _ =>
    out.print(c)
    count += 1
}

source.close()
out.close()