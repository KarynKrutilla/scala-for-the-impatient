package exercises.chapter03

import scala.collection.mutable.ArrayBuffer

/**
 * 6. How do you rearrange the elements of an Array[Int] so that they appear in
 *    reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
 */
object Exercise06 {
  def main(args:Array[String]) {
    def reverseArray(arr:Array[Int]) = {
      arr.reverse
    }
    
    def reverseArrayBuffer(arr:ArrayBuffer[Int]) = {
      arr.reverse
    }
    
    // Test
    val arr = reverseArray(Array(1,2,3,4,5))
    val arrBuff = reverseArrayBuffer(ArrayBuffer(1,2,3,4,5))
    
    println("arr:")
    for(i <- 0 to arr.size-1) print(arr(i))
    assert(arr.deep == Array(5,4,3,2,1).deep)

    println()

    println("arrBuff:")
    for(i <- 0 to arrBuff.size-1) print(arrBuff(i))
    assert(arrBuff == ArrayBuffer(5,4,3,2,1))
  }
}