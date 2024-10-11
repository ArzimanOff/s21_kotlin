package day02.ex06

abstract class Animal(private val name: String, private var age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }

}
