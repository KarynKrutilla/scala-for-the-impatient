package exercises.chapter03

/**
 * 7. Write a code snippet that produces all values from an array with duplicates
 *    removed. (Hint: Look at Scaladoc.)
 */
object Exercise07 {
  def main(args:Array[String]) {
    def removeDuplicates(arr:Array[Int]):Array[Int] = {
      arr.distinct
    }
    
    // Test
    val noDuplicateArray = removeDuplicates(Array(1,1,3,2,2,2,3,1,4,2))
    for(i <- 0 to noDuplicateArray.size-1) println(noDuplicateArray(i))
  }
}