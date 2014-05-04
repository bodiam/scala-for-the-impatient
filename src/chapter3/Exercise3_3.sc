/**
 * @author Erik Pragt
 */

// Swap with new array

// index:     0 1 2 3 4
val a = Array(1,2,3,4,5)

val b = for(i <- 0 until a.length) yield {
  if(i % 2 == 0 && i + 1 < a.length) a(i + 1)
  else if(i % 2 == 1) a(i - 1)
  else a(i)
}

for(c <- b) println(c)






