package samples

// A set is an unordered collection that does not support duplicates. For creating sets, there are functions
// setOf() and mutableSetOf(). A read-only view of a mutable set can be obtained by casting it to Set.

fun main() {
    val aNewIssue = "uniqueDesc4"
    val anIssueAlreadyIn = "uniqueDesc2"

    println("Issue \"$aNewIssue\" ${getStatusLog(addIssue(aNewIssue))}.")
    println("Issue \"$anIssueAlreadyIn\" ${getStatusLog(addIssue(anIssueAlreadyIn))}.")
}

val openIssues = mutableSetOf("uniqueDesc1", "uniqueDesc2", "uniqueDesc3")

fun addIssue(uniqueDesc: String): Boolean { return openIssues.add(uniqueDesc) }

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly" else "marked as duplicate"
}