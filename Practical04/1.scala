var name = Array("item1", "item2", "item3", "item4", "item5")
var quantity =  Array(2,5,6,20,8,1)
def printItem():Unit={
    println("Current Inventory:")
    for(i<- name.indices){
        println(s"${name(i)}: ${quantity(i)}")
    } 
        }
def restockItem(itemName:String, itemQuantity:Int):Unit= {
    val index = name.indexOf(itemName);
    if (index != -1){
        quantity(index)+= itemQuantity
        println(s"Restocked '$itemQuantity' of '$itemName'.  ")
    }

    else {
        println(s"Item '$itemName' does not exist in the inventory")
    }
}

def sellItem(itemName:String, itemQuantity: Int):Unit={
    var index=name.indexOf(itemName)
    if (index != -1){
        if(itemQuantity>quantity(index)){
            println("Not enough quantitiy to sell! only '${quantity(index)' available!'}")
        }
        else{
        quantity(index)-= itemQuantity
        println(s"'$itemQuantity' of '${itemName}' has been sold.")
        }
    }

    else println(s"'$itemName' not found in the inventory.")

}