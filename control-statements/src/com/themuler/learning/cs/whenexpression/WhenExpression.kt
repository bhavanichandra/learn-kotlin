package com.themuler.learning.cs.whenexpression

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, WINTER, FALL
}

fun main(args: Array<String>) {
    var num = 100
    val timeOfYear = Season.SUMMER
    val str = when (timeOfYear) {
        Season.SPRING -> {
            num += 5
            "Flowers are blooming"
        }

        Season.SUMMER -> "Its Hot"
        Season.WINTER -> {
            num = 22 - 5
            "It's getting cooler"
        }

        Season.FALL -> "I need a coat"
    }
    println(str)

    val num2 = -50
//    if (num > num2) {
//        println("num is less than num2")
//    } else if (num < num) {
//        println("num is greater than num")
//    } else {
//        println("num is equal to num")
//    }

    when {
        num < num2 -> println("$num is less than $num2")
        num > num2 -> println("$num is greater than $num2")
        else -> println("$num is equal to $num2")
    }

}

fun patternMatchingWithTypes() {
    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(3.1414)
    val obj3: Any = 45
    val something: Any = 1.toShort()


    val z = when (something) {
        is Int -> "${something - 22}"
        is BigDecimal -> something.remainder(BigDecimal(1.234))
        is String -> something.uppercase()
        else -> "${something.javaClass} is not supported"
    }
    println(z)
}

fun simpleWhen() {
    val num = 150

    when (num) {
        in 100..199 -> println("in range 100 to 199")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't  match anything else")
    }
}