import scala.compiletime.ops.string
val inventory1  = Map(101 ->( "product-1", 20, 100.00),
                    102 ->( "product-2", 15, 200.00), 
                    103 ->( "product-3", 12, 30.00), 
                    104 ->( "product-4", 10, 300.00), 
                    105 ->( "product-5", 25, 50.00), 
                    );

val inventory2  = Map(101 ->( "product-1", 10, 100.00),
                    104 ->( "product-4", 20, 400.00), 
                    106 ->( "product-6", 5, 30.00), 
                    );

def retrieveProductNames(inventory:Map[Int,(String,Int,Double)]):List[String] ={
    inventory.values.map(_._1).toList;
}

def calculateTotal (inventory:Map[Int,(String,Int,Double)]):Double = {
    inventory.values.map{case (_,quantity,price) => quantity*price}.sum
}

def isEmpty(inventory:Map[Int,(String,Int,Double)]):Unit = {
    if (inventory.isEmpty){
        println("The inventory is Empty!");}
    else 
        println(s"The inventory is  NOT Empty!");
}

def merge(invent1:Map[Int,(String,Int,Double)], invent2:Map[Int,(String,Int,Double)]):Unit={
    val mergedInvent = invent2.foldLeft(invent1){(item1, item2)=>
        val(key, (name, quantity,price))=item2
        item1.get(key) match{
        case Some((existingname, existingquantity, existingprice))=>
            item1.updated(key, (name, existingquantity+quantity, math.max(existingprice,price)))
        case None => 
            item1 + (key-> (name, quantity, price))
    }
}
    Display(mergedInvent);
}

def check (inventory:Map[Int,(String,Int,Double)],key:Int):Unit = {
    if (inventory.contains(key)){
        val (name,quantity,price)=inventory(key)
        println(s"The product '${key}'is Available!\n " +
          s"Name: ${name}, Quantity: ${quantity}, Price: ${price}");}
    else 
        println(s"The product '${key}' is NOT Available!");
}

def Display(inventory:Map[Int,(String,Int,Double)]) :Unit={
    println(s"**** Inventory ****")
    inventory.foreach{ case(key,(name,quantity,price))=>
        println(s"$key, $name, $quantity, $price")}
    }