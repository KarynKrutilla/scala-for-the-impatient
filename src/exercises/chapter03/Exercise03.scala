package exercises.chapter03

/**
 * 3. Repeat the preceding assignment, but produce a new array with the swapped
 *    values. Use for/yield.
 */
object Exercise03 {
  def main(args:Array[String]) { 
    // Swaps two values in the provided array
    def swap(arr:Array[Int], index1:Int, index2:Int) = {
      val temp = arr(index1)
      arr(index1) = arr(index2)
      arr(index2) = temp
      arr
    }
    
    def updateArray(arr:Array[Int]) = { 
      for(i <- 0 to (arr.size, 2)) yield if(i < arr.size-1) swap(arr, i, i+1)
      arr
    }
    
    // Test
    val arr = Array(1, 2, 3, 4, 5)
    updateArray(arr)
    for(i <- 0 to arr.size-1) println(arr(i))
    
  }
}