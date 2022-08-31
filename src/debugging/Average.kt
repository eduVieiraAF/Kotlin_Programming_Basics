package debugging

import housing_oop.prettyPrintln

fun main(args: Array<String>) {
    prettyPrintln("Average finder")
    val avg = findAverage(args)
    println("The average is $avg")
}

fun findAverage(input: Array<String>): Double {
    var result = 0.0
    for (s in input) {
        result += s.toDouble()
    }
    return result
}
