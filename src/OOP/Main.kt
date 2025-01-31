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

    // anonymous class

    println()

    val lion = object: Animal("Lion") {

        override fun makeSound() {

            println("ROAR!!!")
        }
    }
    lion.makeSound()

    println()

    val tiger = object: Animal("Tiger", 2) {
        override fun makeSound() {

            println("ROAR!!! [and limps]")
        }
    }
    tiger.makeSound()
}