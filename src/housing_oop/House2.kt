package housing_oop

import samples.capitalized

class House2(
    override var owner: String,
    override val rooms: Int,
    override val bathrooms: Double,
    override var color: String
): Building(35_000.00) {
    override fun ownershipTransfer() {
        println("Ownership transferred to $owner".capitalized())
    }
}