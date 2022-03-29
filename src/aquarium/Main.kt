package aquarium

fun main(){

    buildAquarium()
}

fun buildAquarium() {

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")
    println("The volume is ${myAquarium.volume} litres")

    println()
    myAquarium.height = 80
    println("Height: ${myAquarium.height}")
    println(println("The volume is ${myAquarium.volume} litres"))
}
