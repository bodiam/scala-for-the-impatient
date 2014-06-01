class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def currentBalance = balance
  def deposit(amount: Double) = { balance += amount }
  def withdraw(amount: Double) = { balance -= amount }
}


class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Unit = {
    super.withdraw(1)
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Unit = {
    super.withdraw(1)
    super.withdraw(amount)
  }
}


val account: CheckingAccount = new CheckingAccount(100)
account.withdraw(10)
account.deposit(10)
account.currentBalance

assert(account.currentBalance == 98)
