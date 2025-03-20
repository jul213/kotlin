
data class Contact ( 

    val name: String,
    val tel: String,
    val description: String
)

data class Client  (
    
)

fun main(){

    val contact1 = Contact("juan","45987650","es una persona interesante")
    val contact2 = Contact("sara","4595847","es una persona amable")
    val contact3 = Contact("rodolfo","439650","es una persona normal")
}