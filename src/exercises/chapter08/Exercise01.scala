package exercises.chapter08

/**
  * 1. Extend the following BankAccount class to a CheckingAccount class that charges $1 for every deposit and withdrawal.
  *     class BankAccount(initialBalance: Double) {
  *       private var balance = initialBalance
  *       def deposit(amount: Double) = { balance += amount; balance }
  *       def withdraw(amount: Double) = { balance -= amount; balance }
  *     }
  */
object Exercise01 extends App {


  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
    var balance = initialBalance

    def chargeOneDollar {
      super.withdraw(1)
    }

    override def deposit(amount: Double) = {
      chargeOneDollar
      balance = super.deposit(amount)
      balance
    }

    override def withdraw(amount: Double) = {
      chargeOneDollar
      balance = super.withdraw(amount)
      balance
    }
  }

  // Test
  var account = new CheckingAccount(50)
  account.withdraw(19)
  println(account.balance)
  assert(account.balance == 30)
  account.deposit(11)
  println(account.balance)
  assert(account.balance == 40)
}
