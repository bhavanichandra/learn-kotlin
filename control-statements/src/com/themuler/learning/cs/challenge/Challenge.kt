package com.themuler.learning.cs.challenge


fun main(args: Array<String>) {
    val num = 12
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println(dnum)
}

fun loopNames() {
    iloop@ for (i in 1..5) {
        println(i)
        if(i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }
}

fun fibonacci() {
    val range = 1..13
    var first = 0
    var next = 1
    var sequence = "0 1"
    for (i in range) {
        val third = first + next
        first = next
        next = third
        sequence = "$sequence $third"
    }
    println(sequence)

}

fun challenge1() {

    println("Challenge 1")
    println("------------")
    val range = 5..5000 step 5
    range.forEach { print("$it ") }
    println()
    println(range.average())
}

fun challenge2() {
    val negativeNumbers = 0.downTo(-500)
    negativeNumbers.reversed().forEach { println(it) }

}
