package day02.ex04

abstract class Animal(private val name: String, private var age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    fun increaseAge() {
        age++
    }
}
