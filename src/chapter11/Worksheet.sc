object Number {
  def unapply(input: String): Option[Int] = {
    try {
      Some(Integer.parseInt(input.trim()))
    } catch {
      case ex: Exception => None
    }
  }
}


//def x = "1"
//println(x)
val Number(n) = "1234a"
println(n)