package exercises.chapter10

import java.io.{BufferedInputStream, FileInputStream, InputStream}

/**
  * Implement a class IterableInputStream that extends java.io.InputStream with the trait Iterable[Byte]
  */
object Exercise11 extends App {

  class IterableInputStream(val input: InputStream) extends InputStream with Iterable[Byte] {
    def iterator = new Iterator[Byte] {
      def hasNext() = input.available() > 0
      def next() = input.read.toByte
    }
    def read = input.read()
  }

  // Test
  val stream = new IterableInputStream(new FileInputStream("src/exercises/chapter10/chapter10.txt"))
  stream.iterator.foreach(c => print(c.toChar))

}
