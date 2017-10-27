package exercises.chapter01

import scala.BigInt

object Chapter01 {
  def main(args: Array[String]) {
    // 1. In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?

    //scala> 3.
    //!=   <    >>>         doubleValue   isNaN           isValidShort   shortValue       toDouble        toShort
    //%    <<   ^           floatValue    isNegInfinity   isWhole        signum           toFloat         unary_+
    //&    <=   abs         floor         isPosInfinity   longValue      to               toHexString     unary_-
    //*    ==   byteValue   getClass      isValidByte     max            toBinaryString   toInt           unary_~
    //+    >    ceil        intValue      isValidChar     min            toByte           toLong          underlying
    //-    >=   compare     isInfinite    isValidInt      round          toChar           toOctalString   until
    ///    >>   compareTo   isInfinity    isValidLong     self           toDegrees        toRadians       |
    
    // 2. In the Scala REPL, compute the square root of 3, and then square that value.
    //    By how much does the result differ from 3? (Hint: The res variables are your friend.)
    
    println("2. " + (3 - math.pow(math.sqrt(3), 2)))
    
    // 3. Are the res variables val or var?
    println("3. val")
    
    // 4. Scala lets you multiply a string with a number - try out "crazy" * 3 in the REPL.
    //    What does this operation do? Where can you find it in Scaladoc?
    
    // http://www.scala-lang.org/api/current/scala/collection/immutable/StringOps.html#*(n:Int):String
    println("4. " + "crazy"*3)

    // 5. What does 10 max 2 mean? In which class is the max method defined?
    
    // Returns this if this > that or that otherwise.
    // http://www.scala-lang.org/api/current/scala/Int.html#max(that:Int):Int
    println("5. " + ((10 max 2)))
    
    // 6. Using BigInt, compute 2^1024
    println("6. " + BigInt(2).pow(1024))
    
    // 7. What do you need to import so that you can get a random prime as
    //    probablePrime(100, Random), without any qualifiers before probablePrime and Random?
    
    import math.BigInt.probablePrime
    import scala.util.Random
    probablePrime(100, Random)
    
    // 8. One way to create random file or directory names is to produce a random
    //    BigInt and convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul".
    //    Poke around Scaladoc to find a way of doing this in Scala.
    
    println("8. " + probablePrime(100, Random).toString(36))
    
    // 9. How do you get the first character of a string in Scala? The last character?
    println("9 - first character = " + "testString".head)
    println("9 - last character = " + "testString".last)
    
    // 10. What do the take, drop, takeRight, and dropRight string functions do? What
    //     advantage or disadvantage do they have over using substring?
    
    // http://www.scala-lang.org/api/current/scala/collection/immutable/StringOps.html#take(n:Int):Repr
    println("10 - take = " + "testString".take(3))
    // http://www.scala-lang.org/api/current/scala/collection/immutable/StringOps.html#drop(n:Int):Repr
    println("10 - drop = " + "testString".drop(3))
    // http://www.scala-lang.org/api/current/scala/collection/immutable/StringOps.html#takeRight(n:Int):Repr
    println("10 - takeRight = " + "testString".takeRight(3))
    // http://www.scala-lang.org/api/current/scala/collection/immutable/StringOps.html#dropRight(n:Int):Repr
    println("10 - dropRight = " + "testString".dropRight(3))
    
  }
}