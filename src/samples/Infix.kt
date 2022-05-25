package samples

fun main(){
    val p = Structure()

    p createPyramid 9 // rather than p.createPyramid(9)
}

class Structure {

    infix fun createPyramid(rows: Int) {
        var k: Int

        for (i in 1..rows) {
            k = 0

            for (space in 1..rows-i) print("  ")
            while (k != 2*i-1) {
                print("* ")
                ++k
            }

            println()
        }
    }
}
