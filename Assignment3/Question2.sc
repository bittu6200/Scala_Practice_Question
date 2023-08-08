//Q2: Explain multiple inheritance use case in scala having a class called Calculator by overriding two
// different functions : Sum, Multiply .
trait A{
  def Sum(a : Int,b:Int):Int
}
trait B{
  def Multiply(a:Int,b:Int):Int
}

class Calculator extends A with B{
  override def Sum(a: Int, b: Int): Int = a + b

  override def Multiply(a: Int, b: Int): Int = a*b
}

val c=new Calculator
println("Sum of two number")
c.Sum(2,3)
println("multiplication of two number")
c.Multiply(2,3)
