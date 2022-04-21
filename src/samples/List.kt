package samples

fun main() {
    addSysSudoers(4)
    getSysSudoers().forEach { i -> println(i) }
}

val systemUser = mutableListOf(1, 2, 3)
val sudoers = systemUser

fun addSysSudoers(newUser: Int) { systemUser.add(newUser) }

fun getSysSudoers(): List<Int> { return sudoers }

