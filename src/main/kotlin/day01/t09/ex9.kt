package day01.t09

fun main() {
    try {
        val n = readln().toInt()
        val strings = mutableListOf<String>()
        for (i in 0..<n){
            strings.add(readlnOrNull().toString())
        }
        val subStr = readln()
        val needStrings = mutableListOf<String>()
        strings.forEach{ s ->
            if (containsSubstring(s, subStr)){
                needStrings.add(s)
            }
        }
        println(needStrings.joinToString(", "))
    } catch (e: Exception){
        println("Ошибка ввода данных")
    }
}

fun containsSubstring(mainString: String, subString: String): Boolean {
    return mainString.contains(subString)
}

//4
//First car
//Second door
//Third message
//Fourth wood
//oo