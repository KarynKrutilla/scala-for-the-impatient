package exercises.chapter09

import scala.io.Source

/**
  * 3. Write a Scala code snippet that reads a file and prints all words with more
  *    than 12 characters to the console. Extra credit if you can do this in a single line.
  */
object Exercise03 extends App {

  // Read file
  val source = Source.fromFile("src/exercises/chapter09/exercise03.txt", "UTF-8")
  val words = source.getLines.flatMap(_.split("\\W+"))

  // Print to console if word is over 12 chars
  for(word <- words) {
    if(word.length > 12) println(word)
  }


  // The same functionality in a single line
  for(word <- Source.fromFile("src/exercises/chapter09/exercise03.txt", "UTF-8").getLines.flatMap(_.split("\\W+"))) if(word.length > 12) println(word)
}
