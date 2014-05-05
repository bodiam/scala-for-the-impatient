/**
 * @author Erik Pragt
 */

object RGBCube extends Enumeration {
  val Black = Value(0x000000, "Black")
  val Red = Value(0xff0000, "Red")
  val Green = Value(0x00ff00, "Green")
  val Blue = Value(0x0000ff, "Blue")
  val Yellow = Value(0xffff00, "Yellow")
  val Magenta = Value(0xff00ff, "Magenta")
  val Cyan = Value(0x00ffff, "Cyan")
  val White = Value(0xffffff, "White")
}

for( c <- RGBCube.values ) println("0x%06x: %s".format(c.id, c))







