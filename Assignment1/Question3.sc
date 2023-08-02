import cats.data.OptionT.some

def findElementRecursive(list: List[Int], target: Int): Int = {
  list match {
    case Nil=> -1
    case head :: tail =>
      if (head == target) head
      else findElementRecursive(tail, target)
  }
}
////////////////////////////////////////////////////////////////
import scala.annotation.tailrec

  @tailrec
  def findElementHelper(list: List[Int], target: Int): Int = {
    list match {
      case Nil => -1
      case head :: tail =>
        if (head == target) target
        else findElementHelper(tail, target)
    }
  }

def findElementTailRecursive(list: List[Int], target: Int): Int =findElementHelper(list, target)


val myList = List(1, 2, 3, 4, 5)

val result1 = findElementRecursive(myList, 5)
println(result1)

val result2 = findElementTailRecursive(myList, 6)
println(result2)
