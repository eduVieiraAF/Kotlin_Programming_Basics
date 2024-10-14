package samples

fun main() {
    val c1: Father.Child1 = Father.Child1
    val c2 = Father.Child2

    describeFamilyMember(c1)
    describeFamilyMember(c2)
}

sealed class Father {
    // A sealed class is a class that restricts the class hierarchy
    object Child1 : Father()
    object Child2 : Father()
    object Child3 : Father()

}

fun describeFamilyMember(member: Father) {
    when (member) {
        Father.Child1 -> println("Firstborn")
        Father.Child2 -> println("Middle child")
        Father.Child3 -> println("Youngest child")
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