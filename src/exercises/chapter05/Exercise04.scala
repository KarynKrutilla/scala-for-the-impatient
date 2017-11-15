package exercises.chapter05

/**
 * 4. Reimplement the Time class from the preceding exercise so that the internal
 *    representation is the number of minutes since midnight (between 0 and
 *    24 x 60 - 1). Do not change the public interface. That is, client code should be
 *    unaffected by your change.
 */
object Exercise04 extends App {
  class Time(hrs: Int, min: Int) {
    val time = {
      if((hrs * min) > 1439) 1439
      else if((hrs * min) < 0) 0
      else hrs * min
    }
    
    // Check whether this time come before the given time
    def before(other: Time): Boolean = {
      return time < other.time
    }
  }
  
  // Below tests copied from Exercise03
  val t1 = new Time(2, 30)
  val t2 = new Time(2, 45)
  val t3 = new Time(3, 30)
  
  assert(t1.before(t2) == true)
  assert(t2.before(t1) == false)
  assert(t3.before(t1) == false)
}