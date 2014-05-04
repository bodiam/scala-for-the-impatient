/**
 * @author Erik Pragt
 */

// Reverse array

val a = Array(1,2,3,4,5)
val b = for(i <- (0 until a.length).reverse) yield a(i)

for(c <- b) println(c)




