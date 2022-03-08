package samples

fun main(){

    val inventory = mutableMapOf("fish net" to 1)

    //inventory.put("tank scrubber", 3)
    inventory["tank scrubber"] = 3
    println(inventory.toString())

    inventory.remove("fish net")
    println(inventory.toString())
}