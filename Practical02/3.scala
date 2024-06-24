def normal(hrs:Int):Double=250*hrs
def OT(hrs:Int):Double=85*hrs
def salary(normalhrs:Int , OThrs:Int):Double=normal(normalhrs)+OT(OThrs)
def tax(salary:Double):Double=salary*0.12
def takehome(normalhrs:Int , OThrs:Int):Double=salary(normalhrs,OThrs)-tax(salary(normalhrs,OThrs))