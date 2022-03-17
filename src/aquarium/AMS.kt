package aquarium

import kotlin.random.Random


fun main(){

    feedTheFish()
}

fun feedTheFish(){

    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")
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