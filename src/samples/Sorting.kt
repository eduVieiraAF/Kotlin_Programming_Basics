package samples

import kotlin.math.abs

fun main() {
    val shuffled = listOf(5, 1, 6, -5, 3, -2, 4)
    val inOrder = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it) }

    println("The original list → $shuffled \n")
    println("Natural order → $inOrder\n")
    println("Inverted natural order → $inverted\n")
    println("Inverted natural order value → $descending\n")
    println("Inverted natural order of absolute values → $descendingBy")
}