/**
 * @author Erik Pragt
 */

// Swap adjacent array elements

val array = Array(1, 2, 3, 4, 5)

def swap(input: Array[Int]) = {
  for (i <- 1 until input.length by 2) {
    val orig = input(i - 1)
    input(i - 1) = input(i)
    input(i) = orig
  }
}

swap(array)
for (i <- 0 until array.length)
  println(array(i))





