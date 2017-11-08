package exercises.chapter05

/**
 * 3. Write a class Time with read-only properties hours and minutes and a method
 *    before(other: Time): Boolean that checks whether this time comes before the
 *    other. A Time object should be constructed as new Time(hrs, min), where hrs is in
 *    military time format (between 0 and 23).
 */
object Exercise03 extends App {
  class Time(hrs: Int, min: Int) {
    // Normalize hrs to be between 0 and 23
    val _hrs = {
      if(hrs < 0){
        0
      }
      else if(hrs > 23) 23
      else hrs
    }
    // Normalize min to be between 0 and 59
    val _min = {
      if(min < 0) 0
      else if(min > 59) 59
      else min
    }
    
    // Check whether this time come before the given time
    def before(other: Time): Boolean = {
      if(_hrs < other._hrs) true
      else if(_hrs > other._hrs) false
      else // if(_hrs == other._hrs), check mins
        if(_min < other._min) true
        else false
    }
  }
  
  // Test hrs constraints
  val negativeHrs = new Time(-1,30)
  val tooManyHrs = new Time(40, 30)
  println("negativeHrs hours = " + negativeHrs._hrs)
  assert(negativeHrs._hrs == 0)
  println("tooManyHrs hrs = " + tooManyHrs._hrs)
  assert(tooManyHrs._hrs == 23)
  
  // Test mins constraints
  val negativeMins = new Time(10,-20)
  println("negativeMins mins = " + negativeMins._min)
  assert(negativeMins._min == 0)
  val tooManyMins = new Time(20,70)
  println("tooManyMins mins = " + tooManyMins._min)
  assert(tooManyMins._min == 59)
  
  // Test before function
  val t1 = new Time(2, 30)
  val t2 = new Time(2, 45)
  val t3 = new Time(3, 30)
  
  assert(t1.before(t2) == true)
  assert(t2.before(t1) == false)
  assert(t3.before(t1) == false)
  
}