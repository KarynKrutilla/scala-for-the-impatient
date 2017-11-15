package exercises.chapter07

/**
 * 3. Write a package random with functions nextInt(): Int, nextDouble(): Double, and
 * 	  setSeed(seed: Int): Unit. To generate random numbers, use the linear
 * 	  congruential generator
 * 			next = previous x a + b mod 2n,
 * 		where a = 1664525, b = 1013904223, and n = 32
 */
object Exercise03 extends App {
  // Test
  println(Random.nextDouble)
  println(Random.nextInt)
  println(Random.nextDouble)
  println(Random.nextInt)
}


package object Random {
  var previous:Double = 0
  val a:Int = 1663525
  val b:Int = 1013904223
  val n:Int = 32
  
  def setSeet(seed:Int) {
    previous = seed
  }
  
  def nextInt: Int = {
    nextDouble.toInt
  }
  
  def nextDouble: Double = {
    previous = ((previous * a + b) % scala.math.pow(2, n))
    previous
  }
}