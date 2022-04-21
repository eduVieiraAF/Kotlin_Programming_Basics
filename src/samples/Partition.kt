package samples

/*
The 'partition' function splits the original collection into a pair of lists using a given predicate:
    • Elements for which the predicate is true.
    • Elements for which the predicate is false.
 */

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 ==0 } // Splits numbers into a Pair of lists with even and odd numbers.
    val (positives, negatives) = numbers.partition { it > 0 } /* Splits numbers into two lists with positive and
                                                                 negative numbers. */

    println("Original list → $numbers")
    println("Even numbers pair → ${evenOdd.first}")
    println("Odd numbers pair → ${evenOdd.second}")
    println("Positive numbers list → $positives")
    println("Negative numbers list → $negatives")
}