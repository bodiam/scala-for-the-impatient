case class Point(x: Double, y: Double)


abstract class Shape {
  def centerPoint: Point
}

class Rectangle(x: Double, y: Double, w: Double, h: Double) extends Shape {
  override def centerPoint: Point = new Point(x + w/2, y+h/2)
}

val rectangle: Rectangle = new Rectangle(10, 20, 5, 10)
rectangle.centerPoint




