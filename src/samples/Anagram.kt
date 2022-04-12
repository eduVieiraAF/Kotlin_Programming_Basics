package samples

fun main() {

    val str1 = readln().lowercase()
    val str2 = readln().lowercase()
    println()

    if (str1.length == str2.length){

        val sortedSet1 = str1.toSortedSet()
        val sortedSet2 = str2.toSortedSet()

        if (sortedSet1 == sortedSet2) println("$str1 and $str2 are an anagram.")
        else println("$str1 and $str2 are NOT an anagram.")
   }

   else println("$str1 and $str2 are NOT an anagram.")
}