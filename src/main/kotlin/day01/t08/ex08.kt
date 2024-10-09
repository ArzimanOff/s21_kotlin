package day01.t08

fun main() {
    var previousNumber: Int? = null
    var position = 0
    var inputCount = 0
    var isOrdered = true


    while (true) {
        val input = readlnOrNull()

        val currentNumber = input?.toIntOrNull() ?: break
        position++
        inputCount++

        if (previousNumber != null && currentNumber < previousNumber) {
            println("The sequence is not ordered from the ordinal number of the number $position")
            isOrdered = false
            break
        }

        previousNumber = currentNumber
    }

    if (inputCount == 0) {
        println("Input error")
    } else if (isOrdered) {
        println("The sequence is ordered in ascending order")
    }
}

