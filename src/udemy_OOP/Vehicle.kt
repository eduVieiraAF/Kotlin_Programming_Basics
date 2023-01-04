package udemy_OOP

// Parent class
open class Vehicle(val model: String, val brand: String, override val maxSpeed: Int): Drivable {
    lateinit var color: String
    lateinit var transmition: String
    override fun drive(speed: Int): String {
        return "$brand $model is going at $speed"
    }

}