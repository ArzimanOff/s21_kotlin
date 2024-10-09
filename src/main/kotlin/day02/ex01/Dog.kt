package day02.ex01

class Dog(name: String, age: Int) : Animal(name, age) {
    override fun toString(): String {
        return "Dog name = ${super.getName()}, age = ${super.getAge()}"
    }
}