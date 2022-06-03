package housing_oop

fun main() {
    val house = House(3, 2.0,"red", 500.00)
    house.hasPool(true)

    println()

    val house2 = House(5, 3.0, "white")
    house2.hasPool(true)
    house2.hasGarage(2)

    println()

    val house3 = House(5,4.0,"blue", 650.0, 2)
    house3.hasPool(false)
    house3.hasGarage(3)
}

