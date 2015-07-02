/*
“The java.awt.Rectangle class has useful methods translate and grow that are unfortunately absent from classes
such as java.awt.geom.Ellipse2D. In Scala, you can fix this problem. Define a trait RectangleLike with concrete
 methods translate and grow. Provide any abstract methods that you need for the implementation,
 so that you can mix in the trait like this:
Click here to view code image
val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
egg.translate(10, -10)
egg.grow(10, 20)”
 */



trait RectangleLike {

  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double
  def setFrame(x: Double, y: Double, width: Double, height: Double)

  def translate(x: Int, y: Int): Unit = {
    setFrame(getX + x, getY + y, getWidth, getHeight)
  }
  def grow(x: Int, y: Int): Unit = {
    setFrame(getX - x, getY - y, getWidth + 2 * x, getHeight + 2 * y)
  }

  override def toString = "[%f, %f, %f, %f]".format(getX, getY, getWidth, getHeight)
}



val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
println(egg)
egg.translate(10, -10)
egg.grow(10, 20)
println(egg)