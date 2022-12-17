package samples


/*
In Kotlin, a companion object is a special object that is associated with a class. It is essentially a
singleton object that has the same name as the class and is defined inside the class. It is used to provide
a way to access certain properties or functions that are associated with the class, but do not belong to
any specific instance of the class. */

class Person {
    // name of companion object can be omitted
    companion object /*Test*/ {
        fun callMe() = prettyPrintln("I'm called.")
        fun callMeName(name: String) = prettyPrintln("I'm $name, good to meet you.")
        fun callMeInfo(
            name: String, age: Int
        ) = prettyPrintln("I'm $name → $age years old. Tell about yourself...")

    }
}

fun main() {
    Person.callMe()
    Person.callMeName("Mitch")
    Person.callMeInfo("Taylor", 40)

    val person = Person
    person.callMeName("Neil")
    person.callMeInfo("Martina", 23)
}