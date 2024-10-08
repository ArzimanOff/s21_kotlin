package t02


fun main() {
    var flag = 0
    while (flag == 0) {
        val seconds = inputSeconds()
        if (seconds >= 0) {
            val time = findTime(seconds)
            printTime(time)
            flag = 1
        } else {
            println("Incorrect time")
        }
    }
}

fun inputSeconds(): Int {
    return try {
        readln().toInt()
    } catch (e: Exception) {
        println("Couldn't parse a number. Please, try again")
        -1
    }
}

fun findTime(seconds: Int): Triple<Int, Int, Int> {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val remainingSeconds = seconds % 60
    return Triple(hours, minutes, remainingSeconds)
}

fun printTime(time: Triple<Int, Int, Int>) {
    val (hours, minutes, seconds) = time
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}
