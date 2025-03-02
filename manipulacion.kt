
fun manipulacion(lista: List<String>): List<String>{

    val mapeado = lista.map{
        it + "buenas"
    }

    return mapeado
}


fun main(){

    val saludo = listOf("dias", "tardes", "noches", "nuevas")

    val res = manipulacion(saludo)

    
}