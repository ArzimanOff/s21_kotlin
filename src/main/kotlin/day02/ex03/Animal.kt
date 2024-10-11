package day02.ex03

abstract class Animal(private val name: String, private val age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}
