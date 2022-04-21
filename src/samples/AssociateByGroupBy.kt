package samples

/*
associateBy and groupBy build maps from the elements of a collection indexed by the specified key. The key is defined
in the 'keySelector' parameter. You can also specify an optional 'valueSelector' to define what will be stored in the
'value' of the map element.

The difference between 'associateBy' and 'groupBy' is how they process objects with the same key:

    • 'associateBy' uses the last suitable element as value.
    • 'groupBy builds a list of all suitable elements and puts it in the value.
 */

fun main() {
    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("John", "Boston", "+1-848-456321"),
        Person("Maggie", "Sydney", "+61-3-789331"),
        Person("Sylvia", "Saint-Petersburg", "+7-719-783456"),
        Person("Yuri", "Saint-Petersburg", "+7-999-145269")
    )

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::name)
    val lastPersonCity = people.associateBy(Person::city, Person::name)

    println("People: $people")
    println("••••••••••••••••••")
    println("Phone book: $phoneBook")
    println("••••••••••••••••••")
    println("City book: $cityBook")
    println("••••••••••••••••••")
    println("People living in each city: $peopleCities")
    println("Last person living in each city: $lastPersonCity")
}