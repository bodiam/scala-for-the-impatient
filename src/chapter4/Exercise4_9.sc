

def array = Array(1, 2, 3, 3, 3, 4, 5, 100, 100, 100)
def lteqgt(ints: Array[Int], v: Int) = {
  (ints count (_ < v), ints count(_ == v), ints count(_ > v))
}

val x = lteqgt(array, 3)
x._1
x._2
x._3

































