package exercises.chapter11

/**
  * Implement a class Money with fields for dollars and cents. Supply +,- operators as well as
  * comparison operators == and <.
  * For example, Money(1, 75) + Money(0, 50) == Money(2, 25) should be true.
  * Should you also supply * and / operators? why or why not?
  */
object Exercise04 extends App {

  class Money(val dollars:Int, val cents:Int) {
    def ==(other:Money) = {
      convertToCents(this.dollars, this.cents) == convertToCents(other.dollars, other.cents)
    }
    def +(other:Money) = {
      convertCentsToMoney(convertToCents(this.dollars, this.cents) + convertToCents(other.dollars, other.cents))
    }
    def -(other:Money) = {
      convertCentsToMoney(convertToCents(this.dollars, this.cents) - convertToCents(other.dollars, other.cents))
    }

    def convertToCents(dollars:Int, cents:Int) = {
      (dollars*100) + cents
    }

    def convertCentsToMoney(cents:Int) = {
      new Money(cents / 100, cents % 100)
    }

    // Should you also supply * and / operators? why or why not?
    // I am not adding these operators because you would not multiply or divide two money objects.
  }

  object Money {
    def apply(dollars:Int, cents:Int) {
      new Money(dollars, cents)
    }
  }

  // Test
  val m1 = new Money(1,75)
  val m2 = new Money(0,50)
  val m3 = new Money(0,85)

  assert(!(m1 == m2))
  assert(m1+m2 == new Money(2,25))
  assert((m1-m2) == new Money(1,25))
  assert((m1-m3) == new Money(0,90))


}
