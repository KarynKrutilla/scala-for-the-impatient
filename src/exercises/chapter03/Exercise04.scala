package exercises.chapter03

import scala.collection.mutable.ArrayBuffer

/**
 * 4. Given an array of integers, produce a new array that contains all positive
 *    values of the original array, in their original order, followed by all values that
 *    are zero or negative, in their original order.
 */
object Exercise04 {
  
  def main(args:Array[String]) { 
    def updateArray(arr:Array[Int]) = { 
      // All values greater than 0
      val positiveArray = arr.filter( _ > 0)
      // All values less than or = to 0
      val negativeArray = arr.filter( _ <= 0)
      // Join the values together with positives first
      positiveArray ++ negativeArray
    }
    
    // Test
    val testArray = Array(3, -1, 2, -2, 0, 1, -3)
    val updatedArray = updateArray(testArray)
    for(i <- 0 to updatedArray.size-1) println(updatedArray(i)) // 3,2,1,-1,-2,0,-3
  }
}