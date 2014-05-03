package chapter2

/**
 * @author Erik Pragt
 */
object Exercise2_1 {

  def main(args: Array[String]) {
    println(signum(10))
    println(signum(0))
    println(signum(-20))
  }

  def signum(input: Int) = {
    if (input == 0) 0
    else if (input > 0) 1 else -1
  }

}
