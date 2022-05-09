package samples

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    println(numbers.joinToString(prefix = "---→  ", postfix = "  ─╣"))
    println(numbers.joinToString(prefix = "< ", postfix = " >", separator = " • "))

    val chars = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q')
    println(chars.joinToString(limit = 6, truncated = ", etc...!", separator = "  →  ") {
        "[•...${it.uppercaseChar()}...•]"
    })
}