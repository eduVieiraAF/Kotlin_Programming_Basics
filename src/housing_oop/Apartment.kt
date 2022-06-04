package housing_oop

class Apartment(
    override var owner: String,
    override val rooms: Int,
    override val bathrooms: Double,
    override var color: String,
    override val floorAmount: Int,
    price: Double,
    tenants: Map<Int, String>
): Building(price) {
    private var price = 0.0
    private var tenants = mapOf<Int,String>()

    init {
        this.tenants = tenants
        this.price = price
    }

    override fun buildingPrompt() {
        super.buildingPrompt()
    }

    fun printTenant(id: Int) {
        if (tenants[id] != null) println("Current tenant is ${tenants[id]}.")
        else println("No current tenant at room $id.")
    }

    fun showPrice() = price
}