package exercises.chapter03

/**
 * 5. How do you compute the average of an Array[Double]?
 */
object Exercise05 {
  def main(args:Array[String]) {
    def findAverage(arr:Array[Int]) = {
      arr.sum / arr.size
    }
    
    // Test
    val arr = Array(10,20,30,40,50)
    assert(findAverage(arr) == 30)
  }
}