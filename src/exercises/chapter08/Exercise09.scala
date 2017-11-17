package exercises.chapter08

/**
  * 9. In the Creature class of Section 8.10, “Construction Order and Early Definitions,”
  * on page 94, replace val range with a def. What happens when you also use a
  * def in the Ant subclass? What happens when you use a val in the subclass?
  * Why?
  */
object Exercise09 extends App {

  class Creature {
//    val range: Int = 10
    def range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }

  // What happens when you also use a def in the Ant Subclass?
  class AntDef extends Creature {
    override def range = 2
  }
  // Range gets overwritten by the subclass's value and env size reflects it:
  val antDef = new AntDef
  println(antDef.env.size)
  assert(antDef.env.size == 2)


  // What happens when you use a val in the subclass?
  class AntVal extends Creature {
    override val range = 2
  }
  // Range gets overwritten by the subclass's value but env size is 0:
  val antVal = new AntVal
  println(antVal.env.size)
  assert(antVal.env.size == 0)

  // Why?
  // Range gets overwritten after the Creature constructor is run and env is initialized


}
