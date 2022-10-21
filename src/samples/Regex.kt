package samples

fun main() {

    val pattern = Regex("^a")

    prettyPrintln(pattern.containsMatchIn("abc"))
    prettyPrintln(pattern.containsMatchIn("bac"))
}