

object c {
   def main(args: Array[String]) {
   
     
   println("enter value:") 
   var x=scala.io.StdIn.readInt() 
   
    oddeven(x)
   }
   
  def oddeven(n:Int):Int={
    
    if(n==0)
      return 0
    else
    {
      if(n%2==1)
      {
        println(n + " is odd number")
        return oddeven(n-1)
      }
      else
      {
        println(n + " is even number")
         return oddeven(n-1)
      }
    }
  }
}