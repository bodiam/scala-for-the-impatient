/**
 * @author Erik Pragt
 */

class Point(val x: Int, val y: Int)

object Point {
  def apply(x: Int, y: Int) = {
    new Point(x, y)
  }
}

val point = Point(3, 2)

