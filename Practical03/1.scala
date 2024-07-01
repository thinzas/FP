import scala.io.StdIn.readLine

def reversestring(text: String): String=
    if text.isEmpty then "" else reversestring(text.tail)+ text.head

def main(args: Array[String]):Unit=
    val input = readLine("Enter the string: ")
    val reversedstring = reversestring(input)

    print(s"Reversed string: $reversedstring");
