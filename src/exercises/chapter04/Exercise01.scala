package exercises.chapter04

/**
 * 1. Set up a map of prices for a number of gizmos that you covet. Then produce
 *    a second map with the same keys and the prices at a 10 percent discount.
 */
object Exercise01 extends App {
  // Init gizmos map
  val gizmos = Map("gizmo1" -> 100.00, "gizmo2" -> 150.00, "gizmo3" -> 200.00)
  // Init mutable map
  val discountedGizmos = new scala.collection.mutable.HashMap[String, Double]
  // Iterate over gizmos and set value in discountedGizmos
  for((k, v) <- gizmos) discountedGizmos(k) = v*.9
  
  // print
  for((k, v) <- discountedGizmos) println(k + " -> " + v)
}