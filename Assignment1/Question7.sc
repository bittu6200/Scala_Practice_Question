val listOfLists = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))

// Using for
for {
  innerList <- listOfLists
  element <- innerList
} {
  print(element+" ")
}

// Using for-yield
for {
  innerList <- listOfLists
  element <- innerList
} yield print(element+" ")


