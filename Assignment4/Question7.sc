//flatMap the inner grouping of an item is removed and a sequence is generated.
//we can say that flatMap first runs the map method and then the flatten method
// to generate the desired result.

//Q7.Q7: print the element of the list using map and flatMap yield of below list
//   List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
val nestedList = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))

// Using map and yield
val mappedResult = nestedList.map { innerList =>
  for {
    element <- innerList
  } yield {
    println(element)
  }
}

// Using flatMap and yield
val flatMappedResult = nestedList.flatMap { innerList =>
  for {
    element <- innerList
  } yield {
    println(element)
  }
}
