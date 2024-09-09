package Account

case class Account(var balance: Double){
    def deposit(amount:Double):Unit = {
        balance+=amount
        println(s"Deposited: $amount")

    }

    def withdraw(amount:Double):Unit = {
        balance-=amount
        println(s"Withdrawed: $amount")
    }

    def transfer(toAccount:Account, amount:Double):Unit = {
        this.withdraw(amount)
        toAccount.deposit(amount)
        println(s"Transfered $amount ")

    }

}