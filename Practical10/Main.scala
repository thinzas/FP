package Account

import Rational.Rational
import BankUtils._
import LetterUtils._

object Main extends App {

  val x = Rational(3, 4)
  val y = Rational(5, 8)
  val z = Rational(2, 7)

  val p = x.neg
  val q = x.sub(y.sub(z))

  println("\n\nQuestion 1:")
  println("-----------------------------")

  println(s"x = $x")
  println(s"-x = $p")

  println("\nQuestion 2:")
  println("-----------------------------")
  println(s"x = $x")
  println(s"y = $y")
  println(s"z = $z")
  println(s"x - (y - z) = $q")

  println("\nQuestion 3:")
  println("-----------------------------")
  val acc1 = Account(1000)
  val acc2 = Account(500)
  println(s"Account 1 balance: ${acc1.balance}")
  println(s"Account 2 balance: ${acc2.balance}")

  println("\nDepositing 1000 into Account 1:")
  acc1.deposit(1000)
  println(s"Account 1 balance: ${acc1.balance}")

  println("\nWithdrawing 200 from Account 2:")
  acc2.withdraw(200)
  println(s"Account 2 balance: ${acc2.balance}")

  println("\nTransferring 1000 from Account 1 to Account 2:")
  acc1.transfer(acc2, 1000)
  println(s"Account 1 balance: ${acc1.balance}")
  println(s"Account 2 balance: ${acc2.balance}")

  println("\nQuestion 4:")
  println("-----------------------------")

  val bank = List(Account(1000), Account(-200), Account(500))
  println(s"All acounts: $bank")
  println(s"Accounts with negative balances: ${negativeBalances(bank)}")
  println(s"Total balance: ${totalBalances(bank)}")

  val updatedBank = applyInterest(bank)
  println(s"Final balances after applying interest: ${updatedBank.map(_.balance)}")

  println("\nQuestion 5:")
  println("-----------------------------")

  val words = List("apple", "banana", "cherry", "date")
  val totalLetters = countLetterOccurences(words)
  println(s"Total count of letter occurences: $totalLetters")

}
