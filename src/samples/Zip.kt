package samples

/*
• The 'zip' function merges 2 collections into a new collection. By default, the result collection
contains 'Pairs' of source collection elements with the same index. However, you can define your
own structure of the result collection element.
• The size of the result collection equals to the minimum size of a source collection.
 */

fun main() {
    // defining the collections
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resulPairs = A zip B // [(a, 1), (b, 2), (c, 3)]
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // [a1, b2, c3]
    val resultCustom = A.zip(B) { a, b -> "$a:$b" } // [a:1, b:2, c:3]
    val resultCustom2 = A.zip(B) { a, b -> "$a goes with $b" } //[a goes with 1, b goes with 2, c goes with 3]

    println("Merging $A with $B »»»\n")
    println("Default merge → $resulPairs")
    println("Reduced merge → $resultReduce")
    println("Custom merge 1 → $resultCustom")
    println("Custom merge 2 → $resultCustom2")
}