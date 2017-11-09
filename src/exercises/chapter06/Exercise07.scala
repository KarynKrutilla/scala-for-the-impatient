package exercises.chapter06

import Exercise06.PlayingCards

/**
 * 7. Implement a function that checks whether a card suit value from the preceding
 *    exercise is red.
 * 
 */
object Exercise07 extends App {
    
  def isRed(card: PlayingCards.PlayingCards) = {
    if(card == PlayingCards.hearts || card == PlayingCards.diamonds)  true
    else false
  }
  
  
  // Test
  assert(isRed(PlayingCards.diamonds) == true)
  assert(isRed(PlayingCards.hearts) == true)
  assert(isRed(PlayingCards.spades) == false)
  assert(isRed(PlayingCards.clubs) == false)
}