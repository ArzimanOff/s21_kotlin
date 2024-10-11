package day02.ex03

fun main() {
    val petTypes = listOf("dog", "cat", "hamster", "guinea")
    while (true){
        try {
            val cnt = readln().toInt()
            val pets = mutableListOf<Animal>()
            for (i in 0..<cnt){
                val animalType = readln()
                if (!petTypes.contains(animalType)){
                    println("Incorrect input. Unsupported pet type")
                    continue
                }
                val animalName = readln()
                val animalAge = readln().toInt()
                if (animalAge <= 0){
                    println("Incorrect input. Age <= 0")
                    continue
                }
                val pet: Animal = when (animalType) {
                    "dog" -> Dog(animalName, animalAge)
                    "cat" -> Cat(animalName, animalAge)
                    "hamster" -> Hamster(animalName, animalAge)
                    "guinea" -> GuineaPig(animalName, animalAge)
                    else -> throw IllegalArgumentException("Unknown pet type") // Не должно происходить
                }
                pets.add(pet)
            }

            val herbivores = pets.filterIsInstance<Herbivore>()
            val omnivores = pets.filterIsInstance<Omnivore>()
            herbivores.forEach {
                println(it.toString())
            }
            omnivores.forEach {
                println(it.toString())
            }
        } catch (e: Exception){
            println("Couldn't parse a number. Please, try again")
        }
    }
}
