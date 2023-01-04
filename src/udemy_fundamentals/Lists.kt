package udemy_fundamentals

fun main() {
    val months = listOf("JAN", "MAR", "MAY", "AUG", "DEC")
    val mixedTypes = listOf(1, 53.8, "Poetry", true)

    months.forEach { print("$it, ") }
    mixedTypes.forEach { print("$it, ") }
    println()
    println("${mixedTypes.size} is the size of one of the lists")
    println(mixedTypes[2])

    val additionalMonth = months.toMutableList()
    additionalMonth.add("FEB")
    additionalMonth.forEach { println(it) }

    println()

    val remainingMonths = listOf("APR", "JUN", "JUL", "SEP", "OCT", "NOV")
    additionalMonth.addAll(remainingMonths)
    additionalMonth.forEach { println(it) }
}