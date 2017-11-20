package exercises.chapter09

import java.io.PrintWriter

import scala.io.Source

/**
  * 2. Write a Scala program that reads a file with tabs, replaces each tab with spaces
  *    so that tab stops are at n-column boundaries, and writes the result to the
  *    same file.
  */
object Exercise02 extends App {

  // Read file with tabs
  val source = Source.fromFile("src/exercises/chapter09/exercise02.txt", "UTF-8")
  val linesWithTabs = source.getLines()

  // Replace each tab with spaces
  var linesWithSpaces = ""
  for(l <- linesWithTabs) {
    linesWithSpaces += l.replace("\t"," ")
    linesWithSpaces += "\n"
  }

  // Write result to the same file
  val writer = new PrintWriter("src/exercises/chapter09/exercise02.txt")
  for(l <- linesWithSpaces) {
    writer.write(l)
  }

  writer.close()
}
