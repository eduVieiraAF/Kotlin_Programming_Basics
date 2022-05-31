package oop

abstract class Person(open val name: String, open var age: Int){

    abstract fun speak()

   fun getBirthYear() = 2021 - age
}

class Student(override val name: String, override var age: Int): Person(name, age){

    override fun speak() {
        println("Hey, I'm $name, and I'm a student.")
    }
}

class Employee(override val name: String, override var age: Int): Person(name, age){

    override fun speak() {
        println("Hi there! My name's $name and I work here.")
    }

}

fun main() {


    val student = Student("Lizzy", 21)
    val employee = Employee("Mr. Dunham", 39)

    student.speak()
    employee.speak()

}