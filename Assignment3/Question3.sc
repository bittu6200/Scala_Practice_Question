//03: How to handle None values in scala for optional fields ?


case class Employee(name:String,age:Int,address:Option[String],department:String,employeeId:Option[Int])


val listOfEmployee=List(
  Employee("bittu1",28,Some("Patna"),"Scala_developer",Some(12345)),
  Employee("bittu2",27,None,"Java_developer",None),
  Employee("bittu3",24,Some("Patna"),"UI_developer",None),
  Employee("bittu4",32,None,"backend_developer",Some(1445)),
  Employee("bittu5",65,Some("delhi"),"wordpress_developer",None),
  Employee("bittu6",21,None,"javaScript_developer",Some(1222))
)
def PrintEmployee(employee: Employee): Unit = {


  employee.address match {
    case Some(address)=> println(s"Address is $address")
    case None=>println("Address is not there")
  }

  employee.employeeId match {
    case Some(employeeId) => println(s"EmployeeId is $employeeId")
    case None => println("EmployeeId is not there")
  }
}

PrintEmployee(listOfEmployee(0))
PrintEmployee(listOfEmployee(1))
PrintEmployee(listOfEmployee(2))
PrintEmployee(listOfEmployee(3))
PrintEmployee(listOfEmployee(4))

