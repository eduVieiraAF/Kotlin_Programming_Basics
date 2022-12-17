package samples

fun main() {

    val str1 = readLine()
    val str2 = readLine()
    println()

    if (str1!!.length == str2!!.length){

        val sortedSet1 = str1.toLowerCase().toSortedSet()
        val sortedSet2 = str2.toLowerCase().toSortedSet()

        if (sortedSet1 == sortedSet2) println("${str1.capitalized()} and ${str2.capitalized()} are an anagram.")
        else println("${str1.capitalized()} and ${str2.capitalized()} are NOT an anagram.")
   }

   else println("${str1.capitalized()} and ${str2.capitalized()} are NOT an anagram.")
}