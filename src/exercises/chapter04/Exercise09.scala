package exercises.chapter04

/**
 * 9. Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
 *    the counts of values less than v, equal to v, and greater than v.
 */
object Exercise09 extends App {
  
  def lteqgt(values: Array[Int], v:Int) = {
    (values.count(_ < v), // count of values less than v
        values.count(_ == v), // count of values equal to v
        values.count(_ > v)) // count of values greater than v
  }
   
  // Test:
  val results = lteqgt(Array(1,2,3,4,5,5,6,7,8,9,10), 5)
  println(results)
  assert(results == (4,2,5))
}