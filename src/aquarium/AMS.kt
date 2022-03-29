package aquarium

import kotlin.random.Random

fun main(){

    feedTheFish()
    eagerExample()
}

fun getDirtySensorReading () = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean{

        return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun feedTheFish(){

    val day = randomDay()
    val food = fishFood(day)

    shouldChangeWater(day)
    shouldChangeWater(day,20,50)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater("Monday")

    if (shouldChangeWater(day)) println("Change the water today")

    println("Today is $day and the fish eat $food")

    swim(50, "slow")

    dirtyProcessor()
}

fun eagerExample(){

    val decorations = listOf("rocks", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }

    println(eager)

    // apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }

    println(filtered)
    println(filtered.toList())

    //apply map lazily
    val lazyMap = decorations.asSequence().map { println("map: $it") }
    println("first: ${lazyMap.first()}")
    print("all: ${lazyMap.toList()}")
}

fun fishFood(day: String): String {

    var food = "fasting"

    return when(day){

        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String {

    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    return week[Random.nextInt(7)]
}

fun swim(time: Int, speed: String = "fast"){}

var dirty = 20

val waterFilter: (Int) -> Int = {dirty -> dirty / 2}

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty (dirty: Int, operator: (Int) -> Int): Int{

    return operator(dirty)
}

fun dirtyProcessor(){

    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty -> dirty + 50}
}