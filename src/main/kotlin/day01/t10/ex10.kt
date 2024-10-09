package day01.t10

fun main() {
    while (true){
        try {
            val n = readln().toInt()
            val users = mutableListOf<User>()
            for (i in 0..<n){
                val userName = readln()
                val userAge = readln().toInt()
                if (userAge <= 0){
                    println("Incorrect input. Age <= 0")
                } else {
                    users.add(User(userName, userAge))
                }
            }
            users.asSequence().forEach {
                if (it.age >= 18){
                    println(it.name)
                }
            }
        } catch (e: Exception){
            println("\nCouldn't parse a number. Please, try again")
            return
        }
    }
}

//3
//Name1
//16
//Name2
//19
//Name3
//18

//3
//Name1
//16
//Name2
//14
//Name3
//13

//4
//Name1
//-2
//Name2
//23
//Name3
//13
//Name4
//24