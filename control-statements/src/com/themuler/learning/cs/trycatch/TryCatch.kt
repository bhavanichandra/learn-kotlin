package com.themuler.learning.cs.trycatch


fun main(args: Array<String>) {
//    println(getNum("22"))
//    println(getNum("22.5") ?: throw IllegalArgumentException("Cannot convert to Int"))
    println(getNum("22.5") ?: "Cannot convert to Int")

    notImplemented("Hello World")
}

fun notImplemented(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNum(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("In Finally block $str")
        1 // If try catch used as expression, anything  in finally will not be returned. All statements execute though
    }
}

