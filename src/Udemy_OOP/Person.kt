package Udemy_OOP

import samples.prettyPrintln

class Person(firstName: String = "John", lastName: String = "Doe") {
    init {
        prettyPrintln("Person ($lastName, $firstName) object created and initialized at the moment the " +
                "code is run")

        if (firstName == "John" && lastName == "Doe") println("\t** This new person not been given a proper name **")
        if (firstName != "John" && lastName == "Doe") println("\t** This new person not been given a proper surname **")
    }
}