//Note :the function parameters are evaluated and their values are bound to
// the corresponding parameter names before entering the function body.
// The values remain fixed during the execution of the function.
//call-by-Value
def callByValue(x: Int): Unit = {
  println("Inside callByValue method")
  println("x = " + x)
  println("x = " + x) // The value of 'x' remains the same
}

val value = 42
callByValue(value)

//note : the function parameters are not evaluated immediately.
// Instead, they are evaluated each time they are referenced
// within the function body. This can be achieved by using => in the parameter type.
//call-by-name
def callByName(x: => Int): Unit = {
  println("Inside callByName method")
  println("x = " + x) // The value of 'x' is evaluated when referenced
  println("x = " + x) // The value of 'x' is evaluated again when referenced
}

val value = 42
callByName(value)
//##############################################3
  //call by value
  def callByValue(x: Long): Unit = {
    println("Inside callByValue")
    println(s"x = $x")
    println(s"x = $x") // x is the same value, since it's passed by value
  }

//call by name
  def callByName(x: => Long): Unit = {
    println("Inside callByName")
    println(s"x = $x") // x is re-evaluated every time it's used
    println(s"x = $x") // x is re-evaluated again
  }

 // current time method
  def currentTime(): Long = {
    println("Getting current time")
    System.currentTimeMillis()
  }

  println("Call by value example:")
  callByValue(currentTime()) 

  println("\nCall by name example:")
  println(callByName(currentTime())) 
