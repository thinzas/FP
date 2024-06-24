object question2 extends App{
var a: Int = 2
var b: Int = 3
var c: Int = 4
var d: Int = 5
var g: Int = 5

var k :Float= 4.3f

{ println({b-=1; b} * a + c * d); 
    d-=1;}

{println(a); 
    a+=1;}

{println(-2*(g-k)+c)}

{println(c);
    c+=1;}

{println({c+=1;c} *a);
    a+=1;}

}