package aquarium.generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true){

    fun addChemicalCleaners() = !needsProcessed

}

class FishStoreWater: WaterSupply(false){

    fun filter() = !needsProcessed

}

class LakeWater: WaterSupply(false){

    fun filter() = !needsProcessed

}

class Aquarium<T: WaterSupply> (val waterSupply: T){

    fun addWater(){

        check(!waterSupply.needsProcessed) {"watter supply needs processed"}
        println("adding water from $waterSupply")

    }

}

fun genericExample(){

    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()
    aquarium2.addWater()

}
