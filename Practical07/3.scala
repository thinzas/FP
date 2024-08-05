def filterPrime(numbers: List[Int]):List[Int]={
    def isPrime(number: Int):Boolean={
        if (number<=1){
            return false
        }

        else if (number==2){
            return true
        }

        else !(2 to scala.math.sqrt(number).toInt).exists(x=>number%x==0);
    }

    numbers.filter(num=> isPrime(num))

}

val input3 = List(1,2,3,4,5,6,7,8,9,10,11,12)