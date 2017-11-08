package exercises.chapter05

/**
 * 1. Improve the Counter class in Section 5.1, “Simple Classes and Parameterless
 *    Methods,” on page 51 so that it doesn’t turn negative at Int.MaxValue.
 */
object Exercise01 extends App {
  class Counter {
   private var value = 0
   def increment() {
     if(value < Int.MaxValue) value += 1 
   } 
   def current() = value
  }
  
  // Test by incrementing past Int.MaxValue and confirming current stays there
  val counter = new Counter
  for(i <- 0 to Int.MaxValue) {
    counter.increment()
  }
  counter.increment()
  print(counter.current())
  assert(counter.current() == Int.MaxValue)
}