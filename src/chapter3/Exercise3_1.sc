import scala.util.Random

/**
 * @author Erik Pragt
 */

// Set a to random array values

val a = 10
val n = 100

val nums = new Array[Int](a)
val fill: Seq[Int] = Seq.fill(nums.length)(Random.nextInt(n))
for(i <- 0 until nums.length) {
  println(fill(i))
}









