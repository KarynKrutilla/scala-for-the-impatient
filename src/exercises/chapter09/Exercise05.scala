package exercises.chapter09

import scala.math.pow
import java.io.PrintWriter

/**
  * 5. Write a Scala program that writes the powers of 2 and their reciprocals to a
  * file, with the exponent ranging from 0 to 20. Line up the columns:
  *     1    1
  *     2    0.5
  *     4    0.25
  *   ...    ...
  */
object Exercise05 extends App {

  val writer = new PrintWriter("src/exercises/chapter09/exercise05.txt")

  for(i <- 0 to 20) {
    val exp = pow(2, i)
    writer.println("%9d   ".format(exp.toInt) + 1/exp)
  }
  writer.close()
}
