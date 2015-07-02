sealed trait Gun {
  val damage: Int

  def fire() = println(s"shot does $damage damage")
}

trait RocketLauncher extends Gun {
  override val damage: Int = 10
}
trait GattlingGun extends Gun {
  override val damage: Int = 5
}

class Player(name:String)

class Enemy(name:String) extends Player(name)
class Friend(name:String) extends Player(name)

val e1 = new Enemy("Erik") with RocketLauncher
val e2 = new Friend("Willem") with GattlingGun
e1.fire
e2.fire