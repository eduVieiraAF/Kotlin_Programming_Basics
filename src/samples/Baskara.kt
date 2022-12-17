fun findRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val discriminant = b * b - 4 * a * c
    val root1 = (-b + Math.sqrt(discriminant)) / (2 * a)
    val root2 = (-b - Math.sqrt(discriminant)) / (2 * a)
    return Pair(root1, root2)
}

fun main() {
    val roots = findRoots(2.0, 3.0, 1.0)
    println("Root 1: ${roots.first}")
    println("Root 2: ${roots.second}")
}
