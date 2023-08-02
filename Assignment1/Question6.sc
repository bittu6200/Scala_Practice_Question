def isPalindrome(input: String): Boolean = {
  val result = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase
  result == result.reverse
}

println(isPalindrome("bittib"))
println(isPalindrome("hello"))
println(isPalindrome("Madam$"))
println(isPalindrome("787"))
