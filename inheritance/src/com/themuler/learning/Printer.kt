package com.themuler.learning


fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("HP Brother 1234", 15)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of the printer is: $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    final override fun printModel() = println("The model name of the laser printer is: $modelName")
    override fun bestSellingPrice() = 129.99
}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName, 100) {
//    override fun printModel() = println("this is my way of doing it: $modelName") // cannot override if fun is final
}

//open class TextBook {
//    val pages: Int
//
//    constructor(pages: Int) {
//        this.pages = pages
//    }
//}
//
//class MathsTextBook : TextBook {
//    constructor(pages: Int) : super(pages) // This will call secondary constructor only if class does not have primary constructor
//}

//data class Id(val id: Int) // Cannot inherit or open


interface MyInterface {
    val number: Int
    val number2: Int
        get() = 45

    fun myFunction(str: String): String
}

interface SubInterface : MyInterface {
    fun subFunction(str: String): String
}

open class Something : SubInterface {
    override val number = 35
    override fun subFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}
