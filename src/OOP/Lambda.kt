package OOP

fun main(){

    val list = listOf("Kotlin", "Java", "JavaScript")
    val count = list.customCount { currentSting -> currentSting.length > 4}

    println(count)
}

// fun <T> List<T>.customCount(function: (T) -> Boolean): Int{    *in case you wanna use this in any type of list
fun List<String>.customCount(function: (String) -> Boolean): Int{

    var counter = 0
    for(string in this){

        if(function(string)) {

            counter++
        }
    }

    return counter
}