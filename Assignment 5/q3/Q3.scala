class Account(x:Int){
  var balance:Int = x

  def withdraw(value:Int) = this.balance = this.balance - value
  def deposit(value:Int) = this.balance = this.balance + value
  def transfer(a:Account, amount:Int)={
  this.withdraw(amount)
  a.deposit(amount)
  }
};

object Q3{
  def main(args:Array[String])={
  val acc1= new Account(500)
  val acc2= new Account(2400)
  println("Account 1 balance : "+acc1.balance)
  println("Account 2 balance : "+acc2.balance)
  
  println("Enter the amount you want to transfer from acc1 to acc2 : ")
  var transfer_amount=scala.io.StdIn.readInt()
  acc1.transfer(acc2,transfer_amount)
  println("***New Account balances***")
  println("Account 1 balance : "+acc1.balance)
  println("Account 2 balance : "+acc2.balance)

  }

}
