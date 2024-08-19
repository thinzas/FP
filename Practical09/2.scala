val number : Int => String = num => num match{
    case x  if x <=0 => "Negative / Zero is input"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
} 