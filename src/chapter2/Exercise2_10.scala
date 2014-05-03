package chapter2

/**
 * @author Erik Pragt
 */
object Exercise2_10 {


  def main(args: Array[String]) {
    println(math.pow(2, 2), pow2(2, 2))
    println(math.pow(2, -2), pow2(2, -2))
  }

  def pow2(x: Double, n: Int): Double = {
    if (n > 0 && n % 2 == 0) pow2(x, n / 2) * pow2(x, n / 2)
    else if (n > 0) x * pow2(x, n - 1)
    else if (n == 0) 1
    else 1 / pow2(x, -n)
  }
}
