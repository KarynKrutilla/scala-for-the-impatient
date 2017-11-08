package exercises.chapter05

import scala.beans.BeanProperty

/**
 * 5. Make a class Student with read-write JavaBeans properties name (of type String)
 *    and id (of type Long). What methods are generated? (Use javap to check.) Can
 *    you call the JavaBeans getters and setters in Scala? Should you?
 * 
 */
object Exercise05 extends App {
  class Student(@BeanProperty var name: String, @BeanProperty var id: Long) { }
  
  // Can you call the JavaBeans getters and setters in Scala?
  var s = new Student("Bob", 123)
  
  s.setId(321)
  assert(s.getId() == 321)
  
  // Should you?
  // It should be used to interact with Java libraries.
}