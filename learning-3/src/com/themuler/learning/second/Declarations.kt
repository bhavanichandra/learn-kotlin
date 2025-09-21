package com.themuler.learning.second

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val number = 10
    val employee1 = Employee("Bhavani", 1)
    employee1.name = "Jack"
//    employee1 = Employee("Tim Watson", 2)  val are final
    val employees: EmployeeSet // Typealias
    val employee2: Employee
    val number2 = 1
    if (number > number2) {
        employee2 = Employee("Bhavi", 2)
    } else {
        employee2 = Employee("Jack", 7)
    }
    // No semicolon
    // Use Wrappers
    // Soft keywords

    val names = arrayListOf("Bhavani", "Jack")

    println(names[0])

}

class Employee(var name: String, val id: Int) {

}