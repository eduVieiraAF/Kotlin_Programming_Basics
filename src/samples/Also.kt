package samples

/*
    'also' works like 'apply' → it executes a given block and returns the object called. Inside the block, the object
    is referred by 'it', so it's easier to pass it as an argument. This function is handy when embedding additional
    actions, such as logging in and call chain.
 */

var idCount = 3140 // should be called from database and whatnot, but it's here to make a point
val enroll = mutableListOf<String>()

data class GymMember(val id: Int, val name: String, val age: Int, val accessPlan: String, val planDescription: String)

private val log = StringBuilder()

/**
 * Logs a new gym member registration.
 *
 * @param m the gym member to be registered
 */
fun createLog(m: GymMember) {
    log.setLength(0)
    log.append("→ A new member \'($idCount) ${m.name}\' was registered.\n")
            .append("\t• Member opted for the \'${m.accessPlan}\' facility access plan.\n")
            .append("\t\t• Plan details: ${m.planDescription}")
    println(log.toString())
}

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

    /**
     * Prints out the enrollments for the day.
     */
fun enrollReport() = println("TODAY'S ENROLLMENT:\n${enroll.joinToString(separator = "\n")}")

    /**
     * Registers 4 gym members, logs each registration, and then prints out the enrollments for the day.
     */
fun main() {
    val members = buildList {
        add(GymMember(++idCount, "Maddie Wilkerson", 19, Plan.Premium.accessPlan, Plan.Premium.description)
            .also { createLog(it) })
        add(GymMember(++idCount, "Steve Olsen", 29, Plan.Basic.accessPlan, Plan.Basic.description)
            .also { createLog(it) })
        add(GymMember(++idCount, "Henry Mendez", 23, Plan.Full.accessPlan, Plan.Full.description)
            .also { createLog(it) })
        add(GymMember(++idCount, "Dominic Flinch", 31, Plan.PerDay.accessPlan, Plan.PerDay.description)
            .also { createLog(it) })
    }.map { it.toString() }.toMutableList()
    enroll.addAll(members)

    prettyPrintln("ID count: $idCount") // outputs 3144
    enrollReport()
}

