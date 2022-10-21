package housing_oop

import samples.capitalized
import samples.prettyPrintln

fun main() {

    val house = House(3, 2.0, "red", 500.00)
    house.hasPool(true)

    println()

    val house2 = House(5, 3.0, "white")
    house2.hasPool(true)
    house2.hasGarage(2)

    println()

    val house3 = House(5, 4.0, "blue", 650.0, 2)
    house3.hasPool(false)
    house3.hasGarage(3)

    println()

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

    prettyPrintln(
        "• New owner → ${apartment.owner.capitalized()}\n" +
                "\t• ${apartment.rooms} rooms\n" +
                "\t• ${apartment.bathrooms} bathrooms\n" +
                "\t• with ${apartment.color} colored walls\n" +
                "\t• has ${apartment.floorAmount} floors\n" +
                "\t• sold for ${apartment.showPrice()}"
    )

    apartment.buildingPrompt()
    apartment.promptStatus()
    apartment.staffAmount()
    println()
    apartment.printTenant(1)
    apartment.printTenant(2)
    apartment.printTenant(3)

    prettyPrintln()

    val officeBuilding = OfficeBuilding(
        "Phoenix tech",
        6,
        3.0,
        "Blue",
        20_500.0,
        mapOf(
            24 to "Silver Dollar",
            25 to "Monitor Rim",
            26 to "Switch inc."
        )
    ).Storage(
        mapOf(
            24 to "Coffee",
            25 to "GPS units",
            26 to "automated lights"
        )
    )
    officeBuilding.printStorage(24)
    officeBuilding.printStorage(26)

    println()

    val employee1 = Employee("Mitchel Greene", 21)
    println(employee1.toString())
    val employee2 = employee1.copy(name = "James Colbert", age = 23)
    println(employee2.toString())
    val employee3 = employee1.copy()
    println(employee3.toString())

    prettyPrintln(
        "Hash value of employee1 → ${employee1.hashCode()}\n" +
                "Hash value of employee2 → ${employee2.hashCode()}\n" +
                "Hash value of employee3 → ${employee3.hashCode()}\n" +           //rather than equals()
                "Are ${employee1.name} and ${employee2.name} the same object? → ${employee1 == employee2}\n" +
                "Are ${employee1.name} and ${employee3.name} the same object? → ${employee1 == employee3}"
    )
    val (name, age) = employee1
    println("Employee's name is $name and age is $age")

    prettyPrintln("Standard rent fee (12-month contract) → ${BuildingUtil.costOfStandardRate(12)}\n" +
            "Deluxe rent fee (12-month contract) → $${BuildingUtil.costOfDeluxeRate(12)}")
}
