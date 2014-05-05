/**
 * @author Erik Pragt
 */



abstract class UnitConversion {
  def convert(input: Double) : Double
}

object InchesToCentimers extends UnitConversion {
  override def convert(inches:Double) : Double = {
    inches * 2.54
  }
}

InchesToCentimers.convert(1)
