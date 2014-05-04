import java.util.Calendar
import scala.collection.mutable


val days = mutable.LinkedHashMap(
  "Monday" -> Calendar.MONDAY,
  "Tuesday" -> Calendar.TUESDAY,
  "Wednesday" -> Calendar.WEDNESDAY,
  "Thursday" -> Calendar.THURSDAY,
  "Friday" -> Calendar.FRIDAY,
  "Saturday" -> Calendar.SATURDAY,
  "Sunday" -> Calendar.SUNDAY
)

for((k,v) <- days) println(k,v)






