package exercises.chapter10

/**
  * There are dozens of Scala trait tutorials with silly examples of barking dogs or philosophizing frogs.
  * Reading through contrived hierarchies can be tedious and not very helpful, but designing your own is very illuminating.
  *
  * Make your own silly trait hierarchy example that demonstrates layered traits, concrete and abstract methods, and concrete and abstract fields.
  */
object Exercise08 extends App {

  trait Animal {
    var animalType: String
    var sound: String

    def intro = "The %s says %s".format(animalType, sound)
    def getNumLegs: Int
  }

  class Dog extends Animal {
    var animalType = "dog"
    var sound = "woof"

    override def getNumLegs: Int = 4
  }

  class Crow extends Animal {
    var animalType = "crow"
    var sound = "caw"

    override def getNumLegs: Int = 2
  }


  // Test
  val d = new Dog
  val c = new Crow

  assert(d.getNumLegs == 4)
  assert(c.getNumLegs == 2)

  println(d.intro)
  println(c.intro)

  assert(d.intro == "The dog says woof")
  assert(c.intro == "The crow says caw")



}
