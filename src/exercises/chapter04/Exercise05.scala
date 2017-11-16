package exercises.chapter04

import java.io.File
import java.util.{Scanner, TreeMap}
import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.Map

/**
 * 5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API
 */
object Exercise05 extends App {
  
  // read file
  val words = new Scanner(new File("src/exercises/chapter04/chapter04Words.txt")).useDelimiter("\\W+")

  // init new TreeMap
  val tree = new TreeMap[String, Int]()

  // Loop over each word & update tree
  while (words.hasNext()) {   
    val word = words.next()
    if (tree.contains(word)) tree(word)+=1 else tree(word)=1 // either populate in tree or update count
  }

  // convert to Scala map
  val map: Map[String, Int] = tree

  // print
  map.foreach(println)
}