package samples

/*
    'also' works like 'apply' → it executes a given block and returns the object called. Inside the block, the object
    is referred by 'it', so it's easier to pass it as an argument. This function is handy when embedding additional
    actions, such as logging in and call chain.
 */

var idCount = 3140 // should be called from database and whatnot, but it's here to make a point
val enroll = mutableListOf<String>()

data class GymMember(val id: Int, val name: String, val age: Int, val accessPlan: String, val planDescription: String)

fun createLog(m: GymMember) = println("→ A new member \'($idCount) ${m.name}\' was registered.\n" +
        "\t• Member chose the \'${m.accessPlan}\' facility access plan.\n" +
        "\t\t• Plan details: ${m.planDescription}")

/*
→ Had this work well before changing to sealed class

enum class Plan(val description: String){
    PAYPERDAY("3-hour access on the day."),
    BASIC("16 hours per week."),
    FULL("Unlimited hours."),
    PREMIUM ("FULL + personal trainer.")
}
*/

sealed class Plan (val accessPlan: String, val description: String){
    object PerDay: Plan("PER_DAY","3-hour access on the day.")
    object Basic: Plan("BASIC", "20 hours per week.")
    object Full : Plan("FULL","Unlimited hours.")
    object Premium : Plan("PREMIUM", "FULL + personal trainer.")
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
        Plan.Premium.accessPlan,
        Plan.Premium.description).also { createLog(it) }.toString()
    enroll.add(maddie)

    val steve = GymMember(++idCount, // automatically ups idCount as it creates new member
        "Steve Olsen",
        29,
        Plan.Basic.accessPlan,
        Plan.Basic.description).also { createLog(it) }.toString()
    enroll.add(steve)

    val henry = GymMember(++idCount,
        "Henry Mendez",
        23,
        Plan.Full.accessPlan,
        Plan.Full.description).also { createLog(it) }.toString()
    enroll.add(henry)

    val don = GymMember(++idCount,
        "Dominic Flinch",
        31,
        Plan.PerDay.accessPlan,
        Plan.PerDay.description).also { createLog(it) }.toString()
    enroll.add(don)

    println()
    println("ID count: $idCount") // outputs 3144
    enrollReport()
}
