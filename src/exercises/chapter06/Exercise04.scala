package exercises.chapter06

import java.awt.Point

/**
 * 4. Define a Point class with a companion object so that you can construct Point
 *    instances as Point(3, 4), without using new.
 */
object Exercise04 extends App {
  class Point (val x: Int, val y: Int) {
    
  }
  
  object Point {
    def apply(x: Int, y: Int) = {
      new Point(x, y)
    }
  }
  
  // Test
  val pt = Point(1, 2)
  assert(pt.x == 1)
  assert(pt.y == 2)
}