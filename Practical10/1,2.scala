package Rational

case class Rational (x: Int, y: Int){
require(y>0, "Denomentator must be greater than zero")
    def numer = x/gcd(x,y)
    def denom = y/gcd(x,y)

    private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b, a%b)

    def neg: Rational= Rational(-numer, denom)

    def sub(other:Rational):Rational=Rational(this.numer*other.denom - other.numer*this.denom,this.denom* other.denom)
   
    override def toString(): String = s"$numer/$denom"
}

