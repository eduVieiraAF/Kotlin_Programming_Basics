package samples

/*
 a HashMap is a class that implements a map data structure, which is a collection of key-value pairs. It is similar to
 a dictionary in other programming languages. A HashMap is an unordered collection, which means that the order of the
 elements is not guaranteed to be the same as the order in which they were added to the map.
 */
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