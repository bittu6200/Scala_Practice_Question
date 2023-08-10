//Q4: Give the example for currying and pure function

//example of pure function
def square(x: Int): Int = x * x

val input = 5
val squaredValue = square(input)

println(s"The square of $input is: $squaredValue")


//example of currying function
// how to normal method converted into currying

def divide(x: Double, y: Double): Double = {
  x / y
}
val r2 = (divide _).curried
println(r2(2)(3))


/////currying example //////////
def add(x: Int)(y: Int): Int = x + y

val addFive = add(5) _
val result = addFive(3)
println(s"Result of curried addition: $result")
