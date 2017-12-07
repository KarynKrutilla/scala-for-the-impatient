package exercises.chapter03

import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

/**
 * 10. Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
 *     val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
 *     Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
 *     and get the return value as a Scala buffer. 
 *     (Why this obscure class? It's hard to find uses of java.util.List in the standard Java library.)
 */
object Exercise10 {
  def main(args:Array[String]) { 
    // Make object of type SystemFlavorMap
    val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    // call getNativesForFlavor
    val buffer: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    
    // Print
    for(i <- 0 until buffer.size) println(buffer(i))

    assert(buffer == Buffer("PNG","JFIF","TIFF"))

  }
}