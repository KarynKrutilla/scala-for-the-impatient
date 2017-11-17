package exercises.chapter08

import scala.collection.mutable.ListBuffer

/**
  * 4. Define an abstract class Item with methods price and description. A SimpleItem is
  *    an item whose price and description are specified in the constructor. Take
  *    advantage of the fact that a val can override a def. A Bundle is an item that
  *    contains other items. Its price is the sum of the prices in the bundle. Also
  *    provide a mechanism for adding items to the bundle and a suitable description
  *    method.
  */
object Exercise04 extends App {

  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(val price: Double, val description: String) extends Item

  class Bundle extends Item {
    private var items = ListBuffer[Item]()

    def addItem(item: Item): Unit = {
      items += item
    }

    override def description: String = {
      items.map(_.description).mkString(",")
    }

    override def price: Double = {
      items.foldLeft(0.0)((sum, item) => sum + item.price)
    }
  }


  // Test
  val a = new SimpleItem(2.25, "item A")
  val b = new SimpleItem(3.75, "item B")

  val c = new Bundle
  c.addItem(a)
  c.addItem(b)
  
  assert(c.price == 6)
  assert(c.description == "item A,item B")
}
