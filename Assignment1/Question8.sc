def combineList(listOfLists: List[List[Int]]): List[Int] = {
  var result: List[Int] = List()

  for {
    innerList <- listOfLists
    element <- innerList
  } {
    result = result :+ element
  }

  result
}
val nestedList = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))
val combinelist = combineList(nestedList)
println(combinelist)


