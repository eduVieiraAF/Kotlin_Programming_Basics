package oop2

fun main() {
    val person = Person()
    person.firstName
    person.lastName
    person.nickName = "Dude" // calling setter
    person.nickName = "Needs new nickname" // calling setter
    println()
    println(person.nickName) // calling setter
}