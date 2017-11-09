package exercises.chapter06

/**
 * 6. Write an enumeration describing the four playing card suits so that the toString
 *    method returns suit characters [characters removed because it broke Eclipse] 
 */
object Exercise06 extends App {
  
  object PlayingCards extends Enumeration { 
    type PlayingCards = Value
    val clubs = Value("\u2663")
    val diamonds = Value("\u2666")
    val hearts = Value("\u2665")
    val spades = Value("\u2660")
    
  }
  
  for(card <- PlayingCards.values) println(card.toString())
}