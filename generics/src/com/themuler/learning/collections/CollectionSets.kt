package com.themuler.learning.collections

fun main(args: Array<String>) {
    val ints = setOf(10, 2, 30, -23, 1, 6)
    println(ints.plus(21)) // plus will give us another set
    println(ints.plus(10))
    println(ints.minus(2))
    println(ints.minus(-20)) // Nothing happens if element not available
    println(ints.average().toFloat())
    println(ints.drop(3))

    val mutualSets = mutableSetOf(1, 2, 3, 4, 5)
    mutualSets.plus(10)
    println(mutualSets)

    println(ints.javaClass)
    println(mutualSets.javaClass) // LinkedHashSet
}