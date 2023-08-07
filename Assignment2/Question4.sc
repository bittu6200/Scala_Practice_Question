// 1 : We basically use an enum to represent a group of
// values that fall under the same category. Like weekdays


//object Enum_name extends Enumeration {
//  type Enum_name = Value
//  val constant1, constant2, constant3  = Value
//}

object MonthName extends Enumeration {
  type MonthName = Value
  val Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec  = Value
}

//////////////////////

object Main extends App{

  var demo = new Demo()
  println(s"name of the days are ::  = ${demo.values}")
  println(s"name of the days are ::  = ${demo.day1}")
  println(s"name of the days are ::  = ${demo.day1.id}")

}
class Demo extends Enumeration
{
  // creating with type alias
  type Demo = Value
 
  val day1 = Value("Sun")
  val day2 = Value("Mon")
  val day3 = Value("Tue")
  val day4 = Value("Wed")
  val day5 = Value("Thu")
  val day6 = Value("Fri")
  val day7 = Value("Sat")
}
/*

1) Scala enum supertype class;

io.Serializable
Anyref
Anyref
2) Scala enum has known subclasses;

RoundingMode
3) Scala enum hierarchy;

Serializable
Enumeration
RoundingMode

 */
// Scala program of Matching values in enumeration

// Creating Enumeration
object Main extends Enumeration {
  type Main = Value

  // Assigning Values
  val first = Value("Thriller")
  val second = Value("Horror")
  val third = Value("Comedy")
  val fourth = Value("Romance")

  // Main Method
  def main(args: Array[String]) {
    Main.values.foreach {
      // Matching values in Enumeration
      case d if (d == Main.third) =>
        println(s"Favourite type of Movie = $d")
      case _ => None
    }
  }
}
