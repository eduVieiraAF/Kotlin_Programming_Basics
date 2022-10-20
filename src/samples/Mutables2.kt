package samples

import housing_oop.prettyPrintln

fun main() {
    // cannot add new elements
    val interestingThings = listOf("Kotlin", "Python", "SQL", "Solidity")
    interestingThings.forEach { thing -> prettyPrintln(thing) }


    val map = mapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    map.forEach { (key, value) -> prettyPrintln("$key → $value") }
    //endRegion

    // can add ne elements
        val mutableInterestingThings = mutableListOf("Kotlin", "Python", "SQL", "Solidity")
    mutableInterestingThings.add( "Android")
    mutableInterestingThings.forEach { thing -> prettyPrintln(thing) }

    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    mutableMap[5] = "e" // also → mutableMap.put(5, "Android")
    mutableMap.forEach { (i, e) -> prettyPrintln("$e at index $i") }

    // creates a list of n size with same elements
    val list = MutableList(10) { "*" }
    println(list)

    // creates a list with a lambda
    val list2 = MutableList(10) { index -> 5 * index }
    println(list2)
}