package samples

import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val jokes = mutableListOf<Joke>()

    for (i in 1..5) {
        val joke = getJoke()
        jokes.add(joke)
    }

    jokes.forEach { println("${it.id}\n${it.type}\n\t${it.setup}\n${it.punchline}\n") }
}

class Joke(val id: Int, val type: String, val setup: String, val punchline: String)

fun getJoke(): Joke {
    val endpoint = "https://official-joke-api.appspot.com/random_joke"
    val url = URL(endpoint)

    val conn = url.openConnection() as HttpURLConnection
    conn.requestMethod = "GET"

    val reader = BufferedReader(InputStreamReader(conn.inputStream))
    val response = reader.readText()

    val gson = Gson()

    return gson.fromJson(response, Joke::class.java)
}
