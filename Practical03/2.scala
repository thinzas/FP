def filterLongStrings(strings:List[String]):Unit=
    val result2=strings.filter(_.length>5)
    printf("%s",List(result2))
    
    
    //filterLongStrings(List("hey", "abstraction", "Scala", "programming"))
