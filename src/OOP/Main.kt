package OOP

fun main(){

    val dog = Dog()
    println("I have ${dog.legs} legs.")
    dog.makeSound()

    println()

    val cat = Cat()
    println("I have ${cat.legs} legs.")
    cat.makeSound()

    println()

    val bird = Bird()
    println("I have ${bird.legs} legs.")
    bird.makeSound()
}