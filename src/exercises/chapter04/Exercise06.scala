package exercises.chapter04

import java.util.Calendar._
/**
 * 6. Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
 *    similarly for the other weekdays. Demonstrate that the elements are visited
 *    in insertion order.
 */
object Exercise06 extends App {
  
  val dayMap = scala.collection.mutable.LinkedHashMap(
      "Sunday" -> SUNDAY,
      "Monday" -> MONDAY,
      "Tuesday" -> TUESDAY,
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY,
      "Saturday" -> SATURDAY
  )
  
  for((k, v) <- dayMap) println(k + "=" + v)
      
}