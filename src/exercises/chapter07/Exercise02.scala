package exercises.chapter07

/** 
 *  2. Write a puzzler that baffles your Scala friends, using a package com that isn't
 *  	 at the top level.
 */
object Exercise02 extends App {
  print(test.com.Test.name)
  assert(test.com.Test.name == "test")
}


package test.com {
  object Test {
    val name = "test"
  }
}