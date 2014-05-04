/**
 * @author Erik Pragt
 */


val zones = java.util.TimeZone.getAvailableIDs

val filtered = zones.filter(_.startsWith("America")).map(_.replaceAll("America/", ""))


for(e <- filtered) println(e)




































