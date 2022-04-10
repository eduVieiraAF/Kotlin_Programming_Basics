package samples

fun main(){

    println("Eat. Sleep. Code.\n".repeat(7)) // \n gives you a line feed (new line)

    println()

    println("\'H\' is the first letter of \"Hello world!\" string.") // \'string\' or \"string\"

    println()

    // RAW STRING

    val largeString = """
    This is the house that Jack built.
      
    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
""".trimIndent() // removes the first and the last lines and trim indents

    print(largeString)

    println()

    val unevenString = """
        123
         456
          789""".trimIndent()
    print(unevenString)
    println()

    val rawString = """123
         456
          789
""".trimIndent()

    print(rawString )
}