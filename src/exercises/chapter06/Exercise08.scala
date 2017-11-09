package exercises.chapter06

/**
 * 8. Write an enumeration describing the eight corners of the RGB color cube. As
 *    IDs, use the color values (for example, 0xff0000 for Red).
 */
object Exercise08 extends App {

  object RGBColorCube extends Enumeration {
    val red = Value(0xff0000, "red")
    val green = Value(0x00ff00, "green")
    val blue = Value(0x0000ff, "blue")
    val redgreen = Value(0xffff00, "red-green")
    val redblue = Value(0xff00ff, "red-blue")
    val greenblue = Value(0x00ffff, "green-blue")
    val black = Value(0x000000, "black")
    val white = Value(0xffffff, "white")
  }
  
  for(color <- RGBColorCube.values) println(color.id + " = " + color.toString())
}