package exercises.chapter03

/**
 * 2. Write a loop that swaps adjacent elements of an array of integers. For example,
 *    Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 */
object Exercise02 {
  def main(args:Array[String]) {
    // Swaps two values in the provided array
    def swap(arr:Array[Int], index1:Int, index2:Int) = {
      val temp = arr(index1)
      arr(index1) = arr(index2)
      arr(index2) = temp
      arr
    }
    
    def updateArray(arr:Array[Int]) = { 
      for(i <- 0 to (arr.size, 2)) if(i < arr.size-1) swap(arr, i, i+1)
      arr
    }
    
    // Test
    val arr = Array(1, 2, 3, 4, 5)
    updateArray(arr)
    for(i <- 0 to arr.size-1) print(arr(i))

    assert(arr.deep == Array(2, 1, 4, 3, 5).deep)

  }
}