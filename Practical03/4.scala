def sumOfEvens(numbers: List[Int]): Unit = {
  val result4 = numbers.filter(_ % 2 == 0).sum
    printf("%d",result4)
}

//sumOfEvens(List(1,2,3,4,5,6))
