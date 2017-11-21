package exercises.chapter09

import scala.io.Source

/**
  * 4. Write a Scala program that reads a text file containing only floating-point
  *    numbers. Print the sum, average, maximum, and minimum of the numbers
  *    in the file.
  */
object Exercise04 extends App {

  val source = Source.fromFile("src/exercises/chapter09/exercise04.txt", "UTF-8")
  val tokens = source.mkString.split("\\s+")
  val numbers = tokens.map(_.toDouble)

  val sum = numbers.sum
  println("sum: " + sum)
  assert(sum == 30.8)

  val average = sum / numbers.length
  println("average: " + average)
  assert(average == 4.4)

  val max = numbers.max
  println("maximum: " + max)
  assert(max == 7.7)

  val min = numbers.min
  println("minimum: " + min)
  assert(min == 1.1)
}
