package samples

fun main() {
    // cannot add new elements
    val interestingThings = listOf("Kotlin", "Python", "SQL", "Solidity")
    interestingThings.forEach { thing -> println(thing) }

    println("-----------")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    map.forEach { (key, value) -> println("$key → $value") }
    //endRegion
    println("•••••••••••••••")
    // can add ne elements
    val mutableInterestingThings = mutableListOf("Kotlin", "Python", "SQL", "Solidity")
    mutableInterestingThings.add( "Android")
    mutableInterestingThings.forEach { thing -> println(thing) }

    println("-----------")

    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
    mutableMap[5] = "e" // also → mutableMap.put(5, "Android")
    mutableMap.forEach { (i, e) -> println("$e at index $i") }


}