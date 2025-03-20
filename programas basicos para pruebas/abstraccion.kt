interface Movable {
    fun move(x: Int, y: Int)
}


interface Drawable {
    fun draw()
}


abstract class Shape {
    abstract fun calculateArea(): Double
}

class Button(private val text: String): Drawable, Movable {
    override fun draw(){
        println("drawing button with text: $text")
    }

    override fun move(x: Int, y: Int){
        println("moving button to ($x,$y)")
    }
}