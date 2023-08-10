//Q3: Write a function to find the sum of element from a list using higher order function
def sumListElements(list: List[Int]): Int = {
  //list.foldLeft(0)(_ + _)  //fold,foldleft/foldRight
  list.reduce((a,b)=>a+b) //reduceLeft,reduceRight
}

val myList = List(1, 2, 3, 4, 5)
val sum = sumListElements(myList)
println(s"The sum of elements in the list is: $sum")
