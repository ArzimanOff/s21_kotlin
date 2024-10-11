package day02.ex05

import java.util.concurrent.TimeUnit

class Dog(name: String, age: Int): Animal(name, age) {
    override fun goToWalk(): Double {
        val walkTime = getAge() * 500L
        TimeUnit.MILLISECONDS.sleep(walkTime)
        return walkTime.toDouble()
    }

    override fun toString(): String {
        return "Dog name = ${super.getName()}, age = ${super.getAge()}"
    }
}