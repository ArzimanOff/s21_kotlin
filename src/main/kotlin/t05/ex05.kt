package t05
fun main() {
    while (true) {
        val size = getSize()
        if (size <= 0) continue

        val numbers = getNumbers(size) ?: continue

        val needNums = findNeedNums(numbers)
        if (needNums.isEmpty()) {
            println("There are no such elements")
        } else {
            println(needNums)
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

fun findNeedNums(numbers: List<Int>): List<Int>{
    val res = numbers.filter {
        it.toString()[0] == it.toString()[it.toString().length-1]
    }
    return res
}

fun printError(){
    println("Couldn't parse a number. Please, try again")
}


