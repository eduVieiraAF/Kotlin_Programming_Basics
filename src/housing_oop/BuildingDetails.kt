package housing_oop

abstract class BuildingDetails {
    open var windowStyle: String = ""
    abstract val floorAmount : Int
    abstract fun buildingPrompt()
}