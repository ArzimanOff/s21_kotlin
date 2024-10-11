package day02.ex06

import java.util.concurrent.TimeUnit

class Cat(name: String, age: Int): Animal(name, age) {


    override fun toString(): String {
        return "Cat name = ${super.getName()}, age = ${super.getAge()}"
    }
}