//Q5: Print fibonacci series for a given number N of type Long using pattern matching .

  def fibonacci(n: Long): Long = {
    n match {
      case 0 | 1 => n
      case _     => fibonacci(n - 1) + fibonacci(n - 2)
    }
  }
  def fibonacciSeries(n: Long): Unit = {
    if (n >= 0) {
      println(s"Fibonacci series as : ")
      for (i <- 0L to n) { // default it will take int so here specify L for long
        val series = fibonacci(i)
        print(s"$series ")
      }
    } else {
      println("please enter valid Input")
    }
  }

  fibonacciSeries(3)

