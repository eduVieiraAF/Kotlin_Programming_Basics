package housing_oop

import java.util.*

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
