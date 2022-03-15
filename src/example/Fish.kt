package example

data class Fish(var name: String)

fun fishExamples(){

    val fish = Fish("splashy")
    myWith(fish.name){ println(capitalize()) }

    fish.run { name }

    val fish2 = Fish(name = "splashy").apply { name = "sharky" }

    myWith(fish2.name, object : Function1<String, Unit>{

        override fun invoke (name: String){ name.capitalize()}
    })

    println(fish2.name)

    println(
        fish.name.capitalize()
        .let{it + "fish"}.length
        .let{it + 31})
    println(fish)
}

fun main(){

    fishExamples()
    println()
    runExample()
}

fun myWith(name: String, block: String.() -> Unit){name.block()}

fun runExample(){

   JavaRun.runNow { println("Passing a lambda as a Runnable") }
}