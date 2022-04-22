package samples

/*
'getOrElse' provides safe access to elements of a collection. It takes an index and a function that
provides the default value in cases when the index is out o bound.
 */


fun main() {
    val list = listOf(0, 10, 20)

    println(list.getOrElse(1) { 42 }) // prints element at index 1
    println(list.getOrElse(10) { 42 }) // Prints '42' because the index 10 is out of bounds.

// 'getOrElse' can also be applied to 'Map' to the

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 }) // Prints the default value because the key "x" is not in the map.

    map["x"] = 3
    println(map.getOrElse("x") { 1 }) // Prints 3, the value for the key "x"

    map["x"] = null
    println(map.getOrElse("x") { 1 }) // Prints the default value because the value for the key "x" is not defined.
}