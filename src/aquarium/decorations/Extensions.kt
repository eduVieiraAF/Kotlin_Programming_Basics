package aquarium.decorations

/*
fun String.hasSpaces(): Boolean{

    val found: Char? = this.find { it == ' ' }
    return found != null

} the example below is shorter and more 'Kotlin-lie'
*/

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() = "Does it have spaces?".hasSpaces() // true

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample(){

    val plant = GreenLeafyPlant(50)
    plant.print()

    val aquariumPlants: AquariumPlant = plant
    aquariumPlants.print()

}

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExxample(){

    val plant = AquariumPlant("Green", 50)
    plant.isGreen // true

}

fun AquariumPlant?.pull() {this?.apply { println("Removing $this") }}

fun nullableExample() {

    val plant: AquariumPlant? = null
    plant.pull()

}