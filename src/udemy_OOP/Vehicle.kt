package udemy_OOP

import samples.prettyPrintln

// Parent class
open class Vehicle(val model: String, val brand: String) {
    lateinit var color: String
    lateinit var transmition: String

    fun drive(speed: Int) {
        prettyPrintln("$brand $model is going at $speed km/h")
    }
}