package samples

import kotlin.math.abs

fun getLastDigit(a: Int) =  abs(a % 10)

fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
