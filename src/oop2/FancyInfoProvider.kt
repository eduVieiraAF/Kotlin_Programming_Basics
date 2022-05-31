package oop2

class FancyInfoProvider : BasicInfoProvider() {
    override val providerInfo: String
        get() = "Fany info provider"

    override val sessionPrefix: String
        get() = "Fancy session by inheriting"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}