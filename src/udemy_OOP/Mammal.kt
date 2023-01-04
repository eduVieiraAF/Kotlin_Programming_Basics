package udemy_OOP

import samples.prettyPrintln

// * Abstract classes cannot be instantiated
// * However, you can inherit subclasses from an abstract class
// * Properties and methods of an abstract class are non-abstract
    // unless you explicitly make them abstract

abstract class Mammal(
    private val name: String,
    private val origin: String,
    private val weight: Double
) {
    // must be overriden by Child Class
    abstract var maxSpeed: Int

    // must be implemented by Child Class
    abstract fun run()
    abstract fun breathe()

    // Non-Abstract Method
    fun showDetails() {
        prettyPrintln("Name: $name:\n" +
                "\tOrigin: $origin\n" +
                "\tWeight: $weight")
    }
}

class Human(name: String, origin: String, weight: Double): Mammal(name, origin, weight) {
    override var maxSpeed: Int = 20

    override fun run() {
        prettyPrintln("Runs on 2 legs")
    }

    override fun breathe() {
        prettyPrintln("Breathes through nose and mouth")
    }

}

class Elephant(name: String, origin: String, weight: Double) : Mammal(name, origin, weight) {
    override var maxSpeed: Int = 45
    override fun run() {
        prettyPrintln("Runs on 4 legs")
    }

    override fun breathe() {
        prettyPrintln("Breathes through trunk")
    }

}