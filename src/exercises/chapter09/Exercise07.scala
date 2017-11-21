package exercises.chapter09

import scala.io.Source

/**
  * 7. Write a Scala program that reads a text file and prints all tokens in the file
  *    that are not floating-point numbers. Use a regular expression.
  */
object Exercise07 extends App {

  val pattern = "([aA-zZ]+)".r
  val source = Source.fromFile("src/exercises/chapter09/exercise07.txt").mkString

  pattern.findAllIn(source).foreach(println)


}
