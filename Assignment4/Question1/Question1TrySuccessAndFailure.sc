import scala.util.{Try, Success, Failure}

//////////using Try : Success and Failure ///////////////////////////
  def safeDivide(a: Int, b: Int): Try[Int] = {
    Try(a / b)
  }

  val result1 = safeDivide(10, 2)
  val result2 = safeDivide(10, 0)

  result1 match {
    case Success(value) => println(s"Result 1: $value")
    case Failure(exception) => println(s"Error 1: $exception")
  }

  result2 match {
    case Success(value) => println(s"Result 2: $value")
    case Failure(exception) => println(s"Error 2: $exception")
  }

def Mul(x:Int,y:Int): Try[Int] = {
  Try(x*y)
}
val result3=Mul(2,3)

result3 match {
  case Success(value) => println(s"Result 1: $value")
  case Failure(exception) => println(s"Error 1: $exception")
}


