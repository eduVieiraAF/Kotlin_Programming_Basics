package oop2

interface PersonInfoProvider {
    val providerInfo: String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "Basic info provider"

    protected open val sessionPrefix = "Session ID provided"
    //with 'protected' it's visible only to children classes

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional info after overriding method from interface.")
    }

    override fun getSessionId(): String {
        return sessionPrefix
    }
}

fun main() {
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New info provider"

        fun getSessionId() = "id"

        //overriding && adding to properties
    }

    provider.printInfo(Person())
    provider.getSessionId()
    checkType(provider)
}

fun checkType(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("It is not a session info provider")
    } else {
        println("It is a session info provider")

        infoProvider.getSessionId()
    }
}