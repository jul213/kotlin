open class Animal{
    var name: String = ""

    fun eat(){
        println("$name is eating")
    }
}

class Dog : Animal(){
    fun bark(){
        println("$name says: WOOF")
    }
}