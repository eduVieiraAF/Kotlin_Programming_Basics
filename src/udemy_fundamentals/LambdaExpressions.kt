package udemy_fundamentals

fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    // shorter version
    val minus = { a: Int, b: Int -> println(a - b) }

    println(sum(9, 7))
    minus(9, 7)
}