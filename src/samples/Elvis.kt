package samples

import housing_oop.prettyPrintln

// the Elvis operator

class Elvis(
    var firstName: String,
    var midName: String?,
    var lastName: String
)


fun main() {
    val person1 = Elvis("Kevin", null, "Jones")
    val person2 = Elvis("Linda", "Pamela", "Smith")

    val mid = person1.midName ?: "<Middle name omitted>"
    person1.midName = mid

    prettyPrintln("\t${person1.lastName}, ${person1.firstName} - ${person1.midName}")
    prettyPrintln("\t${person2.lastName}, ${person2.firstName} - ${person2.midName}")
}