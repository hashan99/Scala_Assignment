

object a {
  def main(args: Array[String]) {
 
 
   println("enter value:") 
   var x=scala.io.StdIn.readInt() 
   if(prime(x))
     println(x +" is a Prime number")
   else
      println(x +" is not a Prime number")
  
  
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