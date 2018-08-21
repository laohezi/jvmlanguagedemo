import io.reactivex.Observable
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking {
    for (i in 1..10) {
        Thread {
            val singleton = Singleton
            singleton.add(Thread.currentThread().name)
            singleton.print()
        }.start()

    }

    Thread.sleep(5000)


}

object Singleton {

    val list = ArrayList<String>()

    fun add(string: String) {
        list.add(string)
    }

    fun print() {
        println(list)
    }
}




