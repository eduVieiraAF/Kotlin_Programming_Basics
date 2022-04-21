package samples

// find and findLast functions return the first or the last collection element that matches the given predicate.
// If there are no such elements, functions return null.
fun main() {

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")
    val first = words.find { it.startsWith("some") } // looks for 1st word starting with "some"
    val last = words.findLast { it.endsWith("ow") } // looks for last word ending with "ow"
    val nothing = words.find { it.contains("nothing") }

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word ending with \"ow\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")
}