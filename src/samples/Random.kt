package samples

import kotlin.random.Random

fun main() {
    // generates an integer value between Int.MIN_VALUE and Int.MAX_VALUE (inclusive)
    println(Random.nextInt())
    // generates a long value between Long.MIN_VALUE and Long.MAX_VALUE (inclusive).
    println(Random.nextLong())
    // generates a float value between 0 (inclusive) and 1.0 (exclusive)
    println(Random.nextFloat())
    // generates a double value between 0 (inclusive) and 1.0 (exclusive)
    println(Random.nextDouble())
    // same thing one more time
    println(Random.nextDouble())

    val list = listOf(1, 3, 4, 8, 9)
    print("→ ${list.random()}")

    println()

// CUSTOM RANGES

// generates a non-negative integer value less than 100
    println(Random.nextInt(100))
// generates an integer value between 1 (inclusive) and 100 (exclusive)
    println(Random.nextInt(1, 100))
// generates a non-negative long value less than 100
    println(Random.nextLong(100))
// generates a long value between 1 (inclusive) and 100 (exclusive)
    println(Random.nextLong(1, 100))
// generates a non-negative double value less than 5.0
    println(Random.nextDouble(5.0))
// generates a double value between 0.0 (inclusive) and 5.0 (exclusive)
    println(Random.nextDouble(0.0, 5.0))

    println()

    throwDice()

    println()

    println(generateTemperature(23))

    /*
    Pseudorandom numbers and seeding

So why are these functions called next[......] and not get[.....]? Every time the function is called, it gives us
the next number in a predefined sequence. These numbers are called pseudorandom, and they are not completely
unpredictable! We can calculate them all if we know the initial value and the algorithm of the sequence.
That initial value is called a seed. The seed itself is never returned by a next[......] function but it defines all
the subsequent numbers.

It is guaranteed that the same seed produces the same sequence if the same Kotlin runtime version is used because
the algorithm is the same. This can be useful to reliably test code that uses random generators.

Let's generate five pseudorandom numbers from the sequence with the seed 42:

val randomGenerator42 = Random(42) // the generator takes the seed
for (i in 0..5) {
    randomGenerator42.nextInt(100)
}

In Kotlin 1.4, this code will always generate the same five numbers — 33, 40, 41, 2, 41, 32 — even on different
machines. In contrast, the default generator will give us a new sequence every time.

the same generator we use when we call Random.nextInt(), Random.nextFloat() etc.

val defaultGenerator = Random.Default
for (i in 0..5) {
    defaultGenerator.nextInt(100)
}
     */

    shuffledIntGenerator()
}

fun throwDice(): Int {

    return Random.nextInt(1, 7)
}

/*Temperature generator
 Medium
633 users solved this problem. Latest completion was 16 minutes ago.
Imagine that you were tasked with measuring the water temperature in the aquarium for a week.
Unfortunately, you forgot about it, and now you need to fake a temperature journal. The normal temperature in the
aquarium ranges from 20 to 30 degrees (inclusive).

Write a function that gets a seed and returns a string with 7 numbers from 20 to 30 on one line.
For example: 20 26 21 30 27 23 25 */

fun generateTemperature(seed: Int): String {
    val randomTemperature: MutableList<Int> = mutableListOf()
    val randomizer = Random(seed)

    for (day in 0..6) {
        randomTemperature.add(randomizer.nextInt(20, 31))
    }

    return randomTemperature.joinToString(" ")
}


// it's possible to shuffle random numbers
fun shuffledIntGenerator() {
    val number: MutableList<Int> = mutableListOf()
    for (i in 0..5) {
        number.add(Random.nextInt(1, 60))
    }
    prettyPrintln("LOTTERY NUMBERS\n${number.shuffled()}")
}