package housing_oop

import samples.capitalized

open class Building(marketPrice: Double): BuildingDetails(), BuildingMaintenance, BuildingStaff {
    init {
        println("Current market value is $marketPrice")
    }

    open var owner: String = ""
    open val rooms: Int = 0
    open val bathrooms: Double = 0.0
    open var color: String = ""
    override val maintenanceStatus: String = ""

    override val floorAmount = 0
    override val buildingStaff: Map<Int, String>  = mapOf()

    open fun ownershipTransfer() {
        println("The owner is ${owner.capitalized()}")
    }

    override fun buildingPrompt() {
        println("Welcome to my building.")
    }
}