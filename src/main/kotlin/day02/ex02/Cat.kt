package day02.ex02

class Cat(name: String, age: Int, mass: Double) : Animal(name, age, mass) {
    override fun getFeedInfoKg(): Double {
        return 0.1 * super.getMass()
    }

    override fun toString(): String {
        return String.format("Cat name = ${super.getName()}, " +
                "age = ${super.getAge()}, " +
                "mass = ${super.getMass()}, " +
                "feed = %.2f", getFeedInfoKg())
    }
}