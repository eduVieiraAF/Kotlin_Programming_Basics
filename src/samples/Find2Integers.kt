package samples


/*
The first line contains the size of the list.
The next N lines contain the elements of the list.
The last line contains two integer numbers P and M separated by a space.

If both numbers occur in the list you need to print YES, otherwise – NO.
 */

fun main() {

    val listSize = readLine()?.toInt()
    val myList = mutableListOf<Int>()
    if (listSize != null) {
        repeat(listSize) { readLine()?.toInt()?.let { it1 -> myList.add(it1) } }
    }
    val (p, m) = readLine()!!.split(" ")
    var flag = false

    if (listSize != null) {
        for (i in listSize - 1 downTo 0) {
            if (p.toInt() == myList[i]) {
                for (j in listSize - 1 downTo 0) {
                    if (m.toInt() == myList[j]) flag = true
                }
            }
        }
    }
    when (flag) {
        true -> println("YES")
        false -> println("NO")
    }
}

/*

Here's another alternative but no nested for loops as th challenge suggested

fun samples.samples.samples.samples.samples.main() {
    val listSize = readln().toInt()
    val mylist = MutableList(listSize) { readln().toInt() }
    val s = readln().split(" ").map(String::toInt)
    println(if (mylist.containsAll(s)) "YES" else "NO")
}
*/
