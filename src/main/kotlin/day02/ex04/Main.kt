package day02.ex04

fun main() {
    val petTypes = listOf("dog", "cat")
    while (true) {
        val pets = mutableListOf<Animal>()

        val numberOfPets = readInt()
        if (numberOfPets == null || numberOfPets <= 0){
            println("Couldn't parse a number. Please, try again")
            continue
        }

        fun inputPets(remaining: Int) {
            if (remaining == 0) return
            val petType = readln().trim().lowercase()
            if (!petTypes.contains(petType)) {
                println("Incorrect input. Unsupported pet type")
                inputPets(remaining - 1)
                return
            }
            val petName = readln().trim()
            val petAge = readInt()

            if (petAge == null) {
                println("Couldn't parse a number. Please, try again")
                inputPets(remaining-1)
                return
            }

            if (petAge <= 0) {
                println("Incorrect input. Age <= 0")
                inputPets(remaining - 1)
                return
            }

            val pet = when (petType) {
                "dog" -> Dog(petName, petAge)
                "cat" -> Cat(petName, petAge)
                else -> {
                    println("Incorrect input. Unsupported pet type")
                    inputPets(remaining - 1)
                    return
                }
            }
            pets.add(pet)
            inputPets(remaining - 1)
        }

        inputPets(numberOfPets)

        pets.asSequence()
            .filter { it.getAge() > 10 }
            .forEach { it.increaseAge() }

        pets.asSequence()
            .forEach { println(it) }
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