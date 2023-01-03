package samples

fun main() {
    var name: String = " Eduardo"
    name = "Vieira"
    // name = null → compilation error

    var nullName: String? = "Eduardo"
    //nullName = null // no compilation error now

    val len = name.length
    val len2 = nullName?.length // solves the error instead of using if
    nullName?.let { println(it.length) }
}