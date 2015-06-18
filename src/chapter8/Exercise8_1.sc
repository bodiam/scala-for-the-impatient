class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def currentBalance = balance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def withdraw(amount: Double) = super.withdraw(amount + 1)
}


val account: CheckingAccount = new CheckingAccount(100)
println(account.currentBalance)
account.withdraw(10)
println(account.currentBalance)