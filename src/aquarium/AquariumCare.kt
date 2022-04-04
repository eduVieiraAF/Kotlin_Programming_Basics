package aquarium

fun main(){

    /*val symptoms: MutableList<String> = mutableListOf("white spot", "red spots", "not eating", "bloated",
        "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("re") // false
    symptoms.contains("not eating") // true

    println(symptoms.subList(4, symptoms.size))

    listOf(1, 5, 3).sum()
    listOf("a", "b", "c").sumBy { it.length }*/

    val cures: Map<String, String> = mapOf( "white spots" to "ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])
    println(cures.getOrDefault("bloating", "sorry, not listed here"))
    cures.getOrElse("bloating") {"No cure yet"}

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrub bush", 3)
    inventory.remove( "fish net" )

}