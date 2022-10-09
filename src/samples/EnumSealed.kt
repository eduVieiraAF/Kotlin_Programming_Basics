package samples

fun main() {
    var c1 = Father.Child1
    var c2 = Father.Child2
    family(c1)
    family(c2)
}

sealed class Father {
    // A sealed class is a class that restricts the class hierarchy

    object Child1 : Father()
    object Child2 : Father()
    object Child3 : Father()

}

fun family(member: Father) {
    when (member) {
        is Father.Child1 -> println("1st born")
        is Father.Child2 -> println("middle child")
        is Father.Child3 -> println("youngest one")
        // no need for the else statement because of the sealed class
    }
}

// Sealed classed allows for different types whereas Enum allows for only one

enum class Days(day: String) {
    MONDAY("one"),
    // TUESDAY(2) error
}

sealed class Days2 {
    class Monday(day: String) : Days2()
    class Tuesday(day: Int) : Days2() // no error
}