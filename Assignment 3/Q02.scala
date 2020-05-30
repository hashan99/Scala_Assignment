

object b {
   def main(args: Array[String]) {
   
     
   println("enter value:") 
   var x=scala.io.StdIn.readInt() 
   println("prime numbers are \n")
   
   for(i<-1 until x)
   {
     if(prime(i))
      println(i)
     
   }
   
}
  def prime(n:Int,i:Int=2):Boolean=
  {
    if(n==1)
      return false
    if(n==2)
      return true
    if(n%i==0)
      return false;
    if(i*i>n)
      return true;
    
    return prime(n,i+1);
    
  }
   
   
   
   
   
   
   
}