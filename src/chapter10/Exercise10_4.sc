/*
Provide a CryptoLogger trait that encrypts the log messages with the Caesar cipher.
The key should be 3 by default, but it should be overridable by the user.
Provide usage examples with the default key and a key of –3.”
*/

trait Logger {
  def log(msg: String) = {}
}

trait ConsoleLogger extends Logger {
  override def log(msg: String) = Console.println(msg)
}


trait CryptoLogger extends Logger {
  val shift = 3

  override def log(msg: String): Unit = {
    super.log(for (x <- msg) yield (x + shift).toChar)

  }
}


class Sample extends Logger {
  def work(): Unit = {
    log("working")
  }
}


val x = new Sample() with ConsoleLogger
x.work()
val y = new Sample() with ConsoleLogger with CryptoLogger
y.work()
val z = new { override val shift = -3 } with Sample with ConsoleLogger with CryptoLogger
z.work()