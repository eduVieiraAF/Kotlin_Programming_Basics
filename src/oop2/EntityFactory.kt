package oop2

import java.util.*

enum class EntityTypes {
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

object EntityFactory {
    fun create(type: EntityTypes) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when (type){
            EntityTypes.EASY -> type.getFormattedName()
            EntityTypes.MEDIUM -> type.getFormattedName()
            EntityTypes.HARD -> type.getFormattedName()
        }

        return Entity(id, name)
    }
}
class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id | name: $name"
    }
}

fun main() {
//companion objects have access to properties & methods of that enclosing class
    val entity = EntityFactory.create(EntityTypes.EASY)
    println(entity)

    val mediumEntity = EntityFactory.create(EntityTypes.MEDIUM)
    println(mediumEntity)
}