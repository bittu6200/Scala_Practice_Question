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
 def callByValueExample(x: Int): Unit = {
   println("Inside callByValueExample method")
   println("x = " + x)  // o/p :6
   println("x = " + x) // The value of 'x' remains the same o/p : p
 }

def  incrementAndGetByValue (x: Int): Int = {
  println("Inside incrementAndGetByValue method")
  x + 1
}

val value =  incrementAndGetByValue (5)
callByValueExample(value)

//call by name
def callByNameExample(x: => Int): Unit = {
  println("Inside callByNameExample method")
  println("x = " + x) // The value of 'x' is evaluated when referenced = o/p : 6
  println("x = " + x) // The value of 'x' is evaluated again when referenced o/p : 7
}

def incrementAndGetByName(x: => Int): Int = {
  println("Inside incrementAndGetByName method")
  x + 1
}

val value = incrementAndGetByName(5)
callByNameExample(value)
