/**
 * @author Erik Pragt
 */
package object random {

  var previous = 0

  val a = 1664525
  val b = 1013904223
  val n = 32

  def nextInt(): Int = {
    previous = (previous * a + b) % math.pow(2, n).toInt
    previous
  }

  def nextDouble(): Double = {
    previous = (previous * a + b) % math.pow(2, n).toInt
    previous
  }

  def setSeed(seed: Int): Unit = {
    previous = seed
  }
}
