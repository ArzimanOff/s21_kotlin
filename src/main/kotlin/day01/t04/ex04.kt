package day01.t04
fun main() {
    while (true) {
        val size = getSize()
        if (size <= 0) continue

        val numbers = getNumbers(size) ?: continue

        val negativeAverage = calculateAverageOfNegatives(numbers)
        if (negativeAverage == null) {
            println("There are no negative elements")
        } else {
            println(negativeAverage)
        }
    }
}

fun getSize(): Int {
    return try {
        val n = readlnOrNull()?.trim()?.toInt() ?: throw NumberFormatException()
        if (n <= 0) {
            println("Input error. Size <= 0")
            0
        } else {
            n
        }
    } catch (e: Exception) {
        printError()
        0
    }
}

fun getNumbers(size: Int): List<Int>? {
    val stringNumbers = readlnOrNull()?.trim()?.split(" ") ?: return null
    val numbers = mutableListOf<Int>()

    if (stringNumbers.size != size) {
        printError()
        return null
    }

    for (i in 0..<size) {
        try {
            val number = stringNumbers[i].toInt()
            numbers.add(number)
        } catch (e: Exception) {
            printError()
            return null
        }
    }
    return numbers
}

fun calculateAverageOfNegatives(numbers: List<Int>): Double? {
    val negativeNumbers = numbers.filter { it < 0 }
    return if (negativeNumbers.isNotEmpty()) {
        negativeNumbers.average()
    } else {
        null
    }
}

fun printError(){
    println("Couldn't parse a number. Please, try again")
}
