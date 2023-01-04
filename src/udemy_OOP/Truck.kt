package udemy_OOP

// Child class
open class Truck(model: String, brand: String) : Vehicle(model, brand) { // inherits everything from parent class "Vehicle"
    var wheeler18: Boolean = false

}