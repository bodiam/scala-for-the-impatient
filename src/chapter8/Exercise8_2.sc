class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount
  }

  def withdraw(amount: Double) = {
    balance -= amount
  }
}

class SavingsAccount(initialBalance: Double,
                     yearlyInterest: Double = 0.1,
                     freeTransactions: Int = 3,
                     comission: Int = 1
                      ) extends BankAccount(initialBalance) {

  var transactionsInMonth = 0


  override def deposit(amount: Double): Unit = {
    transactionsInMonth += 1

    super.deposit(amount - (if (isFreeTransaction) 0 else comission))
  }

  override def withdraw(amount: Double): Unit = {
    transactionsInMonth += 1

    super.withdraw(amount + (if (isFreeTransaction) 0 else comission))
  }

  private def isFreeTransaction: Boolean = {
    transactionsInMonth < freeTransactions
  }

  def earnMonthlyInterest() = {
    transactionsInMonth = 0

    super.deposit(super.currentBalance * yearlyInterest / 12)
  }
}

