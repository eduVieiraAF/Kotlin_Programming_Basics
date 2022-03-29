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

    println()

    val smallAquarium = Aquarium(20, 15, 30)
    println("Small aquarium: ${smallAquarium.volume} litres")

    val aquarium2 = Aquarium(numberOfFish = 9)

    println()
    println("Small aquarium 2: ${aquarium2.volume} litres with length ${aquarium2.length} " +
            "width ${aquarium2.width} " + "height ${aquarium2.height}")
}
