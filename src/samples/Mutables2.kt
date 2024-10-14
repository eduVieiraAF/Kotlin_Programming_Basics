package samples

fun main() {
    // cannot add new elements
    val interestingThings = listOf("Kotlin", "Python", "SQL", "Solidity")
    interestingThings.forEach(::prettyPrintln)

    val map = mapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    map.forEach { (key, value) -> println("$key → $value") }

    // can add ne elements
    val mutableInterestingThings = mutableListOf("Kotlin", "Python", "SQL", "Solidity")
    mutableInterestingThings.add("Android")
    mutableInterestingThings.forEach(::prettyPrintln)

    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    mutableMap[5] = "e" // also → mutableMap.put(5, "e")
    mutableMap.forEach { (i, e) -> println("$e at index $i") }

    // creates a list of n size with same elements
    val list = List(10) { "*" }
    println(list)

    // creates a list with a lambda
    val list2 = List(10) { index -> 5 * index }
    println(list2)
}