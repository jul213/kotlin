fun multiplicar(num1: Int , num2: Int) -> Int {
    return num1 * num2
}

fun division(num1: Int , num2: Int) -> Int {
    return num1 / num2
}

fun resta(num1: Int , num2: Int) -> Int {
    return num1 - num2
}

fun suma(num1: Int , num2: Int) -> Int {
    return num1 + num2
}

fun main(){

    println("bienvenido al sistema de calculadora con Kotlin")

    println("escriba el primer numero: ")
    val num1 = readln().toInt()
    println("escriba el segundo numero: ")
    val num2 = readln().toInt()

    println("seleccione operacion 1-suma 2-resta 3-multiplicacion 4-division")
    val operacion = readln().toInt()


    when (operacion){

        1 ->  println(suma(num1,num2))
        2 ->  println(resta(num1,num2))
        3 ->  println(multiplicacion(num1,num2))
        4 ->  println(division(num1,num2))
        else -> println("operacion no encontrada")
    }
    }