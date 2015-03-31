object Caesar {
  private val alphaU='A' to 'Z'
  private val alphaL='a' to 'z'
  def encode(text:String, key:Int)=text.map{
    case c if alphaU.contains(c) => rot(alphaU, c, key)
    case c if alphaL.contains(c) => rot(alphaL, c, key)
    case c => c
  }
  def decode(text:String, key:Int)=encode(text,-key)
  private def rot(a:IndexedSeq[Char], c:Char, key:Int)=a((c-a.head+key+a.size)%a.size)
}

/*
super.log((for(x <- msg) yield (x + shift).toChar).mkString)
// more elegant
super.log(msg.map(_ + shift).map(_.toChar).mkString)
// speedup but less elegant
super.log(msg.map((x : Char) => (x + shift).toChar).mkString)
*/
trait Logged {
  def log(msg: String) {}
}
trait CryptoLogger extends Logged {
  val shift: Int = 3

  override def log(msg: String) {
    println(Caesar.encode(msg, shift))
  }
}
trait ConsoleLogger extends Logged {
  override def log(msg: String) {
    println("Console: " + msg)
  }
}
class MyClass extends Logged {
  def doSomething() {
    log("zzzz")
  }
}

val m = new MyClass with CryptoLogger
val n = new MyClass with ConsoleLogger
val o = new { override val shift = -3} with MyClass with CryptoLogger
m.doSomething()
n.doSomething()
o.doSomething()

