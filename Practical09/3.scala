val toUpper : String => String = input => input.toUpperCase()

val toLower : String => String = input => input.toLowerCase()

val formatNames : (String => String, String) => String = (func: String => String, name: String ) => {
    func(name)
}

def main(args: Array[String]): Unit = {
    println(formatNames(toUpper, "Benny"))
    println(formatNames(toUpper, "Niroshan".substring(0,2))+ "Niroshan".substring(2))
    println(formatNames(toLower, "Saman"))
    println("Kumara".init + formatNames(toUpper, "Kumara".last.toString()))
}