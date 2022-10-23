package samples

import java.util.*

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun Int.abs(): Int = if (this < 0) -this else this

fun main() {

    print("Type in anything: ")
    val myString = readln()

    if (myString.length == 1 || myString.length == 2) println("Cannot verify input")
    else if (myString.isBlank()) println("Cannot verify input")
    else println(myString.removeFirstLastChar())

    println("••••••••••••••••••••••••••••••••")
    print("Type in a number: ")
    val num = readln().toInt()
    println("\"$num\" is the number you enter and \"${num.abs()}\" is its absolute value.")
}

fun String.capitalized() = this.replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(Locale.getDefault())
    else it.toString()
}

fun prettyPrintln(println: Any? = "") {
    println()
    println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println(println)
    println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
}

// Changes int from positive to negative && vice-versa
fun Int.invert() = -(this)
fun Double.invert() = -(this)
fun Float.invert() = -(this)

fun isNumber(check:String): Boolean {
    return check.all { char -> char.isDigit() }
}

fun String.nullIfEmpty(): String? = if (this.isBlank() || this.isEmpty()) null else this

