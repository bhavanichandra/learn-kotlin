package com.themuler.learning.collections

fun main(args: Array<String>) {
    // sequences only for large collections
    val immutableMap = mapOf<Int, Car>(
        1 to Car("Green", "Toyota", 2015),
        2 to Car("Red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013),
        17 to Car("Red", "BMW", 2015),
        8 to Car("Green", "Ford", 2010),
    )
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })
    println(immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color }.toList())

    listOf("Mary", "Jane","Joe")
        .asSequence() // Using this sequence, will apply only on the specific elements
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith("E") }
}