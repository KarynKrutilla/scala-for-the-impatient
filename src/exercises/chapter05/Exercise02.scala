package exercises.chapter05

/**
 * 2. Write a class BankAccount with methods deposit and withdraw, 
 *    and a read-only property balance.
 */
object Exercise02 extends App {
  
  class BankAccount {
    private var _balance = 0
    
    def balance = _balance
    def deposit(value: Int) {
      _balance += value
    }
    def withdraw(value: Int) {
      _balance -= value
    }
  }
  
  // Test
  val bankAccount = new BankAccount
  bankAccount.deposit(50)
  println(bankAccount.balance)
  assert(bankAccount.balance == 50)
  bankAccount.withdraw(25)
  println(bankAccount.balance)
  assert(bankAccount.balance == 25)
}