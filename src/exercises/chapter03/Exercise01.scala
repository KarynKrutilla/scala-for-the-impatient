package exercises.chapter03

import scala.util.Random

/**
 * 1. Write a code snippet that sets a to an array of n random integers between 0
 *    (inclusive) and n (exclusive).
 */
object Exercise01{
  def main(args: Array[String]) {
    def createArray(n:Int) = { 
      val a = new Array[Int](n)
      for(i <- 0 to n-1) a(i) = Random.nextInt(n)
      a
    }
    
    // Test
    val size = 15
    val createdArray = createArray(size)
    for(i <- 0 to size-1) println(createdArray(i))

  }
 

}