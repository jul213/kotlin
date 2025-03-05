class book {

    var title: String = ""
    var author: String = ""
    var pages: Int = 0
}

fun main(){

    val myBook = book()
    myBook.title = "kotlin programming"
    myBook.author = "alex"
    myBook.pages = 50


    println(myBook.title)
}


class Person {

    var edad: Int = 0

    private set 

    set(value){

        field = value 
        edad = value + 2
    }
}


class Car {

    var modelo: String
    var marca: String 

    init {
        require(modelo && marca != null){
            "correcto"
        }
        println("tu coche tiene este mmodelo: $modelo y esta marca: $marca")
    }
}