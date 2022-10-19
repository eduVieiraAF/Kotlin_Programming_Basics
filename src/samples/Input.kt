package samples

import housing_oop.isNumber
import housing_oop.prettyPrintln

fun main() {
    while (true) {
        print("Enter your name: ")
        val name = readln()
        if (name.isBlank()) println("You cannot leave 'name' empty.")
        else if (isNumber(name)) println("You cannot enter numbers.")
        else {
            prettyPrintln("Your name is → \n$name")
            break
        }
    }
}





