package samples

fun main() {
    sample1()
    println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    sample2()
}

fun sample1() {
    /*
    These functions return the first and the last element of the collection correspondingly. You can also use them with
    a predicate; in this case, they return the first or the last element that matches the given predicate.
    If a collection is empty or doesn't contain elements matching the predicate, the functions throw
    NoSuchElementException.
 */
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val first = numbers.first()
    val last = numbers.last()

    println("\"$first\" is the first element.")
    println("\"$last\" is the last element")

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last{ it % 2 != 0 }

    println("\"$firstEven\" is the first even-numbered element.")
    println("\"$lastOdd\" is the last odd-numbered element.")
}

fun sample2() {
    /*
   firstOrNull, lastOrNull
   These functions work almost the same way with one difference: they return null if there are no matching elements.
    */
    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val first = empty.firstOrNull()
    val last = empty.lastOrNull()

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }
    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println("Empty list: first is $first, last is $last")
    println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
    println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")
}