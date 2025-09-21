package com.themuler.learning.lambdas

fun main(args: Array<String>) {
    val employees = listOf(
        Employee("Bhavani", "Chandra", 2023),
        Employee("Raju", "Kumar", 2021),
        Employee("Sharath", "Chandra", 2025),
        Employee("Rama", "Chandra", 2029)
    )
//    println(countTo100())
    findByLastName(employees,"Kumar")
    findByLastName(employees,"Rajesh")

    "Some String".apply someString@{
        "Another String".apply {
            println(this.lowercase())
            println(this@someString.uppercase())
        }
    }



}
// Normal Way
//fun findByLastName(employees: List<Employee>, lastName: String) {
//    for (employee in employees) {
//        if (employee.lastName == lastName) {
//            println("Yes, there's an employee with last name $lastName")
//            return
//        }
//    }
//    println("No employees found with last name $lastName")
//}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with last name $lastName")
            return //@returnBlock for local return
        }
    }
    println("No employees found with last name $lastName")
}

// Normal Way
//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

//// Using `with`
//fun countTo100() = with(StringBuilder()) {
//    for (i in 1..99) {
//        append(i)
//        append(", ")
//    }
//    append(100)
//    toString()
//}

// Using `apply`
fun countTo100() = StringBuilder().apply({
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}).toString()