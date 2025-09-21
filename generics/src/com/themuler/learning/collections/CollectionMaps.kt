package com.themuler.learning.collections

//class Car(val color: String, val model: String, val year: Int) {
//    // To make car to get fields via destructuring
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
//
//}
//
//data class Car(val color: String, val model: String, val year: Int) {
//
//}

fun main(args: Array<String>) {
    val car = Car("Silver", "Corvette", 2023)
    val (color, model, year) = car
    println("$color, $model, $year")
}

fun destructuring() {
    val pair = Pair(10, "ten")
    val (first, second) = pair
    println("first $first, second $second")

    val mutableMap = hashMapOf<String, Car>(
        "John's car" to Car("Red", "Range Rover", 2010),
        "Jane's car" to Car("Blue", "Hyundai", 2012),
    )

    for ((key, value) in mutableMap) { // To be able to destructuring, call should implement component functions
        println("$key = $value")
    }
}

fun mapsBasics() {

    val immutableMap = mapOf<Int, Car>(
        1 to Car("Green", "Toyota", 2023),
        2 to Car("Yellow", "Ford", 2015),
        3 to Car("Silver", "Ferrari", 2025),
    )

    println(immutableMap.javaClass)
    println(immutableMap)

//    val mutableMap = mutableMapOf<String, Car>(
//        "John's car" to Car("Red", "Range Rover", 2010),
//        "Jane's car" to Car("Blue", "Hyundai", 2012),
//    )
    val mutableMap = hashMapOf<String, Car>(
        "John's car" to Car("Red", "Range Rover", 2010),
        "Jane's car" to Car("Blue", "Hyundai", 2012),
    )
    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap["Bhavani's car"] = Car("Silver", "Rolls Royce", 2025)
//    mutableMap.put("Bhavani's car", Car("Silver", "Rolls Royce", 2025))
    println(mutableMap)
}

