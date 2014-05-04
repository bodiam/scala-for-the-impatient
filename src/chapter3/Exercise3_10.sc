/**
 * @author Erik Pragt
 */

import java.awt.datatransfer._
import collection.JavaConversions.asScalaBuffer
import collection.mutable.Buffer

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]


val flavor: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

