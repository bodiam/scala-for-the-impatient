import java.io.PrintWriter
import scala.io.Source
val source = Source.fromFile("/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter9/lines.txt", "UTF-8")
val lines = source.getLines().toList.reverse
val out = new PrintWriter("/tmp/output.txt")
for(line <- lines) {
    out.print(line + "\n")
}

out.close()
source.close()


