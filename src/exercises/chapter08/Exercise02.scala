package exercises.chapter08

import Exercise01.BankAccount
/**
  * 2. Extend the BankAccount class of the preceding exercise into a class SavingsAccount
  *    that earns interest every month (when a method earnMonthlyInterest is called)
  *    and has three free deposits or withdrawals every month. Reset the transaction
  *    count in the earnMonthlyInterest method.
  */
object Exercise02 extends App {

  class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
    var balance = initialBalance
    var numFreeTransactions = 0

    def earnMonthlyInterest: Unit = {
      numFreeTransactions = 0
      balance = super.deposit(balance * .01)
    }

    def chargeForTransaction: Unit = {
      super.withdraw(1)
    }

    override def withdraw(amount: Double): Double = {
      numFreeTransactions += 1
      if(numFreeTransactions > 3) {
        chargeForTransaction
      }
      balance = super.withdraw(amount)
      balance
    }

    override def deposit(amount: Double): Double = {
      numFreeTransactions += 1
      if(numFreeTransactions > 3) {
        chargeForTransaction
      }
      balance = super.deposit(amount)
      balance
    }

  }

  // Test

  // init account
  var account = new SavingsAccount(500)

  // 3 free transactions
  account.deposit(30)
  account.withdraw(20)
  account.deposit(5)
  assert(account.balance == 515)

  // charged for transactions
  account.deposit(6)
  assert(account.balance == 520)
  account.withdraw(4)
  assert(account.balance == 515)

  // earn interest
  account.earnMonthlyInterest
  assert(account.balance == 520.15)

  // transactions should be free again
  account.deposit(4.85)
  account.withdraw(10)
  assert(account.balance == 515)
}
