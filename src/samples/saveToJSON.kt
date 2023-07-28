package samples

import org.json.JSONObject
import java.io.File

fun main() {
    val jsonData = mapOf(
        "name" to "Jon Greene",
        "age" to 54,
        "email" to "g.jon@email.com"
    )

    val jsonObject = JSONObject(jsonData)
    val filePath = "data.json"

    try {
        File(filePath).writeText(jsonObject.toString())
        println("JSON file saved to $filePath")
    } catch (err: Exception) {
        println("An error has occurred → ${err.message}")
    }

}



