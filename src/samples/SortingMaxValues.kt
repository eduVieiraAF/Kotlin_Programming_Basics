package samples

fun main() {

    val int = Int.MAX_VALUE.toLong()
    val long = Long.MAX_VALUE
    val short = Short.MAX_VALUE.toLong()
    val byte = Byte.MAX_VALUE.toLong()

    val array = mutableListOf(byte, int, long, short)
    var temp: Long?

    for (i in 1..array.size) {
        temp = array.minOrNull()
        println(temp)
        array.removeAt(array.indexOf(temp))
    }
}

