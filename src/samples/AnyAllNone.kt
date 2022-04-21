package samples

// Function any returns true if the collection contains at least one element that matches the given predicate.
// Returns boolean value
fun callAny() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it < 0 }

    println("Numbers: $numbers")
    println("Negative number? $anyNegative")
    println("Greater than 6? $anyGT6")
}

// Function all returns true if all elements in collection match the given predicate.
fun callAll() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val allEven = numbers.all { it % 2 == 0 }
    val allLT6 = numbers.all { it < 6 }

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLT6")
}

// Function none returns true if there are no elements that match the given predicate in the collection.
fun callNone() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val allEven = numbers.none { it % 2 == 1 }
    val allLT6 = numbers.none { it > 6 }

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("No element greater than 6: $allLT6")
}

fun main() {
    callAny()
    println("••••••••••••••••••••••••••••••••••••••")
    callAll()
    println("••••••••••••••••••••••••••••••••••••••")
    callNone()
}