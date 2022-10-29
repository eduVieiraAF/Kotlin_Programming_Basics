import samples.decimalPlaces

fun main() {
    val result = 4.8 * Math.PI
    println("Decimal point in place → ${result.decimalPlaces(2)}")
}