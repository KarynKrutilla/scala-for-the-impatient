package exercises.chapter04

import scala.io.Source

/**
 * 3. Repeat the preceding exercise with an immutable map.
 */
object Exercise03 extends App {
  
  // get String from file
  val source = Source.fromFile("src/exercises/chapter04/chapter04Words.txt", "UTF-8")
  // Split into array of words
  val words = source.mkString.split("\\W+")
  
  // Create wordCount
  val wordCount = 
    for(word <- words.distinct) // Loop over each word only once
      yield (word, words.count(_==word)) // For each word, get count of matches in the array
  
  // Print words and counts
  for((k, v) <- wordCount) println(k + " -> " + v)

  
}