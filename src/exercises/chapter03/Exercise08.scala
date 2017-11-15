package exercises.chapter03

import scala.collection.mutable.ArrayBuffer

/**
 * 8. Rewrite the example at the end of Section 3.4, "Transforming Arrays," on
 *    page 34 using the drop method for dropping the index of the first match. Look
 *    the method up in Scaladoc.
 *    
 *    Given a sequence of integers, we want to remove all but the first negative number
 */
object Exercise08 {
  def main(args:Array[String]) {
    def dropFirstNegative(arr:ArrayBuffer[Int]) = {
      // Get indices of all negative values except for the first one
      val negatives = arr.indices.filter(arr(_) < 0).drop(1)
      // Remove these values from arr
      for(i <- 0 until negatives.size) arr.remove(negatives(i))
      arr
    }
    
    // Test
    val withoutFirstNegative = dropFirstNegative(ArrayBuffer(1, -2, 3, -4, 5, -6, 7))
    for(i <- 0 until withoutFirstNegative.size) println(withoutFirstNegative(i))
  }
}