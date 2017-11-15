package exercises.chapter07

/**
 * 7. In the preceding exercise, move all imports into the innermost scope possible.
 */
object Exercise07 extends App {
  
  // Init Java and Scala HashMaps
  val javamap = new java.util.HashMap[Int, String]
  val scalamap = new collection.mutable.HashMap[Int, String]
  
  javamap.put(0, "value0")
  javamap.put(1, "value1")
  
  // Copy items from javamap to scalamap
  val iter = javamap.entrySet().iterator()
  while(iter.hasNext()) { 
    val current = iter.next()
    scalamap += (current.getKey -> current.getValue)
  }
  
  // Test
  assert(scalamap.get(0) == Some("value0"))
  assert(scalamap.get(1) == Some("value1"))
  scalamap.foreach(println)
}