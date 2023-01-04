package udemy_OOP

// Inherits everything from Truck which inherits from Vehicle
class PickUpTrucks(model: String, brand: String, fuel: String) : Truck(model, brand) {
}