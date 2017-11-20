package exercises.chapter09

import scala.io.Source


/**
  * 1. Write a Scala code snippet that reverses the lines in a file (making the last
  *    line the first one, and so on).
  */
object Exercise01 extends App {

  val source = Source.fromFile("src/exercises/chapter09/exercise01.txt", "UTF-8")
  val lines = source.getLines()

  val reversedLines = lines.toArray.reverse.mkString("\n")

  print(reversedLines)

}
