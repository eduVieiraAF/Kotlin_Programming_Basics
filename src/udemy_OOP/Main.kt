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
}