package day02.ex06

import java.util.concurrent.TimeUnit

class Dog(name: String, age: Int): Animal(name, age) {
    override fun toString(): String {
        return "Dog name = ${super.getName()}, age = ${super.getAge()}"
    }
}