package aquarium

import kotlin.random.Random


fun main(){
    feedTheFish()
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