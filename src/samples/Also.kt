package samples

/*
    'also' works like 'apply' → it executes a given block and returns the object called. Inside the block, the object
    is referred by 'it', so it's easier to pass it as an argument. This function is handy when embedding additional
    actions, such as logging in and call chain.
 */

var idCount = 3140// should be called from database and whatnot, but it's here to make a point
val enroll = mutableListOf<String>()

data class GymMember(val id: Int, val name: String, val age: Int, val accessPlan: String, val planDescription: String)

fun createLog(m: GymMember) = println("→ A new member \'($idCount) ${m.name}\' was registered.\n" +
        "\t• Member chose a \'${m.accessPlan}\' facility access plan.\n" +
        "\t\t• Plan details: ${m.planDescription}")

/*

enum class Plan(val description: String){
    PAYPERDAY("3-hour access on the day."),
    BASIC("16 hours per week."),
    FULL("Unlimited hours."),
    PREMIUM ("FULL + personal trainer.")
}
*/

sealed class Plan1 (val accessPlan: String, val description: String){
    object PerDay: Plan1("PER_DAY","3-hour access on the day.")
    object Basic: Plan1("BASIC", "20 hours per week.")
    object Full : Plan1("FULL","Unlimited hours.")
    object Premium : Plan1("PREMIUM", "FULL + personal trainer.")
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
        Plan1.Premium.accessPlan,
        Plan1.Premium.description).also { createLog(it) }.toString()
    enroll.add(maddie)

    val steve = GymMember(++idCount, // automatically ups idCount as it creates new member
        "Steve Olsen",
        29,
        Plan1.Basic.accessPlan,
        Plan1.Basic.description).also { createLog(it) }.toString()
    enroll.add(steve)

    val henry = GymMember(++idCount,
        "Henry Mendez",
        23,
        Plan1.Full.accessPlan,
        Plan1.Full.description).also { createLog(it) }.toString()
    enroll.add(henry)

    val don = GymMember(++idCount,
        "Dominic Flinch",
        31,
        Plan1.PerDay.accessPlan,
        Plan1.PerDay.description).also { createLog(it) }.toString()
    enroll.add(don)

    println()
    println("ID count: $idCount") // outputs 3144
    enrollReport()
}
