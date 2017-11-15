package exercises.chapter04

import scala.io.Source

/**
 * 4. Repeat the preceding exercise with a sorted map, so that the words are
 *    printed in sorted order.
 */
object Exercise04 extends App {
  
  // get String from file
  val source = Source.fromFile("src/exercises/chapter04/chapter04Words.txt", "UTF-8")
  // Split into array of words
  val words = source.mkString.split("\\W+")
  
  // Create wordCount
  val wordCount =  scala.collection.immutable.SortedMap[String, Int]() ++ ( // init as SortedMap
      for(word <- words.distinct) // Loop over each word only once
        yield (word, words.count(_==word)) )// For each word, get count of matches in the array
  
  // Print words and counts
  wordCount.foreach(println)
}