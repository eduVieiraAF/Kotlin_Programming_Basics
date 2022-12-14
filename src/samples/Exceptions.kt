package samples

fun main() {
    val number = readlnOrNull() ?: "0"
    val parsedNumber = try { // tries to do what your code was designed for
        number.toInt()
    } catch (e: Exception) { // in case it fails, it will return sth else
        "Not a number. Nice try bucket-head."
    }
    println(parsedNumber)
}