package samples

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
}