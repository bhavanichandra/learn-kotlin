package com.themuler.learning.lambdas

fun main(args: Array<String>) {
//    run { println("I'm in a lambda") }
    val employees = listOf(
        Employee("Bhavani", "Chandra", 2023),
        Employee("Raju", "Kumar", 2021),
        Employee("Sharath", "Chandra", 2025),
        Employee("Rama", "Chandra", 2029)
    )
//    println(employees.minBy { e -> e.startYear })
//    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    var num = 10
    run {
        num += 15
        println(num)
    }
    useParameter(employees, 10)

    run(::topLevel)

}

fun topLevel() = println("I'm a top level function")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println("${it.firstName} ${it.lastName}")
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {}