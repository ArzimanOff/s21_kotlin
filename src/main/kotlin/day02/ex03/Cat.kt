package day02.ex03

class Cat(name: String, age: Int) : Animal(name, age), Omnivore {
    override fun hunt(): String {
        return "I can hunt for mice"
    }

    override fun toString(): String {
        return "Cat name = ${super.getName()}, " +
                "age = ${super.getAge()}. " + hunt()
    }
}