package housing_oop

class OfficeBuilding(
    override var owner: String,
    override val rooms: Int,
    override val bathrooms: Double,
    override var color: String,
    marketPrice: Double,
    corporations: Map<Int, String>
) : Building(marketPrice) {

    private var corporations: Map<Int, String>

    init {
        this.corporations = corporations
    }

    inner class Storage(storageItems: Map<Int, String>) {
        private var storageItemMap: Map<Int, String>

        init {
            storageItemMap = storageItems
        }

        fun printStorage(roomNumber: Int) {
            if (storageItemMap[roomNumber] != null && corporations[roomNumber] != null) {
                println("${corporations[roomNumber]} currently storing → ${storageItemMap[roomNumber]}")
            }
            else println("No storage item.")
        }
    }
}