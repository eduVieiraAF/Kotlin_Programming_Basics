package oop2

// internal is only accessible within same module
class Person(private val firstName: String, private val lastName: String) {
    init {
        println("Init 1")
    }

    constructor(): this("John", "Doe"){ //can be initialized in primary constructor
        //println("Secondary constructor with default values → " +
                //"\n first Name: $firstName\n last name: $lastName")
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

    fun printInfo() {
        //val nickNameToPrint = if (nickName != null) nickName else "no nickname"
        val nickNameToPrint = nickName ?: "no nickname" // code above replaced with the elvis operator → :?
        println("$firstName ($nickNameToPrint) $lastName")
    }
}