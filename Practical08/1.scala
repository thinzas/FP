def Encrypt(text: String, shift: Int): String= {
    text.map { char => 
        if (char.isLetter){
        val shiftWithinAlphabet = shift% 26
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shiftWithinAlphabet)% 26 + base). toChar
        }
        else {
        char
    }
}
}

def Decrypt(text: String, shift: Int): String = {
    Encrypt(text, 26-shift)
}


    def cipher(processFunction: (String, Int)=> String, text:String, shift:Int):String ={
        processFunction(text, shift)
    }
