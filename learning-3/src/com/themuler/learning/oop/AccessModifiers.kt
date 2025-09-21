package com.themuler.learning.oop

val PI_VALUE = 3.1415925


fun main(args: Array<String>) {
    // public, private, protected and internal
    // Top level are public
    // Can add multiple public classes in single file
    val car = Car("red", "Maruthi Suzuki", 1995)
    println(car)
    println("---------")
    val car2 = Car("red", "Maruthi Suzuki", 1995)
    println(car2)
    println(car == car2)
    println("---------")
    val car3 = car2.copy(year = 2020)
    println(car3)
    println(car3 === car2)
    println("---------")
    val emp = Employee("Bhavani")
    println(emp.toString())
    val emp2 = Employee("Bhavani")
    println(emp == emp2)
}

fun classStuff() {
    val emp = Employee("Bhavani")
    println(emp.firstName)
    emp.fullTime = false
    println(emp.fullTime)
    println("---------")
    val emp2 = Employee("Michael")
    println(emp2.firstName)
    println(emp2.fullTime)
    println("---------")
    val emp3 = Employee("Ramu", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println("---------")
    println("Constant: $PI_VALUE")
}


// Longest way
/*class Employee constructor(firstName: String) {
    val firstName: String

    init {
        this.firstName = firstName
    } // This is not a constructor. It's an init block to initialize and works in conjunction with primary constructor
}*/

// Second Way
/*
class Employee constructor(firstName: String) {
    val firstName: String
}
*/

// Third Way: This is required when using access modifiers or annotation
/*
class Employee constructor(val firstName: String) {
}
*/

// Secondary Constructor
//class Employee(val firstName: String) {
//    var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
//        this.fullTime = fullTime
//    }
//}

// Concise Way - Kotlin Way
class Employee(val firstName: String, fullTime: Boolean = true) {
    //    var fullTime = fullTime // Just by doing this kotlin generates get and set
    var fullTime = fullTime
        get() {
            println("Running the custom get")
            return field
        }
        set(value) {
            println("Running the custom set")
            field = value
        }
}

// Without primary constructor we can use it
//class Demo {
//    val dummy: String = "Hello World!"
//}


data class Car(val color: String, val model: String, val year: Int) {}
