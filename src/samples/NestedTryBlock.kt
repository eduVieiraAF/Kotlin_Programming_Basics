package samples

fun main() {
    val num = intArrayOf(4, 8, 16, 32, 64, 128)
    val deno = intArrayOf(2, 0, 4, 4, 0, 8)

    try {
        for (i in num.indices) {
            try {
                prettyPrintln(num[i].toString() + "/" + deno[i] + " is " + num[i] / deno[i])
            } catch (e: ArithmeticException) {
                prettyPrintln("Cannot be divided")
            }
        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        prettyPrintln("Not found")
    }
}