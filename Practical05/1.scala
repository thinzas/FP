import scala.io.StdIn.readLine

   

    def getProductList(): List[String] = {
        var products = List[String]()
        var continue = true

        while(continue){
            var input =readLine("Enter the Product Name (Enter 'done' to finish) : ")
            if(input.toLowerCase == "done" ) {
                continue = false
            }        

            else {
                products=products:+ input
            }
        }
        products
    }

    def PrintProductList(products : List[String]): Unit ={
        for(i<- products.indices){
        println(s"${i+1}. ${products(i)}")
        }
    }

    def getTotalProducts(products : List[String]):Int={
        products.length;
    }




