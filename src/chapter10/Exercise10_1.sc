import java.awt.geom.Ellipse2D

trait RectangleLike {
  def getX: Double
  def getY: Double

  def getWidth: Double
  def getHeight: Double

  def setFrame(x: Double, y: Double, width: Double, height: Double)
  def translate(dx:Int, dy:Int) {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(x:Int, y:Int) {
    setFrame(getX - (x/2), getY - (y/2), getWidth + x, getHeight + y)
  }

  override def toString = "[%f, %f, %f, %f]".format(getX, getY, getWidth, getHeight)
}



val ellipse = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
ellipse.translate(10, -10)
ellipse.grow(10, 20)

ellipse