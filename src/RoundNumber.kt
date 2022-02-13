import java.math.RoundingMode
import java.text.DecimalFormat

// Example #1

fun main(){

    rounding1()
    rounding2()
}

fun rounding1() {

    val number = 4.3651

    println("%.4f".format(number))
}


fun rounding2() {

    val number = 4.3651
    val formatted = DecimalFormat("#.###")

    formatted.roundingMode = RoundingMode.CEILING
    println(formatted.format(number))
}
