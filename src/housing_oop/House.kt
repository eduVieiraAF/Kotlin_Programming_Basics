package housing_oop

import samples.capitalized

class House(rooms: Int, color: String) {
    private var color: String
    private val rooms: Int

    init {
        println("Property details\n" +
                "••••••••••••••••••••••••••••••••••••••••••••••••••••")
        this.color = color
        println("Color → ${this.color.capitalized()}")

        this.rooms = rooms
        println("Rooms → ${this.rooms}")
    }

    constructor(rooms: Int, bathrooms: Double, color: String): this(rooms, color) {
        println("nBathrooms → $bathrooms")
    }

    constructor(rooms: Int, bathrooms: Double, color: String, hoaFee: Double): this(rooms, color) {
            println("Bathrooms → $bathrooms\n" +
                "Fee → $hoaFee")
    }

    constructor(rooms: Int, bathrooms: Double, color: String, hoaFee: Double, storeys: Int): this(rooms, color) {
        println("Bathrooms → $bathrooms\n" +
                "Fee → $hoaFee\n" +
                "$storeys-storey house")
    }

    fun hasPool(pool: Boolean) = if (pool) println("Pool included") else println("No pool")

    fun hasGarage(spots: Int) = println("Parking space for $spots cars.")
}