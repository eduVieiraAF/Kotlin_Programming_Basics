package OOP

abstract class Animal(

    private val name: String,
    val legs: Int = 4
) {

    init {
        println("Hey hooman, I am a $name")
    }

    abstract fun makeSound()
}