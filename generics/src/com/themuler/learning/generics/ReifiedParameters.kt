package com.themuler.learning.generics

import java.math.BigDecimal

fun main(args: Array<String>) {
    val mixedList: List<Any> = listOf("Bhavani Chandra", 1, BigDecimal(22.5), 'M', BigDecimal(-5938.393849))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)

    println(bigDecimalsOnly)

}

// reified parameters work only in inline function and only when checking type again Generic parameters
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    for (any in list) {
        if (any is T) {
            newList.add(any)
        }
    }
    return newList
}