package exercises.chapter05

/**
 * 6. In the Person class of Section 5.1, "Simple Classes and Parameterless Methods,"
 *    on page 51, provide a primary constructor that turns negative ages to 0.
 */
object Exercise06 extends App {
  
  class Person(inputAge:Int) {
   private var privateAge = {
     if(inputAge < 0) 0
     else inputAge
   }
   def age = privateAge
   def age_= (newValue: Int) {
     if (newValue > privateAge) privateAge = newValue; // Can't get younger
   }
  }

  // Test
  val fred = new Person(5)
  fred.age = 30
  fred.age = 21
  println(fred.age) // 30
  assert(fred.age == 30)
  
  val john = new Person(-5)
  println(john.age)
  assert(john.age == 0)

}