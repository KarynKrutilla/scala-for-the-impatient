package exercises.chapter08

/**
  * 7. Provide a class Square that extends java.awt.Rectangle and has three constructors:
  *    one that constructs a square with a given corner point and width, one that
  *    constructs a square with corner (0, 0) and a given width, and one that constructs
  *    a square with corner (0, 0) and width 0.
  */
object Exercise07 extends App {

  // Construct a square with given corner point and width
  class Square(x:Int, y:Int, width:Int) extends java.awt.Rectangle (x, y, width, width) {

    // Construct a square with corner (0,0) and width 0
    def this() {
      this(0, 0, 0)
    }

    // Construct a square with corner (0,0) and a given width
    def this(width: Int) {
      this(0, 0, width)
    }
  }

  // Test
  val firstSquare = new Square
  assert(firstSquare.x == 0)
  assert(firstSquare.y == 0)
  assert(firstSquare.width == 0)

  val secondSquare = new Square(5, 6, 2)
  assert(secondSquare.x == 5)
  assert(secondSquare.y == 6)
  assert(secondSquare.width == 2)

  val thirdSquare = new Square(8)
  assert(thirdSquare.x == 0)
  assert(thirdSquare.y == 0)
  assert(thirdSquare.width == 8)
}
