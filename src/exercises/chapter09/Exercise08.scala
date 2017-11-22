package exercises.chapter09

import scala.io.Source

/**
  * 8. Write a Scala program that prints the src attributes of all img tags of a web
  *    page. Use regular expressions and groups.
  */
object Exercise08 extends App {

  val regex = """<img.*? src="(.+?)"""".r
  val source = Source.fromURL("http://www.cnn.com").mkString

  for(regex(img) <- regex.findAllIn(source)) println(img)
}
