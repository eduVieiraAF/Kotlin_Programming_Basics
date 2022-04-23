package samples

/*
'apply' executes a block of code on an object and returns the object itself. Inside the block, the object is
referenced by 'this'. This function is handy for initializing objects.
 */

data class StaffMember(var name: String, var age: Int, var job: String, var credentials: Int){
    constructor(): this("", 0, "", 0)
}

fun main() {
    val josh = StaffMember()
    val joshDescription = josh.apply {
        name = "Josh A. Ferguson"
        age = 40
        job = "Senior Developer"
        credentials = 3
    }

    val wendy = StaffMember()
    val wendyDescription = wendy.apply {
        name = "Wendy D. Byrne"
        age = 24
        job = "Account Manager"
        credentials = 2
    }

    val ken = StaffMember()
    val kenDescription = ken.apply {
        name = "Ken A. Smith"
        age = 57
        job = "Latin America Sales Director"
        credentials = 4
    }

    println(joshDescription)
    println(wendyDescription)
    println(kenDescription)
}