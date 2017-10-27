package exercises.chapter02

import scala.math.pow

object Chapter02 {
  
  def main(args: Array[String]) {
    // 1. The signum of a number is 1 if the number is positive, –1 if it is negative, and
    //    0 if it is zero. Write a function that computes this value.

    def signum(num: Int): Int = {
    	if(num > 0) 1 else if(num == 0) 0 else -1
    }
    
    println("1 - positive numbber = " + signum(50))
    println("1 - negative number = " + signum(-50))
    println("1 - zero = " + signum(0))
    
      
    // 2. What is the value of an empty block expression {}? What is its type?
    println("2. value == ()")
    println("2. type == Unit")
  
    // 3. Come up with one situation where the assignment x = y = 1 is valid in Scala.
    //    Hint: Pick a suitable type for x.)
    var y = 0
    val x: Unit = y = 1
    
    // 4. Write a Scala equivalent for the Java loop
    //    for (int i = 10; i >= 0; i--) System.out.println(i); 
    
    print("4. ")
    for(i <- 0 to 10) print(i + " ") 
    println()
    
    // 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0.
    print("5. ")
    def countdown(n: Int) = {
      for(i <- n to(0,-1)) print(i + " ")
    }
    countdown(10)
    println()
    
    // 6. Write a for loop for computing the product of the Unicode codes of all letters in a string.
    print("6. ")
    var sum = 1L
    for(c <- "Hello") sum *= c.toLong
    println(sum)

    // 7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
    println("7. " + "Hello".map(_.toLong).product)

    // 8. Write a function product(s : String) that computes the product, as described in the preceding exercises.
    def product(s: String) = {
      s.map(_.toLong).product
    }
    println("8. " + product("Hello"))
    
    // 9. Make the function of the preceding exercise a recursive function.
    def recursiveProduct(s: String): Long = { 
      if(s.tail != "") s.head.toLong * recursiveProduct(s.tail) else s.head.toLong
    }
    println("9. " + recursiveProduct("Hello"))
    
    /**
     * Write a function that computes x^n , where n is an integer.
     * Use the following recursive definition:
     * • x^n = y^2 if n is even and positive, where y = x^n / 2 .
     * • x^n = x· x^n – 1 if n is odd and positive.
     * • x^0 = 1.
     * • x^n = 1 / x^n if n is negative.
     *
     * Don’t use a return statement */
    import math.pow
    def compute(x:Double, n: Int) = {
      if(n > 0 && n%2 == 0) pow( pow(x, n/2) , 2)
      else if(n > 0 && n%2 != 0) x*pow(x, n-1)
      else if(n < 0) 1/pow(x, -n)
      else if(n==0) 1
    }
    
    assert(compute(5,0)==1)
    println("10 - zero = " + compute(5, 0))
    assert(compute(5, 2) == 25)    
    println("10 - positive even = " + compute(5,2))
    assert(compute(5, 3) == 125)
    println("10 - positive odd = " + compute(5,3))
    assert(compute(5, -3) == .008)
    println("10 - negative = " + compute(5,-3))

  }
  

  
}