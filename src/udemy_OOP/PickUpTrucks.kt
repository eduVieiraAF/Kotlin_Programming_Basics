package udemy_OOP

// Inherits everything from Truck which inherits from Vehicle
class PickUpTrucks(model: String, brand: String, fuel: String, maxSpeed: Int) : Truck(model, brand, maxSpeed) {
}