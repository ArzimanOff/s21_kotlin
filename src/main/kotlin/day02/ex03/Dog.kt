package day02.ex03

class Dog(name: String, age: Int) : Animal(name, age), Omnivore {

    override fun hunt(): String {
        return "I can hunt for robbers"
    }

    override fun toString(): String {
        return "Dog name = ${super.getName()}, " +
                "age = ${super.getAge()}. " + hunt()
    }
}
