package exercises.chapter05

/**
 * 7. Write a class Person with a primary constructor that accepts a string containing
 *    a first name, a space, and a last name, such as new Person("Fred Smith"). Supply
 *    read-only properties firstName and lastName. Should the primary constructor
 *    parameter be a var, a val, or a plain parameter? Why?
 */
object Exercise07 extends App {
  
  class Person(name: String) {
    val firstName = name.split(" ")(0)
    val lastName = name.split(" ")(1)
  }
  
  // Test
  val person = new Person("Fred Smith")
  println("First name = " + person.firstName)
  assert(person.firstName == "Fred")
  println("Last name = " + person.lastName)
  assert(person.lastName == "Smith")
}