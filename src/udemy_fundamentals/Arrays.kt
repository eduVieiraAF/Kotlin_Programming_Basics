package udemy_fundamentals

fun main() {
    // val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // val numbers= intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(numbers.contentToString())
    numbers.forEach { println(it * it) }
    println(numbers[3] + numbers[2])

    val days = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    println(days.contentToString())
    days.forEach { println(it) }

    val fruits = arrayOf(
        Fruit("Apple", 1.78),
        Fruit("Mango", 2.08),
        Fruit("Star fruit", 1.91),
        Fruit("Avocado", 3.05)
    )

    println(fruits.contentToString())
    fruits.forEach { println(it) }
    println(fruits[1])

    fruits.forEach { println("${it.name} at $${it.price} per kilo") }
    fruits.forEach { fruit -> println("${fruit.name} at $${fruit.price} per kilo") }
}

data class Fruit(val name: String, val price: Double)