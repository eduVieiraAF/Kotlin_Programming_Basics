package oop2

import java.util.*

enum class EntityTypes {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase()
}

object EntityFactory {
    fun create(type: EntityTypes): Entity {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityTypes.EASY -> type.getFormattedName()
            EntityTypes.MEDIUM -> type.getFormattedName()
            EntityTypes.HARD -> type.getFormattedName()
            EntityTypes.HELP -> type.getFormattedName()
        }

        return when (type) {
            EntityTypes.EASY -> Entity.Easy(id, name)
            EntityTypes.MEDIUM -> Entity.Medium(id, name)
            EntityTypes.HARD -> Entity.Hard(id, name, 2f)
            EntityTypes.HELP -> Entity.Help
        }
    }
}
/*class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id | name: $name"
    }
}*/

sealed class Entity {
    object Help : Entity() {
        const val name = "Help"
    }

    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

// Extension function && property
fun Entity.Medium.printInfo() = println("Medium class: $id → via extension function")

val Entity.Medium.info: String
    get() = "Medium info"
//endRegion

fun main() {
//companion objects have access to properties & methods of that enclosing class
    val msg = when (EntityFactory.create(EntityTypes.EASY)) {
        is Entity.Easy -> "easy class"
        is Entity.Hard -> "hard class"
        Entity.Help -> "help class"
        is Entity.Medium -> "medium class"
    }

    println(msg)

    val entity1 = Entity.Easy("id", "name")
    val entity2 = entity1.copy(name = "Edited name") // when using data classes
    //val entity2 = entity1.copy() // They are equal

    if (entity1 == entity2) println("They are equal") else println("They're not equal")

    Entity.Medium("id", "name").printInfo()
    // alternatively
    val entity3 = EntityFactory.create(EntityTypes.MEDIUM)

    if (entity3 is Entity.Medium) {
        entity3.printInfo()
        println(entity3.info)
    } // smart cast
}