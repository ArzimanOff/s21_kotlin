package day02.ex05

import java.util.concurrent.TimeUnit

class Cat(name: String, age: Int): Animal(name, age) {
    override fun goToWalk(): Double {
        val walkTime = getAge() * 250L
        TimeUnit.MILLISECONDS.sleep(walkTime)
        return walkTime.toDouble()
    }

    override fun toString(): String {
        return "Cat name = ${super.getName()}, age = ${super.getAge()}"
    }
}