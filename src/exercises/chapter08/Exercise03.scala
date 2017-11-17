package exercises.chapter08

/**
  * 3. Consult your favorite Java or C++ textbook that is sure to have an example
  *    of a toy inheritance hierarchy, perhaps involving employees, pets, graphical
  *    shapes, or the like. Implement the example in Scala.
  */
object Exercise03 extends App {


  abstract class Animal {
    def identify: Unit
    def makeNoise: Unit
  }

  class Dog extends Animal {
    override def identify: Unit = {
      println("I'm a dog!")
    }
    override def makeNoise: Unit = {
      println("woof")
    }
  }

  class Cat extends Animal {
    override def identify: Unit = {
      println("I'm a cat!")
    }
    override def makeNoise: Unit = {
      println("meow")
    }
  }

  class Cow extends Animal {
    override def identify: Unit = {
      println("I'm a cow!")
    }
    override def makeNoise: Unit = {
      println("moo")
    }
  }



  def identifyAndMakeNoise(animal: Animal): Unit = {
    animal.identify
    animal.makeNoise
  }

  identifyAndMakeNoise(new Dog)
  identifyAndMakeNoise(new Cat)
  identifyAndMakeNoise(new Cow)

}
