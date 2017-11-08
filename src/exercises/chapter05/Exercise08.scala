package exercises.chapter05

/**
 * 8. Make a class Car with read-only properties for manufacturer, model name,
 *    and model year, and a read-write property for the license plate. Supply four
 *    constructors. All require the manufacturer and model name. Optionally,
 *    model year and license plate can also be specified in the constructor. If not,
 *    the model year is set to -1 and the license plate to the empty string. Which
 *    constructor are you choosing as the primary constructor? Why?
 * 
 */
object Exercise08 extends App{
  
  
  class Car(val manufacturer: String, val modelName: String) {
    // Default model year to -1 and license plate to empty string
    var licensePlate = ""
    private var _modelYear = -1
    
    // Auxiliary Constructors:
    def this(manufacturer: String, modelName: String, modelYear: Int) {
      this(manufacturer, modelName)
      this._modelYear = modelYear
    }
    
    def this(manufacturer: String, modelName: String, licensePlate: String) { 
      this(manufacturer, modelName)
      this.licensePlate = licensePlate
    }
    
    def this(manufacturer: String, modelName: String, modelYear: Int, licensePlate: String) { 
      this(manufacturer, modelName)
      this._modelYear = modelYear
      this.licensePlate = licensePlate
    }
    
    // Access to modelYear
    def modelYear = _modelYear
    
    
    // Test
    var c1 = new Car("manufacturer", "model")
    assert(c1.manufacturer == "manufacturer")
    assert(c1.modelName == "model")
    assert(c1.modelYear == -1)
    assert(c1.licensePlate == "")
    
    var c2 = new Car("manufacturer", "model", "licensePlate")
    assert(c2.manufacturer == "manufacturer")
    assert(c2.modelName == "model")
    assert(c2.modelYear == -1)
    assert(c2.licensePlate == "licensePlate")
    
    var c3 = new Car("manufacturer", "model", 2008)
    assert(c2.manufacturer == "manufacturer")
    assert(c2.modelName == "model")
    assert(c2.modelYear == 2008)
    assert(c2.licensePlate == "")
    
    var c4 = new Car("manufacturer", "model", 2008, "licensePlate")
    assert(c2.manufacturer == "manufacturer")
    assert(c2.modelName == "model")
    assert(c2.modelYear == 2008)
    assert(c2.licensePlate == "licensePlate")
    
    
  }
}