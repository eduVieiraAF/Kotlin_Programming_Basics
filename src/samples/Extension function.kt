package samples

// Removing 1st and last letter using extension function

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main() {

    val myString= "Hello World"
    val result = myString.removeFirstLastChar()

    println("First character is: $result")
}



