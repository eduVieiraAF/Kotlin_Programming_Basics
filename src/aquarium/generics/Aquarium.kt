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

class Aquarium<out T: WaterSupply> (val waterSupply: T){

    fun addWater(cleaner: Cleaner<T>){

        if (waterSupply.needsProcessed) cleaner.clean(waterSupply)
        println("adding water from $waterSupply")

    }
}

// a reified type is a real type to declare R and make it a real type
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

interface Cleaner<in T: WaterSupply> {fun clean(waterSupply: T)}

class TapWaterCleaner: Cleaner<TapWater>{

    override fun clean(waterSupply: TapWater) {

        waterSupply.addChemicalCleaners()

    }

}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {

    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")

}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample(){

    val cleaner = TapWaterCleaner()

    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()
    //aquarium2.addWater()

    val aquarium3 = Aquarium(TapWater())
    aquarium3.addWater(cleaner)
    isWaterClean(aquarium3)
    aquarium3.hasWaterSupplyOfType<TapWater>() // true
    aquarium3.waterSupply.isOfType<LakeWater>() // false

}
 /* In and OUT:

 Out types are type parameters that only ever occur in return values of functions, or on VAL properties. If we try
 to pass an out type as a parameter to a function, we get a compile error. Once we make a generic type an out type,
 kotlin can infer extra information about where our types are safe to use.

 In types are from the sme school as out types. In types can e used anytime the generic is only used as an argument
 to functions. More specifically, in types can only be passed into an object. Out types can only be passed out of an
 object or returned.

 There's one special time you can pass an out type - Constructor can take out types as arguments, but functions never
 can.
  */