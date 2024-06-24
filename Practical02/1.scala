object question1 extends App{
var k, i, j :Int =2
var m,n :Int =5
var f :Double =12.0
var g :Double=4.0*f
var c: Char = 'X'

val resultA= k + (12 * m)
val resultB= m.toDouble / j
val resultC= n % j
val resultD= m.toDouble / j * j
val resultE= f + 10*5 + g
val resultF= {(i+=1);i} * n


println(s"k + 12 * m = $resultA")
println(s"m / j = $resultB")
println(s"n % j = $resultC")
println(s"m / j * j = $resultD")
println(s"f + 10*5 + g = $resultE")
println(s"++i * n = $resultF")
}