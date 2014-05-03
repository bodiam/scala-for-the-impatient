/**
 * @author Erik Pragt
 */


def productRec(s: String): Int = {
  val tail = s.tail
  s.head * (if (tail.size == 0) 1 else productRec(s.tail))
}
println(productRec("Hello"))



productRec("Hello")
