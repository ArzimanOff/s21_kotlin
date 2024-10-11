package day02.ex04

class Cat(name: String, age: Int) : Animal(name, age) {
    override fun toString(): String {
        return "Cat name = ${super.getName()}, age = ${super.getAge()}"
    }
}