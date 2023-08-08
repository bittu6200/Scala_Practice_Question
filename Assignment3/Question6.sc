//Q6 . Illustrate companion object behavior using a function sum().

class Calculator {
  def sum1(a: Int, b: Int): Int = a + b
}

object Calculator {
  def sum(list: List[Int]): Int = list.sum
}

object Main extends App {
  val cal = new Calculator()

  val sum1 = cal.sum1(1,2)
  println(s"value of sum1() method: $sum1")

  val sum = Calculator.sum(List(1, 2, 3, 4, 5))
  println(s"value of sum() mehod: $sum")
}
//note : Calculator companion object provides a
// static-like behavior for the sum() method, allowing
// you to call it directly on the class without creating
// an instance of the class.
// objects can encapsulate utility functions and provide a
// convenient way to access them.
