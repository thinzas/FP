def toUpper(string: String)=String{
string.toUpperCase()
}

def toLower(string:String)={
string.toLowerCase()
}

def formatNames(name:String)(formatFunc:String=>String):String={
formatFunc(name)
}

 def main(args:Array[String]): Unit={
    val formattedNames = List(
      formatNames("Benny")(toUpper),
      formatNames("Niroshan")(name=> name.substring(0 ,2).toUpperCase + name.substring(2)),
      formatNames("Saman")(toLower),
      formatNames("Kumara")(name=>name.init + name.last.toUpper)
    )

    formattedNames.foreach(println)
 }
