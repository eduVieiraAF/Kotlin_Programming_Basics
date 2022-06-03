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
        println("Rooms → $rooms\nBathrooms → $bathrooms\nColor → ${color.capitalized()}")
    }

    constructor(rooms: Int, bathrooms: Double, color: String, hoaFee: Double): this(rooms, color) {
        println("Rooms → $rooms\n" +
                "Bathrooms → $bathrooms\n" +
                "Color → ${color.capitalized()}\n" +
                "Fee → $hoaFee")
    }
}