package udemy_OOP

class Car {
    var owner: String
    val myBrand = "BMW"
        // custom getter
        get() { // when it's gotten, it'll return the lowercase version of myBrand
            return field.toLowerCase()
        }

    var maxSpeed = 220
        // custom setter
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("** Max speed is glitchy **")
        }

    /*
        this is what happens under the hood with all vars
        get() = field
        set(value) { field = value }
    */

    var myModel = "M5"
    private set

    init {
        this.owner = "Edu"
    }
}