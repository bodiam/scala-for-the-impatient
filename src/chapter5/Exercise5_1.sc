/**
 * @author Erik Pragt
 */

class Counter(private var value: Long = 0) {
  def increment() {
    value += 1
  }

  def current() = value
}

val c = new Counter(Int.MaxValue - 1)

println(c.current())

c.increment()
println(c.current())

c.increment()
println(c.current())


