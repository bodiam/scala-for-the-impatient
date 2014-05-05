/**
 * @author Erik Pragt
 */


object Conversions {
  def inchesToCentimers(inches:Double) = {
    inches * 2.54
  }

  def gallonsToLiters(gallons:Double) = {
    gallons * 3.785
  }

  def milesToKilometers(miles:Double) = {
    miles * 1.6093
  }
}


Conversions.inchesToCentimers(3)
Conversions.gallonsToLiters(2)
Conversions.milesToKilometers(2.5)