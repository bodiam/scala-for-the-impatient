/**
 * @author Erik Pragt
 */

val a = Array(-5, -3, 2, 3, 5, 7, -11).toBuffer

(for(i <- 0 until a.length; if a(i) < 0) yield i).reverse.dropRight(1).foreach(a.remove)

a.toList
