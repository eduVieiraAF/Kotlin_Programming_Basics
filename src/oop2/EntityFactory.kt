package oop2

object EntityFactory {
    fun create() = Entity("id", "name")
}
class Entity constructor(val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id | name: $name"
    }
}

fun main() {
//companion objects have access to properties & methods of that enclosing class
    val entity = EntityFactory.create()
    println(entity)
}