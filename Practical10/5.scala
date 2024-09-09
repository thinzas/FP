package Account
object LetterUtils{
def countLetterOccurences(words: List[String]):Int = {
    words
        .map(_.length)
        .reduce(_+_)
}
}

