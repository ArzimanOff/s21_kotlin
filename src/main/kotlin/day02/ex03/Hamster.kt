package day02.ex03

class Hamster(name: String, age: Int): Animal(name, age), Herbivore {
    override fun chill(): String {
        return "I can chill for 8 hours"
    }
    override fun toString(): String {
        return "Hamster name = ${super.getName()}, " +
                "age = ${super.getAge()}. " + chill()
    }
}