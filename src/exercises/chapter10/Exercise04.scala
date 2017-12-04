package exercises.chapter10

/**
  * Provide a CryptoLogger trait that encrypts the log messages with the Caesar cipher.
  * The key should be 3 by default, but it should be overridable by the user.
  * Provide usage examples with the default key and a key of -3.
  */
object Exercise04 extends App {

  trait CryptoLogger {
    val key = 3
    def log(msg:String) = {
      var convertedMessage = ""
      for(char <- msg) {
        convertedMessage += ((char.toInt+key).toChar)
      }
      println(convertedMessage)
      convertedMessage
    }
  }

  class PersonDefault(val _name:String) extends {} with CryptoLogger {
    def name = {
      log(_name)
    }
  }
  class PersonWithDifferentKey(val _name:String) extends {override val key = -3} with CryptoLogger {
    def name = {
      log(_name)
    }
  }

  // Test
  val firstPerson = new PersonDefault("Joe")
  assert(firstPerson.name == "Mrh")
  val secondPerson = new PersonWithDifferentKey("Mrh")
  assert(secondPerson.name == "Joe")

}
