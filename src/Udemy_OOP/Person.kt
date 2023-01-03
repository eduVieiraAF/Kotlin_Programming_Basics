package Udemy_OOP

import samples.prettyPrintln

class Person(firstName: String = "John", lastName: String = "Doe") {

    var firstName: String? = null
    var lastName: String? = null
    init {
        this.firstName = firstName
        this.lastName = lastName

        prettyPrintln("Person ($lastName, $firstName) object created and initialized at the moment the " +
                "code is run")

        if (firstName == "John" && lastName == "Doe") println("\t** This new person not been given a proper name **")
        if (firstName != "John" && lastName == "Doe") println("\t** This new person not been given a proper surname **")
    }

    // * Member variable - properties
    var age : Int? = null
    var hobby: String? = null

    // * member functions - methods
    fun showHobby() = println("$firstName's hobby is $hobby")
    fun showAge() = println("$firstName is $age years old").also { if (age == null) println("Please insert age") }
}