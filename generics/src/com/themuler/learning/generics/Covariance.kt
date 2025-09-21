package com.themuler.learning.generics

fun main(args: Array<String>) {
    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
//    convertToInt(shortList)
}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}