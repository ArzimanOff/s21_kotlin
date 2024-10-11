package day02.ex05

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main(){
    val petTypes = listOf("dog", "cat")

    while (true) {
        try {
            val pets = mutableListOf<Animal>()

            val numberOfPets = readInt()
            if (numberOfPets == null || numberOfPets <= 0){
                return
            }

            for (i in 0..<numberOfPets){
                val petType = readln().trim().lowercase()
                if (!petTypes.contains(petType)) {
                    println("Incorrect input. Unsupported pet type")
                    continue
                }
                val petName = readln().trim()
                val petAge = readInt() ?: throw RuntimeException()

                if (petAge <= 0) {
                    println("Incorrect input. Age <= 0")
                    continue
                }
                val pet = when (petType) {
                    "dog" -> Dog(petName, petAge)
                    "cat" -> Cat(petName, petAge)
                    else -> {
                        println("Incorrect input. Unsupported pet type")
                        continue
                    }
                }
                pets.add(pet)
            }

            val timeOfStart = System.currentTimeMillis()
            val executor = Executors.newFixedThreadPool(pets.size)

            for (pet in pets) {
                executor.submit {
                    val startWalkTime = (System.currentTimeMillis() - timeOfStart) / 1000.0
                    val walkTimeMillis = pet.goToWalk()
                    val endWalkTime = (System.currentTimeMillis() - timeOfStart) / 1000.0

                    println("${pet.toString()}, start time = $startWalkTime, end time = $endWalkTime")
                }
            }

            executor.shutdown()
            executor.awaitTermination(1, TimeUnit.MINUTES)
        } catch (e: Exception){
            println("Couldn't parse a number. Please, try again")
        }
    }
}

fun readInt(): Int? {
    return try {
        readlnOrNull()?.trim()?.toInt()
    } catch (e: NumberFormatException) {
        println("Couldn't parse a number. Please, try again")
        null
    }
}