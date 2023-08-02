def fibonacci(n: Int): List[Int] = {
  if (n <= 0) {
    List()
  } else if (n == 1) {
    List(0)
  } else {
    var fibonacciSeries = List(0, 1)
    while (fibonacciSeries.length < n) {
      //list(1,2,3,4).takeRight(2) output : (3,4)
      val nextNumber = fibonacciSeries.takeRight(2).sum
      fibonacciSeries = fibonacciSeries :+ nextNumber  // :+ is an operator used for list concatenation
    }
    fibonacciSeries
  }
}
val result = fibonacci(10)
println(result)


