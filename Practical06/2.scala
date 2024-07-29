import scala.io.StdIn
import scala.compiletime.ops.string

def validateInput(name: String, marks:Int, TotalMarks:Double ) :(Boolean, Option[String])= {
    if(name.trim.isEmpty){
        (false, Some("Name cannot be Empty."))
    }
    else  if(marks <0 || TotalMarks<0){
        (false, Some("Marks and total possible marks must be positive integers."))
    }
    else if(marks>TotalMarks){
        (false,Some("Marks cannot exceed total possible marks."))
    }
    else {
        (true, None)
    }
}

def getStudentinfowithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var name = ""
    var marks = 0
    var totalMarks = 0

    while(!isValid){
        print("\nEnter student's name: ")
        name = StdIn.readLine()
        print("Enter marks obtained: ")
        marks = StdIn.readInt()
        print("Enter total possible marks: ")
        totalMarks= StdIn.readInt()

        val validationResult = validateInput(name, marks, totalMarks)
        isValid= validationResult._1
        if (!isValid){
            println(s"\nInvalid input: ${validationResult._2.get}")
        }
    }

    val percentage = (marks.toDouble/totalMarks)*100

    val grade =  if (percentage>=90){
        'A'
    }
    else if (percentage>=75){
        'B'
    }
    else if (percentage>=50){
        'C'
    }
    else {
        'D'
    }
    (name, marks, totalMarks, percentage, grade)

}

def printStudentRecord(record:(String, Int, Int, Double, Char)):Unit = {
    println("\n*** Student Record ***")
    println(s"Name: ${record._1}")
    println(s"Marks Obtained: ${record._2}")
    println(s"Total Possible Marks: ${record._3}")
    println(f"percentage: ${record._4}%.2f%%")
    println(s"Grade: ${record._5}")
}

def main(args: Array[String]):Unit = {
    val studentInfo = getStudentinfowithRetry()
    printStudentRecord(studentInfo)
}


