package day01.t03

import java.math.BigInteger

val fibCache = mutableMapOf<Int, BigInteger>()
fun memFib(n: Int): BigInteger {
    return when {
        n == 0 -> BigInteger.ZERO
        n == 1 -> BigInteger.ONE
        fibCache.containsKey(n) -> fibCache[n]!!
        else -> {
            val result = memFib(n - 1) + memFib(n - 2)
            fibCache[n] = result
            result
        }
    }
}

fun main() {
    while (true) {
        val input = readln()
        try {
            val n = input.toInt()

            if (n < 0) {
                println("Input must be > 0. Please, try again")
                continue
            }

            try {
                val result = memFib(n)
                println(result)
            } catch (e: StackOverflowError) {
                println("Too large n")
            }

        } catch (e: Exception) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}
