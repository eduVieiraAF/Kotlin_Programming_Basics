package udemy_fundamentals

import samples.prettyPrintln

// * ArrayLists are used to create dynamic arrays, which means the size of the array may increase or decrease
    // * according to requirements.
//  * ArrayList class provide READ and WRITE functionalities.
// * An ArrayList is non-synchronized and may contain duplicate elements.

fun main() {
    val arrayList = ArrayList<String>(10)
    arrayList.add("Element 1")
    arrayList.add("Element 2")
    arrayList.forEach { println(it) }

    prettyPrintln()

    val list = listOf(
        "Element 3",
        "Element 4",
        "Element 5",
        "Element 6",
        "Element 7",
    )
    arrayList.addAll(list)
    arrayList.forEach { println(it) }
}