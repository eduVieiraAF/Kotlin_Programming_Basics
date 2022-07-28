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