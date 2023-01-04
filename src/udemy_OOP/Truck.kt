package udemy_OOP

// Child class
open class Truck(model: String, brand: String, maxSpeed: Int) : Vehicle(model, brand, maxSpeed) { // inherits everything from parent class "Vehicle"
    var wheeler18: Boolean = false

}