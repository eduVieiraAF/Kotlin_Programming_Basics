package aquarium

const val rocks = 3 // Value is determined at compile time
val number = 5 //  Value is determine during execution
const val num = 5 // works at the top level and with classes declared with objects, not
                 // with regular classes declared with 'class'

const val CONSTANT = "top-level constant"

object Constants {

        const val CONSTANT2 = "object constant"

}

val foo = Constants.CONSTANT2

class MyClass {

    companion object { // is initialized from the static constructor of containing class

        const val CONSTANT3 = "constant inside companion object"

    }
}




