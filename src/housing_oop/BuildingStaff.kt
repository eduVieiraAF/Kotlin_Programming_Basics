package housing_oop

interface BuildingStaff {
    val buildingStaff : Map<Int, String>

    fun staffAmount() = println("Amount of staff is ${buildingStaff.size}")
}