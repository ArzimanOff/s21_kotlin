package day02.ex02

abstract class Animal(
    private val name: String,
    private val age: Int,
    private val mass: Double
) {
    abstract fun getFeedInfoKg(): Double

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

    fun getMass(): Double {
        return mass
    }
}