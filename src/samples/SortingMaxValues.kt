package samples

/**
 * Prints the max values of Byte, Int, Long and Short in order.
 *
 * The output will be [127, 2147483647, 9223372036854775807, 32767].
 */
fun main() {

    val array = listOf(Byte.MAX_VALUE.toLong(), Int.MAX_VALUE.toLong(), Long.MAX_VALUE, Short.MAX_VALUE.toLong())

    array.sorted().forEach { println(it) }
}

