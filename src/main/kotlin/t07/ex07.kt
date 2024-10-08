package t07

import java.io.File
import java.io.IOException

fun findMinAndMax(filePath: String) {
    val file = File(filePath)

    if (!file.exists()) {
        println("Input error. File isn't exist")
        return
    }

    try {
        val lines = file.readLines()

        val count = lines.firstOrNull()?.toIntOrNull()
        if (count == null || count <= 0) {
            println("Input error. Size <= 0")
            return
        }

        val numbers = lines.drop(1)
            .flatMap { it.split("\\s+".toRegex()) }
            .mapNotNull { it.toDoubleOrNull() }
            .take(count)


        if (numbers.size < count) {
            println("Input error. Insufficient number of elements")
            return
        }

        println(numbers.size)
        println(numbers.joinToString(" "))

        val minValue = numbers.minOrNull()
        val maxValue = numbers.maxOrNull()

        File("src/main/kotlin/t07/result.txt").writeText("$minValue $maxValue")
        println("Saving min and max values in file")

    } catch (e: IOException) {
        println("Input error. Cannot read file.")
    }
}

fun main() {
    while (true){
        val filePath = readlnOrNull() ?: return
        findMinAndMax(filePath)
    }
}
