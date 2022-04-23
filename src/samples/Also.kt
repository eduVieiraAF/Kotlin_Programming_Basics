package samples

/*
    'also' works like 'apply' → it executes a given block and returns the object called. Inside the block, the object
    is referred by 'it', so it's easier to pass it as an argument. This function is handy when embedding additional
    actions, such as logging in and call chain.
 */

var idCount = 3140// should be called from database and whatnot, but it's here to make a point

data class GymMember(var id: Int, var name: String, val age: Int, var plan: Plan)

fun createLog(m: GymMember) = println("→ A new member \'${m.name}\' was registered.\n" +
        "\t• Member chose a \'${m.plan}\' plan facility access.\n" +
        "\t\t• Plan details: ${m.plan.description}")

enum class Plan(val description: String){
    BASIC("16 hours per week."),
    FULL("Unlimited hours."),
    PREMIUM ("FULL + personal trainer.")
}

fun main() {
    val maddie = GymMember(++idCount, // automatically ups idCount as it creates new member
        "Maddie Wilkerson",
        19,
        Plan.PREMIUM).also { createLog(it) }

    val steve = GymMember(++idCount, // automatically ups idCount as it creates new member
        "Steve Olsen",
        19,
        Plan.BASIC).also { createLog(it) }

    println(idCount) // outputs 3142
}
