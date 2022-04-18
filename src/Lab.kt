fun main(){

    val mutList2D = mutableListOf(
        mutableListOf(0, 1, 2),   //[0]
        mutableListOf(3, 4, 5)    //[1]
    )

    println(mutList2D[0][2]) // will access the 1st list and fetch the last element at index [2]

    // -> more examples

    println(mutList2D[0][0])  // 0
    println(mutList2D[0][1])  // 1
    println(mutList2D[0][2])  // 2
    println(mutList2D[1][0])  // 3
    println(mutList2D[1][1])  // 4
    println(mutList2D[1][2])  // 5
}