/**
 * @author Erik Pragt
 */


// Map transformation

val gizmos = Map("Tesla Model S" -> 100000, "B&W Speakers" -> 2000, "HTC M8" -> 650)
val discounted = gizmos.collect { case(name, price) => (name, price * 0.9) }



