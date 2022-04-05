package aquarium5

data class Fish (var name: String)

fun main(){

    fishExample()
}

fun fishExample() {

    val fish  = Fish("splashy")

    myWith(fish.name){ println(capitalize()) }

    println(fish.run { name }) // returns result
    println(fish.apply {  }) // returns the fish object

    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })

    val fish2 = Fish("splashy").apply { name = "Sharky" }
    println(fish2.name)
}

fun myWith (name: String, block: String.() -> Unit) {

    name.block()
}