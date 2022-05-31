package oop2

interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) {
    companion object : IdProvider {
        const val id = "id"

        fun create() = Entity(getId())

        override fun getId(): String {
            return "247"
        }
    }
}

fun main() {
//companion objects have access to properties & methods of that enclosing class
    val entity = Entity.create()
    Entity.id
}