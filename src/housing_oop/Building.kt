package housing_oop

open class Building(marketPrice: Double): BuildingDetails() {
    init {
        println("Current market value is $marketPrice")
    }

    open var owner: String = ""
    open val rooms: Int = 0
    open val bathrooms: Double = 0.0
    open var color: String = ""

    override val floorAmount = 0
    open fun ownershipTransfer() {
        println("The owner is ${owner.capitalized()}")
    }

    override fun buildingPrompt() {
        println("Welcome to my building.")
    }
}