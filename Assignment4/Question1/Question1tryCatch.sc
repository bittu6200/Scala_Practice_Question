import java.io.{FileNotFoundException, FileReader, IOException}


object Demo extends App {
  try{
    val f=new FileReader("/home/kumar/Desktop/DSA Traning/July17scala/abc.txt")
    val b=10/0
  }
  catch {
    case ex:FileNotFoundException=>{
      println("file not found exception")
    }
    case ex:IOException=>{
      println("IOException")
    }
    case ex: ArithmeticException => {
      println("Arithmetic Exception")
    }

  }
  finally {
    println("Exiting finally..............");
  }
}