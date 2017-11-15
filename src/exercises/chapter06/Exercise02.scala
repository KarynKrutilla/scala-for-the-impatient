package exercises.chapter06

/**
 * 2. The preceding problem wasn't very object-oriented. Provide a general superclass
 *    UnitConversion and define objects InchesToCentimeters, GallonsToLiters, and
 *    MilesToKilometers that extend it
 */
object Exercise02 extends App {
  
  abstract class UnitConversion {
    def convert(value: Double): Double
  }
  
  object InchesToCentimeters extends UnitConversion {
    def convert(value: Double) = { 
      value * 2.54
    }
  }
  
  object GallonsToLiters extends UnitConversion {
    def convert(value: Double) = { 
      value * 3.7854
    }
  }
  
  object MilesToKilometers extends UnitConversion {
    def convert(value: Double) = { 
      value * 1.60934
    }
  }
  
  // Test
  println("3 inches = " + InchesToCentimeters.convert(3) + " cm")
  assert(InchesToCentimeters.convert(3) == 7.62)
  println("4 gallons = " + GallonsToLiters.convert(4) + " liters")
  assert(GallonsToLiters.convert(4) == 15.1416)
  println("8 miles = " + MilesToKilometers.convert(8) + " kilometers")
  assert(MilesToKilometers.convert(8) == 12.87472)
}