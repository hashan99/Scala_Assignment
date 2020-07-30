object Q2 extends App{

    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);

  println(x.sub(y).sub(z));
}

class Rational(num1:Int,num2:Int){
    def numor = num1;
    def denom = num2;

    def sub(cls:Rational) = new Rational((cls.denom*numor-cls.numor*denom),(cls.denom*denom));

    override def toString = numor + "/" + denom;
}