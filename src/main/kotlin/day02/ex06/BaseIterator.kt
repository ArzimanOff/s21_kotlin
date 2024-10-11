package day02.ex06

interface BaseIterator<T> {
    fun next(): T
    fun hasNext(): Boolean
    fun reset()
}