package samples

// Removing 1st and last letter using extension function

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main() {

    print("Type in anything: ")
    val myString = readln()
    val result = myString.removeFirstLastChar()

    println("String has been trimmed =  $result")
}



