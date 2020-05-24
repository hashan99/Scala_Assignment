object bookCost extends App {
  def discountedPrice(x:Int)=0.6*24.95*x;

  def shipCost(x:Int)=if(x<50) 3 else 3+(x-50)*0.75 ;

  def totAmount(x:Int)=discountedPrice(x)+shipCost(x);

  println(BigDecimal(totAmount(60)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble);//rounding to two decimal points because answer is a price
  //assumed ship cost of all first 50 copies only 3 rs 	
}