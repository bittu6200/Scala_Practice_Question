
//04: Create a list of tuples with fields of the book: LanguageName, Author, Price.
// Val languageList =List(( “Scala Language”, “Martin Odersky”, 500), (“Java Language”, “James Gosling”, 450), (“JavaScript”, “Brendan Eich”, 350))
//Do pattern matching and print the price of the book if the language name has the string “Language” else print “We don;t sell this book”.






val languageList = List(
  ( "Scala Language", "Martin Odersky", 500),
  ("Java Language", "James Gosling", 450),
  ("JavaScript", "Brendan Eich", 350)
)

def BookPrice(book:(String,String,Int)): Unit = {
  book match {
    case (languageName,author,price) if languageName.contains("Language") => println(s"the price of the book is $price")
    case _ =>println("We don;t sell this book")
  }
}
BookPrice(languageList(0))
BookPrice(languageList(1))
BookPrice(languageList(2))