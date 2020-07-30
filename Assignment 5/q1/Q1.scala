import scala.io.StdIn._

object Q1 extends App{
    println("Enter two numbers : ")
    var num1 = readInt()
    var num2 = readInt()
    var x = new Rational(num1, num2);
    println(x.neg)
}

class Rational(x:Int, y:Int){
    private def gcd(a:Int, b:Int): Int = {
        if(b == 0) a else gcd(b, a%b)
    }
    private val g = gcd(x, y)
    def numer = x/g
    def denom = y/g
    def neg = new Rational(-this.numer, this.denom)
    override def toString = numer + "/" + denom;
} 