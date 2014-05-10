import java.util.{HashMap => JavaHashMap }
import scala.collection.mutable.{HashMap => ScalaHashMap}
import scala.collection.JavaConversions.mapAsScalaMap

/**
 * @author Erik Pragt
 */


val javaHashMap = new JavaHashMap[String, String]()
javaHashMap.put("Erik", "Pragt")
javaHashMap.put("Lieke", "Boon")

val scalaHashMap = javaHashMap

scalaHashMap.foreach(e=> println(e))

