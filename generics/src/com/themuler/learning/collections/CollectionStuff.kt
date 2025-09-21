package com.themuler.learning.collections

data class Car(val color: String, val model: String, val year: Int) {

}

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(
        1 to Car("Green", "Toyota", 2015),
        2 to Car("Red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013),
        17 to Car("Red", "BMW", 2015),
        8 to Car("Green", "Ford", 2010),
    )

    println(immutableMap.toSortedMap())

    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })

    val cars = immutableMap.values
    println(cars.sortedBy { it.year })

    println(cars.find { it.year > 2014 })

    println(cars.groupBy { it.color })

    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })

    println(immutableMap.map { it.value.year })
}


fun collectionMapOperation() {
    val ints = arrayOf(1, 2, 3, 4, 5)
//    val add10List: MutableList<Int> = mutableListOf()
//    for (i in ints) {
//        add10List.add(i + 10)
//    }
    val add10List = ints.map { it + 10 }
    println(add10List)
    println(add10List.javaClass)
}

fun filterOperation() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, Car>(
        1 to Car("Green", "Toyota", 2015),
        2 to Car("Red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013),
    )

    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf<Int, Car>(
        1 to Car("Green", "Toyota", 2015),
        2 to Car("Red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013),
    )

    mutableMap.filter { it.value.color == "silver" } // filter return new map
    println(mutableMap) // This will not change even for mutable map
}