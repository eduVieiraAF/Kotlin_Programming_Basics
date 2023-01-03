package samples

fun main() {
    for (num in 1..10) {
        print(num)
    }

    println()

    for(i in 1 until 10) {
        print(i)
    }

    println()

    for (x in 10 downTo 1) {
        print(x)
    }

    println()

    for (s in 100 downTo 1 step 4) {
        print(s)
    }
}