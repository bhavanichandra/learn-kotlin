package com.themuler.learning

import java.time.Year

fun main(args: Array<String>) {

    println(Department.IT.getDeptInfo())
    println(CompanyCommunications.getCopyrightLine())
    topLevel(Department.IT.getDeptInfo())
}

fun somePrints() {
    val someClass1 = SomeClass.justAssign("Hello world")
    val someClass2 = SomeClass.upperOrLowerCase("Hello world 2", false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantSomeInterface(object :
        SomeInterface { // This instance is created and removed, its just to provide anonymous function
        override fun mustImplement(num: Int): String {
            thisIsMutable++ // Can apply side effects like updating variables present outside of this scope
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println("ThisIsMutable: $thisIsMutable")
}

// Singletons in Kotlin
object CompanyCommunications {
    val currentYear = Year.now().value
    fun getTagLine() = "Laziness is the mother of invention"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear, TheMuler All rights reserved."
}


enum class Department(val fullName: String, val numOfEmployees: Int) {
    IT("IT", 100),
    HR("Human Resoirces", 10),
    SALES("Sales", 20),
    ACCOUNTING("Accounting", 2),
    MARKETING("Marketing", 34); // Add semi colon to add other functions after

    fun getDeptInfo() = "The $fullName has $numOfEmployees Employees"
}

class SomeClass private constructor(val someString: String) {
    // Use companion objects to create factory classes
    companion object {
        private val privateVar = 6

        fun accessPrivateVar() = println("I'm accessing privateVar: $privateVar")

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowercase: Boolean): SomeClass {
            if (lowercase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}


interface SomeInterface {
    fun mustImplement(num: Int): String
}


fun wantSomeInterface(si: SomeInterface) {
    println("Printing from some interface ${si.mustImplement(22)}")
}

private fun topLevel(str: String) = println("To level function: $str")

fun String.upperFirstAndLast(): String {
    return take(1).uppercase() + substring(1, length - 2) + takeLast(1).uppercase()
}
