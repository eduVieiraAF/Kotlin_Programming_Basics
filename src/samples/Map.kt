package samples

/*
A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value.
For creating maps, there are functions mapOf() and mutableMapOf(). Using the to infix function makes initialization
less noisy. A read-only view of a mutable map can be obtained by casting it to Map.
 */

fun main() {
    accountsReport()
    println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    // updatePointsCredit(readln().toInt()) to take user's input
    updatePointsCredit(1)
    updatePointsCredit(3)
    updatePointsCredit(5)
    println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
    accountsReport()
}

const val POINT_X_PASS = 15
val EZPassAccounts = mutableMapOf(1 to 100, 2 to 200, 3 to 100)
val EZPassReport = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating ID $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINT_X_PASS
    } else {
        println("Error → Unable to update or account $accountId does not exist")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit $v") }
}
