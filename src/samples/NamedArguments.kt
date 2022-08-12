package samples

import housing_oop.prettyPrintln

fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {
    // Regular function call
    println(format("mario", "example.com"))
    // Calls a function with switched arguments. No syntax errors, but the result domain.com@username is incorrect.
    println(format("domain.com", "username"))
    // Calls a function with named arguments.
    println(format(userName = "foo", domain = "bar.com"))
    // When invoking a function with named arguments, you can specify them in any order you like.
    println(format(domain = "frog.com", userName = "pepe"))
    
    prettyPrintln(format("edu_vieira", "yahoo.ca"))
}