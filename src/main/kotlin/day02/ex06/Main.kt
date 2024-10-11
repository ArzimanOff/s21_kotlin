package day02.ex06

import java.lang.RuntimeException

fun main(){
    val petTypes = listOf("cat", "dog")
    while (true){
        try {
            val pets = mutableListOf<Animal>()
            val n: Int = readln().toInt()
            if (n <= 0){
                throw RuntimeException("Введенное кол-во петомцев <= 0")
            }
            for (i in 0..<n){
                val petType = readln()
                if (!petTypes.contains(petType)){
                    println("Incorrect input. Unsupported pet type")
                    continue
                }
                val petName = readln()
                val petAge: Int = readln().toInt()
                if (petAge <= 0){
                    println("Incorrect input. Age <= 0")
                    continue
                }
                val pet = when(petType){
                    "cat" -> Cat(petName, petAge)
                    "dog" -> Dog(petName, petAge)
                    else -> {
                        throw RuntimeException("Неизвестный тип питомца")
                    }
                }
                pets.add(pet)
            }

            val iterator = AnimalIterator(pets)
            while (iterator.hasNext()) {
                println(iterator.next().toString())
            }
        } catch (e: Exception) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}