package com.themuler.learning.cs.ifstatement

fun main(args: Array<String>) {
//   var num: Int
//    if(someCondtion) { // Verbose way
//        num = 50
//    } else {
//        num = 592
//    }

    val num =
        if (12 % 2 == 0) 40 else 345 // If values are expressions. Can be assigned to a var, and normally and also in template literals
    println(num)

    val num2 = if (12 * 123 % 2 == 0) {
        println("Printing if true")
        50
    } else {
        println("Printing if false")
        123
    }
    println(num2)

}
