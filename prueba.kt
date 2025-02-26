val hola = "buenas"

fun main(){
    val unique = setOf("red", "blue", "green", "yellow")
    println(unique)


    val mutableUnique = mutableSetOf("apple")

    mutableUnique.add("banana")
    mutableUnique.add("pera")

    println(mutableUnique)
    println(mutableUnique.size)
}


fun map() {

    val countryCapitals = mapOf(
        "France" to "paris",
        "Japan" to "Tokyo",
        "Italy" to "Rome"

    )

    println(countryCapitals["Italy"])

    println(countryCapitals.keys)

    println(countryCapitals.values)


    val countryMutable = mutableMapOf(

        "coche" to 20,
        "avion" to 100,
    )

    countryMutable["coche"] = 50


    countryMutable.remove("avion")


}