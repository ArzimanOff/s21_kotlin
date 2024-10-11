package day02.ex06

import java.lang.RuntimeException

class AnimalIterator(
    private val animalsList: List<Animal>
): BaseIterator<Animal> {
    private var index: Int = 0
    override fun next(): Animal {
        if (hasNext()){
            return animalsList[index++]
        } else {
            throw RuntimeException("Ошибка! Элемента под индексом $index нет в списке")
        }
    }

    override fun hasNext(): Boolean {
        return index < animalsList.size
    }

    override fun reset() {
        index = 0
    }
}