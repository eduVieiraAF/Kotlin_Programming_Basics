package samples

fun main() {
    val number = readln().toInt()
    val result: Long = factorial(number)

    println("The factorial of $number is $result")
}

fun factorial(number: Int): Long {
    return if (number == 1) number.toLong() else number * factorial(number - 1)
}
