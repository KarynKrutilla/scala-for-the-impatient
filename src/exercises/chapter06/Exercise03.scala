package exercises.chapter06

import java.awt.Point

/**
 * 3. Define an Origin object that extends java.awt.Point. Why is this not actually a
 *    good idea? (Have a close look at the methods of the Point class.)
 */
object Exercise03 {
  
  object Origin extends Point {}
  
  // The below code doesn't fit because Origin should not move
  Origin.move(1, 2)
}