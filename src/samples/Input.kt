package samples

import housing_oop.prettyPrintln
import java.lang.Character.isDigit

fun main() {

    while (true) {
        print("Enter your name: ")
        val name = readlnOrNull()
        if (name.isNullOrBlank()) println("You didn't enter a valid name.")
        else if (isNumber(name)) println("You didn't enter a valid name.")
        else {
            prettyPrintln("Your name is → \n$name")
            break
        }
    }
}

fun isNumber(check:String): Boolean {
    return check.all { char -> char.isDigit() }
}



