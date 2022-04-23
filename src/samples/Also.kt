package samples

/*
    'also' works like 'apply' → it executes a given block and returns the object called. Inside the block, the object
    is referred by 'it', so it's easier to pass it as an argument. This function is handy when embedding additional
    actions, such as logging in and call chain.
 */

var idCount = 3140// should be called from database and whatnot, but it's here to make a point
val enroll = mutableListOf<String>()

data class GymMember(val id: Int, val name: String, val age: Int, val plan: Plan)

fun createLog(m: GymMember) = println("→ A new member \'${m.name}\' was registered.\n" +
        "\t• Member chose a \'${m.plan}\' plan facility access.\n" +
        "\t\t• Plan details: ${m.plan.description}")

enum class Plan(val description: String){
    BASIC("16 hours per week."),
    FULL("Unlimited hours."),
    PREMIUM ("FULL + personal trainer.")
}

fun enrollReport() {
    println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••\n" +
            "TODAY'S ENROLLMENT:\n")
    for (i in 0 until enroll.size){
        println(enroll[i])
    }
    println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
}

fun main() {
    val maddie = GymMember(++idCount, // automatically ups idCount as it creates new member
        "Maddie Wilkerson",
        19,
        Plan.PREMIUM).also { createLog(it) }.toString()
    enroll.add(maddie)

    val steve = GymMember(++idCount, // automatically ups idCount as it creates new member
        "Steve Olsen",
        29,
        Plan.BASIC).also { createLog(it) }.toString()
    enroll.add(steve)

    val henry = GymMember(++idCount,
        "Henry Mendez",
        23,
        Plan.FULL).also { createLog(it) }.toString()
    enroll.add(henry)

    println(idCount) // outputs 3143
    enrollReport()
}
