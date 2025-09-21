package com.themuler.learning.third

import com.themuler.learning.javacode.DummyClass

fun main(args: Array<String>) {
    val names = arrayOf("Bhavani", "Bharathi", "Achyutaramaiah")
    val longs = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    val long3 = arrayOf(1, 2, 3)
    println(long3 is Array<Int>)

//    println(longs[2])

    val evenNumbers = Array(16) {i -> i * 2}
//    for (i in evenNumbers) {
//        println(i)
//    }
//    val lotsOfNumbers = Array(100000) {i -> i + 1 }
//    println(lotsOfNumbers is Array<Int>)
//    println("10000 numbers")
//    for (i in lotsOfNumbers) {
//        println(i)
//    }

    var someArray: Array<Int>;
    someArray = arrayOf(1, 2, 3)
    for (i in someArray) {
        println(i)
    }
    println("After")
    someArray = Array(6, { i -> i * 2 })
    for (i in someArray) {
        println(i)
    }

    val mixedArray = arrayOf("Bhavani", 29, 'M');
    mixedArray.forEach { print("$it ") }

    println(mixedArray.isArrayOf<Any>())

    val newArry = intArrayOf(1, 2, 46, 7, 2, 12)
    DummyClass().printNumbers(newArry) // Calling java with arrays, we need to update it to IntArray

//    var someArray2 = Array<Int>(5) // You cannot just specify the capacity. Needs init lambda also

    val someArray3 = IntArray(5) // This is primitive type array we can just specify the capacity
    for (i in someArray3) {
        println(i)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())
}
