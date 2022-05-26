package samples

fun main() {
    val interestingThings = arrayOf("Kotlin", "Python", "SQL", "Solidity")

    println("${interestingThings.size} item(s) on your array.")

    for (thing in interestingThings) {
        println(thing)
    }

    println()

    // lambda Syntax
    interestingThings.forEach { thing ->
        println(thing)
    }

    println()

    interestingThings.forEachIndexed { index, thing ->
        println("$thing at index $index")
    }
}