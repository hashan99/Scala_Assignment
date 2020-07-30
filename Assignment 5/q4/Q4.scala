class Account (id:String,no:Int,bal:Double){
  val nic:String=id
  val accno:Int=no
  var balance: Double =bal

  val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0)
  var sum=(b:List[Account])=>b.reduce((a,b)=>(new Account("0",0,a.balance+b.balance)))
  var finalbalance=(b:List[Account])=>b.map(a=>{
    if(a.balance<0)(new Account(a.nic,a.accno,a.balance*1.1)) 
    else(new Account(a.nic,a.accno,a.balance*1.05))
  })

  override def toString ="\n[NIC no: "+nic+":Account No: "+accno +":Balance: "+ balance+"]"
};

object Q4{
 def main(args:Array[String])={

  val bank:List[Account]=List(
  new Account("1130910V",1000,2390.50),
  new Account("2230243V",1001,-120.80),
  new Account("3325252V",1002,50000.0),
  new Account("2252525V",1003,3034.90),
  new Account("5134134V",1004,-290.00),
  new Account("6123321V",1005,65332.70)
  ) 
 println("Negative balance accounts: \n"+bank(0).overdraft(bank))
 println("\nThe sum of all account balances is: " +(bank(0).sum(bank)).balance)
 println("\nFinal balances of all accounts are: " +(bank(0).finalbalance(bank)))

 }

 }