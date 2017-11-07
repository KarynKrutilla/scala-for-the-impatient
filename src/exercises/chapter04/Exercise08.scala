package exercises.chapter04

/**
 * 8. Write a function minmax(values: Array[Int]) that returns a pair containing the
 *    smallest and largest values in the array.
 */
object Exercise08 extends App {
  
  def minmax(values: Array[Int]) = {
    (values.min, values.max)
  }
  
  // Test: 
  val result = minmax(Array(1,2,3,4,8,7,6,5))
  print(result)
  assert(result == (1,8)) 
}