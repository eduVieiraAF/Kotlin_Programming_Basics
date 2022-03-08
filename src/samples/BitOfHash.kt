package samples

fun main(){

    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures["white spots"])
    println()
    println(cures["red sores"])
    println()
    println(cures["scale loss"])
    println()
    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    println()
    println(cures.getOrElse("bloating"){"No cure for this"})
}