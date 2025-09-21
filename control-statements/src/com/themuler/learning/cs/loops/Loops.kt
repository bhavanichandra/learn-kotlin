package com.themuler.learning.cs.loops

fun main(args: Array<String>) {
    // For loops use ranges
//    val seasons = arrayOf("spring", "summer", "winter", "fall")
////    for (index in seasons.indices) { // Use this how to get index
////        println("${seasons[index]} is season [$index]")
////    }
//    seasons.forEach { println(it) } // Lambda
//    seasons.forEachIndexed { index, value -> println("$value is season $index") } // Lambda
//    val notASeason = "MidSpring" !in seasons
//    println(notASeason)
//    val str = "Hello"
//    println('e' in str)
//    println('e' !in str)

    // Don't use that much the loop names, but its there for extreme scenarios
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    continue@jloop
                }
            }
        }
    }

}


fun ranges() {
    val range = 1..5
    val charRange = 'a'..'z'

    val stringRange = "ABC".."XYZ"
    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("XXXSZ" in stringRange)
    println("ZZZZZZ" in stringRange)

    val reversed = 5.downTo(1) // Use downTo if we want to reverse, not 5..1
    println(5 in reversed)

    val stepRange = 3..15
    val stepThree = stepRange step 3
    for (i in stepThree) {
        println(i)
    }
    val reversedRange = range.reversed()
    for (i in reversedRange) {
        println(i)
    }


//    val str = "Hello"
//    for (c in str) {
//        println(c)
//    }
//
//    for (num in 1..20 step 4) {
//        println(num)
//    }

//    for (i in 20 downTo 10 step 5) {
//        println(i)
//    }

    for (i in 1 until 10) {
        println(i)
    }
}
