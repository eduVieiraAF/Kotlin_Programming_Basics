package samples

fun main() {
    val weight = 70.0
    val height = 1.66

    println(calculateBMI(weight, height).toInt())
}

fun calculateBMI(weight: Double, height: Double): Double = weight / (height * height)