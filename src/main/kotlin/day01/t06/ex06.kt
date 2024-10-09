package day01.t06

fun main() {
    while (true) {
        val size = getSize()
        if (size <= 0) continue

        val numbers = getNumbers(size) ?: continue
        selectionSort(numbers)
        println(numbers.joinToString(" "))
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
        println("0")
        printError()
        0
    }
}

fun getNumbers(size: Int): MutableList<Double>? {
    val stringNumbers = readlnOrNull()?.trim()?.split(" ") ?: return null
    val numbers = mutableListOf<Double>()

    if (stringNumbers.size != size) {
        println("1")
        printError()
        return null
    }

    for (i in 0..<size) {
        try {
            val number = stringNumbers[i].toDouble()
            numbers.add(number)
        } catch (e: Exception) {
            println("2")
            printError()
            return null
        }
    }
    return numbers
}

fun selectionSort(nums: MutableList<Double>) {
    val len = nums.size
    for (i in 0..<len - 1) {
        var minIndex = i
        for (j in i + 1..<len) {
            if (nums[j] < nums[minIndex]) {
                minIndex = j
            }
        }
        val temp = nums[minIndex]
        nums[minIndex] = nums[i]
        nums[i] = temp
    }
}

fun printError() {
    println("Couldn't parse a number. Please, try again")
}


