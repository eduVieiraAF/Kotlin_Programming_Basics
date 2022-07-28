package samples

import housing_oop.prettyPrintln

fun main() {

// while
    var sum = 0
    var i = 100

    while (i != 0) {
        sum += i
        --i
    }

    println("sum → $sum")

    prettyPrintln()

    // do...while

    var sum2 = 0
    var input: String

    do {
        print("Enter a number: ")
        input = readln()
        sum2 += input.toInt()
    } while (input != "0")

    println("Sum → $sum2")
}


