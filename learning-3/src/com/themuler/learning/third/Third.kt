package com.themuler.learning.third

import com.themuler.learning.javacode.DummyClass

fun booleanTypes() {
    val vacationTime = true
    val onVacation = DummyClass().isVacationTime(vacationTime) // Calling Java method here
    val onVacation2 =
        DummyClass().isVacationTimeWithBoolean(vacationTime) // Calling Java method here
    println(onVacation)
    println(onVacation2)
}

fun characters() {
    val char = 'b'
    val myChar = 65.toChar()
    println(myChar)
}


fun integers() {
    val myInt = 10 // Immutable integer variable
    var myLong = 10L // specify L for long similar to java

    myLong = myInt.toLong() // Need to use .toLong(). Automatic conversion is not possible
    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()
    println(myInt is Int)
}

fun doubles() {
    var myDouble = 12.4
    println(myDouble is Double)

    val myFloat = 832.89f
    println("myFloat is Float: ${myFloat is Float}")
}
