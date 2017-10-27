package exercises.chapter04

import scala.io.Source

/**
 * 2. Write a program that reads words from a file. Use a mutable map to count
 *    how often each word appears. To read the words, simply use a java.util.Scanner:
 *    val in = new java.util.Scanner(java.io.File("myfile.txt"))
 *    while (in.hasNext()) process in.next()
 *    Or look at Chapter 9 for a Scalaesque way.
 *    At the end, print out all words and their counts
 */
object Exercise02 extends App {
  
  // init wordCount
  val wordCount = new scala.collection.mutable.HashMap[String, Int]
  // get String from file
  val source = Source.fromFile("chapter04Words.txt", "UTF-8")
  // Split into array of words
  val words = source.mkString.split("\\W+")
  // Update wordCount
  for(word <- words) wordCount += word -> (wordCount.getOrElse(word, 0)+1)
  
  // Print words and counts
  for((k, v) <- wordCount) println(k + " -> " + v)
 }