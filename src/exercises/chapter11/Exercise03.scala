package exercises.chapter11

/**
  * Implement the Fraction class with operations + - * /.
  * Normalize fractions, for example, turning 15/-6 into -5/2.
  * Divide by the greatest common divisor, like this:
  *
  *   class Fraction(n: Int, d: Int) {
  *     private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  *     private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)
  *     override def toString = s"$num/$den"
  *     def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  *     def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a%b)
  *     ...
  *   }
  */
object Exercise03 extends App {

  class Fraction(num: Int, den: Int) {
    val numerator:Int = num / gcd(num,den)
    val denominator:Int = den / gcd(num,den)


    def +(other:Fraction) = {
      new Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)
    }
    def -(other: Fraction) = {
      new Fraction(numerator*other.denominator-other.numerator*denominator, denominator*other.denominator)
    }
    def *(other: Fraction) = {
      new Fraction(numerator * other.numerator, denominator * other.denominator)
    }
    def /(other: Fraction) = {
      new Fraction(numerator * other.denominator, denominator * other.numerator)
    }


    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    // To simplify testing
    override def toString: String = numerator+"/"+denominator
  }

  // Test
  val f1 = new Fraction(2,3) // 10/15
  val f2 = new Fraction(4,5) // 12/15

  assert((f1+f2).toString == "22/15")
  assert((f1-f2).toString == "-2/15")
  assert((f2-f1).toString == "2/15")
  assert((f1*f2).toString == "8/15")
  assert((f1/f2).toString == "5/6")
  assert((f2/f1).toString == "6/5")
}
