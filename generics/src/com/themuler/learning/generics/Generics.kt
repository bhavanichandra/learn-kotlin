package com.themuler.learning.generics

import java.math.BigDecimal


fun main(args: Array<String>) {
    val list = mutableListOf("Hello", "World")
    list[0].uppercase()
//    printCollection(list)
    list.printCollection()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
    bdList.printCollection()
}

fun <T> List<T>.printCollection() {
    for (element in this) {
        println(element)
    }
}