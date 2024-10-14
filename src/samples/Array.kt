package samples

fun main() {
    val interestingThings = arrayOf("Kotlin", "Python", "SQL", "Solidity")

    println("${interestingThings.size} item(s) on your array.")

    interestingThings.forEachIndexed { index, thing ->
        println("$thing at index $index")
    }
}