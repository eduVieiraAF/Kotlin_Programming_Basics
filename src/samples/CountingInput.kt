package samples

fun main() {

    var line = readln()
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    line = line.lowercase()

    for (element in line){

        when (element) {
            'a', 'e', 'i', 'o', 'u' -> ++vowels
            in 'a'..'z' -> ++consonants
            in '0'..'9' -> ++digits
            ' ' -> ++spaces
        }
    }

    println("__________________________")
    println("$vowels vowel(s)")
    println("$consonants consonant(s)")
    println("$digits digit(s)")
    println("$spaces space(s)")
}