
/**
 * @author Erik Pragt
 */

class Time(val hours: Int, val minutes: Int) {
  private val time : Int = hours * 60 + minutes

  def before(other: Time): Boolean = {
    time < other.time
  }
}

new Time(10, 30).before(new Time(10, 29)) // false
new Time(10, 28).before(new Time(10, 29)) // true