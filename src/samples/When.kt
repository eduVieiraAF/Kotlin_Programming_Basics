package samples

fun main() {
    //val move = readln().toInt()
    //moving(move)

    //val string = readln().lowercase()
    //stringToInt(string)

    /*println(
        when (readln().toInt()) {
            1 -> "You have chosen a square"
            2 -> "You have chosen a circle"
            3 -> "You have chosen a triangle"
            4 -> "You have chosen a rhombus"
            else -> "There is no such shape!"
        }
    )*/

    val a = 10
    val b = 11

    when {
        a < 2 -> print(1)
        b > 3 -> print(2)
        a < b -> print(3)
    }
}

fun moving(move: Int) {

    when (move) {
        0 -> println("do not move")
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("move right")
        else -> println("error!")
    }
}

/*
    println(
        when (readln().toInt()) {
            1 -> "move up"
            2 -> "move down"
            3 -> "move left"
            4 -> "move right"
            0 -> "do not move"
            else -> "error!"
        }
    )*/

fun stringToInt(string: String) {
    when (string) {
        "one" -> println("1")
        "two" -> println("2")
        "three" -> println("3")
        "four" -> println("4")
        "five" -> println("5")
        "six" -> println("6")
        "seven" -> println("7")
        "eight" -> println("8")
        "nine" -> println("9")
        else -> println("invalid input")
    }
}

fun FTN() {

    println(
        when (readln().toInt()) {
            0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> "F"
            0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> "T"
            1, 10, 100, 1000, 10000, 100000 -> "P"
            else -> "N"
        }
    )
}
