class Employee(var salary:Double,var hour:Double){
  def getInfo(): Unit = {

    println("salary "+salary)
    println("hours "+hour)

  }
  def addSalary(): Unit = {
    if(salary<500){
      this.salary+=10
    }

  }
  def AddWork(): Unit = {
    if(hour>6){
      this.salary+=5
    }
  }
  def totalSalary(): Unit = {
    println(s"total salary paid to Employee  ${salary}")
  }
  override def toString:String={
    s"Total salary ${salary}\ntotal working hours ${hour}"
  }
}
object Mains2 extends App {
  val emp=new Employee(450,7)
  emp.getInfo();
  emp.addSalary()
  emp.getInfo()
  emp.AddWork()
  emp.totalSalary()
  print(emp)



}
