package exercises.chapter10

/**
  * The java.awt.Rectangle class has useful methods translate and grow that are
  * unfortunately absent from classes such as java.awt.geom.Ellipse2D.
  * In Scala, you can fix this problem.
  * Define a trait RectangleLike with concrete methods translate and grow.
  * Provide any abstract methods that you need for the implementation, so that
  * you can mix in the trait like this:
  *
  * val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  * egg.translate(10, -10)
  * egg.grow(10, 20)
  *
  */
object Exercise01 extends App {


  trait RectangleLike {
    this: java.awt.geom.Ellipse2D =>
      def translate(x: Int, y: Int) {
        setFrame(getX + x, getY + y, getWidth, getHeight)
      }

    def grow(x: Int, y: Int) {
      setFrame(getX, getY, getWidth+x, getHeight+y)
    }
  }

  // Test
  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike

  assert(egg.getX == 5)
  assert(egg.getY == 10)

  egg.translate(10, -10)

  assert(egg.getX == 15)
  assert(egg.getY == 0)

  egg.grow(10, 20)

  assert(egg.getWidth == 30)
  assert(egg.getHeight == 50)
}
