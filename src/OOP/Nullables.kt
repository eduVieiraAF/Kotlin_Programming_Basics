package OOP

fun main(){

    //val x: Int? = null
    val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0"
    val result = number1.toInt() + number2.toInt()
    println("$result is the sum of your input.")
}
