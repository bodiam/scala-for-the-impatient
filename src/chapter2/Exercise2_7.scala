package chapter2

/**
 * @author Erik Pragt
 */
object Exercise2_7 {

  def main(args: Array[String]) {
    val i: Long = "Hello".foldLeft(1L)(_ * _.toLong)

    // H.toLong = 1 * 72
    // e.toLong = 1 * 72 * 101

    println(i)
  }

}
