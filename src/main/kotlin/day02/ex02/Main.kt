package day02.ex02


fun main() {
    while (true){
        try {
            val cnt = readln().toInt()
            val pets = mutableListOf<Animal>()
            for (i in 0..<cnt){
                val animalType = readln()
                if (animalType != "cat" && animalType != "dog"){
                    println("Incorrect input. Unsupported pet type")
                    continue
                }
                val animalName = readln()
                val animalAge = readln().toInt()
                if (animalAge <= 0){
                    println("Incorrect input. Age <= 0")
                    continue
                }
                val animalMass = readln().toDouble()
                if (animalMass <= 0){
                    println("Incorrect input. Mass <= 0")
                    continue
                }
                val animal = if (animalType == "cat"){
                    Cat(animalName, animalAge, animalMass)
                } else {
                    Dog(animalName, animalAge, animalMass)
                }
                pets.add(animal)
            }
            pets.forEach {
                println(it.toString())
            }
        } catch (e: Exception){
            println("Couldn't parse a number. Please, try again")
        }
    }
}


//3
//dog
//Snowball
//12
//dog
//Snowball2
//10
//dog
//Snowball3
//9