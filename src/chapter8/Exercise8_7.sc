import java.awt.Rectangle

class Square(x: Int, y: Int, w: Int) extends Rectangle(x, y, w, w) {

  def this() = this(0, 0, 0)

  def this(w: Int) = this(0, 0, w)
}

new Square()
new Square(1,1,1)
new Square(4)


