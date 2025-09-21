package com.themuler.learning.second

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

}

fun rawStrings() {
//    val filePath = """c:\test\test2""" // For file paths use triple quets
    val name = "Humpty"
    val rhyme = """$name Dumpty sat on a wall
        |All The kings horses amd all the kings men
        |Couldn't put $name together again
    """.trimMargin();
    println(rhyme)

}

fun stringTemplates() {
    val employeeOne = Employee("Ramu", 500)
    println(employeeOne)

    val change = 4.22
    println("$$change") // use \$ to escape

    val n = 10.99
    val d = 20.00
    println("Value of $n divided by $d is ${n / d}")
    println("The Employee's Id is ${employeeOne.id}")
}

fun equalityAndTypecasting() {

    val employeeOne = Employee("Chandy", 2)
    val employeeTwo = Employee("Ravi", 1)
    val employeeThree = Employee("Ravi", 1)

    println("Structural Equality")
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)

    println("Referential Equality")
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree) // Referential Equality
//
    val employeeFour = employeeOne
    println(employeeFour === employeeOne)
    println(employeeTwo != employeeThree)
    println(employeeThree !== employeeOne)

    println("Type Casting")
    var something: Any = employeeOne
    if (something is Employee) {
//        val newEmp = something // as Employee: Casting is not required. Smart Casting
        something = employeeFour
        println(something.name)
    }
}

fun bitwiseOperations() {
    val x = 2
    val y = 10
    println("Bitwise Operations")
    println(x or y)
    println(x and y)
    println(x xor y)
}

fun declarations() {
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

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}
