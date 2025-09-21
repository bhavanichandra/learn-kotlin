package com.themuler.learning.generics

fun main(args: Array<String>) {
    val cars1 = mutableListOf(Car(), Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()

    copyCars(cars1, cars2)


    val fords = mutableListOf(Ford(), Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()

    copyCars(fords, fords2)

    copyCars(fords, cars2)


}

fun <T: Car> copyCars(source: MutableList<out T>, dest: MutableList<T>) {
    source.forEach {
        dest.add(it)
    }
}

open class Car {}

class Toyota : Car() {

}

class Ford : Car() {}