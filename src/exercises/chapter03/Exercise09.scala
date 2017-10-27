package exercises.chapter03

import java.util.TimeZone
/**
 * 9. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
 *    that are in America. Strip off the "America/" prefix and sort the result.
 */
object Exercise09 {
  def main(args:Array[String]) {
    
    val timeZones = 
      TimeZone.getAvailableIDs // All time zones returned by java.util.TimeZone.getAvailableIDs
      .filter(_.startsWith("America/")) // that are in America
      .map(_.stripPrefix("America/")) // Strip off the "America/"
      .sorted // Sort the result
    
    for(i <- 0 until timeZones.size) println(timeZones(i)) // Print 
  }
}