/**
 * @author Erik Pragt
 */

// Split concat negative and positive array

val a = Array(1,-2,3,-4)
val b = Array.concat(for (i <- a if i > 0) yield i, for (i <- a if i <= 0) yield i)

for(c <- b) println(c)







