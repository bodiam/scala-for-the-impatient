
class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
  override def toString = super.toString + " Range:" + range + " Environment:" + env.toBuffer
}
class Ant extends Creature {
  override val range = 2
}
val a = new Ant
val b = new Creature
println(a.range)
println(b.range)
