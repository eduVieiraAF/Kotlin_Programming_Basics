package OOP

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: String): Driveable, Buildable{
    override val timeRequired: Int = 120
    override fun drive() {
        println("driving car...")
    }

    override fun build() {
        println("Building a car in $timeRequired minutes")
    }
}

class Motorcycle (val color: String): Driveable{
    override fun drive() {
        println("riding motorcycle...")
    }
}

fun main() {
    val car: Driveable = Car("White")
    car.drive()

    val motorcycle: Driveable = Motorcycle("Blue")
    motorcycle.drive()
}