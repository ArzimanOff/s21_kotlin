package day02.ex02

class Dog(name: String, age: Int, mass: Double) : Animal(name, age, mass) {
    override fun getFeedInfoKg(): Double {
        return 0.3 * super.getMass()
    }

    override fun toString(): String {
        return String.format("Dog name = ${super.getName()}, " +
                "age = ${super.getAge()}, " +
                "mass = ${super.getMass()}, " +
                "feed = %.2f", getFeedInfoKg())
    }
}