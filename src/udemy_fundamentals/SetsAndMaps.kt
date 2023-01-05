package udemy_fundamentals

// * Sets are a type of collections that eliiminate duplicates and are unsorted
// * Maps are a type of collection in which data is store in key-value pairs

fun main() {
    val fruits = setOf("Orange", "Kiwi", "Mango", "Apple", "Pear", "Mango")
    fruits.forEach { println(it) } // will print "Mango" only once
    println(fruits.size) // outputs 5
    val sortedFruits = fruits.toSortedSet()
    println(sortedFruits)

    println()

    val newFruits = fruits.toMutableSet()
    println(newFruits)
    newFruits.add("Banana")
    newFruits.forEach { println(it) }
    println(newFruits.elementAt(2))


    val daysOfTheWeek = mapOf(
        1 to "Sunday",
        2 to "Monday",
        3 to "Tuesday",
        4 to "Wednesday",
        5 to "Thursday",
        6 to "Friday",
        7 to "Saturday"
    )

    daysOfTheWeek.forEach { (k, v) -> println("$v is day $k of the week") }
    println(daysOfTheWeek[3]) // not the index, but the actual key

    println()

    val fruitsMap = mapOf(
        1 to Fruits("Banana", 1.75),
        2 to Fruits("Apple", 1.97),
        3 to Fruits("Mango", 2.15),
        4 to Fruits("Kiwi", 2.75),
    )

    fruitsMap.forEach { (t, u) -> println("${u.name} at $${u.price} at position $t") }
    println()
    val newFruitsMap = fruitsMap.toMutableMap()
    newFruitsMap[5] = Fruits("Strawberries", 6.45 )
    newFruitsMap.forEach { (t, u) -> println("${u.name} at $${u.price} at position $t") }
}

data class Fruits(val name: String, val price: Double)