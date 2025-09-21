package com.themuler.learning.oop

fun main(args: Array<String>) {
////    println(labelMultiply(3, 4, "Result is"))
//    val emp = Employee2("Jane")
//    println(emp.upperCaseFirstName())
//
//    val car = NewCar("red", "Maruthi Suzuki", 1995)
//    val car2 = NewCar("red", "Maruthi Suzuki", 1995)
//    printColors(car, car2)
//
//    val manyCars = arrayOf(car, car2)
//    printColors(*manyCars) // * is the spread operator if used like this

    val s = "this is all lowercase"
    println(s.upperFirstAndLast())

}

// These are extension functions (Similar to receiver functions from go)
fun String.upperFirstAndLast(): String {
        val upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
        return upperFirst.substring(0, upperFirst.length - 1)  + upperFirst.substring(
            upperFirst.length - 1,
            upperFirst.length
        ).uppercase()

    }

fun labelMultiply(a: Int, b: Int, label: String) =
    "$label: ${a * b}" // These have expression body. and functions with {} have block body

class Employee2(val firstName: String) {
    fun upperCaseFirstName(): String = firstName.uppercase()
}

fun printColors(vararg cars: NewCar) {
    for (car in cars) {
        println(car.color)
    }
}

data class NewCar(val color: String, val model: String, val year: Int) {}
