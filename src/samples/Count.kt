package samples

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }
    val positiveCount = numbers.count { it > 0 }

    prettyPrintln("Total number of elements: $totalCount")
    prettyPrintln("Number of even elements: $evenCount")
    prettyPrintln("Number of positive elements: $positiveCount")
    prettyPrintln("Original list: $numbers")
}