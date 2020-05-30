

object f {
    def main(args: Array[String]) {
   println("enter value:") 
   var x=scala.io.StdIn.readInt() 
      for (i <- 1 to x)
         println( "Addition of " + i + ": = " + Addition(i) )
   }
   
   def Addition(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n + Addition(n - 1)
   }
}