package samples

import java.util.*

class Pirate(var name: String, var rank: String, var nick: String)

fun main() {

    // Suggested replacement for .capitalize() but an extension function was created (by me)

    val captain1 = Pirate("hector Barbosa", "Captain", "Capt. Barbosa")
    println(
        "${
            captain1.name.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault())
                else it.toString()
            }
        } is a(n) ${
            captain1.rank.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(
                    Locale.getDefault()
                ) else it.toString()
            }
        }, and you may call him ${
            captain1.nick.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
            }
        }"
    )


    val captain2 = Pirate("Jack Sparrow", "Captain", "Sparrow")
    println(
        "${captain2.name.capitalize()} is a(n) ${captain2.rank.capitalize()}, and you may call him " +
                captain2.nick.capitalize()
    )

    val captain3 = Pirate("edu Vieira", "captain", "james")
    println(
        "${captain3.name.capitalized()} is a ${captain3.rank.capitalized()}, aka " +
                "\"${captain3.nick.capitalized()}\""
    )
}
