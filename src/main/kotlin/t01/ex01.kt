package t01

import java.lang.Exception
import kotlin.math.abs
import kotlin.math.round
import kotlin.math.sqrt

fun main(args: Array<String>) {

    var flag = 0

    do {
        var x1: Double = 0.0
        var y1: Double = 0.0
        var x2: Double = 0.0
        var y2: Double = 0.0
        var x3: Double = 0.0
        var y3: Double = 0.0
        try {
            x1 = readln().toDouble()
            y1 = readln().toDouble()
            x2 = readln().toDouble()
            y2 = readln().toDouble()
            x3 = readln().toDouble()
            y3 = readln().toDouble()
        } catch (e: Exception){
            println("Couldn't parse a number. Please, try again")
            continue
        }

        if (checkTriangle(x1, y1, x2, y2, x3, y3)) {
            val p = findPerimeter(x1, y1, x2, y2, x3, y3)
            val roundedP = round(p * 1000) / 1000
            println("Perimeter: $roundedP")
            flag = 1
        } else {
            println("It's not a triangle")
        }
    } while (flag == 0)
}

fun findPerimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double
): Double {
    val a = sqrt(
        (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
    )

    val b = sqrt(
        (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)
    )

    val c = sqrt(
        (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)
    )

    return a + b + c
}

fun checkTriangle(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double
): Boolean {
    val s = 0.5 * abs(
        x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)
    )
    return s != 0.000
}

