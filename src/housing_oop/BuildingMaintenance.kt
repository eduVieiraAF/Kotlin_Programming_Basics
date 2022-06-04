package housing_oop

interface BuildingMaintenance {
    val maintenanceStatus: String

    fun promptStatus() = println("Maintenance status → $maintenanceStatus")
}