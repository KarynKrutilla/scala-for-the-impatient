package exercises.chapter10

import java.io.{BufferedInputStream, FileInputStream, InputStream}


/**
  * Using the logger traits from this chapter, add logging to the solution of the preceding problem that demonstrates buffering.
  */
object Exercise10 extends App {
  // Add logger trait
  trait Logger {
    def log(msg:String)
  }

  // Reimplement buffering as a trait
  trait BufferingWithLog extends Logger {
    this:InputStream =>
    val buffer = new BufferedInputStream(this)
    // For simplicity, override the read method
    override def read(arr:Array[Byte]) = {
      log("reading array...")
      buffer.read(arr)
    }
    override def log(msg: String) = {
      println(msg)
    }
  }

  // Test
  val input = new FileInputStream("src/exercises/chapter10/exercise09.txt") with BufferingWithLog
  val arr = new Array[Byte](23)

  input.read(arr)

  arr.foreach(c => print(c.toChar))


}
