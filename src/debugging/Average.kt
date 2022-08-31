package debugging

import housing_oop.prettyPrintln

fun main() {
    prettyPrintln("Average finder →")
    val args = arrayOf(1, 2, 4)
    val avg = findAverage(args)
    println("The average is $avg")
}

fun findAverage(input: Array<Int>): Double {
    var result = 0.0
    for (s in input) {
        result += s
    }

    return result
}
