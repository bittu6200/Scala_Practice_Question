package Assignment2


case class StudentContact(var email:String,var phoneNo: Long,var state:String)
class Student(
               val studentName:String,
               val studentId:Int,
               val studentGender:String,
               var studentInfo:StudentContact
             ){
  var studentCourse:List[String]=List.empty


  def updateStudentContact(email:String,phone:Long,state:String): Unit = {
    studentInfo=StudentContact(email, phone, state)
  }
  def enrollCourse(course:String): Unit = {
    studentCourse=course :: studentCourse
  }
  def removeCourse(course:String): Unit = {
    studentCourse=studentCourse.filter(_ !=course)
  }
  def payment(fee:Int): Unit = {
    val n=studentCourse.size
    val total=n*fee
    if(n>=1) println(s"total amount payable  ${total}")
    else println("please enroll course then pay")
  }
  override def toString: String = {
    s"studentName : $studentName\nstudentId : $studentId\nstudentGender : $studentGender\nstudentInfo : $studentInfo"

  }


}
object UniversityManagementSystem extends App{
val student=new Student(
  "bittu",
  12345,
  "male",
  StudentContact("sarrafbittu@gmail.com",9090908383L,"bihar")
  ) // need a case class not a normal class
println(student)
student.enrollCourse("scala")
println("List of enroll cources by student "+ student.studentCourse)
student.enrollCourse("play")
println("List of enroll cources by student  "+student.studentCourse)
student.updateStudentContact("sarraf@gmail.com",9087654321L,"Delhi")
println(student)
//student.removeCourse("play")
println(student)
//suppose each course have rate 1000

student.payment(1000)


}