
/**
 * @author Erik Pragt
 */
class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    hours * 60 + minutes < other.hours * 60 + other.minutes
  }
}

new Time(10, 30).before(new Time(10, 29)) // false
new Time(10, 28).before(new Time(10, 29)) // true