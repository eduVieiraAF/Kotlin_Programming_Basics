package OOP

interface DoColor{

    fun doColor()
}

enum class Color(val colorName: String, val colorValue: Int): DoColor{
    RED("Red", 10) {
        override fun doColor() {
            println("You've painted it red")
        }
    },
    GREEN("Green", 20){
        override fun doColor() {
            println("You've painted it green")
        }
    },
    BLUE("Blue", 30){
        override fun doColor() {
            println("You've painted it blue")
        }
    }
}

fun main(){

   /* Color.values().forEach { println(it)}

    val color = Color.RED
    when(color){
        Color.RED -> println("red is the color.")
        Color.GREEN -> println("blue is the color.")
        Color.BLUE -> println("green is the color.")
    }*/

    println(Color.BLUE.colorName)
    println(Color.BLUE.colorValue)

    Color.GREEN.doColor()
    Color.RED.doColor()
    println(Color.GREEN.colorValue)
}