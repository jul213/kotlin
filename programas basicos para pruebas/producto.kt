data class Product (
    val id: String,
    val name: String,
    val price: Double
)

class Cart {

    private val items = mutableMapOf<Product, Int>()

    fun addItem(product: Product, quantity: Int = 1){
        items[product] = (items[product] ?: 0) + quantity
    }


    fun getItem(): Int {
        return items.values.sum()
    }
}


fun main(){
    val cart = Cart()
    val laptop = Product("1","Laptop", 230.20)

    cart.addItem(laptop,20)
}