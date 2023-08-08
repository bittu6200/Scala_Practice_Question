//Q1: Create a case class Employee with fields: name, age, address, department, employeeId.
//  Prepare a list of records of 6 employee with age as 28,27,24,32,65,21
//Output:  Print employee name and department when age of the employee is greater than 25 using for yield.


case class Employee(name:String,age:Int,address:String,department:String,employeeId:Int)


val listOfEmployee=List(
  Employee("bittu1",28,"Patna","Scala_developer",12345),
  Employee("bittu2",27,"deldi","Java_developer",23456),
  Employee("bittu3",24,"mumbai","UI_developer",11111),
  Employee("bittu4",32,"lucknow","backend_developer",12222),
  Employee("bittu5",65,"chennai","wordpress_developer",15678),
  Employee("bittu6",21,"Kerala","javaScript_developer",10987)
)
val nameDepartment=for{
  employee<-listOfEmployee
  if(employee.age>25)
} yield (employee.name,employee.department)

println(nameDepartment)