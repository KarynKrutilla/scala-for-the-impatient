package exercises.chapter07

import java.util.{HashMap => JavaHashMap}
import collection.mutable.{HashMap => ScalaHashMap}

/**
 * 6. Write a program that copies all elements from a Java hash map into a Scala hash map. 
 *    Use imports to rename both classes.
 */
object Exercise06 extends App {
  
  // Init Java and Scala HashMaps
  val javamap = new JavaHashMap[String, String]
  val scalamap = new ScalaHashMap[String, String]
  
  javamap.put("0", "value0")
  javamap.put("1", "value1")
  
  // Copy items from javamap to scalamap
  val iter = javamap.entrySet().iterator()
  while(iter.hasNext()) { 
    val current = iter.next()
    scalamap += (current.getKey -> current.getValue)
  }
  
  // Test
  assert(scalamap.get("0") == Some("value0"))
  assert(scalamap.get("1") == Some("value1"))
  scalamap.foreach(println)
}