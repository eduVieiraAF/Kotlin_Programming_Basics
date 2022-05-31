package oop2

class Person(val firstName: String, val lastName: String) {
    init {
        println("Init 1")
    }

    constructor(): this("John", "Doe"){ //can be initialized in primary constructor
        //println("Secondary constructor with default values → " +
                //"\nfirst Name: $firstName\nlast name: $lastName")
    }

    init {
        println("Init 2")
    }

    var nickName: String? = null // property which is not mandatory
        set(value) {
            field = value // updates new object assignment into property
            println("The new nickname is $value")
        }

        get() {
            println("The returned value is $field")
            return field
        }
}