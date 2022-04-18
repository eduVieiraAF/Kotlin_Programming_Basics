package samples

fun main(){

    val mutList2D = mutableListOf(
        mutableListOf(0, 1, 2),   //[0]
        mutableListOf(3, 4, 5)    //[1]
    )

    println(mutList2D[0][2]) // will access the 1st list and fetch the last element at index [2]
    println()

    // -> more examples
    println(mutList2D[0][0])  // 0
    println(mutList2D[0][1])  // 1
    println(mutList2D[1][0])  // 3
    println(mutList2D[1][1])  // 4
    println(mutList2D[1][2])  // 5

    // Multidimensional list of Type String
    val mutListOfString2D = mutableListOf(
        mutableListOf("to", "be", "or"),
        mutableListOf("not", "to", "be")
    )

    // Multidimensional list of Type Char
    val mutListOfChar2D = mutableListOf(
        mutableListOf('A', 'R', 'R'),
        mutableListOf('A', 'Y', 'S')
    )

    // Multidimensional list of various Types
    val mutListOfVariousTypes2D = mutableListOf(
        mutableListOf("Practice", "makes", "perfect"),
        mutableListOf(1, 2),
        mutableListOf('A', 'E', 'I', 'O', 'U')
    )

    println()
    println(mutListOfVariousTypes2D[2])
}