
/**
 * @author Erik Pragt
 */
package random {

object Random {
  def main(args: Array[String]) {
    random.setSeed(1)
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextDouble())
  }
}

}