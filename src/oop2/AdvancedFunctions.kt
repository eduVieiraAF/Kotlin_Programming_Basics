package oop2

// • HIGHER ORDER FUNCTIONS → either return another function or take functions as parameter values

fun separator() {
    println()
    println()
    println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    println()
}

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) print("$it, ") //else println("[Element does not contain parameter]")
    }
}

val predicate: (String) -> Boolean = { it.contains("S") } // passing the lambda here instead

fun settPredicate(): (String) -> Boolean {
    return { it.contains("++") } // passing parameter as a function
}

fun main() {
    val list = listOf(
        "Kotlin", "Ktor", "Spring", "KMM", "Kotlin/JS", "Kotlin for Android", "Java", "JavaScript",
        "C++", "C#"
    )
    printFilteredStrings(list) { it.startsWith("K") }
    separator()
    printFilteredStrings(list) { it.contains("J") }
    separator()
    printFilteredStrings(list) { it.endsWith("d") }
    separator()
    printFilteredStrings(list, predicate)
    separator()
    printFilteredStrings(list, settPredicate())
    separator()

    val list2 = listOf("Kotlin", "Java", "Python", "Flutter", null, "JavaScript")
    list2
        .filterNotNull() // to cast out nullable values
        .filter { it.contains("t") }
        .forEach { print("$it, ") }
    separator()

    list2
        .filterNotNull()
        .filter { it.contains("t") }
        .map { it.length }
        .forEach { println(it) } // will return the length of each element that contains "t"
    separator()

    list
        .take(4)
        .forEach { print("$it, ") }
    separator()

    list
        .takeLast(4)
        .forEach { print("$it, ") }
    separator()

    list2
        .filterNotNull().associateWith { it.length }
        .forEach { println("${it.value} characters in ${it.key}") }
}

