package Account

object BankUtils {
  type Bank = List[Account]

  // Function to find accounts with negative balances
  def negativeBalances(bank: Bank): List[Account] = {
    bank.filter(_.balance < 0)
  }

  // Function to calculate the sum of all account balances
  def totalBalances(bank: Bank): Double = {
    bank.map(_.balance).sum
  }

  // Function to calculate final balances after applying interest
  def applyInterest(bank: Bank): List[Account] = {
    bank.map { account =>
      val interest = if (account.balance > 0) 0.05 else 0.1
      val interestAmount = account.balance * interest
      account.balance += interestAmount
      account
    }
  }
}
