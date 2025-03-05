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


class Carro {

    var edad: Int = 0

    private set 

    set(value){

        field = value 
        edad = value + 2
    }
}