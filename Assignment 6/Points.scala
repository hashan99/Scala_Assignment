object Points extends App{
  var p1 = Point(10,4);
  var p2 = Point(5,17);
  println(p1 + " + " + p2 + " = " + (p1+p2));
  println(p1 + " move(4,1) = " + p1.move(4,1));
  println("Distance between " + p1 + " and " + p2 + " = " + (p1.distance(p2)));
  println(p1 + "invert() = " + p1.invert());
}

case class Point(x:Int,y:Int){
  def +(p:Point) = Point(this.x+p.x,this.y+p.y);
  def move(dx:Int, dy:Int) = Point(this.x+dx,this.y+dy);
  def distance(p:Point) = Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
  def invert() = Point(this.y,this.x);
}