class Triangle(l:Double,b:Double,h:Double){
  def area(): Double = {
    val s = (l + b + h) / 2
    val area = math.sqrt(s * (s - l) * (s - b) * (s - h))
    area
  }

  def perimeter(): Double = {
    val p=l+b+h
    p
  }
}
object Mains extends App{
  val l=new Triangle(3,4,5);
  println("area "+ l.area())
  println("perimeter "+l.perimeter())
}
/*
A=s(s﹣a)(s﹣b)(s﹣c)
s=a+b+c
2
 */