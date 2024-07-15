import scala.collection.mutable
case class Book(title: String, author:String, isbn:String)

var library: mutable.Set[Book] = mutable.Set(
    Book("Harry Potter", "J.K.Rowling", "123456"),
    Book("1984\t", "George Orwell", "234567"),
    Book("Famous Five", "Enide Blyton", "345678")
)

def addBook(book:Book):Unit={
    library+=book
    println(s"Book '${book.title}' added to the library.")
}

def removeBook(isbn : String):Unit ={
    var bookToRemove= library.find(_.isbn == isbn)
    bookToRemove match {
        case Some(book) => 
            library-=book
            println(s"Book '${book.title}' removed from the library.")
        case None =>
            println(s"No book found with the ISBN $isbn.")
    }
}

def isBookInLibrary(isbn : String):Unit = {
    var isAvailable= library.exists(_.isbn == isbn)

    isAvailable match{
        case true => println("Book is available.")
        case false => println("Book is not available.")
    }
}

def Display() :Unit={
    println("**** Current Library Collection ****")
    library.foreach(book=> println(s"Title: ${book.title}\tAuthor: ${book.author}\tISBN: ${book.isbn}"))
}

def Search(title:String):Unit={
    val book = library.find(_.title.equalsIgnoreCase(title))
    book match{
        case Some(book) => println(s"Book Found! => \n Title: ${book.title}\tAuthor: ${book.author}\tISBN: ${book.isbn}")
        case None => println(s"No book found with title '$title'.")
    }
}

def DisplayByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty){
        println(s"Books by Author '$author' :")
        booksByAuthor.foreach(book => println(s"Title: ${book.title}\tAuthor: ${book.author}\tISBN: ${book.isbn}"))
    }
    else{
        println(s"No Book found by Author '$author'")
    }
}