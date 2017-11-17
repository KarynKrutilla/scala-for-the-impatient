package exercises.chapter08

/**
  * 5. Design a class Point whose x and y coordinate values can be provided in a
  *    constructor. Provide a subclass LabeledPoint whose constructor takes a label
  *    value and x and y coordinates, such as
  *
  *       new LabeledPoint("Black Thursday", 1929, 230.07)
  */
class Exercise05 {

  abstract class Point(val x: Double, val y: Double)

  class LabeledPoint(val label: String, x:Double, y:Double) extends Point(x, y)


  val labeledPoint = new LabeledPoint("Black Thursday", 1929, 230.07)

}
