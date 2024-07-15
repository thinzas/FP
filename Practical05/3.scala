def Fibonacci(num: Int):Int= num match{
    case 0 => 0
    case 1 => 1
    case _ => Fibonacci(num-1) + Fibonacci(num-2)
}

def printFibSeq(n: Int):Unit={
    if(n>=1){ printFibSeq(n-1)}
    println(Fibonacci(n));
}
