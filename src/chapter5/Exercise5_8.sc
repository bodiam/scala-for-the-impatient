
/**
 * @author Erik Pragt
 */

class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licencePlate: String = "")

val c1 = new Car("Audi", "TT", 2006, "ABCD12")
println(c1)

val c2 = new Car("Porsche", "911", 2014)
println(c2)

val c3 = new Car("Mercedes", "Benz")
println(c3)
