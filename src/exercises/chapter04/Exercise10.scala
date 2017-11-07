package exercises.chapter04

/**
 * 10. What happens when you zip together two strings, such as "Hello".zip("World")?
 *     Come up with a plausible use case
 */
object Exercise10 extends App {
  // http://www.scala-lang.org/api/current/scala/collection/immutable/StringOps.html#zip[B](that:scala.collection.GenIterable[B]):String[(A,B)]
  
  // Returns: Vector((H,W), (e,o), (l,r), (l,l), (o,d))
  println("Hello".zip("World"))
  
  // Use case - index the characters:
  println("Hello".zip(Stream from 0))
}