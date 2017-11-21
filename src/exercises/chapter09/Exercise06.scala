package exercises.chapter09

import scala.io.Source

/**
  * 6. Make a regular expression searching for quoted strings "like this, maybe with
  *    \" or \\" in a Java or C++ program. Write a Scala program that prints out all
  *    such strings in a source file.
  */
object Exercise06 extends App {

  val pattern = """"(.*?)[^\\]"""".r

  val source = Source.fromFile("src/exercises/chapter09/Exercise06Source.java", "UTF-8").mkString
  val matches = pattern.findAllIn(source)

  matches.foreach(println)
}
