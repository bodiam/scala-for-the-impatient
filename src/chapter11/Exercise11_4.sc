// “mplement a class Money with fields for dollars and cents.
// Supply +, - operators as well as comparison operators == and <.
// For example, Money(1, 75) + Money(0, 50) == Money(2, 25) should be true.
// Should you also supply * and / operators? Why or why not?”

object Money {
  def apply(dollar:Int, cents:Int): Money = new Money(dollar, cents)
  private def apply(value: Int) : Money = new Money(value/100, value%100)
}


class Money(val dollar:Int, val cents: Int) {
  private val value = dollar * 100 + cents

  def  + (money:Money) = Money(value + money.value)
  def  - (money:Money) = Money(value - money.value)
  def == (m: Money) = value == m.value
  def  < (m: Money) = value  < m.value
  def  * (d: Double) = Money((value * d).toInt)
  def  / (d: Double) = Money((value / d).toInt)

  override def toString = "$" + s"${value/100}.${Math.abs(value%100)}"
}

Money(5, 40) + Money(1, 30)
Money(5, 40) - Money(1, 70)
Money(5, 40) == Money(5, 40)
Money(5, 40) < Money(5, 40)
Money(1, 40) - Money(2, 70)
Money(1, 60) * 2