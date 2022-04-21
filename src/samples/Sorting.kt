package samples

import kotlin.math.abs

fun main() {
    sortingWithNumber()
    println()
    sortingWithCharacter()
}

fun sortingWithCharacter() {
    println("What's your name? ")
    val name = readln().uppercase()
    val nameSet = name.toSet() // will not repeat letters as elements
    val nameList = name.toList() // all letters converted into elements

    val orderedNameList = nameList.sorted()
    val reversedNameList = nameList.asReversed()
    val shuffledNameList = nameList.shuffled()
    val orderedNameSet = nameSet.sorted()
    val reversedNameSet = nameSet.reversed().toSet()
    val shuffledNameSet = nameSet.shuffled()

    println(name +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Ordered name as a set → $orderedNameSet" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Reversed name as a set → $reversedNameSet" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Shuffled name as a set → $shuffledNameSet" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Ordered name as a list → $orderedNameList" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Reversed name as a list → $reversedNameList" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Shuffle name as a list → $shuffledNameList" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
}

fun sortingWithNumber() {
    val shuffled = listOf(5, 1, 6, -5, 3, -2, 4)
    val inOrder = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it) }

    println("The original list → $shuffled " +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Natural order → $inOrder" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Inverted natural order → $inverted" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Inverted natural order value → $descending" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println("Inverted natural order of absolute values → $descendingBy" +
            "\n••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
}
