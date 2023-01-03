package udemy_OOP

import samples.prettyPrintln

fun main() {
    val edu = Person("Eduardo", "Vieira")
    // val john = Person("John", "Smith")
    // val unknown = Person(firstName = "Jack")

    edu.hobby = "Martial Arts"
    edu.age = 40
    edu.showHobby()
    edu.showAge()

    // myFunction(5)
    // can access global variable here
    b = 9

    val myCar = Car()
    println(myCar.myBrand)
    myCar.maxSpeed = 280
    println("${myCar.owner}'s ${myCar.myBrand}'s top speed is ${myCar.maxSpeed}km/h")

    // myCar.myModel = "M3" cannot be reassigned due to 'private' keyword but its getter works
    prettyPrintln(myCar.myModel)

    prettyPrintln()

    val user1 = User(1, "Eduardo")
    println(user1.name)

    val name = user1.name
    val id = user1.id
    println(id)

    val user2 = User(1, "Heather")
    println(user1.equals(user2)) // alternatively "==" instead of equals

    // data class also makes available toString and copy
    val user3 = user2.copy(name = "Joyce")
    println(user3)
    println(user3.component1()) // the id parameter
    println(user3.component2()) // the name parameter

    val (code, avatar) = user1
}