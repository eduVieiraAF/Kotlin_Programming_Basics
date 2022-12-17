package samples

/*
→ Kotlin provides a mechanism of delegated properties that allows delegating the calls of the property set and
get methods to a certain object. The delegate object in this case should have the method getValue. For mutable
properties, you'll also need setValue.
*/

import kotlin.reflect.KProperty

class Example {
    var oop: String by Delegate()

    override fun toString(): String = "Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you fo delegating '${prop.name}' to me."
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef.")
    }
}

fun main() {
    val example = Example()

    println(example.oop)
    example.oop = "\"New assignment\""
}