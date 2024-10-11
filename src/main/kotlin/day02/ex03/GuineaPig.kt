package day02.ex03

class GuineaPig(name: String, age: Int) : Animal(name, age), Herbivore {
    override fun chill(): String {
        return "I can chill for 12 hours"
    }

    override fun toString(): String {
        return "GuineaPig name = ${super.getName()}, " +
                "age = ${super.getAge()}. " + chill()
    }
}