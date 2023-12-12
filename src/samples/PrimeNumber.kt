package samples
fun main(){
    val num = readLine()!!.toInt()
    var flag = false

    for (count in 2..num / 2){
        if (num % count == 0){
            flag = true
            break
        }
    }

    if (!flag) println("$num is a prime number")
    else println("$num is not a prime number")
}
