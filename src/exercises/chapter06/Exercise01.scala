package exercises.chapter06

/**
 * 1. Write an object Conversions with methods
 *    inchesToCentimeters, gallonsToLiters, and milesToKilometers
 */
object Exercise01 extends App {
  
  object Conversions {
    def inchesToCentimeters(inches: Double) = {
      inches * 2.54
    }
    
    def gallonsToLiters(gallons: Double) = { 
      gallons * 3.7854
    }
    
    def milesToKilometers(miles: Double) = { 
      miles * 1.60934
    }
  }
  
  // Test
  println("3 inches = " + Conversions.inchesToCentimeters(3) + " cm")
  assert(Conversions.inchesToCentimeters(3) == 7.62)
  println("4 gallons = " + Conversions.gallonsToLiters(4) + " liters")
  assert(Conversions.gallonsToLiters(4) == 15.1416)
  println("8 miles = " + Conversions.milesToKilometers(8) + " kilometers")
  assert(Conversions.milesToKilometers(8) == 12.87472)
}