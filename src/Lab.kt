import jdk.internal.org.jline.utils.InputStreamReader
import sun.net.www.protocol.http.HttpURLConnection
import java.io.BufferedReader

import java.net.URL

fun main() {
    val url = URL("https://api.coindesk.com/v1/bpi/currentprice.json")

    val connection = url.openConnection() as HttpURLConnection
    connection.requestMethod = "GET"
    connection.connect()

    val responseCode = connection.responseCode
    val responseBody =
        BufferedReader(InputStreamReader(connection.inputStream)).use { it.readText() }

    println("Status code:  $responseCode")
    println("Status body:  $responseBody")
}