package com.themuler.learning.generics


fun main(args: Array<String>) {

    val strings = listOf("1", "2", "3")
    if(strings is List<String>) {
        println("This strings contains Strings")
    }
    val listAny: Any = listOf("str1", "str2", "str3")
    if(listAny is List<*>) {
        println("This listAny contains Strings")
    }

}

fun upperBoundExample() {
    val ints = listOf(1, 2, 3, 4, 5)
    val shorts = listOf<Short?>(10, 20, 30, 40)
    val floats = listOf<Float?>(10.125f, -459.43f)

    val strings = listOf("1", "2", "3")

    append(StringBuilder("String 1"), StringBuilder("String 2"))

//    convertToInts(strings)

    convertToInts(floats)
    convertToInts(shorts)

    printCollection(floats)
    printCollection(strings)
}

fun <T> printCollection(collection: List<T>) {
    for (element in collection) {
        println(element)
    }
}

fun <T> append(item1: T, item2: T)
        where T : CharSequence, T : Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T : Number?> convertToInts(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}