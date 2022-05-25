package samples

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun Int.abs(): Int = if (this < 0) -this else this

fun main() {

    print("Type in anything: ")
    val myString = readln()
    val result = myString.removeFirstLastChar()

    println("String has been trimmed =  $result")

    println("••••••••••••••••••••••••••••••••")
    print("Type in a number: ")
    val num = readln().toInt()
    println("\"$num\" is the number you enter and \"${num.abs()}\" is its absolute value.")
}

