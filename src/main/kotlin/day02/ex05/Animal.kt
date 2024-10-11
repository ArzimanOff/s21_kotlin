package day02.ex05

abstract class Animal(private val name: String, private var age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    abstract fun goToWalk(): Double
}
