
/**
 * @author Erik Pragt
 */

class Person(private val name: String) {
  val (firstName, lastName) = name.split("\\s+") match { case Array(firstName, lastName ) => (firstName, lastName)}

  override def toString = firstName + " - " + lastName
}

def p = new Person("Erik Pragt")
println(p)



