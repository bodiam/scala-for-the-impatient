package chapter2

/**
 * @author Erik Pragt
 */
object Exercise2_6 {

  def main(args: Array[String]) {

    var sum:Long = 1
    for(i <- "Hello") {
      sum = sum * i.toLong
    }
    println(sum)
  }

}
