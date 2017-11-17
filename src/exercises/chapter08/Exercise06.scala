package exercises.chapter08

/**
  * 6. Define an abstract class Shape with an abstract method centerPoint and subclasses
  *    Rectangle and Circle. Provide appropriate constructors for the subclasses and
  *    override the centerPoint method in each subclass.
  */
object Exercise06 extends App {


  abstract class Shape {
    def centerPoint: (Double, Double)
  }

  class Rectangle(topLeft: (Double, Double), width: Double, height: Double) extends Shape {
    override def centerPoint: (Double, Double) = {
      ((topLeft._1 + (width/2)), (topLeft._2 + (height/2)))
    }
  }

  class Circle(center: (Double, Double), radius: Double) extends Shape {
    override def centerPoint: (Double, Double) = center
  }

  // Test
  var rec = new Rectangle((10, 20), 6, 4)
  assert(rec.centerPoint == (13, 22))

  var circle = new Circle((10, 20), 5)
  assert(circle.centerPoint == (10,20))
}
