package samples

import java.util.*
fun main() {

    val myList = mutableListOf<Int>()
    val n = readln().toInt()

    repeat(n) { myList.add(readln().toInt()) }
    Collections.rotate(myList, n + 1)
    println(myList.joinToString(" "))

}
/*
A list of integers and cyclically shifts the elements of the list to the right: A[0] goes to the place of A[1], A[1]
becomes A[2], ..., and the last element goes to the place of A[0].

The first line of the input contains the number of elements in the list.
The other lines contain the elements of the list.

The output contains all the shifted elements of the list in a single line. Separate the elements by a space.

Sample Input 1:

5 - defines how many number to enter
1
2
3
4
5

Sample Output 1:

5 1 2 3 4
 */

