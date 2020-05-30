

object e {
    def main(args: Array[String]) {
   
     
   println("enter value:") 
   var x=scala.io.StdIn.readInt()
   
   println("Fibonacci series\n ")
   var i:Int=0
   var c:Int=1
  
   while(c<=x)
   {
     println(Fib(i))
        i+=1
        c+=1
   }
    }
    
 def Fib(n:Int):Int=
 {
    if ( n == 0 )
      return 0;
   else if ( n == 1 )
      return 1;
   else
      return ( Fib(n-1) + Fib(n-2) );
 }
}