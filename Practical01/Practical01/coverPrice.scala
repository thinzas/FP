def coverPrice(x:Int):Double=x*24.95
def discount(amount:Double):Double=amount*0.4
def price(x:Int):Double=coverPrice(x)-discount(coverPrice(x))
def shipping(x:Int):Double=if(x<=50) 3*x else (3*50)+(x-50)*0.75
def total(x:Int):Double=price(x)+shipping(x)