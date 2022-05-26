package samples

fun sayHello(greeting: String = "Hello", vararg peopleToGreet: String) {
    peopleToGreet.forEach { person ->
        println("$greeting, $person")
    }
}

fun main() {
    sayHello("Hey", "Jack")

    println("•••••••••••••••••••••")

// with vararg, elements will be treated as an array to eliminate the need to create one
    sayHello("Welcome", "John", "Nancy", "Phil")

    println("•••••••••••••••••••••")

// in case you want to use an array, place an '*' before array
    val people =  arrayOf("Will", "Jane", "Elliot", "Christine")
    sayHello("Ahoy", *people)
}