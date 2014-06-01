abstract class Ball(weight: Int) {

}

trait Bounce {
  def move() = println("Bouncing" + toString)
}


class BasketBall(weight: Int = 624, color: String = "Red") extends Ball(weight) with Bounce {
  override def toString: String = s"BasketBall with weight $weight and color $color"
}


class TennisBall(weight: Int = 56, color: String = "Yellow") extends Ball(weight) with Bounce {
  override def toString: String = s"Tennis with weight $weight and color $color"
}



val balls = Seq[Ball with Bounce](new BasketBall(), new BasketBall(color = "Blue"), new TennisBall())

for(b <- balls) {
  b.move()
}


