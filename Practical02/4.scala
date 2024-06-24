def atendees(ticketPrice:Int)=120+(15-ticketPrice)*4
def costs(atendees:Int):Int=500+3*atendees
def income(ticketPrice:Int, atendees:Int):Int=ticketPrice*atendees
def profit(ticketPrice:Int):Int=income(ticketPrice,atendees(ticketPrice))-costs(atendees(ticketPrice))
