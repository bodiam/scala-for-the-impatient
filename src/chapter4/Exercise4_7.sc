import scala.collection.JavaConversions.propertiesAsScalaMap

val properties = propertiesAsScalaMap(java.lang.System.getProperties)

val maxkey = properties.keySet.map(_.length).max
for( (k,v) <- properties ) printf("%-" + maxkey + "s | %s\n", k, v)








































