package udemy_OOP

var b: Int = 0

// this 'a' is a parameter
fun myFunction(a: Int) {
    // a = 5 cannot reassign here as 'a' is a parameter

    // var a = 5 this 'a' is a variable
    val a = a // now variable 'a' receives the value from parameter 'a'

    println("Variable is $a and is the value received from parameter")

    // This is called shadowing and may be confusing as it allow many elements to have the sama name


    // reassigning global variable
    b = 3
}