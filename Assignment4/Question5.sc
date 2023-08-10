//Q5. How do we define the default value of a parameter in the function with example
def greet(name: String = "Day"): Unit = {
  println(s"Good, $name!")
}

greet()
greet("morning")
////////////////////////////////////////////

def givingUpdate(message1: String, message2: String = "Task"): Unit = {
  println(s"$message1: $message2")
}

givingUpdate("Completed")
givingUpdate("progress", "remaining some task")
