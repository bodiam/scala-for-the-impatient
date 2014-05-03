package chapter2

/**
 * @author Erik Pragt
 */
object Exercise2_5 {

  def main(args: Array[String]) {
    countdown(4)
  }

  def countdown(n: Int) = {
    for(i <- n to 0 by -1)
      println(i)
  }

}
