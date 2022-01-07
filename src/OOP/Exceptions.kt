package OOP

fun main(){

    val number = readLine()?: "0"
    val parsedNumber = try { // tries to do what your code was design for

        number.toInt()
    } catch (e: Exception) { // in case it fails, it will return sth else
        "Not a number. Nice try buckethead"
    }
    println(parsedNumber)
}