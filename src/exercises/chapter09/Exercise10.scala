package exercises.chapter09

import scala.collection.mutable.ArrayBuffer
import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

/**
  * Expand the example in Section 9.8, "Serialization," on page 113.
  *
  * Construct a few Person objects, make some of them friends of others,
  * and save an Array[Person] to a file.
  *
  * Read the array back in and verify that the friend relations are intact.
  */
object Exercise10 extends App {

  // Expand example
  @SerialVersionUID(42L) class Person(val name: String) extends Serializable {
    private val friends = new ArrayBuffer[Person]

    def addFriend(person: Person) {
      friends += person
    }

    def hasFriend(person: Person) = {
      friends.contains(person)
    }
  }

  // Construct a few person objects
  val bob = new Person("Bob")
  val joe = new Person("Joe")
  val sarah = new Person("Sarah")
  val emily = new Person("Emily")

  // Make some of them friends of others
  bob.addFriend(joe)
  joe.addFriend(sarah)
  sarah.addFriend(emily)
  emily.addFriend(sarah)
  emily.addFriend(joe)

  // Verify friend relations
  assert(bob.hasFriend(joe))
  assert(joe.hasFriend(sarah))
  assert(sarah.hasFriend(emily))
  assert(emily.hasFriend(sarah))
  assert(emily.hasFriend(joe))
  assert(!emily.hasFriend(bob))

  // Save an Array[Person] to a file
  val people = Array(bob, joe, sarah, emily)

  val output = new ObjectOutputStream(new FileOutputStream("testing.obj"))
  output.writeObject(people)
  output.close()


  // Read the array back in
  val input = new ObjectInputStream(new FileInputStream("testing.obj"))
  val Array(bob2, joe2, sarah2, emily2) = input.readObject().asInstanceOf[Array[Person]]

  // Verify the friend relations are in tact
  assert(bob2.hasFriend(joe2))
  assert(joe2.hasFriend(sarah2))
  assert(sarah2.hasFriend(emily2))
  assert(emily2.hasFriend(sarah2))
  assert(emily2.hasFriend(joe2))
  assert(!emily2.hasFriend(bob2))
}
