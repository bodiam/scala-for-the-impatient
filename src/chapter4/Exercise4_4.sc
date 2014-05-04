import java.io.File
import java.util.Scanner
import scala.collection.SortedMap


val in = new Scanner(new File("/Users/erikp/Userfiles/projects/scala/for-the-impatient/src/chapter4/myfile.txt"))
var map = SortedMap[String, Int]()
while(in.hasNext) {
  val line = in.next()
  var count = map.getOrElse(line, 0)
  count += 1
  map = map + (line -> count)
}
map