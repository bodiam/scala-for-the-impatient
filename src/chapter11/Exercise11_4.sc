/**
“Implement a class Money with fields for dollars and cents. Supply +, -
operators as well as comparison operators == and <. For example, Money(1, 75) + Money(0, 50) == Money(2, 25)
should be true. Should you also supply * and / operators? Why or why not?”
  */


class Money(val dollars:Int, val cents:Int) {

  def value = dollars * 100 + cents

  def this(value:Int) = this(value / 100, value % 100)

  def +(that:Money) = {
    new Money(this.value + that.value)
  }
  def -(that:Money) = {
    new Money(this.value - that.value)
  }
  override def toString: String = s"$$ $dollars,$cents"
}


object Money {
  def apply(dollars:Int, cents:Int) = {
    new Money(dollars, cents)
  }

}

Money(1,75) + Money(2, 30)

Money(3,50) - Money(1, 60)
Money(1,60) - Money(2, 0)

