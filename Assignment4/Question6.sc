//Q6: check if the given string is palindrome or not without using inbuilt methods like reverse

def isPalindrome(str: String): Boolean = {
  def checkPalindrome(left: Int, right: Int): Boolean = {

    if (left >= right) true
    else if (str(left) != str(right)) false
    else checkPalindrome(left + 1, right - 1)
  }

  checkPalindrome(0, str.length - 1)
}


println(isPalindrome("bitib"))
println(isPalindrome("hello"))
println(isPalindrome("madam"))
