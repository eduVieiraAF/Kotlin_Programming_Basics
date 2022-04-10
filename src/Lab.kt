
fun main() {

    var input = readln().toInt()
    var reversedNum = 0

    while (input != 0) {

        val digit = input % 10
        reversedNum = reversedNum * 10 + digit
        input /= 10
    }

    println("Reversed Number: $reversedNum")
}

