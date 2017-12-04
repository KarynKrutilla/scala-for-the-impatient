package exercises.chapter10

import java.awt.Point

/**
  * Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point.
  * Use lexicographic ordering, i.e. (x,y) < (x',y') if x < x' or x = x' and y < y'
  */
object Exercise02 extends App {

  class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x,y) with scala.math.Ordered[Point] {
    def compare(that: Point) = {
      val diff = ((this.x-that.x).signum, (this.y-that.y).signum)

      diff match {
        case(0,0) => 0
        case(-1,_) | (0,-1) => -1
        case _ => 1
      }
    }
  }

  // Test
  val firstPoint = new OrderedPoint(10, 5)
  val secondPoint = new OrderedPoint(10, 6)
  val thirdPoint = new OrderedPoint(15, 5)
  val fourthPoint = new OrderedPoint(5, 10)
  val fifthPoint = new OrderedPoint(5, 10)

  assert(firstPoint < secondPoint)
  assert(secondPoint < thirdPoint)
  assert(thirdPoint > fourthPoint)
  assert(fourthPoint < secondPoint)
  assert(fifthPoint == fourthPoint)


}
