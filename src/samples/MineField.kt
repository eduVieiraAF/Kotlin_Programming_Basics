package samples

import kotlin.random.Random

const val COLS = 9
const val ROWS = 9

fun main() {
    print("How many mines do you want on the field? ")
    val mineCount = readln().toInt()
    val mineField = MutableList(COLS * ROWS) { "." }
    var placedMines = 0

    while (placedMines < mineCount) {
        val rnd = Random.nextInt(COLS * ROWS - 1)
        if (mineField[rnd] != "x") {
            mineField[rnd] = "x"
            placedMines++
        }
    }

    for (i in 0 until mineField.size step 9) {
        println(mineField.slice(i..i + 8).joinToString(""))
    }
}