package samples

/*
When applied to a map, [] operator returns the value corresponding to the given key, or 'null' if there's no such
key in the map.

'getValue' function returns an existing value corresponding to the given key or throw an exception if the key isn't
found. For maps created with 'withDefaultValue', 'getValue' returns the default value instead of throwing an exception.
 */

fun main() {
    val map = mapOf("key" to 42)

    val value1 = map["key"] // returns 42 because it's the value corresponding to the "key" key.
    val value2 = map["key2"] // returns 'null' because there's no 'key2' key.

    val value3 = map.getValue("key") // returns 42 because it's the value corresponding to the "key" key.

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2") // Returns the default value because "key2" is absent.
                                                        // For this key it's 4.

    try {
        map.getValue("anotherKey") //Throws NoSuchElementException because "anotherKey" is not in the map.
    } catch (e: NoSuchElementException) {
        println("Message → $e")
    }

    println("value1 is $value1")
    println("value2 is $value2")
    println("value3 is $value3")
    println("value4 is $value4")
}