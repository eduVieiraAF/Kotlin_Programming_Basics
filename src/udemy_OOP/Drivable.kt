package udemy_OOP

// * Interfaces are features which allow us to extend the functionalities of classes
interface Drivable {
    val maxSpeed: Int
    fun drive(speed: Int): String
    fun brake() = println("Stopping")
}