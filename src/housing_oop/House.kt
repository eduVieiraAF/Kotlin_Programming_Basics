package housing_oop

class House(rooms: Int, color: String) {
    var color: String
    val rooms: Int

    init {
        println("Property details\n" +
                "••••••••••••••••••••••••••••••••••••••••••••••••••••")
    }
    init {
        this.color = color
        println("Color → ${this.color.capitalized()}")
    }

    init {
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

    fun hasPool(pool: Boolean) {
        if (pool) println("Pool included") else println("No pool")
    }
}