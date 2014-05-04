
/**
 * @author Erik Pragt
 */

class Person(var age: Int) {
  if (age < 0) age = 0
}


val p = new Person(5)
println(p.age)


val n = new Person(-5)
println(n.age)


n.age = -5
println(n.age)