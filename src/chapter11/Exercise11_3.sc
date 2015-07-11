import java.lang.Math.abs

case class Fraction(n: Int, d: Int) {

  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def +(that: Fraction): Fraction = {
    new Fraction(this.num * that.den + that.num * this.den, this.den * that.den)
  }
  def -(that: Fraction): Fraction = {
    new Fraction(this.num * that.den - that.num * this.den, this.den * that.den)
  }

  def *(that: Fraction): Fraction = {
    new Fraction(this.num * that.num, this.den * that.den)
  }

  override def toString = s"$n/$d"
}

val x = Fraction(1, 4)
val y = Fraction(1, 2)

println(x + y)
println(x - y)
println(x * y)
//println(x / y)
//1/2 * 1/2 = 1/4
//2/3 * 2/3 = 4/9
Fraction(1,2) * Fraction(3,4)