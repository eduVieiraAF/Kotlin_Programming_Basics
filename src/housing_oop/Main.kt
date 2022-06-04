package housing_oop

fun main() {
    /*
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

    println()*/

    val house4 = House2("Steven", 20, 10.5, "Cyan")
    house4.ownershipTransfer()

    println()

    val apartment = Apartment(
        "Eduardo",
        20,
        11.5,
        "teal",
        3,
        "pending",
        20_000.00,
        mapOf(1 to "Ben Schenkel", 2 to "Nancy Stewart"),
        mapOf(1 to "Javier Rodriguez", 2 to "Zack Scholz", 3 to "Robert LeBlanc", 4 to "Ingrid Spencer")
    )

    prettyPrintln("• New owner → ${apartment.owner.capitalized()}\n" +
            "\t• ${apartment.rooms} rooms\n" +
            "\t• ${apartment.bathrooms} bathrooms\n" +
            "\t• with ${apartment.color} colored walls\n" +
            "\t• has ${apartment.floorAmount} floors\n" +
            "\t• sold for ${apartment.showPrice()}")

    apartment.buildingPrompt()
    apartment.promptStatus()
    apartment.staffAmount()
    println()
    apartment.printTenant(1)
    apartment.printTenant(2)
    apartment.printTenant(3)
}
