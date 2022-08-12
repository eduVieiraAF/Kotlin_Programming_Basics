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
fun Int.abs() = (-this)
fun Double.abs() = (-this)
fun Float.abs() = (-this)
