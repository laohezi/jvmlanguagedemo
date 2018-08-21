import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

inline fun <T> T.printlin() {
    kotlin.io.println(this)
}

inline fun <T> printDetail(message: T) {

    val dateFormat = SimpleDateFormat("MM-dd HH:mm:ss:SSS")
    System.out.println(Thread.currentThread().name + "   "+dateFormat.format(Date()) + "  info:" + message.toString())
}