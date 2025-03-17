data class Product (
    val id: String,
    val name: String,
    val price: Double
)

class Cart {

    private val items = mutableMapOf<Product, Int>()
}