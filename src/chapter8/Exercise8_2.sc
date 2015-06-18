class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance: Double, interestRate: Double) extends BankAccount(initialBalance) {

  var counter : Int = 0

  def earnMonthlyInterest() = {
    currentBalance * (1 + interestRate)
    counter = 0
  }
  override def withdraw(amount: Double) : Double = {
    counter = counter + 1

    if(counter <= 3) {
      super.withdraw(amount)
    } else {
      super.withdraw(amount + 1)
    }
  }

  override def deposit(amount: Double) : Double = {
    counter = counter + 1

    if(counter <= 3) {
      super.deposit(amount)
    } else {
      super.deposit(amount - 1)
    }
  }
}
val account: SavingsAccount = new SavingsAccount(100, 0.05)
println(account.currentBalance)
println(account.withdraw(10))
println(account.withdraw(10))
println(account.withdraw(10))
println(account.withdraw(10))
println(account.deposit(10))
account.earnMonthlyInterest()
println(account.deposit(10))
println(account.deposit(10))
println(account.currentBalance)
