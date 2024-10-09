package day01.t11

import kotlin.math.abs

fun main() {
    while (true){
        try {
            val (a, b) = readln().trim().split(" ").map {
                it.toInt()
            }

            val result = nod(a, b)
            println(result)
        } catch (e: Exception){
            println("Couldn't parse a number. Please, try again")
        }
    }

}



fun nod(a: Int, b: Int): Int {
    var x = abs(a)
    var y = abs(b)

    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}
