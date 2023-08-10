class InvalidAgeException(excep:String) extends Exception(excep){

}
object testExe extends App{
  def validate(age:Int): Unit = {
    if(age<18) throw new InvalidAgeException("not valid age")
    else println("welcome to vote")
  }
  try{
    validate(12)
  }catch {
    case ex:Exception=>println("output"+ex)
  }
}