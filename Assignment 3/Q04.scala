

object d {
   def main(args: Array[String]) {
   
     
   println("enter value:") 
   var x=scala.io.StdIn.readInt()
   var p=addeven(x-1)
   println("addition of even numbers are  "+ p)
   }
   
   def addeven(n:Int):Int=
   {
     if (n <= 1)
          return 0;
      else
      {
          if(n%2 == 1)
              return addeven(n - 1);
          else 
              return n + addeven(n - 1);
      }
     
   }
}