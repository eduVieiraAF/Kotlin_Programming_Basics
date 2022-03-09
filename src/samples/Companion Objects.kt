package samples

class Person {

    // name of companion object can be omitted
    companion object /*Test*/ {

        fun callMe() = println("I'm called.")
    }
}

fun main(){

    Person.callMe()
}