package samples

/*
→ In software engineering, the delegation pattern is an object-oriented design pattern that allows object
        composition to achieve the same code reuse as inheritance.
→ Kotlin supports easy implementation of the delegation pattern on the native level without any boilerplate code.
*/

interface SoundBehavior {
    fun makeSound()
}

class ScreamBehavior(val n: String): SoundBehavior {
    override fun makeSound() = println("${ n.uppercase() }!!!!".uppercase())
}

class RockAndRollBehavior(val n: String): SoundBehavior {
    override fun makeSound() = println("I'm the king of Rock 'N Roll → $n.")
}

class TomAraya(n: String): SoundBehavior by ScreamBehavior(n)

class ElvisPresley(n: String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomA = TomAraya("Thrash Metal")
    val elvisP = ElvisPresley("A Little Less Conversation")

    tomA.makeSound()
    elvisP.makeSound()
}