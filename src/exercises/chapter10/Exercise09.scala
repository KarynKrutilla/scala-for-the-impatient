package exercises.chapter10

import java.io.{BufferedInputStream, FileInputStream, InputStream}

/**
  * In the java.io library you can add buffering to an input stream with a BufferedInputStream decorator.
  * Reimplement buffering as a trait. For simplicity, override the read method.
  */
object Exercise09 extends App {

  // Reimplement buffering as a trait
  trait Buffering {
    this:InputStream =>
      val buffer = new BufferedInputStream(this)
      // For simplicity, override the read method
      override def read(arr:Array[Byte]) = buffer.read(arr)
  }

  // Test
  val input = new FileInputStream("src/exercises/chapter10/chapter10.txt") with Buffering
  val arr = new Array[Byte](23)

  input.read(arr)

  arr.foreach(c => print(c.toChar))
}
