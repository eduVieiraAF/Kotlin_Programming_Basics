package samples

fun main(){

    //print10Numbers()

    val x = isEven(7)
    val y = 5

    println(x)
    println(y.isOdd())
}

fun print10Numbers(){

    for (i in 1..10){

        println("The number is $i.")
    }
}

fun isEven(number: Int = 4): Boolean {

    return number % 2 == 0
}

//extension function

fun Int.isOdd(): Boolean{

    return this % 2 == 1
}