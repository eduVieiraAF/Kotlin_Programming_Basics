package generics

open class WaterSupply (var needsProcessing: Boolean)

class TapWater: WaterSupply(true){

    fun addChemicalCleaners() {needsProcessing = false}
}

class FishStoreWater: WaterSupply(true)

class LakeWater: WaterSupply(true){

    fun filter() {needsProcessing = false}
}

class Aquarium<T: WaterSupply> (val waterSupply: T){

    fun addWater(){

        check(!waterSupply.needsProcessing) {"water supply needs processing first"}
        println("adding water from $waterSupply")
    }
}

fun genericsExample() {

    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}

fun main(){

    genericsExample()
}
