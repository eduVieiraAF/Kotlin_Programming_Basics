package oop2

interface PersonInfoProvider {
    val providerInfo: String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

class BasicInfoProvider : PersonInfoProvider {
    override val providerInfo: String
        get() = "Basic info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional info after overriding method from interface.")
    }
}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())
}