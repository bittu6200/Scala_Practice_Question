def defaultValueExample(fName: String = "Bittu", lName: String = "kumar"): Unit = {
  println(s"$fName, $lName!")
}
// Call without providing any arguments, using default values
defaultValueExample() // Output: Bittu, Kumar!

// Call with providing only the 'fname' argument, using default 'lName'
defaultValueExample("Alice") // Output: Alice, Kumar!

// Call with providing both 'fName' and 'lName' arguments
defaultValueExample("Bob", "Joshi") // Output: Bon, Joshi!

// directly we can't pass 2nd argument without passing first argument if i pass
//then illegal start of simple expression
defaultValueExample(,"sarraf")

