package aquarium

interface Runnable {

    fun run()
}

interface Callable<T>{

    fun call(): T
}

fun example(){

    val runnable = object : Runnable{

        override fun run() {

            println("I am a runnable")
        }
    }

    JavaRun.runNow(runnable)
}