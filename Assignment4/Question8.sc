//Q8. Q8: write a function to convert the nested list to list using map or flatMap
//input:    List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
//Output: List(1,2,3,4, 3,4,5,11,34,6)

def flattenNestedList[A](nestedList: List[List[A]]): List[A] = {
  //nestedList.flatMap(identity) or
  nestedList.flatten
}

val inputList = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))
val flattenedList = flattenNestedList(inputList)
println(flattenedList)

///////////////////////////////////////////////////////
def flattenNestedList[A](nestedList: List[List[A]]): List[A] = {
  nestedList.flatMap(_.map(identity))
  //nestedList.map(_.map(identity)).flatten

}

val inputList = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))
val flattenedList = flattenNestedList(inputList)
println(flattenedList)



///////////////////////////////////////////////////////////////

val listoflist=List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
val f=(f:List[Int])=>f
val usingMap=listoflist.map(f).flatten
val usingFlatMap=listoflist.flatMap(f)
